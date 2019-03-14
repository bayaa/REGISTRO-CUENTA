/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocuenta;

/**
 *
 * @author ALUMNO
 */
public class RegistroCuenta {
    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;

public RegistroCuenta(){
    this(0,"","",0.0);
}
    public  RegistroCuenta(int cta, String nombre, String apellido, double sal){
        establecerCuenta(cta);
        establecerPrimerNombre(nombre);
        establcerApellidoPaterno(apellido);
        establcerSaldo(sal);
    }
    public void establecerCuenta(int cta){
        cuenta = cta;
    }
    public int obtenerCuenta(){
        return cuenta;
    }
    public void establecerPrimerNombre(String nombre){
        primerNombre = nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
     public void establcerApellidoPaterno(String apellido){
         apellidoPaterno = apellido;
     }
     public String obtnerApellidoPaterno(){
       return apellidoPaterno;  
     }
     public void establcerSaldo(double sal){
         saldo = sal;
     }
     public double obtenerSaldo(){
         return saldo;
     }
}
