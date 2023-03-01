/**
 * 
 */
package gestionMaterialV2.aplicaciones.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
import gestionMaterialV2.aplicaciones.repositorios.AlumnoRepositorio;
import gestionMaterialV2.aplicaciones.repositorios.PortatilRepositorio;

/**
 * @author JOD
 * 
 */

@Service
public class ConsultaServicioImpl implements ConsultaServicio{

	//Alumno
	
	@Autowired
	private AlumnoRepositorio psi;
	@Autowired
	private PortatilRepositorio psi2;
	
	@Transactional
	public void insertarAlumno(alumnos alumno) {
		try {
			psi.save(alumno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<alumnos> seleccionarTodosLosAlumnos() {
		List<alumnos> listaAlumnos= (List<alumnos>) psi.findAll();
		return listaAlumnos;
	}

	@Override
	public void borrarAlumno(int id) {
			psi.deleteById(id);
		
	}

	@Override
	public alumnos seleccionarAlumnoEspecifico(int id) {
		try {
			
			List<alumnos> listaAlumnos= (List<alumnos>) psi.findAll();
			for (alumnos alumnos : listaAlumnos) {
				if(alumnos.getNum_port().getId_portatil() == id)
				{
					return alumnos;
				}
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List<portatiles> seleccionarTodosLosPortatiles() {
		
		return (List<portatiles>) psi2.findAll();
	}

	@Override
	public void insertarPortatil(portatiles portatilDAO) {
		try {
			psi2.save(portatilDAO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}




	@Override
	public portatiles seleccionarPortatilEspecifico(int id) {
		try {
			
			//List<alumnos> listaAlumnos= (List<alumnos>) psi.findAll();
			Optional<alumnos> alu = psi.findById(id);
				return alu.get().getNum_port();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public Optional<alumnos> seleccionarAlumnoPorId(int id) {
		try {
			
			//List<alumnos> listaAlumnos= (List<alumnos>) psi.findAll();
			Optional<alumnos> alu = psi.findById(id);
				return alu;
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
