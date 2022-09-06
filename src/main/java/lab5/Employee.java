package lab5;

/**
 * Класс, представляющий работника предприятия
 * @author Damir
 * @since 1.8
 */
public class Employee {

    /**
     * Имя работника
     */
    private String firstname;
    /**
     * Фамилия работника
     */
    private String lastname;
    /**
     * Возраст работника
     */
    private int age;
    /**
     * Сотовый номер работника
     */
    private String number;
    /**
     * Внутренний код работника
     */
    private String code;
    /**
     * Зарплата работника
     */
    private Double salary;

    /**
     * Конструктор по умолчанию
     * @author Damir
     */
    public Employee() {
        firstname = "";
        lastname = "";
        age = -1;
        number = "";
        code = "";
        salary = -1.0;
    }

    /**
     * Конструктор с параметрами
     * @param firstname - имя работника
     * @param lastname - фамилия работника
     * @param age - возраст работника
     * @param number - сотовый номер работника
     * @param code - внутренний код работника
     * @param salary - зарплата работника
     */
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
