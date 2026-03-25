package Views;

import Entities.Student;
import Repositories.StudentRepo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {

    // Hien thi du lieu
    public static void showAllStudentList() {
        // Dung JDBC truy van du lieu
        ArrayList<Student> stdList = StudentRepo.getAll();
        // Hien thi du lieu
        stdList.forEach((x) -> {
            System.out.print(x.getId());
            System.out.print(" | ");
            System.out.print(x.getCode());
            System.out.print(" | ");
            System.out.print(x.getSurname());
            System.out.print(" | ");
            System.out.print(x.getFirstName());
            System.out.print(" | ");
            System.out.print(x.getGender() ? "Name" : "Nữ");
            System.out.print(" | ");
            System.out.print(x.getDob());
            System.out.print(" | ");
            System.out.println(x.getPhone());
        });
    }

    // Sap xep danh sach theo Ma sinh vien truoc
    // Sau do Hien thi danh sach
    public static void showAllStudentSortByCode(boolean isDesc) {
        // Dung JDBC truy van du lieu
        ArrayList<Student> stdList = StudentRepo.getAll();
        // Sap xep danh sach
        // isDesc = true: sap xep Giam dan
        // isDesc = false: sap xep Tang dan
        stdList.sort((s1, s2) -> isDesc ?
                s2.getCode().compareTo(s1.getCode()) : s1.getCode().compareTo(s2.getCode())
        );
        // Hien thi du lieu
        stdList.forEach((x) -> {
            System.out.print(x.getId());
            System.out.print(" | ");
            System.out.print(x.getCode());
            System.out.print(" | ");
            System.out.print(x.getSurname());
            System.out.print(" | ");
            System.out.print(x.getFirstName());
            System.out.print(" | ");
            System.out.print(x.getGender() ? "Name" : "Nữ");
            System.out.print(" | ");
            System.out.print(x.getDob());
            System.out.print(" | ");
            System.out.println(x.getPhone());
        });
    }

    public static void insert() {
        Student std = new Student();
        Scanner scn = new Scanner(System.in);

        System.out.println("Thêm thông tin Sinh viên");
        System.out.print("Nhập 'Mã sinh viên': ");
        // Du lieu nguoi dung nhap
        String code = scn.nextLine();
        std.setCode(code);

        System.out.print("Nhập 'Họ và tên đệm': ");
        // Du lieu nguoi dung nhap
        String surname = scn.nextLine();
        std.setSurname(surname);

        System.out.print("Nhập 'Tên chính': ");
        // Du lieu nguoi dung nhap
        String firstName = scn.nextLine();
        std.setFirstName(firstName);

        System.out.print("Nhập 'Giới tính' [1: Nam | 0: Nữ]: ");
        // Du lieu nguoi dung nhap
        int gender = scn.nextInt();
        std.setGender(gender == 1);

        System.out.print("Nhập 'Ngày sinh' [yyyy-MM-dd]: ");
        // Du lieu nguoi dung nhap
        String dob = scn.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            std.setDob(df.parse(dob));
        } catch (ParseException e) {
            System.out.println("Nhập ngày sinh không hợp lệ");
            throw new RuntimeException(e);
        }

        System.out.print("Nhập 'Điện thoại': ");
        std.setPhone(scn.nextLine());

        StudentRepo.insert(std);
    }

    public static void update() {

    }

    public static void delete() {

    }

    public static void searchByCode() {
        // Dung JDBC truy van du lieu
        ArrayList<Student> stdList = StudentRepo.getAll();

        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập Mã sinh viên: ");
        // Du lieu nguoi dung nhap
        String stdCode = scn.nextLine();
        // Tim kiem thong tin qua Ma sinh vien Nguoi dung nhap
        stdList.stream()
            .filter((x) -> stdCode.equals(x.getCode()))
            .forEach((x) -> {
                System.out.print(x.getId());
                System.out.print(" | ");
                System.out.print(x.getCode());
                System.out.print(" | ");
                System.out.print(x.getSurname());
                System.out.print(" | ");
                System.out.print(x.getFirstName());
                System.out.print(" | ");
                System.out.print(x.getGender() ? "Name" : "Nữ");
                System.out.print(" | ");
                System.out.print(x.getDob());
                System.out.print(" | ");
                System.out.println(x.getPhone());
            }
        );
    }
}
