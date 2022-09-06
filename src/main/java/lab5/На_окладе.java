package lab5;

/**
 * Класс работника, находящегося на окладе
 */
public class На_окладе extends Employee {

    /**
     * Переменная, показывающая, находится ли работник в декрете
     */
    private boolean вДекрете;

    /**
     *
     * @return true - если работник находится в декрете, false - если нет
     */
    public boolean isвДекрете() {
        return вДекрете;
    }

    /**
     *
     * @param вДекрете - boolean значение - находится ли работник в декрете
     */
    public void setвДекрете(boolean вДекрете) {
        this.вДекрете = вДекрете;
    }

    /**
     * Конструктор по умолчанию
     * @see Employee#Employee()
     */
    public На_окладе() {
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
     * @param вДекрете - находится ли работник в декрете
     */
    public На_окладе(String firstname, String lastname, int age, String number, String code, Double salary, boolean вДекрете) {
        super(firstname, lastname, age, number, code, salary);
        this.вДекрете = вДекрете;
    }
}
