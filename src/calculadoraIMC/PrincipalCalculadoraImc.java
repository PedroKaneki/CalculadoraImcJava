/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraIMC;

/**
 *
 * @author pedro
 */
import  java.util.Scanner;
public class PrincipalCalculadoraImc {
    public static void main (String args[]){
        Pessoa pessoa = new Pessoa();
        pessoa.PerguntarPeso();
        pessoa.PerguntarAltura();
       
        System.out.printf("Seu imc e : %.2f%n",pessoa.calcularImc());
        pessoa.ClassificarImc();
        
    }
}
