package app;

import entiti.Calc;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Deseja outra cotacao? (N para sair): ");
            String key = input.next();

            if(Objects.equals(key, "n") || Objects.equals(key, "N")){
                input.close();
                break;
            }else{
                System.out.print("Qual o valor da Cotacao ?  ");
                double price = input.nextDouble();
                System.out.print("Quantos voce deseja trocar?  ");
                double valor = input.nextDouble();

                System.out.printf("Esta quantidade em Reais equivale a: %.2f%n", Calc.DollarReal(valor, price));
                System.out.println();
            }


        }
    }
}
