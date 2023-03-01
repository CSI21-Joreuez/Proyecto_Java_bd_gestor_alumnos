package gestionMaterialV2.aplicaciones.entidades;

import javax.persistence.*;

/*
 * @author JOD
 */

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
	


	

	public portatiles() {
		super();
	}

	public portatiles(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;

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
