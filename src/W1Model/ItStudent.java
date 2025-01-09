/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1Model;

/**
 *
 * @author Admin
 */
public class ItStudent extends Student {
    public double JavaScore;
    public double CSSscore;

    public ItStudent(double JavaScore, double CSSscore, String id, String fullName, Address address) {
        super(id, fullName, address);
        this.JavaScore = JavaScore;
        this.CSSscore = CSSscore;
    }

 

    @Override
    public double Calaverage(double JavaScore, double CSSscore ) {
        return (3 * JavaScore + CSSscore)/4;
    }
    @Override
    public void displayDetail() {
        System.out.println("id=" + id + ", fullName=" + fullName + ", address=" + address +" Java score: " +JavaScore+" CSS score: "+ CSSscore);
    }

    @Override
    public void displayNameGpa() {
        System.out.println("Name:"+ fullName +", GPA: "+ this.Calaverage(JavaScore, CSSscore));; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

 
    
    
    
}
