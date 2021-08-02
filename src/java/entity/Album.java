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
package entity;

/**
 * This class describe data fields of <code>entity.Album</code> object. Class
 * contains methods which use to get and set all of attributes.
 *
 * @author Pham Thi Huyen
 */
public class Album {

    private int galleryID;
    private String img;

    /**
     * Empty constructor. This constructor used to initialize
     * <code>entity.Album</code> object with no properties.
     */
    public Album() {
    }

    /**
     * Full constructor. This constructor used to initialize
     * <code>entity.Album</code> object with full properties: galleryID, img.
     *
     * @param galleryID, id of gallery is an integer number
     * @param img, image url <code>java.util.String</code>
     */
    public Album(int galleryID, String img) {
        this.galleryID = galleryID;
        this.img = img;
    }

    /**
     * Get gallery id of <code>entity.Album</code> object
     *
     * @return id of gallery is an integer number
     */
    public int getGalleryId() {
        return galleryID;
    }

    /**
     * Set gallery id of <code>entity.Album</code> object
     *
     * @param galleryID, id of gallery is an integer number
     */
    public void setGalleryId(int galleryID) {
        this.galleryID = galleryID;
    }

    /**
     * Get image url of <code>entity.Album</code> object
     *
     * @return image <code>java.util.String</code>
     */
    public String getImg() {
        return img;
    }

    /**
     * Set image url of <code>entity.Album</code> object
     *
     * @param img, image <code>java.util.String</code>
     */
    public void setImg(String img) {
        this.img = img;
    }

}
