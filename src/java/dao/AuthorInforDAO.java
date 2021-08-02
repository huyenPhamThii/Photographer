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

import entity.AuthorInfor;

/**
 * This class is an interface class contains interface functions to get data
 * from author table in the database relating to <code>entity.AuthorInfor</code>
 * object. The method will return an <code>java.sql.SQLException</code> object
 * when any error querying in the data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public interface AuthorInforDAO {

    /**
     * This class gets author's information from author table in database. The
     * result contains img, shortDesc, about of <code>entity.AuthorInfor</code>
     * object.
     *
     * @return an <code>entity.AuthorInfor</code> object
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    public AuthorInfor getAuthorInfor() throws Exception;
}
