/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1Model;



/**
 *
 * @author Admin
 */
public class Address {
    public String country;
    public String city;
    public String district;
    public String street;
    

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", city=" + city + ", district=" + district + ", street=" + street + '}';
    }
    
    //hhhhh


    //huhss
}
