/**
 * 
 */
package gestionMaterialV2.aplicaciones.impl;

import java.util.List;
import java.util.Optional;

import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;

/**
 * @author JOD 
 * Consultas: Interfaz que define los métodos específicos de consulta sobre base de datos.
 */
public interface ConsultaServicio {

	// Alumno

	/**
	 * seleccionarTodosLosAlumnos: Hace un select completo de la tabla de Alumnos
	 *
	 * 
	 * @return una lista de tipo AlumnoDAO
	 */
	public List<alumnos> seleccionarTodosLosAlumnos();

	/**
	 * insertarAlumno: Inserta en base de datos un nuevo alumno
	 * 
	 * @param un DAO de Alumno
	 */
	public void insertarAlumno(alumnos alumnoDAO);

	

	/**
	 * borrarAlumno: Elimina en base de datos a un alumno
	 * 
	 * @param el ID del Alumno deseado a borrar
	 */
	public void borrarAlumno(int id);

	/**
	 * seleccionarAlumnoEspecifico: Hace un select de la tabla Alumnos pero
	 * filtrando con un where por id hacia el campo de Portatiles
	 * 
	 * @param id 
	 * @return un objeto Alumnos
	 */
	public alumnos seleccionarAlumnoEspecifico(int id);

	// Portatil

	/**
	 * seleccionarTodosLosPortatiles: Hace un select completo de la tabla portatiles
	 * 
	 * 
	 * @return una lista de objetos Portatiles
	 */
	public List<portatiles> seleccionarTodosLosPortatiles();

	/**
	 * insertarPortatil: Inserta en base de datos un nuevo portatil
	 * 
	 * @param un DAO de Portatil
	 */
	public void insertarPortatil(portatiles portatilDAO);


	/**
	 * seleccionarTodosLosAlumnos: Hace un select de la tabla portatiles pero
	 * filtrando con un where por id hacia el campo id_Alumno
	 * 
	 * @param id
	 * @return un objeto de Tipo Portatil
	 */
	public portatiles seleccionarPortatilEspecifico(int id);
	
	/**
	 * seleccionarAlumnoPorId: Hace un select de la Tabla Alumnos pero
	 * filtrando unicamente por el ID del Alumno
	 * 
	 * @param id
	 * @return un objeto de Tipo Alumno
	 */

	public Optional<alumnos> seleccionarAlumnoPorId(int id);
}
