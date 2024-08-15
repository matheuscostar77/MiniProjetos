package application;


import entities.Notas;

import java.util.Scanner;

public class Aluno {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Notas nota = new Notas();

        System.out.println("Digite seu nome: ");
        nota.nome = sc.nextLine();

        System.out.print("Digite sua nota do  bimestre: ");
        nota.nota1 = sc.nextInt();
        System.out.print("Digite sua nota do  bimestre: ");
        nota.nota2 = sc.nextInt();
        System.out.print("Digite sua nota do  bimestre: ");
        nota.nota3 = sc.nextInt();


        System.out.println(nota.somadorNota(nota.nota1,nota.nota2,nota.nota3));
        if (nota.somadorNota(nota.nota1,nota.nota2,nota.nota3) < 60) {

            System.out.println("Reprovado");
            System.out.printf("Faltam: %d", 60-nota.somadorNota(nota.nota1,nota.nota2,nota.nota3));
        }
        else {
            System.out.println("Aprovao");
        }

    }
}
