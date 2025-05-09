package org.example;

import java.util.Scanner;

import org.example.util.Fibonacci;
import org.example.util.InvertText;
import org.example.util.SumAcc;

public class Main {

    public static void main(String[] args) {
        System.out.println("================ Iniciando ================");
        exc1();
        exc2();
        exc5();
    }

    public static void exc1() {
        SumAcc accumulated = new SumAcc();

        System.out.println("A soma acumalada de 13 é de " + accumulated.reduce(13));
    }

    public static void exc2() {
        Fibonacci fibc = new Fibonacci();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scan.nextInt();

        System.out.print("Sequência de Fibonacci até " + n + ": ");
        int i = 0;
        int fib;
        while (true) {
            fib = fibc.sequence(i);
            if (fib > n) {
                break;
            }
            System.out.print(fib + " ");
            i++;
        }

        System.out.println(" ");

        scan.close();
    }

    public static void exc5() {
        InvertText reverse = new InvertText();

        System.out.println("Texto -> teste | Texto invertido -> " + reverse.invert("teste"));
    }

}
