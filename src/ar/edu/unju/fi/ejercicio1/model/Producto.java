package ar.edu.unju.fi.ejercicio1.model;

public class Producto {
	private String codigo;
	private String descripcion;
	private Double precio_Unitario;
	private OrigenFabricacion origenFabricacion;
	private Categoria categoria;
	
		public enum OrigenFabricacion {
			ARGENTINA,
			CHINA,
			BRASIL,
			URUGUAY;
	    }
		public enum Categoria {
			TELEFONIA,
			INFORMATICA,
			ELECTROHOGAR,
			HERRAMIENTAS;
		}
		
		






}

