/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumerosComplejos;


/**
 * clase para modelar numeros complejos
 *
 * @author (ACR)
 * @version (1)
 */
public class NumeroComplejo
{
    // instance variables - replace the example below with your own
    private double parteReal;
    private double parteImaginaria;

    //constructor
    public NumeroComplejo()
    {
       parteReal=0;
       parteImaginaria=0;
    }

    //constructor parametrizado
    public NumeroComplejo(double parteReal,double parteImaginaria)
    {
        this.parteReal=parteReal;
        this.parteImaginaria=parteImaginaria;
    }
    
    //setters
    public void setParteReal(double parteReal)
    {
        this.parteReal=parteReal;    
    }
    public void setParteImaginaria(double parteImaginaria)
    {
        this.parteImaginaria=parteImaginaria;    
    }
    
    //getters
    public double getParteReal()
    {
        return parteReal;
    }
    public double getParteImaginaria()
    {
        return parteImaginaria;    
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString()
    {
    if(parteImaginaria>=0)return (float)parteReal+"+"+(float)parteImaginaria+"i";
    return (float)parteReal+""+(float)parteImaginaria+"i";    
    }
}

