package gestionMaterialV2.aplicaciones.Dtos;

import org.springframework.stereotype.Component;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
@Component
public class alumnos_portatilesDTO {

	//Alumno
	private int id_alumno;
	
	private String nombre;

	private String telefono;

	private  portatiles num_port;

	
	//Portatiles
	private int id_portatil;
	
	private String marca;
	
	private String modelo;
	
	private int alumno_id;

	
	
	

	public alumnos_portatilesDTO( String marca, String modelo, int alumno_id) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.alumno_id = alumno_id;
	}

	public alumnos_portatilesDTO(String nombre, String telefono, portatiles num_port) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.num_port = num_port;
	}

	public int getId_portatil() {
		return id_portatil;
	}

	public void setId_portatil(int id_portatil) {
		this.id_portatil = id_portatil;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public portatiles getNum_port() {
		return num_port;
	}

	public void setNum_port(portatiles num_port) {
		this.num_port = num_port;
	}


	public alumnos_portatilesDTO() {
		super();
	}
	
	

}
