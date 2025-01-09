/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1Model;

/**
 *
 * @author Admin
 */
public abstract class Student {

    public String id;
    public String fullName;
    public Address address;

    public Student(String id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract double Calaverage(double Score0 , double Score1);
    public abstract void displayDetail();
    public abstract void displayNameGpa();

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", address=" + address + '}';
    }
    

    


}
