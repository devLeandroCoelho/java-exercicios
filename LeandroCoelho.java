package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class LeandroCoelho {
    public static void main(String[] args) {
        LeandroCoelho leandroCoelho = new LeandroCoelho();
        leandroCoelho.metodo1();
        leandroCoelho.metodo2();
        leandroCoelho.metodo3();
    }

    private void metodo1() { // passando a quantidade de numeros que vai apresentar

        /* Método 1: Deve criar a sequencia de fibonacci até o décimo item. (não é só imprimir, tem de calcular com for ou while) -
         *  Deve imprimir:
         *                   1
         *                   1
         *                   2
         *                   3
         *                   5
         *                   8
         *                   13
         *                   21
         *                   34
         *                   55
         */
        int num1 = 1, num2 = 0;
        System.out.println("\n=================================\nMETODO 1 (Fibonacci): \n=================================");
        System.out.println(num1);

        for (int i = 0; i < 9; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

    }

    private void metodo2() {
        /* Método 2. Criar um método que pergunte por um valor e informe quantas notas, usando notas de 1,2,5 e 10 serão usadas neste cálculo. */
        System.out.println("\n=================================\nMETODO 2 (Quantidade Notas): \n=================================");
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        int[] notas = {10, 5, 2, 1};
        int[] numeroNotas = {0, 0, 0, 0};
        int i = 0;
        System.out.println("Digite um valor inteiro maior que ZERO");
        valor = sc.nextInt();
        System.out.println("Para o valor R$ " + valor + ", teremos o seguinte numero de notas: ");
        for (int nota : notas) {
            if (valor >= nota) {
                numeroNotas[i] = valor / nota;
            }
            valor -= numeroNotas[i] * nota;
            i++;
        }
        int j = 0;
        for (int numNotas : numeroNotas) {
            System.out.println("- " + numNotas + " notas de R$" + notas[j]);
            j++;
        }
    }

    private void metodo3() {
        /*Método 3. Crie um array, com 10 posições, pergunte o nome de até 10 alunos, insira no array, ORDENE o array (existe uma classe para isto), imprima o array ordenado.*/
        System.out.println("\n=================================\nMETODO 3 (Ordenação Array): \n=================================");

        String[] alunos = {"","","","","","","","","",""};

        Scanner sc = new Scanner(System.in);
        int x = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o  nome do " + x + "º Aluno");
            alunos[i] = sc.nextLine();
            ++x;
        }
        Arrays.sort(alunos);
        System.out.println("LISTA DE ALUNOS EM ORDEM ALFABÉTICA (A-Z):");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
