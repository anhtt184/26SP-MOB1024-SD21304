package Entities;

import java.util.Date;

public class Student {
    int id;
    String code;
    String firstName;
    String surname;
    boolean gender;
    Date dob;
    String phone;

    // SELECT all info
    public Student(int id, String code, String firstName, String surname, boolean gender, Date dob, String phone) {
        this.id = id;
        this.code = code;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
    }

    // INSERT | UPDATE
    public Student() {
    }

    // DELETE
    public Student(String code) {
        this.code = code;
    }

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

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
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
}
