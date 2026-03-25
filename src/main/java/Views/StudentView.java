package Views;

import Entities.Student;
import Repositories.JDBC;
import Repositories.StudentRepo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class StudentView {
    public static void showList() throws SQLException {
        ArrayList<Student> stdList = StudentRepo.getAllData();

        // Sap xep theo Code
        Collections.sort(stdList, (s1, s2) -> s2.getCode().compareTo(s1.getCode()));

        // Hien thi TAT CA DU LIEU len man hinh
        // SELECT * FROM STUDENT
        stdList.forEach((x) -> {
            System.out.print(x.getId());
            System.out.print(" | ");
            System.out.print(x.getCode());
            System.out.print(" | ");
            System.out.print(x.getSurname());
            System.out.print(" | ");
            System.out.println(x.getFirstName());
        });

        // HIEN THI TTSV co ma SV la "PH12346"
        // SELECT * FROM STUDENT WHERE code = "PH12346"
        stdList.stream()
                .filter((s) -> Objects.equals(s.getCode(), "PH12346"))
                .forEach((x) -> {
                            System.out.print(x.getId());
                            System.out.print(" | ");
                            System.out.print(x.getCode());
                            System.out.print(" | ");
                            System.out.print(x.getSurname());
                            System.out.print(" | ");
                            System.out.println(x.getFirstName());
                        }
                );

        // UPPER FirstName cua TAT CA DS Sinh Vien
        // SELECT FirstName FROM STUDENT
        stdList.stream()
                .map((s) -> s.getFirstName().toUpperCase())
                .forEach(s -> System.out.println(s));

        // UPPER FirstName cua Sinh Vien co CODE = "PH12346"
        // SELECT FirstName FROM STUDENT WHERE code = "PH12346"
        stdList.stream()
                .filter((s) -> Objects.equals(s.getCode(), "PH12346"))
                .map((s) -> s.getFirstName().toUpperCase())
                .forEach(s -> System.out.println(s));
    }

    public static void doInsert(Student std) {

    }

    public static void doUpdate(Student std) {

    }

    public static void doDelete(String stdCode) {

    }

    public static void doSearchByCode(String stdCode) {

    }

    public static void doSearchByName(String stdName) {

    }


}
