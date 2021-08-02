/**
 * Copyright(C) 2021, Pham Thi Huyen
 * J3.L.P0017
 * Photographer
 *
 * Record of change:
 * DATE          VERSION    AUTHOR      DESCRIPTION
 * 2021-06-15    1.0        HuyenPT     First Implement
 * 2021-06-23    2.0        HuyenPT     Fix header class comment
 * 2021-06-23    3.0        HuyenPT     Fix header method comment
 */
package dao.impl;

import context.DBContext;
import dao.AlbumDAO;
import entity.Album;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains methods to get data from album table in the database
 * relating to <code>entity.Album</code> object. The method will return an
 * object <code>java.sql.SQLException</code> when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public class AlbumDAOImpl extends DBContext implements AlbumDAO {

    /**
     * This method gets all images of <code>entity.Album</code> object by
     * gallery id. The result contains galleryID, img of
     * <code>entity.Album</code> object.
     *
     * @param galleryId, the id of gallery. It is an integer number.
     * @return a list of <code>entity.Album</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public List<Album> getAllAlbumByGalleryId(int galleryId) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Album> list = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Album WHERE galleryID = ?");
            ps.setInt(1, galleryId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Album(
                        rs.getInt("galleryID"),
                        rs.getString("img"))
                );
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
        return list;
    }

    /**
     * This method counts number of pages depend on the total images in each
     * album.
     *
     * @param galleryID, the id of gallery that user has clicked. It is an
     * integer number.
     * @param pageSize, number of images will display in each page. It is an
     * integer number.
     * @return number of pages that can be found. It is an integer number
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public int getPageNumber(int galleryID, int pageSize) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT COUNT(*) FROM Album \n"
                    + "WHERE galleryID = ?");
            ps.setInt(1, galleryID);
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
     * This method returns a list of <code>entity.Album</code> object has found
     * by gallery id. The result contains galleryID, img of
     * <code>entity.Album</code> object.
     *
     * @param galleryID, the id of gallery that user has clicked. It is an
     * integer number.
     * @param pageSize, number of images will display in each page. It is an
     * integer number.
     * @param pageIndex, page index that user is stay in. It is an integer
     * number.
     * @return a list of <code>entity.Album</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    @Override
    public List<Album> getAlbumWithPaging(int galleryID, int pageSize, int pageIndex) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Album> listAlbum = new ArrayList<>();
        try {
            conn = getConnection();
            ps = conn.prepareStatement("SELECT * FROM Album \n"
                    + "WHERE galleryID = ?\n"
                    + "ORDER BY galleryID\n"
                    + "OFFSET ?*?-? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, galleryID);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ps.setInt(5, pageSize);
            rs = ps.executeQuery();
            while (rs.next()) {
                listAlbum.add(new Album(
                        rs.getInt("galleryID"),
                        rs.getString("img"))
                );
            }
            return listAlbum;
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            closeRs(rs);
            closePS(ps);
            closeCon(conn);
        }
    }

}
