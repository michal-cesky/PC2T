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
public class UpdateQueries {

  public UpdateQueries() {}

  /**
   * Template metoda, do které se dá vkládat libovolný SQL UPDATE příkaz.
   *
   * POZN: není vhodné implementovat své metody tímto způsobem, daleko vhodnější je implementovat
   * konkrétní metody (např. updateUserById() pomocí PreparedStatements, do kterých vkládáme
   * konkrétní parametry)
   *
   * @param updateQuery řetězec představující příkaz UPDATE
   */
  public void performUpdateQuery(String updateQuery) {
    if (updateQuery == null) {
      throw new NullPointerException("query must not be null!");
    } else if (updateQuery.isEmpty()) {
      throw new IllegalArgumentException("query must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();
    try (PreparedStatement prStmt = conn.prepareStatement(updateQuery);) {
      int rowsUpdated = prStmt.executeUpdate();
      // System.out.println(rowsUpdated);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  /**
   * Doplňte příkaz update20PercentOfSalary, tak abyste přidali danému zaměstnanci 20% jeho platu
   *
   * POZN: Opět napiště SQL příkaz tak, abyste využili PreparedStatements (=> příkaz musí obsahovat
   * WHERE email = ?)
   *
   * @param email vstupní parametr, který je při volání nastaven na hodnotu:
   *        myname@stud.feec.vutbr.cz (jde pouze o ukázkový příklad u uživatele, který je zanesen v
   *        DB a má uveden plat)
   */
  public void increase20PercentOfSalary(String email) {
    if (email == null) {
      throw new NullPointerException("email must not be null!");
    } else if (email.isEmpty()) {
      throw new IllegalArgumentException("email must not be empty!");
    }
    Connection conn = DBConnection.getDBConnection();

    String update20PercentOfSalary = "UPDATE user SET salary = salary + (salary*0.2) WHERE user.email = ?";

    try (PreparedStatement prStmt = conn.prepareStatement(update20PercentOfSalary);) {
      prStmt.setString(1, email);
      int rowsUpdated = prStmt.executeUpdate();
      // System.out.println(rowsUpdated);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
