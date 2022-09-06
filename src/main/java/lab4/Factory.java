package lab4;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(Employee e) {
        if(employees.remove(e))
            System.out.println("Работник удален из предприятия");
        else
            System.out.println("Неудачное удаление. Работник не найден на предприятии");
    }

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
