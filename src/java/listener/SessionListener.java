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
package listener;

import dao.PageViewDAO;
import dao.impl.PageViewDAOImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * This class implement <code>HttpSessionListener</code> to catch sessionCreated
 * event to count the number of view.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class SessionListener implements HttpSessionListener {

    /**
     * This method catches event when session is created, then update the number
     * of view in view table in the database, and push the number of view list
     * to session.
     *
     * @param se the session event. It is a
     * <code> javax.servlet.http.HttpServletRequest </code>
     */
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        try {
            PageViewDAO pageViewDAO = new PageViewDAOImpl();
            pageViewDAO.updateNumberOfView();
            HttpSession session = se.getSession();

            //Set sesstion time out for 15 seconds
            //se.getSession().setMaxInactiveInterval(15);
            //Get number of view
            int numberOfViews = pageViewDAO.getNumberOfView();

            //Format number of views to string contains 6 characters.
            String formatNumberOfView = String.format("%06d", numberOfViews);

            List<String> numberOfViewsList = new ArrayList<>();
            for (int i = 0; i < formatNumberOfView.length(); i++) {
                numberOfViewsList.add(formatNumberOfView.charAt(i) + "");
            }
            session.setAttribute("numberOfView", numberOfViewsList);
        } catch (Exception e) {
            Logger.getLogger(SessionListener.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
