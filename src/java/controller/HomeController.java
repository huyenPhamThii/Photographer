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

import dao.AuthorInforDAO;
import dao.ContactDAO;
import dao.GalleryDAO;
import dao.impl.AuthorInforDAOImpl;
import dao.impl.ContactDAOImpl;
import dao.impl.GalleryDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class gets top3 galleries, pagination gallery from
 * <code>dao.impl.GalleryDAOImpl</code>. Get author's information from
 * <code>dao.impl.AuthorInforDAOImpl</code>. Get author's contact social from
 * <code>dao.impl.ContactDAOImpl</code>. Then forward to <code>Home.jsp</code>
 * page. Servlet will switch to <code>error.jsp</code> page when any error
 * occurs.
 *
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class HomeController extends HttpServlet {

    /**
     * This method gets top3 galleries to show the title in header and
     * pagination gallery from <code>dao.impl.GalleryDAOImpl</code>. Get
     * author's information from <code>dao.impl.AuthorInforDAOImpl</code>. Get
     * author's social contact from <code>dao.impl.ContactDAOImpl</code>. Then
     * forward to <code>home.jsp</code> page. Servlet will switch to error page
     * when any error occurs.
     *
     * @param request stores attributes: topListGallery, authorInfor,
     * homePageActive, pageNumber, pageIndex, galleryPagingList, socialContact,
     * error to send to JSP. It is a <code> javax.servlet.http.HttpServletRequest
     * </code>
     * @param response provide HTTP-specific functionality in sending a response
     * to client's web browser. It is a
     * <code> javax.servlet.http.HttpServletResponse </code>
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    //size of top list
    private final static int LIST_SIZE = 3;
    //number of image in each page
    private final static int PAGE_SIZE = 3;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            GalleryDAO galleryDAO = new GalleryDAOImpl();
            AuthorInforDAO authorInforDAO = new AuthorInforDAOImpl();
            ContactDAO contactDAO = new ContactDAOImpl();

            //Get top list of gallery
            request.setAttribute("topListGallery", galleryDAO.getTopGalaryList(LIST_SIZE));

            //Get author's information
            request.setAttribute("authorInfor", authorInforDAO.getAuthorInfor());

            //Active title
            request.setAttribute("homePageActive", "isActivePage");

            //Get social contact
            request.setAttribute("socialContact", contactDAO.getSocialContact());

            //Pagination
            //Get number of page
            request.setAttribute("pageNumber", galleryDAO.getCountPage(PAGE_SIZE));

            //In case pageIndexRaw is null means user doesn't click to pagination
            //so, auto display page number 1.
            int pageIndex = 1;
            String pageIndexRaw = request.getParameter("pageIndex");
            try {
                if (pageIndexRaw != null) {
                    pageIndex = Integer.parseInt(pageIndexRaw);
                }
                request.setAttribute("pageIndex", pageIndex);
                
                //Get gallery list with pagingation
                request.setAttribute("galleryPagingList", galleryDAO.getGalleryListByPaging(PAGE_SIZE, pageIndex));
            } catch (NumberFormatException ex) {
                request.setAttribute("error", ex);
                request.getRequestDispatcher("view/Error.jsp").forward(request, response);
            }

            //Go to home page
            request.getRequestDispatcher("view/Home.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", ex);
            request.getRequestDispatcher("view/Error.jsp").forward(request, response);
        }
    }
}
