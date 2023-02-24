/**
 * 
 */
package gestionMaterialV2.aplicaciones.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestionMaterialV2.aplicaciones.entidades.portatiles;

/**
 * @author Talamino
 * 
 */

@Repository
public interface PortatilRepositorio extends CrudRepository<portatiles, Integer> {

}
