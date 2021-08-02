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
import dao.GalleryDAO;
import entity.Gallery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains methods to get data from gallery table in the database
 * relating to <code>entity.AuthorInfor</code> object. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class GalleryDAOImpl extends DBContext implements GalleryDAO {

    /**
     * This class gets all galleries. The result contains a list of
     * <code>entity.Gallery</code> object with id, title, img, brief,
     * createdDate <code>java.util.List</code>
     *
     * @return a list of <code>entity.Gallery</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    @Override
    public List<Gallery> getAllGalerry() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Gallery> listGallery = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Gallery");
            rs = ps.executeQuery();
            while (rs.next()) {
                listGallery.add(new Gallery(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("img"),
                        rs.getString("brief"),
                        rs.getDate("createdDate"))
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
        return listGallery;
    }

    /**
     * This method gets the top list of galleries had sorted ascending by date
     * create. The result contains a list of <code>entity.Gallery</code> object
     * with id, title, img, brief, createdDate <code>java.util.List</code>
     *
     * @param ListSize, size of the list. It is an integer number.
     * @return a list of <code>entity.Gallery</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    @Override
    public List<Gallery> getTopGalaryList(int ListSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Gallery> listGallery = new ArrayList<>();
        try {

            conn = getConnection();
            ps = conn.prepareStatement("SELECT TOP(?)* FROM Gallery ORDER BY createdDate");
            ps.setInt(1, ListSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                listGallery.add(new Gallery(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("img"),
                        rs.getString("brief"),
                        rs.getDate("createdDate"))
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
        return listGallery;
    }

    /**
     * This method counts number of pages depend on the total galleries in
     * gallery table in the database. The result contains an integer number.
     *
     * @param pageSize, number of galleries will display each page. It is an
     * integer number.
     * @return number of pages that can be found. It is an integer number
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    @Override
    public int getCountPage(int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM Gallery");
            rs = ps.executeQuery();
            int numOfPage;
            while (rs.next()) {
                numOfPage = rs.getInt(1) / pageSize;
                if (rs.getInt(1) % pageSize == 0) {
                    return numOfPage;
                }
                return (numOfPage + 1);
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
     * This method gets a list of <code>entity.Gallery</code> object has found
     * by pagination from gallery table in the database. The result contains id,
     * title, img, brief, createdDate of <code>entity.Gallery</code> object.
     *
     * @param pageSize, number of galleries will display each page. It is an
     * integer number.
     * @param pageIndex, page index that user is stay in. It is an integer
     * number.
     * @return a list of <code>entity.Album</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    @Override
    public List<Gallery> getGalleryListByPaging(int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Gallery> listGallery = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Gallery\n"
                    + "ORDER BY id\n"
                    + "OFFSET ?*?-? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, pageIndex);
            ps.setInt(2, pageSize);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                listGallery.add(new Gallery(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("img"),
                        rs.getString("brief"),
                        rs.getDate("createdDate"))
                );
            }
            return listGallery;
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
    }

}
