package sysventas.entity;

public class DetalleVenta {
    private int iddetalle_venta;
    private int idventas;
    private int idproducto;
    private double precio;
    private int cantidad;
	public DetalleVenta() {
		
	}
	public DetalleVenta(int iddetalle_venta, int idventas, int idproducto, double precio, int cantidad) {
		
		this.iddetalle_venta = iddetalle_venta;
		this.idventas = idventas;
		this.idproducto = idproducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int getIddetalle_venta() {
		return iddetalle_venta;
	}
	public void setIddetalle_venta(int iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
    
}
