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
        
        System.out.println("Digite sua nome:");
        Scanner sc = new Scanner(System.in);
       

        Aluno aluno = new Aluno();

        aluno.setIdade(scanner.nextInt());
        aluno.setNome(sc.next());

        if (aluno.getIdade() >= 18 && aluno.getIdade() < 64) {

            System.out.println("VOCE PODE ESUDAR:  " +aluno.getNome());
            
        } else {
            if (aluno.getIdade() < 18) {
                System.out.println("NAO PODE");
            } else {
                if (aluno.getIdade() > 64) {

                    System.out.println("IDOSO");
                }
            }
        }

    }

}
