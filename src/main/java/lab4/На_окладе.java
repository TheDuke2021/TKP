package lab4;

public class На_окладе extends Employee{

    private boolean вДекрете;

    public boolean isвДекрете() {
        return вДекрете;
    }

    public void setвДекрете(boolean вДекрете) {
        this.вДекрете = вДекрете;
    }

    public На_окладе() {
        super();
    }

    public На_окладе(String firstname, String lastname, int age, String number, String code, Double salary, boolean вДекрете) {
        super(firstname, lastname, age, number, code, salary);
        this.вДекрете = вДекрете;
    }
}
