/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author um5ro
 */
public class BankInfo {
    String name="";
    String cardNumber="";
    String email="";
    String phoneNumber="";
    String password="";
    double balance;
    double savingBalance;
    
    public String getName() {
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setCardNumber(String CN) {
        cardNumber = CN;
    }
    
    public void setEmail(String e) {
        email = e;
    }
    
    public void setPhoneNumber(String PN) {
        phoneNumber = PN;
    }
    
    public void setPassword(String p) {
        password = p;
    }
    
    public void setBalance(double b){
        balance = b;
    }
    public void setSavingBalance(double b2){
        savingBalance = b2;
    }
}
