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
package dao;

import entity.Gallery;
import java.util.List;

/**
 * This class is an interface class contains interface functions to get5 data
 * from gallery table in the database relating to
 * <code>entity.AuthorInfor</code> object. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public interface GalleryDAO {

    /**
     * This class gets all galleries from gallery table in the database. The
     * result contains id, title, img, brief, createdDate of
     * <code>entity.Gallery</code> object.
     *
     * @return a list of <code>entity.Gallery</code> object,
     * <code> java.util.List </code>
     * @throws Exception when any error occurs 
     * <code> java.lang.Exception </code>
     */
    public List<Gallery> getAllGalerry() throws Exception;

    /**
     * This method gets the top list of galleries had sorted ascending by date
     * create from gallery table in the database. The result contains id, title,
     * img, brief, createdDate of <code>entity.Gallery</code> object.
     *
     * @param ListSize, size of the list. It is an integer number.
     * @return a list of <code>entity.Gallery</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    public List<Gallery> getTopGalaryList(int ListSize) throws Exception;

    /**
     * This method counts number of pages depend on the total galleries in
     * gallery table in the database. The result contains an integer number.
     *
     * @param pageSize, number of galleries will display each page. It is an
     * integer number.
     * @return number of pages that can be found. It is an integer number
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    public int getCountPage(int pageSize) throws Exception;

    /**
     * This method gets a list of <code>entity.Gallery</code> object has found
     * by pagination from gallery table in the database. The result contains id,
     * title, img, brief, createdDate of <code>entity.Gallery</code> object.
     *
     * @param pageSize, number of galleries will display in each page. It is an
     * integer number.
     * @param pageIndex, page index that user is stay in. It is an integer
     * number.
     * @return a list of <code>entity.Album</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    public List<Gallery> getGalleryListByPaging(int pageSize, int pageIndex) throws Exception;
}
