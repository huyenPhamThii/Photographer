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
package dao.impl;

import context.DBContext;
import dao.AuthorInforDAO;
import entity.AuthorInfor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class contains method to get data from author table in database relating
 * to <code>entity.AuthorInfor</code> object. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class AuthorInforDAOImpl extends DBContext implements AuthorInforDAO {

    /**
     *  This class gets author's information from author table in database. The
     * result contains img, shortDesc, about of <code>entity.AuthorInfor</code>
     * object.
     *
     * @return an <code>entity.AuthorInfor</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public AuthorInfor getAuthorInfor() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Author");
            rs = ps.executeQuery();
            while (rs.next()) {
                return new AuthorInfor(
                        rs.getString("img"),
                        rs.getString("shortDesc"),
                        rs.getString("about")
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
        return null;
    }

}
