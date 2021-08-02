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

import entity.Contact;

/**
 * This class is an interface class contains interface functions to get data
 * from contact table in the database relating to <code>entity.Contact</code>
 * object. The method will return an <code>java.sql.SQLException</code> object
 * when any error querying in the data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public interface ContactDAO {

    /**
     * This method gets basic contact of author from contact table in database.
     * The result contains addr, city, country, phone, email of
     * <code>entity.Contact</code> object.
     *
     * @return an <code>entity.Contact</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    public Contact getBasicContact() throws Exception;

    /**
     * This method gets social contact of author from contact table in database.
     * The result contains facebookURL, googleURL, twitterURL, facebookImg,
     * googleImg, twitterImg of <code>entity.Contact</code> object.
     *
     * @return an <code>entity.Contact</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    public Contact getSocialContact() throws Exception;
}
