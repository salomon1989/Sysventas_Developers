package sysventas.entity;

public class Usuario {
   private int idusuario;
   private String nom_user;
   private int clave;
   private int estado;
   private int idrol;
   private int idpersona;
public Usuario() {
	super();
}
public Usuario(int idusuario, String nom_user, int clave, int estado, int idrol, int idpersona) {
	super();
	this.idusuario = idusuario;
	this.nom_user = nom_user;
	this.clave = clave;
	this.estado = estado;
	this.idrol = idrol;
	this.idpersona = idpersona;
}
public int getIdusuario() {
	return idusuario;
}
public void setIdusuario(int idusuario) {
	this.idusuario = idusuario;
}
public String getNom_user() {
	return nom_user;
}
public void setNom_user(String nom_user) {
	this.nom_user = nom_user;
}
public int getClave() {
	return clave;
}
public void setClave(int clave) {
	this.clave = clave;
}
public int getEstado() {
	return estado;
}
public void setEstado(int estado) {
	this.estado = estado;
}
public int getIdrol() {
	return idrol;
}
public void setIdrol(int idrol) {
	this.idrol = idrol;
}
public int getIdpersona() {
	return idpersona;
}
public void setIdpersona(int idpersona) {
	this.idpersona = idpersona;
}
   
   
}
