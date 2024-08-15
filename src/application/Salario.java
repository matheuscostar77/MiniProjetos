package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Funcionario;

public class Salario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario aumento = new Funcionario();

        System.out.print("Name: ");
        aumento.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        aumento.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        aumento.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: "+aumento);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percent = sc.nextDouble();
        aumento.increaseSalary(percent);

        System.out.println("Updated data: "+aumento);


        sc.close();
    }
}
