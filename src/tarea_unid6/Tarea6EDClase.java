/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_unid6;

/**
 *
 * @author Usuario
 */
public class Tarea6EDClase {
    
        public void aplicarDescuento(double precioDeProducto, int numeroDeProductos){double precioTotal;
    if(numeroDeProductos>3)
        precioDeProducto-=5;
            if (numeroDeProductos!=0){
            precioTotal = precioDeProducto*0.8;
            System.out.println("El total a pagar es:"+precioTotal);
            System.out.println("Enviado");
        }else {
            precioTotal = precioDeProducto*0.95;
            System.out.println("El total a pagar es:"+precioTotal);
            System.out.println("Enviado");
        }   
    }

}
