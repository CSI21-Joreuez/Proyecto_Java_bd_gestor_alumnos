package gestionMaterialV2.aplicaciones.entidades;

import javax.persistence.*;


@Entity
@Table(name="gp_portatiles",schema="dlk_gestion_portatil")
public class portatiles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_portatil", unique= true, nullable=true)
	private int id_portatil;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="alumno_id")
	private int alumno_id;

	

	public portatiles() {
		super();
	}

	public portatiles(String marca, String modelo, int alumno_id) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.alumno_id = alumno_id;
	}

	public int getAlumno_id() {
		return alumno_id;
	}

	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}



	public String getMarca() {
		return marca;
	}

	public int getId_portatil() {
		return id_portatil;
	}

	public void setId_portatil(int id_portatil) {
		this.id_portatil = id_portatil;
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

	
	
	
}
