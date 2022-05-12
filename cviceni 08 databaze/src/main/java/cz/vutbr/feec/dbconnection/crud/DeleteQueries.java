package cz.vutbr.feec.dbconnection.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cz.vutbr.feec.dbconnection.dbconn.DBConnection;

/**
 * 
 * @author Pavel Šeda (154208)
 *
 */
public class DeleteQueries {

  public DeleteQueries() {}

  /**
   * Template metoda, do které se dá vkládat libovolný SQL DELETE příkaz.
   * 
   * POZN: není vhodné implementovat své metody tímto způsobem, daleko vhodnější je implementovat
   * konkrétní metody (např. deleteUserById(String email) pomocí PreparedStatements, do kterých
   * vkládáme konkrétní parametry)
   * 
   * @param deleteQuery řetězec představující příkaz DELETE
   */
  public void performDeleteQuery(String deleteQuery) {
    if (deleteQuery == null) {
      throw new NullPointerException("query must not be null!");
    } else if (deleteQuery.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();
    try (PreparedStatement prStmt = conn.prepareStatement(deleteQuery);) {
      int rowsDeleted = prStmt.executeUpdate();
      // System.out.println(rowsInserted);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //@formatter:off
  /**
   * Úkol: Doplňte proměnnou userToDelete příkazem DELETE ..., který vymaže uživatele podle emailu, který je předán v parametru metody
   * 
   * HINT: V této metodě jsou využity preparedStatements, takže se parametr emailu nastaví až později příkazem prStmt.setString(1, email). 
   * Pro představu, jak se píší prepared statements se podívejte na následující odkaz: 
   * https://www.mkyong.com/jdbc/jdbc-preparestatement-example-delete-a-record/
   * 
   * @param email na základě, kterého je vymazán daný uživatel
   */
  //@formatter:on
  public void deleteUserByEmail(String email) {
    if (email == null) {
      throw new NullPointerException("email must not be null!");
    } else if (email.isEmpty()) {
      throw new IllegalArgumentException("email must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();

    String userToDelete = "DELETE FROM user WHERE user.email = ?";

    try (PreparedStatement prStmt = conn.prepareStatement(userToDelete);) {
      prStmt.setString(1, email);
      int rowsDeleted = prStmt.executeUpdate();
      System.out.println("Vaším příkazem byl vymazán následující počet uživatelů: " + rowsDeleted);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
