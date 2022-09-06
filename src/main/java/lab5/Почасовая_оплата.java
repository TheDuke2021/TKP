package lab5;

/**
 * Класс, представляющий работника с почасовой оплатой
 */
public class Почасовая_оплата extends Employee {

    /**
     * Страховой номер работника
     */
    private String страховой_номер;

    /**
     *
     * @return {@link Почасовая_оплата#страховой_номер}
     */
    public String getСтраховой_номер() {
        return страховой_номер;
    }

    /**
     *
     * @param {@link Почасовая_оплата#страховой_номер}
     */
    public void setСтраховой_номер(String страховой_номер) {
        this.страховой_номер = страховой_номер;
    }

    /**
     * Конструктор по умолчанию
     * @see Employee#Employee()
     */
    public Почасовая_оплата() {
        super();
    }

    /**
     * Конструктор с параметрами, переопределяющий метод из класса {@link Employee}
     * @param firstname - имя работника
     * @param lastname - фамилия работника
     * @param age - возраст работника
     * @param number - сотовый номер работника
     * @param code - внутренний код работника
     * @param salary - зарплата работника
     * @param страховой_номер - страховой номер работника
     */
    public Почасовая_оплата(String firstname, String lastname, int age, String number, String code, Double salary, String страховой_номер) {
        super(firstname, lastname, age, number, code, salary);
        this.страховой_номер = страховой_номер;
    }
}
