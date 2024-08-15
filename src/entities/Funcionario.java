package entities;

public class Funcionario {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percent){

            this.grossSalary += (grossSalary*(percent / 100));
    }

    public String toString(){
         return name
                 +", $"
                 +netSalary();
    }
}
