package equals_;

public class Manger extends Employee {
    private double bonus;

    public Manger(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        return bonus+super.getSalary();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equal(Object otherObject){
        if(!super.equals(otherObject)) return false;
        Manger other = (Manger) otherObject;
        Boolean flag =  bonus == other.bonus;
        return flag;
    }

    public int hashCode(){
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus" + bonus +"]";
    }
}
