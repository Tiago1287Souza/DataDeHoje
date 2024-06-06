/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {

    public void Controller() {

        System.out.println("Digite sua idade:");

        Scanner scanner = new Scanner(System.in);

        

        Aluno aluno = new Aluno();

        aluno.setIdade(scanner.nextInt());
        
        System.out.println("Digite sua nome:");
        Scanner sc = new Scanner(System.in);
        aluno.setNome(sc.next());
        
        
        
        System.out.println("Digite sua nota1:");
        aluno.setNota1(scanner.nextDouble());
        System.out.println("Digite sua nota2:");
        aluno.setNota2(scanner.nextDouble());
        System.out.println("Digite sua nota3:");
        aluno.setNota3(scanner.nextDouble());
        System.out.println("Digite sua nota4:");
        aluno.setNota4(scanner.nextDouble());
        
        
        double resultado = (aluno.getNota1()+aluno.getNota2()+aluno.getNota3()+aluno.getNota4()) / 4;
        
        

        if (aluno.getIdade() >= 18 && aluno.getIdade() < 64) {

            System.out.println("VOCE PODE ESUDAR:  " + aluno.getNome());
            

        } else {
            if (aluno.getIdade() < 18) {
                System.out.println("NAO PODE" + aluno.getNome());
            } else {
                if (aluno.getIdade() > 64) {

                    System.out.println("IDOSO" + aluno.getNome());
                }
            }
        }
        
        if(resultado < 3) {
            
            System.out.println("Reprovado");
            
        } else {
            if (resultado < 6) {
                System.out.println("FINAL");
            } else {
                if (resultado >= 6) {
                    System.out.println("APROVADO");
                }
            }
        }

    }

}
