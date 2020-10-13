package sysventas.entity;

public class Producto {
  private int idproducto;
  private String nom_prod;
  private double precio;
  private double stock;
  private int codigo;
public Producto() {
	super();
}
public Producto(int idproducto, String nom_prod, double precio, double stock, int codigo) {
	super();
	this.idproducto = idproducto;
	this.nom_prod = nom_prod;
	this.precio = precio;
	this.stock = stock;
	this.codigo = codigo;
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}
public String getNom_prod() {
	return nom_prod;
}
public void setNom_prod(String nom_prod) {
	this.nom_prod = nom_prod;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public double getStock() {
	return stock;
}
public void setStock(double stock) {
	this.stock = stock;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
  
  
}
