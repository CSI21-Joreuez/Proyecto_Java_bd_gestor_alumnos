/**
 * 
 */
package gestionMaterialV2.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.JOptionPane;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gestionMaterialV2.aplicaciones.Dtos.alumnos_portatilesDTO;
import gestionMaterialV2.aplicaciones.Dtos.ToDao.aDAOService;
import gestionMaterialV2.aplicaciones.Dtos.ToDao.aDAOServiceImpl;
import gestionMaterialV2.aplicaciones.Dtos.ToDto.aDTOServicio;
import gestionMaterialV2.aplicaciones.Dtos.ToDto.aDTOServicioImpl;
import gestionMaterialV2.aplicaciones.entidades.alumnos;
import gestionMaterialV2.aplicaciones.entidades.portatiles;
import gestionMaterialV2.aplicaciones.impl.ConsultaServicio;

/**
 * @author JOD Controlador que contiene los procedimientos de la vista
 *         MatriculaAlumno
 */

@Controller
public class MatriculaAlumnoController {

	// Objetos Iniciados
	List<alumnos> ListaAlumnos = new ArrayList<alumnos>();
	List<portatiles> ListaPortatiles = new ArrayList<portatiles>();
	protected final Log logger = LogFactory.getLog(getClass());
	Map<String, Object> miModelo = new HashMap<String, Object>();
	@Autowired
	ConsultaServicio consulta;
	aDAOService toDAO = new aDAOServiceImpl();
	aDTOServicio toDTO = new aDTOServicioImpl();

	// Accion de Añadir a un Alumno
	@RequestMapping(value = "/redirectMatriculaAlumno")
	public ModelAndView gestionSolicitud() {
		System.out.println("Entrando en el metodo Add Alumno");
		return new ModelAndView("matriculaAlumno");
	}

	// Crear Alumno y Darlo de Alta
	@PostMapping("/matriculaAlumno")
	public ModelAndView procesarFormulario(@RequestParam String nombre, @RequestParam String tlf,
			@RequestParam String marca, @RequestParam String modelo) {
		try {
			// Creamos el ModelAndView;
			ModelAndView mav = new ModelAndView("../index");

			// Creamos un DTO de Alumnos_portatiles
			alumnos_portatilesDTO alumn = new alumnos_portatilesDTO();
			alumn = new alumnos_portatilesDTO(nombre, tlf, new portatiles(marca, modelo));

			// Insertamos los Datos en BBDD
			consulta.insertarAlumno(toDAO.alumnoDTOaDAO(alumn));
			JOptionPane.showMessageDialog(null, "Alumno Creado Exitosamente");

			// Devolvemos el ModelAndView
			return mav;

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "El Alumno No Se Ha Podido Añadir Revise Los Campos", "**ERROR**",
					JOptionPane.ERROR_MESSAGE);
			return new ModelAndView();
		}

	}

	// Muestra Lista de Alumnos
	@RequestMapping("/listadoAlumno")
	public ModelAndView listarAlumnos() {
		
		// Inicializamos los Objetos t Arrays que vamos a utilizar
		ListaAlumnos = consulta.seleccionarTodosLosAlumnos();
		List<alumnos_portatilesDTO> listaDTO = new ArrayList<alumnos_portatilesDTO>();
		alumnos_portatilesDTO alm = new alumnos_portatilesDTO();

		// Recorremos la Lista DTO creada y la llenamos
		for (alumnos alumnos : ListaAlumnos) {
			alm = toDTO.alumnoADTO(alumnos.getId_alumno(), alumnos.getNombre(), alumnos.getTelefono(),
					alumnos.getNum_port());
			listaDTO.add(alm);
		}
		// Devolvemos el array y la vista en el model and view
		return new ModelAndView("listadoAlumno", "listaDTO", listaDTO);
	}

	// Accion Consulta de Alumnos mediante el Id del Portatil
	@RequestMapping(value = "/redirectConsultaAlumno")
	public ModelAndView gestionConsulta() {
		System.out.println("Entrando en el metodo consulta Alumno");
		return new ModelAndView("consultaAlumno");
	}

	// Consultamos el Alumno mediante el ID del portatil
	@PostMapping("/consultaAlumno")
	public ModelAndView consultaAlumno(@RequestParam int num_port) {
		try {
			System.out.println("Entra en Consulta Alumno");

			// Creamos los Objetos Necesarios
			alumnos alm = consulta.seleccionarAlumnoEspecifico(num_port);
			alumnos_portatilesDTO almDTO = new alumnos_portatilesDTO();

			// Igualamos el DAO AL DTO de Alumno
			almDTO = toDTO.alumnoADTO(alm.getId_alumno(), alm.getNombre(), alm.getTelefono(), alm.getNum_port());

			// Metemos en el Modelo los Campos que queremos mostrar en la vista
			miModelo.put("id_alumno", almDTO.getId_alumno());
			miModelo.put("nombre", almDTO.getNombre());
			miModelo.put("telefono", almDTO.getTelefono());
			miModelo.put("num_port", almDTO.getNum_port().getId_portatil());

			return new ModelAndView("listadoConsultaAlumno", "miModelo", miModelo);
		} catch (Exception e) {
			// Mostramos un mensaje de error y lo mandamos a la misma pagina en la que se
			// encuentra porque ha ocurrido un error
			JOptionPane.showMessageDialog(null, "El Alumno Buscado No Existe o No Tiene Ningun Portatil Asignado",
					"**ERROR**", JOptionPane.ERROR_MESSAGE);
			return new ModelAndView();
		}

	}

	// Accion Borrado de Alumnos

	@RequestMapping(value = "/redirectBorradoAlumno")
	public ModelAndView gestionBorradoAlumno() {
		System.out.println("Entrando en el metodo Borrado de Alumno");
		return new ModelAndView("borradoAlumno");
	}

	// Borramos el Alumno mediante el ID escrito
	@PostMapping("/borradoAlumno")
	public ModelAndView borradoAlumno(@RequestParam int num_port, @RequestParam String conf) {

		try {
			logger.info("Estamos en el Metodo de Borrado Alumno");
			System.out.println(conf);

			// En el caso de que sea correcto y la confirmacion sea igual a 'si' se borra el
			// alumno
			if (conf.toLowerCase().equals("si") || conf.toLowerCase().equals("yes")) {
				consulta.borrarAlumno(num_port);
				logger.info("Borramos el Alumno deseado");

				// Mostramos un mensaje de Alumno Borrado con exito y vamos al index
				JOptionPane.showMessageDialog(null, "Alumno Borrado Exitosamente");
				return new ModelAndView("../index");
			}
		} catch (Exception e) {

			// Mostramos un error y Redireccionamos a la misma pagina porque ha habido un
			// error
			JOptionPane.showMessageDialog(null, "El Alumno Buscado No Existe o No Se ha podido Borrar", "**ERROR**",
					JOptionPane.ERROR_MESSAGE);
			return new ModelAndView();
		}
		return new ModelAndView();
	}

}
