/**
 * 
 */
package gestionMaterialV2.aplicaciones.impl;

import java.util.List;


import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;

/**
 * @author Talamino 
 * Consultas: Interfaz que define los métodos específicos de consulta sobre base de datos.
 */
public interface ConsultaServicio {

	// Alumno

	/**
	 * seleccionarTodosLosAlumnos: Hace un select completo de la tabla
	 * dlk_tch_Alumno
	 * 
	 * @return una lista de tipo AlumnoDAO
	 */
	public Iterable<alumnos> seleccionarTodosLosAlumnos();

	/**
	 * repostajeGasolinera: Inserta en base de datos un nuevo alumno
	 * 
	 * @param alumnoDAO
	 */
	public void insertarAlumno(alumnos alumnoDAO);

	/**
	 * repostajeGasolinera: Actualiza en base de datos a un alumno
	 * 
	 * @param alumnoDAO
	 */
	public void actualizarAlumno(String nombreN, String nombreV);

	/**
	 * repostajeGasolinera: Elimina en base de datos a un alumno
	 * 
	 * @param alumnoDAO
	 */
	public void borrarAlumno(alumnos alumnoDAO);

	/**
	 * seleccionarTodosLosAlumnos: Hace un select de la tabla dlk_tch_Alumno pero
	 * filtrando con un where por id
	 * 
	 * @param id
	 * @return una lista de tipo AlumnoDAO
	 */
	public List<alumnos> seleccionarAlumnoEspecifico(int id);

	// Portatil

	/**
	 * seleccionarTodosLosAlumnos: Hace un select completo de la tabla
	 * dlk_tch_Portatil
	 * 
	 * @return una lista de tipo PortatilDAO
	 */
	public List<portatiles> seleccionarTodosLosPortatiles();

	/**
	 * repostajeGasolinera: Inserta en base de datos un nuevo portatil
	 * 
	 * @param portatilDAO
	 */
	public void insertarPortatil(portatiles portatilDAO);

	/**
	 * repostajeGasolinera: Actualiza en base de datos a un portatil
	 * 
	 * @param portatilDAO
	 */
	public void actualizarPortatil(String marcaN, String marcaV);

	/**
	 * repostajeGasolinera: Elimina en base de datos a un portatil
	 * 
	 * @param portatilDAO
	 */
	public void borrarPortatil(portatiles portatilDAO);

	/**
	 * seleccionarTodosLosAlumnos: Hace un select de la tabla dlk_tch_Portatil pero
	 * filtrando con un where por id
	 * 
	 * @param id
	 * @return una lista de tipo PortatilDAO
	 */
	public List<portatiles> seleccionarPortatilEspecifico(int id);

}
