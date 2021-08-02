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
import dao.PageViewDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class is interface class contains interface functions to get data from
 * view table in the database. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class PageViewDAOImpl extends DBContext implements PageViewDAO {

    /**
     * This method gets number of view from view table in the database. The
     * result contains an integer number.
     *
     * @return number of view is an integer number.
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public int getNumberOfView() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM [View]");
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
        return 0;
    }

    /**
     * This method updates number of view in view table in the database.
     *
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public void updateNumberOfView() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("UPDATE [View]\n"
                    + "SET photographerView = photographerView + 1");
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
    }

}
