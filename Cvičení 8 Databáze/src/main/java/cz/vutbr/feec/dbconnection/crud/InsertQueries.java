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
public class InsertQueries {

  public InsertQueries() {}


  /**
   * Template metoda, do které se dá vkládat libovolný SQL INSERT příkaz.
   * 
   * POZN: není vhodné implementovat své metody tímto způsobem, daleko vhodnější je implementovat
   * konkrétní metody (např. insertNewUser(String email, char[] password) pomocí PreparedStatements,
   * do kterých vkládáme konkrétní parametry)
   * 
   * @param insertQuery řetězec představující příkaz INSERT
   */
  public void performInsertQuery(String insertQuery) {
    if (insertQuery == null) {
      throw new NullPointerException("query must not be null!");
    } else if (insertQuery.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();
    try (PreparedStatement prStmt = conn.prepareStatement(insertQuery);) {
      int rowsInserted = prStmt.executeUpdate();
      // System.out.println("Bylo vloženo uživatelů: " + rowsInserted);
      System.out.println("Byl vložen uživatel s emailem: " + "myname123@stud.feec.vutbr.cz");
    } catch (SQLException e) {
      System.out.println("Uživatel s emailem: " + "myname123@stud.feec.vutbr.cz "
          + "již byl vložen nemusíte jej vkládat znovu");
      // e.printStackTrace();
    }
  }

  /**
   * Úkol: Vaším úkolem je přiřadit INSERT příkaz do proměnné insertUser, tak aby se vytvořil nový
   * uživatel dle zadaných parametrů
   * 
   * HINT: V této metodě jsou využity preparedStatements, takže se parametr emailu nastaví až
   * později příkazem prStmt.setString(1, email)... Pro představu, jak se píší prepared statements
   * se podívejte na následující odkaz:
   * https://www.mkyong.com/jdbc/jdbc-preparestatement-example-insert-a-record/
   * 
   * @param email uživatele
   * @param name uživatele
   * @param surname uživatele
   * @param age uživatele
   * @param salary uživatele
   */
  public void insertNewUser(String email, String name, String surname) {
    if (email == null || name == null || surname == null)
      throw new NullPointerException("Email, name and surname must be set.");

    Connection conn = DBConnection.getDBConnection();

    String insertUser = "INSERT INTO user " + "(email,name,surname)" + "VALUES(?,?,?)";

    try (PreparedStatement prStmt = conn.prepareStatement(insertUser)) {
      prStmt.setString(1, email);
      prStmt.setString(2, name);
      prStmt.setString(3, surname);

      prStmt.executeUpdate();
      System.out.println("Nový uživatel byl vložen do databáze!");
    } catch (SQLException e) {
      System.out.println("Uživatel už byl vložen nebo jste zadali špatně SQL příkaz INSERT");
      // e.printStackTrace();
    }
  }


}
