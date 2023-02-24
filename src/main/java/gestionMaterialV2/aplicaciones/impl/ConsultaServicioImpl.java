/**
 * 
 */
package gestionMaterialV2.aplicaciones.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
import gestionMaterialV2.aplicaciones.repositorios.AlumnoRepositorio;

/**
 * @author Talamino
 * Clase que agrupa las transacaciones contra base de datos
 */

@Service
public class ConsultaServicioImpl implements ConsultaServicio{

	//Alumno
	
	@Autowired
	private AlumnoRepositorio alr;
	
	@Transactional
	public void insertarAlumno(alumnos alumno) {
		try {
			alr.save(alumno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Iterable<alumnos> seleccionarTodosLosAlumnos() {
		Iterable<alumnos> listaAlumnos= alr.findAll();
		return listaAlumnos;
	}

	@Override
	public void actualizarAlumno(String nombreN, String nombreV) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarAlumno(alumnos alumnoDAO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<alumnos> seleccionarAlumnoEspecifico(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<portatiles> seleccionarTodosLosPortatiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarPortatil(portatiles portatilDAO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarPortatil(String marcaN, String marcaV) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarPortatil(portatiles portatilDAO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<portatiles> seleccionarPortatilEspecifico(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
