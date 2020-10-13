package sysventas.entity;

public class Ventas {
   private int idventas;
   private String fecha;
   private int idpersona;
   private int idcliente;
public Ventas() {
	super();
}
public Ventas(int idventas, String fecha, int idpersona, int idcliente) {
	super();
	this.idventas = idventas;
	this.fecha = fecha;
	this.idpersona = idpersona;
	this.idcliente = idcliente;
}
public int getIdventas() {
	return idventas;
}
public void setIdventas(int idventas) {
	this.idventas = idventas;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
public int getIdcliente() {
	return idcliente;
}
public void setIdcliente(int idcliente) {
	this.idcliente = idcliente;
}
   
   
}
