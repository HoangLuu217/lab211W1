/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1Model;

import java.util.ArrayList;
import W1View.Validation;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 *
 * @author Admin
 */
public class School {

    public ArrayList<Student> StudentList = new ArrayList<>();
    public Validation valid = new Validation();;

    public School() {
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }

    public boolean isEmptyList(ArrayList list) {
        if (!list.isEmpty()) {
            return false;
        }
        return true;

    }

    public Address enterAddress() {
        String country = Validation.getValue("nhap quoc gia: ");
        String city = Validation.getValue("nhap thanh pho: ");
        String district = Validation.getValue("nhap quan, huyen: ");
        String street = Validation.getValue("nhap ten duong: ");
        return new Address(country, city, district, street);
    }

    public void addNewItStu() {
        
        int type = valid.getValueInt("chon 1: hoc sinh IT. 2: hoc sinh Biz.", 1, 2);
        String id = Validation.getValue("nhap id hoc sinh: ");
        String fullName = Validation.getValue("nhap ten hoc sinh: ");
        Address stAdd = enterAddress();
        if (type == 1) {
            double javaScore = valid.getCheckScore("nhap diem java", 0.00, 10.00);
            double CssScore = valid.getCheckScore("nhap diem Css", 0.00, 10.00);
            StudentList.add(new ItStudent(javaScore, CssScore, id, fullName, stAdd));
        } else if (type == 2) {
            double AccScore = valid.getCheckScore("nhap diem accounting", 0.00, 10.00);
            double MktScore = valid.getCheckScore("nhap diem mkt", 0.00, 10.00);
            StudentList.add(new BizStudent(AccScore, MktScore, id, fullName, stAdd));
        }

    }
    public void exportList(){
        for(Student student : StudentList){
            student.displayNameGpa();
        }
        
    }
   public ArrayList<Student> searchMethod(Predicate<Student> p) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student st : StudentList) {
            if (p.test(st)) {
                list.add(st);
            }
        }
        return list;
    }
   public void sortMethod(Comparator<Student> c){
        StudentList.sort(c);
    }
    public void display(){
        for (Student student : StudentList) {
            student.displayDetail();
        }
    }

}
