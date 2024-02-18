/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasMain;

import orden.Producto;

/**
 *
 * @author LATITUDE E5440
 */
public class pruebasMain {
    public static void main(String[] args) {
        
        Producto a = new Producto("leche", 12.5);
	
        Producto  b = new Producto("gato", 1.5);
	    System.out.println(a );

	    System.out.println( b);
	    
        		System.out.println(a.getIdProducto());
    }
}
