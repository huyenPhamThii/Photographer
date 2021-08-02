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
import dao.ContactDAO;
import entity.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class contains method to get data from contact table in the database.
 * relating to <code>entity.Contact</code> object. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class ContactDAOImpl extends DBContext implements ContactDAO {

    /**
     * This method gets author's basic contact from contact table in the
     * database. The result contains addr, city, country, phone, email of
     * <code>entity.Contact</code> object.
     *
     * @return an <code>entity.Contact</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public Contact getBasicContact() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Contact");
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Contact(
                        rs.getString("addr"),
                        rs.getString("city"),
                        rs.getString("country"),
                        rs.getString("phone"),
                        rs.getString("email")
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

    /**
     * This method gets social contact of author from contact table in database.
     * The result contains facebookURL, googleURL, twitterURL, facebookImg,
     * googleImg, twitterImg of <code>entity.Contact</code> object.
     *
     * @return an <code>entity.Contact</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public Contact getSocialContact() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Contact");
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Contact(
                        rs.getString("facebookURL"),
                        rs.getString("googleURL"),
                        rs.getString("twitterURL"),
                        rs.getString("facebookImg"),
                        rs.getString("googleImg"),
                        rs.getString("twitterImg")
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
