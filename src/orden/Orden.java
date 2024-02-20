package orden;

public class Orden {

	private int idOrden;
	static int contadorOrdenes;
	private Producto productos[];
	private static final int MAXPRODUCTOS = 10;

	private int contador;
	private double sumaTotal;

	public Orden() {
		this.productos = new Producto[MAXPRODUCTOS];
		contadorOrdenes++;
		idOrden = contadorOrdenes;
	}

	public double calcularTotal() {
		for (int i = 0; i < MAXPRODUCTOS; i++) {
			if (productos[i] != null) {
				this.sumaTotal = +productos[i].getPrecio();
			}

		}
		return this.sumaTotal;
	}

	public void agregarProducto(Producto productos) {
		this.productos[contador] = productos;
		contador++;

	}

	public void mostrarOrden() {
		System.out.println("El id de la orden es: " + this.idOrden
		);
		System.out.println(" los productos en la Orden son: "
		);

		for (Producto producto : productos) {
			if (producto != null) {
				System.out.println(producto.getNombre() + "  " + producto.getPrecio());
			}
		}
		System.out.println("total a pagar: " + this.calcularTotal());
	}

}
