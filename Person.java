package project;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected String phonenumber;
    protected String address;
    protected Date dayofbirth;

    public Person(String name, String gender, String phonenumber, String address, Date dayofbirth) {
        this.name = name;
        this.gender = gender;
        this.phonenumber = phonenumber;
        this.address = address;
        this.dayofbirth = dayofbirth;
    }
    
    static Scanner input = new Scanner(System.in);

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender) {
            this.gender = gender;
    }

    public String getPhonenumber(){
        return phonenumber;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Date getDayofbirth(){
        return dayofbirth;
    }
    public void setDayofbirth(Date dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    

    void Show(){
        System.out.printf("| Name: %s | Gender: %s | Address: %s | Number phone: %s | Date of birth: %d / %d / %d |",
        getName(),getGender(),getAddress(),getPhonenumber(),dayofbirth.getDay(),dayofbirth.getMonth(),dayofbirth.getYear());
    }
    
}
