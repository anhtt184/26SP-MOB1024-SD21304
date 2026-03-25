package Repositories;

import Entities.Student;

import java.sql.*;
import java.util.ArrayList;

public class StudentRepo {
    // SELECT *
    public static ArrayList<Student> getAllData() throws SQLException {
        // lenh chinh de tao ket noi thong qua JDBC
        Connection cnn = JDBC.getConnection();

        PreparedStatement ps = cnn.prepareStatement("SELECT * FROM STUDENT");
        ResultSet rslSet = ps.executeQuery();

        // bien tam thoi
        ArrayList<Student> stdList = new ArrayList<>();

        // next() - tham chieu den tung HANG/DONG du lieu
        while (rslSet.next()) {
            stdList.add(new Student(
                    rslSet.getInt("ID"),
                    rslSet.getString("CODE"),
                    rslSet.getString("FIRST_NAME"),
                    rslSet.getString("SURNAME"),
                    rslSet.getBoolean("GENDER"),
                    rslSet.getDate("DOB"),
                    rslSet.getString("PHONE")
            ));
        }

        return stdList;
    }

    public static void insert(Student std) {

    }

    public static void update(Student std) {

    }

    public static void delete(String stdCode) {

    }

    public static void searchByCode(String stdCode) {

    }

    public static void searchByName(String stdName) {

    }
}
