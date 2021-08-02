/**
 * Copyright(C) 2021, Pham Thi Huyen
 * J3.L.P0017
 * Photographer
 *
 * Record of change:
 * DATE          VERSION    AUTHOR      DESCRIPTION
 * 2021-06-15    1.0        HuyenPT     First Implement
 * 2021-06-23    2.0        HuyenPT     Fix header class, header method comment
 * 2021-06-30    3.0        HuyenPT     Fix header class, header method comment
 */
package controller;

import dao.AlbumDAO;
import dao.ContactDAO;
import dao.GalleryDAO;
import dao.impl.AlbumDAOImpl;
import dao.impl.ContactDAOImpl;
import dao.impl.GalleryDAOImpl;
import entity.Album;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class gets top3 galleries from <code>dao.impl.GalleryDAOImpl</code>. Get
 * the album and number of page from <code>dao.impl.AlbumDAOImpl</code>. Get
 * author's social contact from <code>dao.impl.ContactDAOImpl</code> . Then
 * forward to the <code>Gallery.jsp</code> page. Servlet will switch to
 * <code>Error.jsp</code> page when any error occurs.
 *
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class GalleryController extends HttpServlet {

    /**
     * This method gets top3 galleries from <code>dao.impl.GalleryDAOImpl</code>
     * to show the title in header. Get author's social contact from
     * <code>dao.impl.ContactDAOImpl</code>. Get the album and number of page
     * from <code>dao.impl.AlbumDAOImpl</code> to display in the slide show and
     * pagination at the <code>gallery.jsp</code> page.
     *
     * @param request stores attributes: topListGallery, galleryID,
     * slideAlbumList, pageNumber, pageIndex, smallAlbumList, lineNumber,
     * galleryPageActive, socialContact, error to send to JSP. It is a 
     * <code> javax.servlet.http.HttpServletRequest </code>
     * @param response provide HTTP-specific functionality in sending a response
     * to client's web browser. It is a
     * <code> javax.servlet.http.HttpServletResponse </code>
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    //size of top list
    private final static int LIST_SIZE = 3;
    //number of image in each page
    private final static int PAGE_SIZE = 8;
    //number of image in each line
    private final static int LINE_SIZE = 4;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            AlbumDAO albumDAO = new AlbumDAOImpl();
            GalleryDAO galleryDAO = new GalleryDAOImpl();
            ContactDAO contactDAO = new ContactDAOImpl();

            //Get social contact
            request.setAttribute("socialContact", contactDAO.getSocialContact());
            
            //Get top list of gallery
            request.setAttribute("topListGallery", galleryDAO.getTopGalaryList(LIST_SIZE));

            //Get album by galleryID to show in slide
            int galleryID = Integer.parseInt(request.getParameter("galleryID"));
            request.setAttribute("galleryID", galleryID);
            List<Album> slideAlbumList = albumDAO.getAllAlbumByGalleryId(galleryID);
            if (slideAlbumList.isEmpty()) {
                request.setAttribute("error", "There is no image in this gallery");
                request.getRequestDispatcher("view/Error.jsp").forward(request, response);
            }
            request.setAttribute("slideAlbumList", slideAlbumList);

            //Pagination
            //Get number of page
            request.setAttribute("pageNumber", albumDAO.getPageNumber(galleryID, PAGE_SIZE));

            //In case pageIndexRaw is null means user doesn't click to pagination
            //so, auto display page number 1.
            int pageIndex = 1;
            String pageIndexRaw = request.getParameter("pageIndex");
            if (pageIndexRaw != null) {
                pageIndex = Integer.parseInt(pageIndexRaw);
            }
            request.setAttribute("pageIndex", pageIndex);

            //Get album list in each page
            List<Album> paginationAlbumList = albumDAO.getAlbumWithPaging(galleryID, PAGE_SIZE, pageIndex);
            request.setAttribute("paginationAlbumList", paginationAlbumList);

            //Get size of each line in each page
            int lineNumber = paginationAlbumList.size() / LINE_SIZE;
            if (paginationAlbumList.size() % LINE_SIZE != 0) {
                lineNumber++;
            }
            request.setAttribute("lineNumber", lineNumber);

            //Active title
            request.setAttribute("galleryPageActive", galleryID);

            //Go to gallery page
            request.getRequestDispatcher("view/Gallery.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", ex);
            request.getRequestDispatcher("view/Error.jsp").forward(request, response);
        }
    }
}
