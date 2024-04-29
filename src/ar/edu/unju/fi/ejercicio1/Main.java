package ar.edu.unju.fi.ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio1.model.Producto;
import ar.edu.unju.fi.ejercicio1.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio1.model.Producto.OrigenFabricacion;

public class Main {
	private static Scanner scanner;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		 scanner = new Scanner(System.in);
		 productos = new ArrayList<>();
	int opcion = 0;		 
		 do {
			 System.out.println("1 -- Crear Producto");
			 System.out.println("2 -- Mostrar Productos");
			 System.out.println("3 -- Modificar Producto");
			 System.out.println("4 -- Salir");
			 
			 opcion = scanner.nextInt();
			 scanner.nextLine();
			 
			 switch (opcion) {
			 	case 1: crearProducto();
			 		break;
			 	case 2: mostrarProductos();
			 		break;
			 	case 3: modificarProducto();
			 		break;
			 	case 4: System.out.println("Fin del programa...");
			 	 	break;
			 	default:
			 		System.out.println("Opcion incorrecta.Intente nuevamente...");
			 		break;
			 }
		 } while(opcion != 4);
		 
		 
	}
	
	public static void mostrarProductos() {
		if (productos.isEmpty()) {
			System.out.println("Lista de productos vacía.");
		} else {
			System.out.println("Lista de productos:");
			productos.forEach(product -> System.out.println(product));			
		}
	}	
	public static void crearProducto () {
		Producto producto = new Producto();
		
		System.out.println("Ingresar el código: ");
		producto.setCodigo(scanner.nextLine());
		
		System.out.println("Ingresar la descripción: ");
		producto.setDescripcion(scanner.nextLine());
		
		double precio;
		while (true) {
			System.out.println("Ingrese el precio: ");
		    String input = scanner.nextLine();
		    try {
		    	precio = Double.parseDouble(input);
		        break;
		    } catch (NumberFormatException e) {
		    	System.out.println("Dato no válido.Intentar de Nuevo.");
		    }
		 }
		producto.setPrecio_Unitario(precio);
		
		OrigenFabricacion origenFabricacion = obtenerOrigenFabricacion();
		producto.setOrigenFabricacion(origenFabricacion);
		
		Categoria categoria = obtenerCategoria();
		producto.setCategoria(categoria);
		
		productos.add(producto);
		System.out.println("Su Producto se a Creado con exito");
	}
	public static void modificarProducto () {
		if (productos.isEmpty()) {
			 System.out.println("Lista de productos vacía...");
	    } else {
	        System.out.print("Ingresar el código del producto a modificar: ");
	        String codigo = scanner.nextLine();
	        Producto productoFounded = null;
	        for (Producto producto : productos) {
	        	if (producto.getCodigo().equals(codigo)) {
	        		productoFounded = producto;
	        		break;
	             }
	        }
	        if (productoFounded == null) {
	        	System.out.println("Producto no encontrado.");
	        } else {
	        	int opcion_mod = 0;
	        	do {
	        		System.out.println("MODIFICAR PRODUCTO");
	                System.out.println("1 - Descripción");
	                System.out.println("2 - Precio");
	                System.out.println("3 - Origen de Fabricación");
	                System.out.println("4 - Categoría");
	                System.out.println("5 - Salir");
	                System.out.print("Elegir una opción: ");
	                
	                opcion_mod = scanner.nextInt();
	                scanner.nextLine(); 
	                
	                switch (opcion_mod) {
						case 1: 
							System.out.println("Ingresar la nueva descripción: ");
							productoFounded.setDescripcion(scanner.nextLine());
							break;
						case 2:
							double precio;
							while (true) {
								System.out.println("Ingrese el precio: ");
							    String input = scanner.nextLine();
							    try {
							    	precio = Double.parseDouble(input);
							        break;
							    } catch (NumberFormatException e) {
							    	System.out.println("Dato no válido. Intentar nuevamente...");
							    }
							 }
							productoFounded.setPrecio_Unitario(precio);
							break;
						case 3:
							OrigenFabricacion origen = obtenerOrigenFabricacion();
							productoFounded.setOrigenFabricacion(origen);
							break;
						case 4:
							Categoria categoria = obtenerCategoria();
							productoFounded.setCategoria(categoria);
							break;
						case 5:
							System.out.println("Fin de la modificacion...");
							break;
						default:
							System.out.println("Opcion incorrecta. Intentar nuevamente...");
							break;
					}
	                
	        	} while(opcion_mod != 5);    	
	        	
                System.out.println("El Producto se a Modificado Exitosamente");
	        }
	    }
	}
	public static OrigenFabricacion obtenerOrigenFabricacion () {
		int or_fab = 0;
		do {
			System.out.println("ORIGEN DE FABRICACION");
			System.out.println("1 - Argentina");
			System.out.println("2 - China");
			System.out.println("3 - Brasil");
			System.out.println("4 - Uruguay");
			System.out.println("Elija una opcion: ");
			
			if (scanner.hasNextInt()) {
                or_fab = scanner.nextInt();
                scanner.nextLine();
                if (or_fab < 1 || or_fab > 4) {
                    System.out.println("Opción no válida. Intentar nuevamente...");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida. Intentar nuevamente...");
            }
		} while(or_fab < 1 || or_fab > 4);
		
		OrigenFabricacion origen = 
				OrigenFabricacion.values()[or_fab - 1];
		return origen;
	}
	public static Categoria obtenerCategoria () {
		int op_categoria = 0;
		do {
			System.out.println("CATEGORIA");
			System.out.println("1 - Telefonía");
			System.out.println("2 - Informática");
			System.out.println("3 - Electro hogar");
			System.out.println("4 - Herramientas");
			System.out.println("Elija una opcion: ");
			
			if (scanner.hasNextInt()) {
                op_categoria = scanner.nextInt();
                scanner.nextLine();
                if (op_categoria < 1 || op_categoria > 4) {
                    System.out.println("Opción no válida.Intentar nuevamente...");
                }
            } else {
                scanner.nextLine();
                System.out.println("Opción no válida.Intentar nuevamente...");
            }
		} while(op_categoria < 1 || op_categoria > 4);
		
		Categoria categoria = 
				Categoria.values()[op_categoria - 1];
		return categoria;
	}
}
