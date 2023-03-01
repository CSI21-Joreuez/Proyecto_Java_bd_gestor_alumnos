package gestionMaterialV2.aplicaciones.Dtos.ToDto;

import org.springframework.stereotype.Service;

import gestionMaterialV2.aplicaciones.Dtos.alumnos_portatilesDTO;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
/**
 * @author JOD
 * Interfaz que implementa la case aDTOServicio
 */
@Service
public class aDTOServicioImpl implements aDTOServicio {

	public alumnos_portatilesDTO alumnoADTO(int id,String nombre, String telefono, portatiles num_port) {
		alumnos_portatilesDTO apDTO = new alumnos_portatilesDTO(id, nombre, telefono, num_port);
		return apDTO;
	}

	public alumnos_portatilesDTO portatilADTO(int id, String marca, String modelo) {
		alumnos_portatilesDTO paDTO = new alumnos_portatilesDTO(id, marca, modelo);
		return paDTO;
	}


}
