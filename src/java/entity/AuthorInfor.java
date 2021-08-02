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
 * This class describe data fields of <code>entity.AuthorInfo</code> object.
 * Class contains methods which use to get and set all of attributes.
 *
 * @author Pham Thi Huyen
 */
public class AuthorInfor {

    private String img;
    private String shortDes;
    private String about;

    /**
     * Empty constructor. This constructor used to initialize
     * <code>entity.AuthorInfor</code> object with no properties.
     */
    public AuthorInfor() {
    }

    /**
     * Full constructor. This constructor used to initialize
     * <code>entity.AuthorInfor</code> object with full properties: img,
     * shortDes, about.
     *
     * @param img, image url <code>java.util.String</code>
     * @param shortDes, short description <code>java.util.String</code>
     * @param about <code>java.util.String</code>
     */
    public AuthorInfor(String img, String shortDes, String about) {
        this.img = img;
        this.shortDes = shortDes;
        this.about = about;
    }

    /**
     * Get image url of <code>entity.AuthorInfor</code>
     *
     * @return image url <code>java.util.String</code>
     */
    public String getImg() {
        return img;
    }

    /**
     * Set image url of <code>entity.AuthorInfor</code>
     *
     * @param img, image url <code>java.util.String</code>
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * Get short description of <code>entity.AuthorInfor</code>
     *
     * @return short description <code>java.util.String</code>
     */
    public String getShortDes() {
        return shortDes;
    }

    /**
     * Set short description of <code>entity.AuthorInfor</code>
     *
     * @param shortDes, short description <code>java.util.String</code>
     */
    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    /**
     * Get about of <code>entity.AuthorInfor</code>
     *
     * @return about of author <code>java.util.String</code>
     */
    public String getAbout() {
        return about;
    }

    /**
     * Set about of <code>entity.AuthorInfor</code>
     *
     * @param about, about of author <code>java.util.String</code>
     */
    public void setAbout(String about) {
        this.about = about;
    }

}
