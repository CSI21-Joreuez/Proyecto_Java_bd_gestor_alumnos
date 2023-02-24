package gestionMaterialV2.aplicaciones.Dtos.ToDao;

import gestionMaterialV2.aplicaciones.Dtos.alumnos_portatilesDTO;
import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;

/**
 * @author JOD
 * aDAOService: Interfaz con los metodos que pasan de DTO a DAO.
 */
public interface aDAOService {
	
	
	/**
	 * Paso de DTO alumno a DAO alumnos
	 * @param alumnos_portatilesDTO dto de alumno DTO
	 * @return
	 */
	public alumnos alumnoDTOaDAO(alumnos_portatilesDTO alumnDTO);
	
	
	/**
	 * Paso de DTO portatil a DAO portatiles
	 * @param alumnos_portatilesDTO dto de portatil DTO
	 * @return
	 */
	public portatiles portatilDTOaDAO(alumnos_portatilesDTO portatilDTO);

}
