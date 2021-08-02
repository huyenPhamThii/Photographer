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
 * This class describe data fields of <code>entity.Contact</code> object. Class
 * contains methods which use to get and set all of attributes.
 *
 * @author Pham Thi Huyen
 */
public class Contact {

    private String adrress;
    private String city;
    private String country;
    private String phone;
    private String email;
    private String facebookURL;
    private String googleURL;
    private String twitterURL;
    private String facebookImg;
    private String googleImg;
    private String twitterImg;

    /**
     * Empty constructor. This constructor used to initialize
     * <code>entity.Contact</code> object with no properties.
     */
    public Contact() {
    }

    /**
     * This constructor used to initialize <code>entity.Contact</code> object
     * with properties: address, city, country, phone, email.
     *
     * @param adrress <code>java.util.String</code>
     * @param city <code>java.util.String</code>
     * @param country <code>java.util.String</code>
     * @param phone phone number, <code>java.util.String</code>
     * @param email <code>java.util.String</code>
     *
     */
    public Contact(String adrress, String city, String country, String phone, String email) {
        this.adrress = adrress;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;

    }

    /**
     * This constructor used to initialize <code>entity.Contact</code> object
     * with properties: facebookURL, googleURL, twitterURL, facebookImg,
     * googleImg, twitterImg.
     *
     * @param facebookURL
     * @param googleURL
     * @param twitterURL
     * @param facebookImg
     * @param googleImg
     * @param twitterImg
     */
    public Contact(String facebookURL, String googleURL, String twitterURL, String facebookImg, String googleImg, String twitterImg) {
        this.facebookURL = facebookURL;
        this.googleURL = googleURL;
        this.twitterURL = twitterURL;
        this.facebookImg = facebookImg;
        this.googleImg = googleImg;
        this.twitterImg = twitterImg;
    }

    /**
     * Get address of <code>entity.Contact</code> object
     *
     * @return address <code>java.util.String</code>
     */
    public String getAdrress() {
        return adrress;
    }

    /**
     * Set address of <code>entity.Contact</code> object
     *
     * @param adrress <code>java.util.String</code>
     */
    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    /**
     * Get city of <code>entity.Contact</code> object
     *
     * @return city <code>java.util.String</code>
     */
    public String getCity() {
        return city;
    }

    /**
     * Set city of <code>entity.Contact</code> object
     *
     * @param city <code>java.util.String</code>
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Get country of <code>entity.Contact</code> object
     *
     * @return country <code>java.util.String</code>
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set country of <code>entity.Contact</code> object
     *
     * @param country <code>java.util.String</code>
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Get phone number of <code>entity.Contact</code> object
     *
     * @return phone number <code>java.util.String</code>
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone number of <code>entity.Contact</code> object
     *
     * @param phone <code>java.util.String</code>
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Get email of <code>entity.Contact</code> object
     *
     * @return email <code>java.util.String</code>
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set email of <code>entity.Contact</code> object
     *
     * @param email <code>java.util.String</code>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get facebookURL of <code>entity.Contact</code> object
     *
     * @return facebookURL <code>java.util.String</code>
     */
    public String getFacebookURL() {
        return facebookURL;
    }

    /**
     * Set facebookURL of <code>entity.Contact</code> object
     *
     * @param facebookURL <code>java.util.String</code>
     */
    public void setFacebookURL(String facebookURL) {
        this.facebookURL = facebookURL;
    }

    /**
     * Get googleURL of <code>entity.Contact</code> object
     *
     * @return googleURL <code>java.util.String</code>
     */
    public String getGoogleURL() {
        return googleURL;
    }

    /**
     * set googleURL of <code>entity.Contact</code> object
     *
     * @param googleURL <code>java.util.String</code>
     */
    public void setGoogleURL(String googleURL) {
        this.googleURL = googleURL;
    }

    /**
     * Get twitterURL of <code>entity.Contact</code> object
     *
     * @return twitterURL <code>java.util.String</code>
     */
    public String getTwitterURL() {
        return twitterURL;
    }

    /**
     * Set twitterURL of <code>entity.Contact</code> object
     *
     * @param twitterURL <code>java.util.String</code>
     */
    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    /**
     * Get facebookImg of <code>entity.Contact</code> object
     *
     * @return facebookImg <code>java.util.String</code>
     */
    public String getFacebookImg() {
        return facebookImg;
    }

    /**
     * Set facebookImg of <code>entity.Contact</code> object
     *
     * @param facebookImg <code>java.util.String</code>
     */
    public void setFacebookImg(String facebookImg) {
        this.facebookImg = facebookImg;
    }

    /**
     * Get googleImg of <code>entity.Contact</code> object
     *
     * @return googleImg <code>java.util.String</code>
     */
    public String getGoogleImg() {
        return googleImg;
    }

    /**
     * Set googleImg of <code>entity.Contact</code> object
     *
     * @param googleImg <code>java.util.String</code>
     */
    public void setGoogleImg(String googleImg) {
        this.googleImg = googleImg;
    }

    /**
     * Get twitterImg of <code>entity.Contact</code> object
     *
     * @return twitterImg <code>java.util.String</code>
     */
    public String getTwitterImg() {
        return twitterImg;
    }

    /**
     * Set twitterImg of <code>entity.Contact</code> object
     *
     * @param twitterImg <code>java.util.String</code>
     */
    public void setTwitterImg(String twitterImg) {
        this.twitterImg = twitterImg;
    }

}
