/**
 * 
 */
package gestionMaterialV2.aplicaciones.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestionMaterialV2.aplicaciones.entidades.alumnos;

/**
 * @author JOD
 *
 */

@Repository
public interface AlumnoRepositorio extends CrudRepository<alumnos, Integer> {

}
