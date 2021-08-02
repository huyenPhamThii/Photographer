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

import java.sql.Date;

/**
 * This class describe data fields of <code> entity.Gallery </code> object.
 * Class contains methods which use to get and set all of attributes.
 *
 * @author Pham Thi Huyen
 */
public class Gallery {

    private int id;
    private String title;
    private String img;
    private String brief;
    private Date createDate;

    /**
     * Empty constructor. This constructor used to initialize
     * <code>entity.Gallery</code> object with no properties.
     */
    public Gallery() {
    }

    /**
     * Full constructor. This constructor used to initialize
     * <code>entity.Gallery</code> object with full properties: id, title, img,
     * brief, createDate
     *
     * @param id is an integer number
     * @param title <code> java.util.String </code>
     * @param img, image <code> java.util.String </code>
     * @param brief <code> java.util.String </code>
     * @param createDate, created date <code> java.sql.Date </code>
     */
    public Gallery(int id, String title, String img, String brief, Date createDate) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.brief = brief;
        this.createDate = createDate;
    }

    /**
     * Get id of <code> entity.Gallery </code> object
     *
     * @return id is an integer number
     */
    public int getId() {
        return id;
    }

    /**
     * Set id of <code> entity.Gallery </code> object
     *
     * @param id is an integer number
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get title of <code> entity.Gallery </code> object
     *
     * @return title <code> java.util.String </code>
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title of <code> entity.Gallery </code> object
     *
     * @param title <code> java.util.String </code>
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get image of <code> entity.Gallery </code> object
     *
     * @return img, image <code> java.util.String </code>
     */
    public String getImg() {
        return img;
    }

    /**
     * Set image of <code> entity.Gallery </code> object
     *
     * @param img, image <code> java.util.String </code>
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * Get brief of <code> entity.Gallery </code> object
     *
     * @return brief <code> java.util.String </code>
     */
    public String getBrief() {
        return brief;
    }

    /**
     * Set brief of <code> entity.Gallery </code> object
     *
     * @param brief <code> java.util.String </code>
     */
    public void setBrief(String brief) {
        this.brief = brief;
    }

    /**
     * Get created date of <code> entity.Gallery </code> object
     *
     * @return created date <code> java.sql.Date </code>
     */
    public Date getDate() {
        return createDate;
    }

    /**
     * Set created Date of <code> entity.Gallery </code> object
     *
     * @param createDate,created date <code> ava.sql.Date </code>
     */
    public void setDate(Date createDate) {
        this.createDate = createDate;
    }

}
