package project;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Teacher> ArrListTeacher = new ArrayList<>();
    static Method obj = new Method();
    public static void menu(){
        System.out.println("Here are function of the application");
        System.out.println("Enter number 0 to end the application");
        System.out.println("Enter number 1 to enter new teacher");
        System.out.println("Enter number 2 to show information of all teacher in school");
        System.out.println("Enter number 3 to show information of one teacher in school");
        System.out.println("Enter number 4 to sort teacher in school");
        System.out.println("Enter number 5 to insert one teacher join school");
        System.out.println("Enter number 6 to update information of one teacher in school");
        System.out.println("Enter number 7 to remove one teacher out school");
        System.out.println("Which function do you want use, please enter your number");
        byte choice = input.nextByte();
        switch (choice){
            case 0 : {
                System.out.println("Thank you for your used my application");
                System.out.println("See you late");
                break;
            }
            case 1 : {
                Method.inputTeacher(ArrListTeacher);
                System.out.println();
                menu();
                break;
            }
            case 2 : {
                if(Teacher.count == 0){
                    System.out.println("School hasn't teacher");
                    System.out.println();
                }
                else{
                    System.out.printf("Have %d teachers in school",Teacher.count);
                    System.out.println();
                    for(Teacher i : ArrListTeacher){
                        i.show();
                        System.out.println();
                    }
                }
                menu();
                break;
            }
            case 3 :{
                System.out.println("Here are 2 option");
                System.out.println("You want search by ID, please enter number 1");
                System.out.println("You want search by Name, please enter number 2");
                System.out.println("You want back, please enter number 0");
                byte option = input.nextByte();
                switch(option){
                    case 0:{
                        break;
                    }
                    case 1 : {
                        System.out.println("Enter ID of teacher you want display:");
                        obj.showInfOneTeacher(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                        System.out.println();
                        menu();
                        break;
                    }
                    case 2 :{
                        System.out.println("Enter Name of teacher you want display:");
                        input.nextLine();
                        obj.showInfOneTeacher(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                        System.out.println();
                        menu();
                        break;
                    }
                    default : {
                        System.out.println("Please choose again");
                        menu();
                    }
                }
                break;
            }
            case 4 : {
                System.out.println("Here are 3 option");
                System.out.println("Enter number 1 to sort by ID");
                System.out.println("Enter number 2 to sort by Name");
                System.out.println("Enter number 3 to sort by Salary");
                System.out.println("You want back, please enter number 0");
                byte option = input.nextByte();
                switch(option){
                    case 0 :{
                        break;
                    }
                    case 1 : {
                        obj.sortId(ArrListTeacher);
                        System.out.println();
                        System.out.printf("List after sort");
                        System.out.println();
                        for(Teacher i : ArrListTeacher){
                            i.show();
                            System.out.println();
                        }
                        menu();
                        break;
                    }
                    case 2 : {
                        obj.sortName(ArrListTeacher);
                        System.out.println();
                        System.out.printf("List after sort");
                        System.out.println();
                        for(Teacher i : ArrListTeacher){
                            i.show();
                            System.out.println();
                        }
                        menu();
                        break;
                    }
                    case 3 : {
                        obj.sortSalary(ArrListTeacher);
                        System.out.println();
                        System.out.printf("List after sort");
                        System.out.println();
                        for(Teacher i : ArrListTeacher){
                            i.show();
                            System.out.println();
                        }
                        menu();
                        break;
                    }
                    default : {
                        System.out.println("Please choose again");
                        menu();
                    }
                }
                break;
            }
            case 5 : {
                System.out.println("Here are 2 option");
                System.out.println("Insert before another teacher, please enter number 1");
                System.out.println("Insert after another teacher, please enter number 2");
                System.out.println("You want back, please enter number 0");
                byte option = input.nextByte();
                switch(option){
                    case 0 : {
                        break;
                    }
                    case 1 : {
                        System.out.println("You want search ID, please enter number 1");
                        System.out.println("You want search Name, please enter number 2");
                        System.out.println("You want back, please enter number 0");
                        byte choosen = input.nextByte();
                        switch(choosen){
                            case 0: {
                                break;
                            }
                            case 1 : {
                                System.out.println("Enter ID you want search");
                                obj.insertBefore(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                System.out.println();
                                System.out.printf("List after insert");
                                System.out.println();
                                for(Teacher i : ArrListTeacher){
                                    i.show();
                                    System.out.println();
                                }
                                menu();
                                break;
                            } 
                            case 2 : {
                                System.out.println("Enter Name you want search");
                                input.nextLine();
                                obj.insertBefore(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                System.out.println();
                                System.out.printf("List after insert");
                                System.out.println();
                                for(Teacher i : ArrListTeacher){
                                    i.show();
                                    System.out.println();
                                }
                                menu();
                                break;
                            }
                            default : {
                                System.out.println("Please choose again");
                                menu();
                            }
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("You want search ID, please enter number 1");
                        System.out.println("You want search Name, please enter number 2");
                        System.out.println("You want back, please enter number 0");
                        byte choosen = input.nextByte();
                        switch(choosen){
                            case 0: {
                                break;
                            }
                            case 1 : {
                                System.out.println("Enter ID you want search");
                                obj.insertAfter(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                System.out.println();
                                System.out.printf("List after insert");
                                System.out.println();
                                for(Teacher i : ArrListTeacher){
                                    i.show();
                                    System.out.println();
                                }
                                menu();
                                break;
                            }
                            case 2 : {
                                System.out.println("Enter Name you want search");
                                input.nextLine();
                                obj.insertAfter(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                System.out.println();
                                System.out.printf("List after insert");
                                System.out.println();
                                for(Teacher i : ArrListTeacher){
                                    i.show();
                                    System.out.println();
                                }
                                menu();
                                break;
                            }
                            default : {
                                System.out.println("Please choose again");
                                menu();
                            }
                        }
                        break;
                    }  
                }
                break;
            }
            case 6 : {
                System.out.println("You want update by what");
                System.out.println("Update by ID, please enter number 1");
                System.out.println("Update by Name, please enter number 2");
                System.out.println("You want back, please enter number 0");
                byte choosen = input.nextByte();
                switch (choosen){
                    case 0: {
                        break;
                    }
                    case 1 : {
                        System.out.println("What information do you want update:");
                        System.out.println("Enter numbere 1 to update Name");
                        System.out.println("Enter numbere 2 to update gender");
                        System.out.println("Enter numbere 3 to update phone number");
                        System.out.println("Enter numbere 4 to update address");
                        System.out.println("Enter numbere 5 to update day of birth");
                        System.out.println("Enter numbere 6 to update ID teacher");
                        System.out.println("Enter numbere 7 to update Date join school");
                        System.out.println("Enter numbere 8 to update time teaching");
                        System.out.println("Enter numbere 9 to update salary");
                        System.out.println("Enter numbere 10 to update email");
                        System.out.println("You want back, please enter number 0");
                        System.out.println("Plaese enter number to update:");
                        byte option = input.nextByte();
                        switch(option){
                            case 0 : {
                                break;
                            }
                            case 1 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateName(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 2 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateGender(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 3 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateNumberPhone(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 4 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateAddress(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 5 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateDayOfBirth(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 6 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateIdTeacher(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 7 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateDayEnterSchool(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 8 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateTimeTeaching(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 9 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateSalary(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 10 : {
                                System.out.println("Enter ID where you want update");
                                obj.updateEmail(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            default : {
                                System.out.println("Please choose again");
                                menu();
                            }
                        }
                        break;
                    }
                    case 2 : {
                        System.out.println("What information do you want update:");
                        System.out.println("Enter numbere 1 to update Name");
                        System.out.println("Enter numbere 2 to update gender");
                        System.out.println("Enter numbere 3 to update phone number");
                        System.out.println("Enter numbere 4 to update address");
                        System.out.println("Enter numbere 5 to update day of birth");
                        System.out.println("Enter numbere 6 to update ID teacher");
                        System.out.println("Enter numbere 7 to update Date join school");
                        System.out.println("Enter numbere 8 to update time teaching");
                        System.out.println("Enter numbere 9 to update salary");
                        System.out.println("Enter numbere 10 to update email");
                        System.out.println("You want back, please enter number 0");
                        System.out.println("Plaese enter number to update:");
                        byte option = input.nextByte();
                        switch(option){
                            case 0 : {
                                break;
                            }
                            case 1 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateName(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 2 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateGender(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 3 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateNumberPhone(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 4 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateAddress(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 5 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateDayOfBirth(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 6 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateIdTeacher(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 7 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateDayEnterSchool(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 8 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateTimeTeaching(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 9 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateSalary(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            case 10 : {
                                System.out.println("Enter Name where you want update");
                                input.nextLine();
                                obj.updateEmail(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                                break;
                            }
                            default : {
                                System.out.println("Please choose again");
                                menu();
                            }
                        }
                        break;
                    }
                    
                }
                break;
            }
            case 7 : {
                System.out.println("You want back, please enter number 0");
                System.out.println("You want remove by ID, please enter number 1");
                System.out.println("You want remove by Name, please enter number 2");
                byte option = input.nextByte();
                switch(option){
                    case 0 : {
                        break;
                    }
                    case 1 : {
                        System.out.println("Enter ID where you want remove");
                        obj.removeTeacher(obj.searchId(input.nextInt(), ArrListTeacher), ArrListTeacher);
                        System.out.println();
                        System.out.printf("List after remove");
                        System.out.println();
                        for(Teacher i : ArrListTeacher){
                            i.show();
                            System.out.println();
                        }
                        menu();
                        break;
                    }
                    case 2 : {
                        System.out.println("Enter Name where you want remove");
                        obj.removeTeacher(obj.searchName(input.nextLine(), ArrListTeacher), ArrListTeacher);
                        System.out.println();
                        System.out.printf("List after remove");
                        System.out.println();
                        for(Teacher i : ArrListTeacher){
                            i.show();
                            System.out.println();
                        }
                        menu();
                        break;
                    }
                    default : {
                        System.out.println("Please choose again");
                        menu();
                    }
                }
                break;
            }
            default : {
                System.out.println("Please choose again");
                menu();
            }
        }
    }

            
    public static void main(String[] args) {
        System.out.println("Welcome to application management teacher");
        menu();
    }
    
}


