package project;

public class Teacher extends Person {
    private int idTeacher;
    private Date dateEnterSchool;
    private int timeTeachingEachMonth;
    private float salary;
    private String email;

    public static int count;

    public Teacher(String name, String gender, String phonenumber, String address, Date dayofbirth,int idTeacher, Date dateEnterSchool, int timeTeachingEachMonth, float salary, String email) {
        super(name,gender,phonenumber, address, dayofbirth);
        this.idTeacher = idTeacher;
        this.dateEnterSchool = dateEnterSchool;
        this.timeTeachingEachMonth = timeTeachingEachMonth;
        this.salary = salary;
        this.email = email;
        count++;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public Date getDateEnterSchool() {
        return dateEnterSchool;
    }

    public void setDateEnterSchool(Date dateEnterSchool) {
        this.dateEnterSchool = dateEnterSchool;
    }

    public int getTimeTeachingEachMonth() {
        return timeTeachingEachMonth;
    }

    public void setTimeTeachingEachMonth(int timeTeachingEachMonth) {
        this.timeTeachingEachMonth = timeTeachingEachMonth;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary >= 0) {
            this.salary = salary;

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void show() {
        System.out.printf("Have %d teachers in school", count);
        System.out.println();
        super.Show();
        System.out.printf(
                " Id: %d | Date join the school: %d / %d / %d | Time teaching: %d | Salary: %.1f | Email: %s |",
                getIdTeacher(), dateEnterSchool.getDay(), dateEnterSchool.getMonth(), dateEnterSchool.getYear(),
                getTimeTeachingEachMonth(), getSalary(), getEmail());
        System.out.println();
    }

}
