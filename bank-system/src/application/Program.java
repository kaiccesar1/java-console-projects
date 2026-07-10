package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Bem vindo ao JavaBank");
        System.out.println("Informe os dados do cliente");

        System.out.print("Nome: ");
        String name = sc.nextLine();

        System.out.print("Informe o CPF: ");
        String cpf = sc.nextLine();

        User p1 = new User(name, cpf);

        System.out.println("======= Menu JavaBank =======");

        int opc = 1;

        while(opc != 0){
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1 - Depositar:");
            System.out.println("2 - Sacar");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Consultar dados cadastrais");
            System.out.println("0 - Sair");

            System.out.print("Escolha a opção: ");
            opc = sc.nextInt();

            double value = 0.0;

            switch (opc){
                case 1:
                    System.out.print("Escolha o valor de deposito: ");
                    value = sc.nextDouble();
                    boolean res = p1.deposit(value);
                    if(res){
                        System.out.println("\nDeposito realizado com sucesso!");
                    } else {
                        System.out.println("\nHouve um erro inesperado. Tente novamente!");
                    }
                    break;
                case 2:
                    System.out.print("Escolha o valor de saque: ");
                    value = sc.nextDouble();
                    res = p1.withdraw(value);
                    if(res){
                        System.out.println("\nSaque realizado com sucesso!");
                    } else {
                        System.out.println("\nHouve um erro inesperado. Tente novamente!");
                    }
                    break;
                case 3:
                    System.out.printf("\nR$ %.2f%n", p1.balance());
                    break;
                case 4:
                    System.out.printf("Titular da conta: %s%n", p1.getName());
                    System.out.printf("CPF: %s%n", p1.getDoc());
                    System.out.printf("Número da conta: %d%n", p1.account());
                    break;
                case 0:
                    opc = 0;
                    break;
                default:
                    System.out.print("Opção inválida!\nDigite novamente");
                    break;
            }
        }
    }
}
