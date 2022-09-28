package lab5;
public class test {
    public static void main(String[] args) {
        Factory factory = new Factory();
        На_окладе emp1 = new На_окладе("Иван", "Иванов", 30, "+7924192986", "1",
                75000.0, false);
        На_окладе emp2 = new На_окладе("Михаил", "Михайлов", 18, "+7954954992",
                "2", 35984.0, true);
        Почасовая_оплата emp3 = new Почасовая_оплата("Мария", "Мариевна", 65,
                "9875945919", "3", 100000.0, "987654");
        factory.addEmployee(emp1);
        factory.addEmployee(emp2);
        factory.addEmployee(emp3);
        factory.printEmployees();
    }
}
