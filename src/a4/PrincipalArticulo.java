package a4;

public class PrincipalArticulo {

	public static void main(String[] args) {

		Articulo articulo1 = new Articulo("Pijama", 10.0, 21, 50);
		Articulo articulo2 = new Articulo("Zapatos", 20.0, 21, 30);

		mostrar(articulo1);
		mostrar(articulo2);
	}
	
	static void mostrar(Articulo articuloQueQuieroMostrar) {
		System.out.println(articuloQueQuieroMostrar.nombre + "| Precio: " + articuloQueQuieroMostrar.precio + "| IVA: " + articuloQueQuieroMostrar.IVA + "% | Stock: " + articuloQueQuieroMostrar.stock + "ud(s)" );
	}

}
