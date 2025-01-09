/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W1Model;

/**
 *
 * @author Admin
 */
public class BizStudent extends Student{
    public double accountingScore;
    public double marketingScore;

    public BizStudent(double accountingScore, double marketingScore, String id, String fullName, Address address) {
        super(id, fullName, address);
        this.accountingScore = accountingScore;
        this.marketingScore = marketingScore;
    }

    public double getAccountingScore() {
        return accountingScore;
    }

    public void setAccountingScore(double accountingScore) {
        this.accountingScore = accountingScore;
    }

    public double getMarketingScore() {
        return marketingScore;
    }

    public void setMarketingScore(double marketingScore) {
        this.marketingScore = marketingScore;
    }

    @Override
    public String toString() {
        return "BizStudent{" + "accountingScore=" + accountingScore + ", marketingScore=" + marketingScore + '}';
    }

   
    
    @Override
    public double Calaverage(double Score0, double Score1) {
         return (Score0*2 + Score1)/3;
    }
    @Override
    public void displayDetail() {
        System.out.println("id=" + id + ", fullName=" + fullName + ", address=" + address +" Java score: " +accountingScore+" CSS score: "+ marketingScore);
    }    

    @Override
    public void displayNameGpa() {
        System.out.println("Name:"+ fullName +", GPA: "+ this.Calaverage(marketingScore, marketingScore)); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
