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
		public Producto () {}
		
		public Producto(String codigo, String descripcion, Double precio_Unitario, OrigenFabricacion origenFabricacion,
				Categoria categoria) {
			super();
			this.codigo = codigo;
			this.descripcion = descripcion;
			this.precio_Unitario = precio_Unitario;
			this.origenFabricacion = origenFabricacion;
			this.categoria = categoria;
		}

		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Double getPrecio_Unitario() {
			return precio_Unitario;
		}
		public void setPrecio_Unitario(Double precio_Unitario) {
			this.precio_Unitario = precio_Unitario;
		}
		public OrigenFabricacion getOrigenFabricacion() {
			return origenFabricacion;
		}
		public void setOrigenFabricacion(OrigenFabricacion origenFabricacion) {
			this.origenFabricacion = origenFabricacion;
		}
		public Categoria getCategoria() {
			return categoria;
		}
		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}
		






}

