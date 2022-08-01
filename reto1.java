package reto1;


///Aqui es donde comienza el codigo 

import java.util.Scanner;

public class Reto1 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String entrada = sc.nextLine();
    String[] ent = entrada.split(" ");

    double masa = Double.parseDouble(ent[0]);
    double altura = Double.parseDouble(ent[1]);
    int edad = Integer.parseInt(ent[2]);
    double imc = calcularIMC(masa, altura);
    
     if (validarEntrada(masa, altura, edad){
        System.out.println(String.format("%.1f", imc) + " " + calcularRiesgo(imc, edad) );
    }else{
        System.out.println("ERROR")
              }

    public double calcularIMC(double masa, double altura) {
        return (masa / (altura * altura));
    }

    public String calcularRiesgo(double imc, int edad) {
        String riesgo = " ";
        if (imc < 22 && edad < 45) {
            riesgo = "bajo";
        }
        if (imc < 22 && edad >= 45) {
            riesgo = "medio";
        }
        if (imc >= 22 && edad < 45) {
            riesgo = "medio";
        }
        if (imc >= 22 && edad >= 45) {
            riesgo = "alto";
        }
        return riesgo;
    }

    public boolean validarEntrada(double masa, double altura, int edad) {
        if ((masa < 0 || masa > 150) || (altura > 0.1 || altura < 2.5) || (edad > 0 || edad < 110)) {
            return false;
        }
        return true;
    }
    
}

}
