/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasMain;

import orden.Orden;
import orden.Producto;

/**
 *
 * @author LATITUDE E5440
 */
public class pruebasMain {

	public static void main(String[] args) {
		//productos
		Producto leche = new Producto("leche", 12.5);
		Producto gato = new Producto("gato", 1.5);
		Producto mouse = new Producto("mouse", 22.23);
		Producto teclado = new Producto("teclado", 56.63);


		//usuarios y sus ordenes
		Orden elias = new Orden();
		elias.agregarProducto(mouse);

		elias.agregarProducto(gato);
		elias.mostrarOrden();
		
		System.out.println("  /////////////////////////");
		
		Orden victor = new Orden();
		victor.agregarProducto(mouse);

		victor.agregarProducto(gato);
		victor.agregarProducto(leche);

		victor.agregarProducto(teclado);
		victor.mostrarOrden();

	}
}
