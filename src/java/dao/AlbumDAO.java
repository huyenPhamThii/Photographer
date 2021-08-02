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

import entity.Album;
import java.util.List;

/**
 * This class is an interface class contains interface functions to get data
 * from album table in the database relating to <code>entity.Album</code>
 * object.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public interface AlbumDAO {

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
    public List<Album> getAllAlbumByGalleryId(int galleryId) throws Exception;

    /**
     * This method counts number of pages depend on the total images in each
     * album. The result contains an integer number.
     *
     * @param galleryID, the id of gallery that user has clicked. It is an
     * integer number.
     * @param pageSize, number of images will display each page. It is an
     * integer number.
     * @return number of pages that can be found. It is an integer number
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    public int getPageNumber(int galleryID, int pageSize) throws Exception;

    /**
     * This method returns a list of <code>entity.Album</code> object has found
     * by gallery id. The result contains galleryID, img of
     * <code>entity.Album</code> object.
     *
     * @param galleryID, the id of gallery that user has clicked. It is an
     * integer number.
     * @param pageSize, number of images will display each page. It is an
     * integer number.
     * @param pageIndex, page index that user is stay in. It is an integer
     * number.
     * @return a list of <code>entity.Album</code> object,
     * <code>java.util.List</code>
     * @throws Exception when any error occurs <code>java.lang.Exception</code>
     */
    public List<Album> getAlbumWithPaging(int galleryID, int pageSize, int pageIndex) throws Exception;
}
