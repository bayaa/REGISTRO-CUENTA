/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocuenta;

/**
 * @author JAML
 */
public class PruebaCrearArchivoTexto {
    public static void main(String args[]){
        CrearArchivoTexto aplicacion = new CrearArchivoTexto();
        
        aplicacion.abrirArchivo();
        aplicacion.agregarRegistros();
        aplicacion.cerrarArchivo();
    }//fin del main
}// fin de la clase PruebaCrearArchivoTexto
