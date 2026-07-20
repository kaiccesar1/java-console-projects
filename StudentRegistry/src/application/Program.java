package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        List<Aluno> alunos = new ArrayList<>();

        int opc = 1;
        while(opc != 0){
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Remover aluno");
            System.out.println("3 - Listar alunos");

            System.out.print("Opção: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Nome: ");
                    String name = sc.nextLine();

                    System.out.print("Idade: ");
                    int age = sc.nextInt();

                    alunos.add(new Aluno(name, age));
                    break;

                case 2:
                    System.out.print("Posicao do elemento: ");
                    int id = sc.nextInt();

                    if(id < 0 || id >= alunos.size()){
                        System.out.println("ID invalido");
                        break;
                    }

                    alunos.remove(id);
                    break;

                case 3:
                    for(int i = 0; i < alunos.size(); i++){
                        System.out.println("ID: " + i + " - " + alunos.get(i));
                    }
                    break;
                default:
                    System.out.print("Opcao inválida\nDigite novamente: ");
                    opc = sc.nextInt();
            }
        }
        sc.close();
    }
}
