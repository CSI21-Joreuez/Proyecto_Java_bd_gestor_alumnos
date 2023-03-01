package gestionMaterialV2.aplicaciones.Dtos.ToDto;
import gestionMaterialV2.aplicaciones.Dtos.alumnos_portatilesDTO;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
/**
 * @author JOD
 * aDTOServicio: Interfaz con los metodos que pasan de DAO a DTO.
 */
public interface aDTOServicio {

	
	/**
	 * Convierte la información insertada en alomnos_portilesDTO
	 * @param nombre de Alumno
	 * @param telefono del Alumno
	 * @param objeto portatil
	 * @return
	 */
	public alumnos_portatilesDTO  alumnoADTO(int id, String nombre, String telefono, portatiles num_port);
	
	
	/**
	 * Convierte la información insertada en alomnos_portilesDTO
	 * @param marca del portatil
	 * @param modelo del portatil
	 * @param objeto alumno
	 * @return
	 */
	public alumnos_portatilesDTO  portatilADTO(int id, String marca, String modelo);
	
}
