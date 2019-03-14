/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocuenta;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import registrocuenta.RegistroCuenta;
/**

 *
 * @author ALUMNO
 */
public class CrearArchivoTexto {
   private Formatter salida; 
    
    public void abrirArchivo(){
    try{
     salida  = new Formatter("clientes.txt");
    }
    catch(SecurityException securiteException){
        System.err.println("No tienes acceso de escritura");
        System.exit(1);
    }
    catch(FileNotFoundException filesNotFoundException){
    System.err.println("Error al crear el archivo");
    System.exit(1);
    }
    }


public void agregarRegistros(){
    int casos=5;
RegistroCuenta registro = new RegistroCuenta();
Scanner entrada = new Scanner(System.in);
System.out.printf("%s\n%s\n%s\n%s\n\n","Para terminar la entrada ",
"cuando se le pida que escriba ls datos de entrada.",
"En UNIX/Linux/MAC OS X escriba <ctrl> d y oprima Intro",
"En Windows escriba <ctrl> z y oprima Intro");
System.out.printf("%s\n%s",
"Escriba el numero de cuenta (> 0), primer nombre, apellido paterno y saldo.",
"?");
for(int i=0; i<=1; i++){
try{
registro.establecerCuenta(entrada.nextInt());
registro.establecerPrimerNombre(entrada.next());
registro.establcerApellidoPaterno(entrada.next());
registro.establcerSaldo(entrada.nextDouble());
if(registro.obtenerCuenta()>0){
    salida.format("%d %s %s %.2f\n", registro.obtenerCuenta(),
            registro.obtenerPrimerNombre(),registro.obtnerApellidoPaterno()
    ,registro.obtenerSaldo());
}
//fin del if
else{
    System.out.println("El numero de cuenta debe ser mayor que 0.");
}// fin else
}//fin try
catch(FormatterClosedException formatterClosedException){
    System.err.println("Error al escribir el archivo");
    return;
}//fin del catch
catch(NoSuchElementException elementException){
    System.err.println("Entrada invalida. Intente de nuevo.");
    entrada.nextLine();
}//fin del catch
System.err.printf("%s %s\n%s","Escriba el numero de cuenta (> 0),", 
        "primer nombre, apellido paterno y saldo.","? ");
    }//fin del while
}//fin del metodo agregarRegistros
public void cerrarArchivo(){
   if(salida != null){
       salida.close();
   } //fin del metodo cerrar archivo
}
}//fin de la clase CrearArchivoTexto