package lab4;

public class Почасовая_оплата extends Employee {

    private String страховой_номер;

    public String getСтраховой_номер() {
        return страховой_номер;
    }

    public void setСтраховой_номер(String страховой_номер) {
        this.страховой_номер = страховой_номер;
    }

    public Почасовая_оплата() {
        super();
    }

    public Почасовая_оплата(String firstname, String lastname, int age, String number, String code, Double salary, String страховой_номер) {
        super(firstname, lastname, age, number, code, salary);
        this.страховой_номер = страховой_номер;
    }
}
