package lab4;

public class Employee {

    private String firstname;
    private String lastname;
    private int age;
    private String number;
    private String code;
    private Double salary;

    public Employee() {
        firstname = "";
        lastname = "";
        age = -1;
        number = "";
        code = "";
        salary = -1.0;
    }
    public Employee(String firstname, String lastname, int age, String number, String code, Double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.number = number;
        this.code = code;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", number='" + number + '\'' +
                ", code='" + code + '\'' +
                ", salary=" + salary +
                '}';
    }
}
