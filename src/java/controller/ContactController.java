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

import dao.ContactDAO;
import dao.GalleryDAO;
import dao.impl.ContactDAOImpl;
import dao.impl.GalleryDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This class gets top3 galleries list from
 * <code>dao.impl.GalleryDAOImpl</code>. Get the basic contact and social
 * contact of author from <code>dao.impl.ContactDAOImpl</code>. Then forward to
 * the <code>view.contact.jsp</code> page. Servlet will switch to
 * <code>view.error.jsp</code> page when any error occurs.
 *
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class ContactController extends HttpServlet {

    /**
     * This method gets top3 galleries from <code>dao.impl.GalleryDAOImpl</code>
     * to show title in header. Get basic contact and social contact from
     * <code>dao.impl.ContactDAOImpl</code>. Then forward to the
     * <code>view.contact.jsp</code> page. Servlet will switch to
     * <code>view.error.jsp</code> page when any error occurs.
     *
     * @param request stores attributes: contact, topListGallery,
     * contactPageActice, socialContact, error to send to JSP. It is a 
     * <code> javax.servlet.http.HttpServletRequest </code>
     * @param response provide HTTP-specific functionality in sending a response
     * to client's web browser. It is a
     * <code> javax.servlet.http.HttpServletResponse </code>
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    //size of top list
    private final static int LIST_SIZE = 3;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ContactDAO contactDAO = new ContactDAOImpl();
            GalleryDAO galleryDAO = new GalleryDAOImpl();

            //get contact information
            request.setAttribute("contact", contactDAO.getBasicContact());

            //get top 3 of gallery
            request.setAttribute("topListGallery", galleryDAO.getTopGalaryList(LIST_SIZE));

            //active title
            request.setAttribute("contactPageActice", "isActivePage");

            //Get social contact
            request.setAttribute("socialContact", contactDAO.getSocialContact());

            //go to contact page
            request.getRequestDispatcher("view/Contact.jsp").forward(request, response);
        } catch (Exception ex) {
            request.setAttribute("error", ex);
            request.getRequestDispatcher("view/Error.jsp").forward(request, response);
        }

    }

}
