package project;

import java.util.*;
import java.util.regex.Pattern; // bieu thuc chinh quy, dinh dang mot chuoi

public class Method {
    static Scanner input = new Scanner(System.in);

    // Phuong thuc nhap vao
    public static void inputTeacher(ArrayList<Teacher> arr) {
        System.out.println("Enter name: ");
        String name = input.nextLine();
        do {
            if (checkName.matcher(name).find()) {
                break;
            } else {
                System.out.println("Enter name again ");
                name = input.nextLine();
            }
        } while (true);

        System.out.println("Enter gender: ");
        String gender = input.nextLine();
        do {
            if (gender.equals("male") || gender.equals("female") || gender.equals("Male") || gender.equals("Female")) {
                break;
            } else {
                System.out.println("Enter gender again:");
                gender = input.nextLine();
            }
        }
        while (true);
        System.out.println("Enter phone number: ");
        String phonenumber = input.nextLine();
        do {
            if (checkPhone.matcher(phonenumber).find()) {
                break;
            } else {
                System.out.println("Enter phone number again");
                phonenumber = input.nextLine();

            }
        } while (true);
        System.out.println("Enter address: ");
        String address = input.nextLine();
        System.out.println("Enter day of birth: ");
        System.out.println("Enter day: ");
        int dayofbirth = (input.nextInt());
        System.out.println("Enter month: ");
        int monthofbirth = (input.nextInt());
        System.out.println("Enter year: ");
        int yearofbirth = (input.nextInt());
        do {
            if (Date.checkDate(dayofbirth, monthofbirth, yearofbirth)) {
                break;
            } else {
                System.out.println("Date Of Violation is wrong, enter agian:");
                System.out.println("Enter Day:");
                dayofbirth = input.nextInt();
                System.out.println("Enter month:");
                monthofbirth = input.nextInt();
                System.out.println("Enter year:");
                yearofbirth = input.nextInt();
            }
        } while (true);
        System.out.println("Enter id teacher: ");
        int idTeacher = (input.nextInt());
        System.out.println("Enter date join the school: ");
        System.out.println("Enter day: ");
        int day = (input.nextInt());
        System.out.println("Enter month: ");
        int month = (input.nextInt());
        System.out.println("Enter year: ");
        int year = (input.nextInt());
        do {
            if (Date.checkDate(day, month, year)) {
                break;
            } else {
                System.out.println("Date Of Violation is wrong, enter agian:");
                System.out.println("Enter Day:");
                day = input.nextInt();
                System.out.println("Enter month:");
                month = input.nextInt();
                System.out.println("Enter year:");
                year = input.nextInt();
            }
        } while (true);
        System.out.println("Enter time of teaching each month: ");
        int timeTeachingEachMonth = (input.nextInt());
        System.out.println("Enter salary of teacher: ");
        float salary = (input.nextFloat());
        input.nextLine();
        System.out.println("Enter email of teacher: ");
        String email = (input.nextLine());
        arr.add(new Teacher(name, gender, phonenumber, address, new Date(dayofbirth, monthofbirth, yearofbirth),
                idTeacher, new Date(day, month, year), timeTeachingEachMonth, salary, email));
    }

    // Phuong thuc tim kiem theo ID cua giao vien
    public int searchId(int index, ArrayList<Teacher> arr) {
        for (Teacher i : arr) {
            if (i.getIdTeacher() == index) {
                return arr.indexOf(i);
            }
        }
        return -1; // trả về giá trị cho phương thức

    }

    // Phuong thuc tim kiem theo ten cua giao vien
    public int searchName(String name, ArrayList<Teacher> arr) {
        for (Teacher i : arr) {
            if (i.getName().equals(name)) {
                return arr.indexOf(i); // trả về vị trí của i có giá trị đó ở trong mảng arr
            }
        }
        return -1;
    }

    // Phuong thuc sap xep theo ten
    public void sortName(ArrayList<Teacher> arr) {
        if (arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size() - j; j++) {
                    if (arr.get(j).getName().compareTo(arr.get(j + 1).getName()) > 0) {
                        Teacher temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                    }
                }
            }
        }
    }

    // Phuong thuc sap xep theo ID
    public void sortId(ArrayList<Teacher> arr) {
        if (arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size() - j; j++) {
                    if (arr.get(j).getIdTeacher() < arr.get(j + 1).getIdTeacher()) {
                        Teacher temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                    }
                }
            }
        }
    }

    // Phuong thuc sap xep theo luong tu thap den cao
    public void sortSalary(ArrayList<Teacher> arr) {
        if (arr.size() > 1) {
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size() - j; j++) {
                    if (arr.get(j).getSalary() < arr.get(j + 1).getSalary()) {
                        Teacher temp = arr.get(j);
                        arr.set(j, arr.get(j + 1));
                        arr.set(j + 1, temp);
                    }
                }
            }
        }
    }

    // Phuong thuc update
    // --------------------------------------
    // update name
    public void updateName(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter ID you want update");
                String name = input.nextLine();
                do { 
                    if (checkName.matcher(name).find()) {
                        break;
                    } else {
                        System.out.println("Enter name again ");
                        name = input.nextLine(); 
                    }
                } while (true);
                arr.get(index).setName(name);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // update gender
    public void updateGender(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter gender you want update");
                String gender = input.nextLine();
                do {
                    if (gender.equals("male") || gender.equals("female") || gender.equals("Male")
                            || gender.equals("Female")) {
                        break;
                    } else {
                        System.out.println("Enter gender again:");
                        gender = input.nextLine();
                    }
                } while (true);
                arr.get(index).setGender(gender);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update address
    public void updateAddress(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter address you want update");
                arr.get(index).setAddress(input.nextLine());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update number phone
    public void updateNumberPhone(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter phone number you want update");
                String phonenumber = input.nextLine();
                do {
                    if (checkPhone.matcher(phonenumber).find()) {
                        break;
                    } else {
                        System.out.println("Enter phone number again");
                        phonenumber = input.nextLine();

                    }
                } while (true);
                arr.get(index).setPhonenumber(phonenumber);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update day of birth
    public void updateDayOfBirth(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter day of birth you want update");
                System.out.println("Enter day: ");
                int day = (input.nextInt());
                System.out.println("Enter month: ");
                int month = (input.nextInt());
                System.out.println("Enter year: ");
                int year = (input.nextInt());
                arr.get(index).setDayofbirth(new Date(day, month, year));

            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update ID
    public void updateIdTeacher(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter ID you want update");
                arr.get(index).setIdTeacher(input.nextInt());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update time teaching
    public void updateTimeTeaching(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter time teaching each month you want update");
                arr.get(index).setTimeTeachingEachMonth(input.nextInt());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update salary
    public void updateSalary(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter salayr you want update");
                arr.get(index).setSalary(input.nextInt());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update email
    public void updateEmail(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter email you want update");
                arr.get(index).setEmail(input.nextLine());
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Update thoi gian vao truong
    public void updateDayEnterSchool(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter date you want update");
                System.out.println("Enter day: ");
                int day = (input.nextInt());
                System.out.println("Enter month: ");
                int month = (input.nextInt());
                System.out.println("Enter year: ");
                int year = (input.nextInt());
                arr.get(index).setDateEnterSchool(new Date(day, month, year));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // --------------------------------------------------

    // Phuong thuc xoa giao vien
    public void removeTeacher(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                arr.remove(index);
                Teacher.count--;
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Phuong thuc chen them giao vien moi vao truoc phan tu tim thay
    public void insertBefore(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter name: ");
                String name = input.nextLine();
                
                do {
                    if (checkName.matcher(name).find()){
                        break;
                    }
                    else{
                        System.out.println("Enter name again ");
                        name = input.nextLine();
                    }
                }
                while (true);
                System.out.println("Enter gender: ");
                String gender = input.nextLine();
                do {
                    if (gender.equals("male") || gender.equals("female") || gender.equals("Male")
                            || gender.equals("Female")) {
                        break;
                    } else {
                        System.out.println("Enter gender again:");
                        gender = input.nextLine();
                    }
                } while (true);
                System.out.println("Enter phonenumber: ");
                String phonenumber = input.nextLine();
                do {
                    if (checkPhone.matcher(phonenumber).find()) {
                        break;
                    } else {
                        System.out.println("Enter phone number again");
                        phonenumber = input.nextLine();

                    }
                } while (true);
                System.out.println("Enter address: ");
                String address = input.nextLine();
                System.out.println("Enter day of birth: ");
                System.out.println("Enter day: ");
                int dayofbirth = (input.nextInt());
                System.out.println("Enter month: ");
                int monthofbirth = (input.nextInt());
                System.out.println("Enter year: ");
                int yearofbirth = (input.nextInt());
                do {
                    if (Date.checkDate(dayofbirth, monthofbirth, yearofbirth)) {
                        break;
                    } else {
                        System.out.println("Date Of Violation is wrong, enter agian:");
                        System.out.println("Enter Day:");
                        dayofbirth = input.nextInt();
                        System.out.println("Enter month:");
                        monthofbirth = input.nextInt();
                        System.out.println("Enter year:");
                        yearofbirth = input.nextInt();
                    }
                } while (true);
                System.out.println("Enter id teacher: ");
                int idTeacher = (input.nextInt());
                System.out.println("Enter date join the school: ");
                System.out.println("Enter day: ");
                int day = (input.nextInt());
                System.out.println("Enter month: ");
                int month = (input.nextInt());
                System.out.println("Enter year: ");
                int year = (input.nextInt());
                do {
                    if (Date.checkDate(day, month, year)) {
                        break;
                    } else {
                        System.out.println("Date Of Violation is wrong, enter agian:");
                        System.out.println("Enter Day:");
                        day = input.nextInt();
                        System.out.println("Enter month:");
                        month = input.nextInt();
                        System.out.println("Enter year:");
                        year = input.nextInt();
                    }
                } while (true);
                System.out.println("Enter time of teaching each month: ");
                int timeTeachingEachMonth = (input.nextInt());
                System.out.println("Enter salary of teacher: ");
                float salary = (input.nextFloat());
                input.nextLine();
                System.out.println("Enter email of teacher: ");
                String email = (input.nextLine());
                arr.add(index,
                        new Teacher(name, gender, phonenumber, address, new Date(dayofbirth, monthofbirth, yearofbirth),
                                idTeacher, new Date(day, month, year), timeTeachingEachMonth, salary, email));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Phuong thuc chen them giao vien moi vao sau phan tu tim thay
    public void insertAfter(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                System.out.println("Enter name: ");
                String name = input.nextLine();
                do {
                    if (checkName.matcher(name).find()){
                        break;
                    }
                    else{
                        System.out.println("Enter name again ");
                        name = input.nextLine();
                    }
                }
                while (true);
                System.out.println("Enter gender: ");
                String gender = input.nextLine();
                do {
                    if (gender.equals("male") || gender.equals("female") || gender.equals("Male")
                            || gender.equals("Female")) {
                        break;
                    } else {
                        System.out.println("Enter gender again:");
                        gender = input.nextLine();
                    }
                } while (true);
                System.out.println("Enter phonenumber: ");
                String phonenumber = input.nextLine();
                do {
                    if (checkPhone.matcher(phonenumber).find()) {
                        break;
                    } else {
                        System.out.println("Enter phone number again");
                        phonenumber = input.nextLine();

                    }
                } while (true);
                System.out.println("Enter address: ");
                String address = input.nextLine();
                System.out.println("Enter day of birth: ");
                System.out.println("Enter day: ");
                int dayofbirth = (input.nextInt());
                System.out.println("Enter month: ");
                int monthofbirth = (input.nextInt());
                System.out.println("Enter year: ");
                int yearofbirth = (input.nextInt());
                do {
                    if (Date.checkDate(dayofbirth, monthofbirth, yearofbirth)) {
                        break;
                    } else {
                        System.out.println("Date Of Violation is wrong, enter agian:");
                        System.out.println("Enter Day:");
                        dayofbirth = input.nextInt();
                        System.out.println("Enter month:");
                        monthofbirth = input.nextInt();
                        System.out.println("Enter year:");
                        yearofbirth = input.nextInt();
                    }
                } while (true);
                System.out.println("Enter id teacher: ");
                int idTeacher = (input.nextInt());
                System.out.println("Enter date join the school: ");
                System.out.println("Enter day: ");
                int day = (input.nextInt());
                System.out.println("Enter month: ");
                int month = (input.nextInt());
                System.out.println("Enter year: ");
                int year = (input.nextInt());
                do {
                    if (Date.checkDate(day, month, year)) {
                        break;
                    } else {
                        System.out.println("Date Of Violation is wrong, enter agian:");
                        System.out.println("Enter Day:");
                        day = input.nextInt();
                        System.out.println("Enter month:");
                        month = input.nextInt();
                        System.out.println("Enter year:");
                        year = input.nextInt();
                    }
                } while (true);
                System.out.println("Enter time of teaching each month: ");
                int timeTeachingEachMonth = (input.nextInt());
                System.out.println("Enter salary of teacher: ");
                float salary = (input.nextFloat());
                input.nextLine();
                System.out.println("Enter email of teacher: ");
                String email = (input.nextLine());
                arr.add(index + 1,
                        new Teacher(name, gender, phonenumber, address, new Date(dayofbirth, monthofbirth, yearofbirth),
                                idTeacher, new Date(day, month, year), timeTeachingEachMonth, salary, email));
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    // Phuong thuc hien thi giao vien theo ID
    public void showInfOneTeacher(int index, ArrayList<Teacher> arr) {
        if (arr.size() > 0) {
            if (index != -1) {
                arr.get(index).show();
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("List is null");
        }
    }

    public static Pattern checkName = Pattern.compile("^[a-z A-z]{1,50}+$");
    public static Pattern checkPhone = Pattern.compile("^0[0-9]{9}+$");

}
