package lab5;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий предприятие, на котором работают работники
 */
public class Factory {

    /**
     * Массив с работниками
     */
    private List<Employee> employees = new ArrayList<>();

    /**
     * Добавляет работника на предприятие
     * @param e - объект работника
     */
    public void addEmployee(Employee e) {
        employees.add(e);
    }

    /**
     * Удаляет работника из предприятия
     * @param e - объект работника
     */
    public void removeEmployee(Employee e) {
        if(employees.remove(e))
            System.out.println("Работник удален из предприятия");
        else
            System.out.println("Неудачное удаление. Работник не найден на предприятии");
    }

    /**
     * Выводит всех работников, работающих на предприятии, а также количество работников на окладе и с почасовой оплатой
     */
    public void printEmployees() {
        int оклад = 0;
        int почас = 0;

        for (Employee emp: employees) {
            System.out.println(emp);
            if(emp instanceof На_окладе)
                оклад++;
            else
                почас++;
        }
        System.out.println("Всего на предприятии " + оклад + " работников на окладе и " + почас + " работников с почасовой оплатой");
    }
}
