package ar.edu.unju.fi.ejercicio1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio1.model.Producto;
public class Main {
	
	private static Scanner scanner;
	private static List<Producto> productos;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		 productos = new ArrayList<>();
		 int option= 0 ; 
		 do {
			 System.out.println("1 -- Crear Producto");
			 System.out.println("2 -- Mostrar Productos");
			 System.out.println("3 -- Modificar Producto");
			 System.out.println("4 -- Salir");
			 
			 option = scanner.nextInt();
			 scanner.nextLine();
			 
			 switch (option) {
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
		 } while(option != 4);
		 
		 
		 
	}
		 


	private static void modificarProducto() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarProductos() {
		// TODO Auto-generated method stub
		
	}

	private static void crearProducto() {
		// TODO Auto-generated method stub
		
	}
	








}
