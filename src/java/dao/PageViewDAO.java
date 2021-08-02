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

/**
 * This class is interface class contains interface functions to get data from
 * view table in the database. The method will return an
 * <code>java.sql.SQLException</code> object when any error querying in the
 * data.
 * <p>
 * Bugs: None
 *
 * @author Pham Thi Huyen
 */
public interface PageViewDAO {

    /**
     * This method gets number of view from view table in the database. The
     * result contains an integer number.
     *
     * @return number of view is an integer number.
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    public int getNumberOfView() throws Exception;

    /**
     * This method updates number of view in view table in the database.
     *
     * @throws Exception when any exception occurs
     * <code>java.lang.Exception</code>
     */
    public void updateNumberOfView() throws Exception;
}
