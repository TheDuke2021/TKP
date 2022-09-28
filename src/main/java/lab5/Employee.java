package lab5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    public Employee(String firstname, String lastname, int age, String number,
                    String code, Double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.number = number;
        this.code = code;
        this.salary = salary;
    }
    /**
     *
     * @return имя работника
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     *
     * @param firstname имя работника
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    /**
     *
     * @return фамилия работника
     */
    public String getLastname() {
        return lastname;
    }
    /**
     *
     * @param lastname фамилия работника
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    /**
     *
     * @return возраст работника
     */
    public int getAge() {
        return age;
    }
    /**
     *
     * @param age - целое положительное число, обозначающее возраст работника
     * @throws Exception если в качестве параметра передано отрицательное число
     */
    public void setAge(int age) throws Exception{
        if(age <= 0)
            throw new Exception("Age cannot be negative");
        this.age = age;
    }
    /**
     *
     * @return номер телефона работника
     */
    public String getNumber() {
        return number;
    }
    /**
     *
     * @param number - номер телефона работника
     * @throws Exception если номер телефона введён в неправильном формате
     */
    public void setNumber(String number) throws Exception{
        Pattern pattern = Pattern.compile("^((8|\\+7)[\\-]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
        Matcher matcher = pattern.matcher(number);
        if(!matcher.find())
            throw new Exception("Invalid number format");
        String newNumber = number.substring(matcher.start(), matcher.end());
        this.number = number;
    }
    /**
     *
     * @return внутренний код работника
     */
    public String getCode() {
        return code;
    }
    /**
     *
     * @param code внутренний код работника
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     *
     * @return зарплата работника
     */
    public Double getSalary() {
        return salary;
    }
    /**
     *
     * @param salary зарплата работника
     */
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