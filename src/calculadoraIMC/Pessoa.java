/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraIMC;

import java.util.Scanner;
public class Pessoa {
    private double altura;
    private double peso;
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    
     public void PerguntarPeso(){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Digite seu peso: ");
         peso = Scan.nextDouble();
       
    }
    public void PerguntarAltura(){
        Scanner Scan = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
         altura = Scan.nextDouble();
    }
    public double calcularImc(){
        double imc = peso/(altura*altura);
        return imc;
    }
   
    public void ClassificarImc(){
        if (calcularImc() <18.5){
            System.out.println("Abaixo do peso");
        }else if (calcularImc() >18.5 && calcularImc() <= 24.9){
            System.out.println("Peso ideal (Parabens!!)");
        } else if (calcularImc()>24.9 && calcularImc() <= 29.9) {
            System.out.println("Levemente acima do peso!");
        }else if(calcularImc() >29.9 && calcularImc() <= 34.9){
            System.out.println("obesidade");
        }else{
            System.out.println("Gordaoo aii");
        }
    }
}
