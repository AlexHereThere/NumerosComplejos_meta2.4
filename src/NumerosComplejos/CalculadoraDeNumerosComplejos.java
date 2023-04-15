/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NumerosComplejos;



import java.util.Random;
import java.util.Scanner;
/**
 * clase para realizar diferentes operaciones con 
 * los numeros complejos,esta vercion es para indicar su uso como estaticos los metodos  
 * 
 * @author (ACR)
 * @version (2)
 */
public class CalculadoraDeNumerosComplejos
{
    private static NumeroComplejo numero_complejo1;
    private static NumeroComplejo numero_complejo2;

    //constructor
    public CalculadoraDeNumerosComplejos()
    {
        numero_complejo1=new NumeroComplejo();
        numero_complejo2=new NumeroComplejo();
    }
    //constructor parametrizado
    public CalculadoraDeNumerosComplejos(NumeroComplejo num_comp1,NumeroComplejo num_comp2)
    {
        CalculadoraDeNumerosComplejos.numero_complejo1=num_comp1;
        CalculadoraDeNumerosComplejos.numero_complejo2=num_comp2;
    }
    
    //otros metodos...
    /**
     * para generar numeros complejos aleatorios.
     */
    public void generarValores()
    {
    Random rmd=new Random();
    numero_complejo1.setParteReal(rmd.nextDouble(41)-20);
    numero_complejo1.setParteImaginaria(rmd.nextDouble(41)-20);
    numero_complejo2.setParteReal(rmd.nextDouble(41)-20);
    numero_complejo2.setParteImaginaria(rmd.nextDouble(41)-20);
    }
    /**
     * para sumar los dos numeros complejos que se crearon y mostrar 
     * el resultado en consola.
     * @return 
     */
    public static NumeroComplejo sumar()
    {
       double resultadoParteReal=numero_complejo1.getParteReal()+numero_complejo2.getParteReal();
       double resultadoparteImaginaria=numero_complejo1.getParteImaginaria()+numero_complejo2.getParteImaginaria();
       return new NumeroComplejo(resultadoParteReal,resultadoparteImaginaria);
    }
    /**
     * para restar los dos numeros complejos que se crearon y mostrar 
     * el resultado en consola.
     * @return 
     */
    public static NumeroComplejo restar()
    {
       double resultadoParteReal=numero_complejo1.getParteReal()-numero_complejo2.getParteReal();
       double resultadoparteImaginaria=numero_complejo1.getParteImaginaria()-numero_complejo2.getParteImaginaria();
       return new NumeroComplejo(resultadoParteReal,resultadoparteImaginaria);
    }
    /**
     * para multiplicar los dos numeros complejos que se crearon y mostrar 
     * el resultado en consola.
     * @return 
     */
    public static NumeroComplejo multiplicar()
    {
        double ParteReal1=numero_complejo1.getParteReal()*numero_complejo2.getParteReal();
        double ParteReal2=-(numero_complejo1.getParteImaginaria()*numero_complejo2.getParteImaginaria());
        double parteImaginaria1=numero_complejo1.getParteReal()*numero_complejo2.getParteImaginaria();
        double parteImaginaria2=numero_complejo2.getParteReal()*numero_complejo1.getParteImaginaria();
        double resultadoParteReal=ParteReal1+ParteReal2;
       double resultadoparteImaginaria=parteImaginaria1+parteImaginaria2;
       return new NumeroComplejo(resultadoParteReal,resultadoparteImaginaria);
    }
    /**
     * para dividir los dos numeros complejos que se crearon y mostrar 
     * el resultado en consola.
     * @return 
     */
     public static NumeroComplejo dividir()
    {
         double parteImaginariaConjugadaDel2=-(numero_complejo2.getParteImaginaria());//se ocupa la conjugada del segundo numero imaginario
         //Sacar la parte de arriba de la division
        double parteReal1=numero_complejo1.getParteReal()*numero_complejo2.getParteReal();
        double parteReal2=-(numero_complejo1.getParteImaginaria()*parteImaginariaConjugadaDel2);//se hace menos por el i^2
        double parteImaginaria1=numero_complejo1.getParteReal()*parteImaginariaConjugadaDel2;
        double parteImaginaria2=numero_complejo2.getParteReal()*numero_complejo1.getParteImaginaria();
        double parteRealNumerador=parteReal1+parteReal2;
        double parteImaginariaNumerador=parteImaginaria1+parteImaginaria2;
         //Sacar la parte de abajo de la division
        double divisor=Math.pow(numero_complejo2.getParteReal(),2)+Math.pow(numero_complejo2.getParteImaginaria(),2);
         //realizar la division
        double resultadoParteReal=parteRealNumerador/divisor;
        double resultadoParteImaginaria=parteImaginariaNumerador/divisor;
        return new NumeroComplejo(resultadoParteReal,resultadoParteImaginaria);
       
    }
public static void main(String[] a)
 {
     double parteReal;
     double parteImaginaria;
     Scanner sc=new Scanner(System.in);
     System.out.println("Introduce la parte real del primer numero complejo:");
     parteReal=sc.nextDouble();
     System.out.println("introduce la parte imagianria del primer numero complejo:");
     parteImaginaria=sc.nextDouble();
    numero_complejo1=new NumeroComplejo(parteReal,parteImaginaria);//primer numero complejo
     System.out.println("Introduce la parte real del primer numero complejo:");
     parteReal=sc.nextDouble();
     System.out.println("introduce la parte imagianria del primer numero complejo:");
      parteImaginaria=sc.nextDouble();
    numero_complejo2=new NumeroComplejo(parteReal,parteImaginaria);
     
 

     System.out.println(numero_complejo1+" + "+numero_complejo2+" = "+sumar());
     System.out.println(numero_complejo1+" - "+numero_complejo2+" = "+restar());
     System.out.println(numero_complejo1+" * "+numero_complejo2+" = "+multiplicar());
     System.out.println(numero_complejo1+" / "+numero_complejo2+" = "+dividir());
 
 }
}

