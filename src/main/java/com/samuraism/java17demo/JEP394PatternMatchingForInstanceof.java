package com.samuraism.java17demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @see <a href="https://openjdk.java.net/jeps/394">JEP 394: Pattern Matching for instanceof</a>
 * @since Java 16
 */
public record JEP394PatternMatchingForInstanceof(Connection con) {
    static System.Logger logger = System.getLogger(JEP394PatternMatchingForInstanceof.class.getName());

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection(System.getProperty("jdbcURL"));
        new JEP394PatternMatchingForInstanceof(con)
                .execute("delete from emp where deptno = ?", 123);
    }

    public void execute(String sql, Object... params) {
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            int index = 1;
            for (var object : params) {
                if (object instanceof String) {
                    String strValue = (String) object;
                    stmt.setString(index, strValue);
                } else if (object instanceof Integer) {
                    Integer intValue = (Integer) object;
                    stmt.setInt(index, intValue);
                }
                index++;
            }
        } catch (SQLException e) {
            logger.log(System.Logger.Level.INFO, "例外", e);
        }
    }
}
