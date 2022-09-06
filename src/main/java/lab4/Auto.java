package lab4;

public class Auto {
    private String firm;
    private int maxSpeed;
    //Гос номер машины
    private String plate;


    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setFirm(String firma){
        firm = firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed = speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public Auto(){
        firm = "Без названия";
        maxSpeed = 0;
    }
    public Auto(String firma, int speed){
        firm = firma;
        maxSpeed = speed;
    }
}