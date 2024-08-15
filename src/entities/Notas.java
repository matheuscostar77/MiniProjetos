package entities;

public class Notas {

    public String nome;
    public int nota1;
    public int nota2;
    public int nota3;
    public int soma = 0;

    public int somadorNota(int n1, int n2, int n3) {
        for (int i = 1; i <= 3; i++) {
            soma = nota1 + nota2 + nota3;
        }
        return soma;

    }

}

