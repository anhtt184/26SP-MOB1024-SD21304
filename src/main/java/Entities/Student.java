package Entities;

import java.util.Date;

// Lop doi tuong <=> Thuc The trong Database
public class Student {
    // ID so tang dan - dung trong he thong
    private int	id;
    // PH12345
    private String	code;
    private String	firstName;
    private String	surname;
    // Gioi Tinh
    private Boolean	gender;
    // Ngay Sinh
    private Date dob;
    // So dien thoai
    private String	phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // DELETE STUDENT WHERE code = stdCode;
    public Student(String stdCode) {
        this.code = stdCode;
    }

    // SELECT * FROM STUDENT WHERE code = stdCode;
    public Student(int id, String code, String firstName, String surname, Boolean gender, Date dob, String phone) {
        this.id = id;
        this.code = code;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
    }

    // INSERT INTO STUDENT (...Columns) VALUES (...values)
    public Student(String code, String firstName, String surname, Boolean gender, Date dob, String phone) {
        this.code = code;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
    }
}
