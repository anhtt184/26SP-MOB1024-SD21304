package Repositories;

import Entities.Student;

import java.sql.*;
import java.util.ArrayList;

public class StudentRepo {
    public static ArrayList<Student> getAll() {
        Connection cnn = JDBC.getSqlserverConnection();
        try {
            PreparedStatement ps = cnn.prepareStatement("SELECT * FROM STUDENT");
            ResultSet rs = ps.executeQuery();

            ArrayList<Student> stdList = new ArrayList<>();

            while (rs.next()) {
                stdList.add(new Student(
                        rs.getInt("ID"),
                        rs.getString("CODE"),
                        rs.getString("FIRST_NAME"),
                        rs.getString("SURNAME"),
                        rs.getBoolean("GENDER"),
                        rs.getDate("DOB"),
                        rs.getString("PHONE")
                ));
            }

            return stdList;

        } catch (SQLException e) {
            System.out.println("Get all student error: ");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void insert(Student std) {
        Connection cnn = JDBC.getSqlserverConnection();
        String sqlCmd = "INSERT INTO student (CODE, FIRST_NAME, SURNAME, GENDER, DOB, PHONE) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = cnn.prepareStatement(sqlCmd);
            ps.setString(1, std.getCode());
            ps.setString(2, std.getFirstName());
            ps.setString(3, std.getSurname());
            ps.setBoolean(4, std.getGender());
            ps.setDate(5, new java.sql.Date(std.getDob().getTime()));
            ps.setString(6, std.getPhone());

            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Insert student error: ");
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void update(Student std) {

    }

    public static void delete(String stdCode) {

    }

}
