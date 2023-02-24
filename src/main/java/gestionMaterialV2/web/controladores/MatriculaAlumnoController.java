/**
 * 
 */
package gestionMaterialV2.web.controladores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gestionMaterialV2.aplicaciones.Dtos.alumnos_portatilesDTO;
import gestionMaterialV2.aplicaciones.Dtos.ToDao.aDAOService;
import gestionMaterialV2.aplicaciones.Dtos.ToDao.aDAOServiceImpl;
import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
import gestionMaterialV2.aplicaciones.impl.ConsultaServicio;

/**
 * @author Talamino
 * Controlador que contiene los procedimientos de la vista MatriculaAlumno
 */

@Controller
public class MatriculaAlumnoController {

	Iterable<alumnos>ListaAlumnos = new ArrayList<alumnos>();
	@Autowired
	ConsultaServicio consulta;
	
	aDAOService toDAO = new aDAOServiceImpl();
	
	@RequestMapping(value="/redirectMatriculaAlumno")
	public ModelAndView gestionSolicitud() {
		System.out.println("Va");
		return new ModelAndView("matriculaAlumno");
	}
	
	
    @PostMapping("/matriculaAlumno" )
    public ModelAndView procesarFormulario(@RequestParam String nombre, @RequestParam String tlf, @RequestParam String marca, @RequestParam String modelo, @RequestParam int num_port) {
        
    	//Creamos el ModelAndView;
    	ModelAndView mav = new ModelAndView();
      
    	alumnos_portatilesDTO alumn = new alumnos_portatilesDTO(nombre, tlf, new portatiles(marca, modelo, num_port));
    	 System.out.println(alumn.toString());
        consulta.insertarAlumno(toDAO.alumnoDTOaDAO(alumn));
        // Creamos un DTO con los datos recogidos
	   
        
        return mav;
    }
    
    @RequestMapping("/listadoAlumno")
    public ModelAndView listarAlumnos() {
    	
    	ListaAlumnos = consulta.seleccionarTodosLosAlumnos();
    	System.out.println("esto es la lista"+ListaAlumnos.toString());
    	return new ModelAndView("listadoAlumno", "ListaAlumnos", ListaAlumnos );
    }
    
}
