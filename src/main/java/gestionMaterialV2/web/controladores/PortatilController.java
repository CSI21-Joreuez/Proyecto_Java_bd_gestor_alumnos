package gestionMaterialV2.web.controladores;

import java.util.ArrayList;
import java.util.HashMap;
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
 *         PortatilController
 */


@Controller
public class PortatilController {

	// Objetos Iniciados
	List<portatiles> ListaPortatiles = new ArrayList<portatiles>();
	@Autowired
	ConsultaServicio consulta;
	aDAOService toDAO = new aDAOServiceImpl();
	aDTOServicio toDTO = new aDTOServicioImpl();
	protected final Log logger = LogFactory.getLog(getClass());
	Map<String, Object> miModelo = new HashMap<String, Object>();

	// Entrando en redireccion para el Add Portatil
	@RequestMapping(value = "/redirectAddPortatil")
	public ModelAndView gestionSolicitud() {
		System.out.println("Entrando en el metodo Add Portatil");
		return new ModelAndView("addPortatil");
	}

	// Entramos en el metodo de añadir portatil
	@PostMapping("/addPortatil")
	public ModelAndView procesarConsulta(@RequestParam String marca, @RequestParam String modelo) {

		try {
			// Creamos el ModelAndView;
			ModelAndView miModelo = new ModelAndView("../index");

			// Creamos un DTO de Alumnos_portatiles
			alumnos_portatilesDTO port = new alumnos_portatilesDTO();
			port = new alumnos_portatilesDTO(marca, modelo);

			// Insertamos los Datos en BBDD
			consulta.insertarPortatil(toDAO.portatilDTOaDAO(port));
			JOptionPane.showMessageDialog(null, "Portatil Creado Exitosamente");
			// Devolvemos el ModelAndView hacia el index
			return miModelo;
		} catch (Exception e) {

			// Da error y seguimos con el formulario reseteado
			JOptionPane.showMessageDialog(null, "El Portatil No Se Ha Podido Añadir Revise Los Campos", "**ERROR**",
					JOptionPane.ERROR_MESSAGE);
			return new ModelAndView();
		}

	}

	// Metodo Para consultar el portatil
	@RequestMapping(value = "/redirectConsultaPortatil")
	public ModelAndView gestionConsulta() {
		System.out.println("Entrando en el metodo consulta Portatil");
		return new ModelAndView("consultaPortatil");
	}

	// Entramos en el metodo consultar portatil mediante un ID
	@PostMapping("/consultaPortatil")
	public ModelAndView consultaPortatil(@RequestParam int num_port) {
		try {
			System.out.println("Entra en el Metodo Consulta Portatil");
			// Inicializamos los DAOs
			portatiles pt = consulta.seleccionarPortatilEspecifico(num_port);
			Optional<alumnos> alm = consulta.seleccionarAlumnoPorId(num_port);

			// Declaro los DTO
			alumnos_portatilesDTO alumDTO = new alumnos_portatilesDTO();
			alumnos_portatilesDTO portDTO = new alumnos_portatilesDTO();

			// Inicializo los DTO con valores de los DAO
			alumDTO = toDTO.alumnoADTO(alm.get().getId_alumno(), alm.get().getNombre(), alm.get().getTelefono(),
					alm.get().getNum_port());
			portDTO = toDTO.portatilADTO(pt.getId_portatil(), pt.getMarca(), pt.getModelo());

			// Guardo en mi Modelo las propiedades de los DTOs
			miModelo.put("id_portatil", portDTO.getId_portatil());
			miModelo.put("marca", portDTO.getMarca());
			miModelo.put("modelo", portDTO.getModelo());
			miModelo.put("id_alumno", alumDTO.getId_alumno());

			// Devuelvo el ModelAndView de la pagina listadoConsultaPortatil
			return new ModelAndView("listadoConsultaPortatil", "miModelo", miModelo);
		} catch (Exception e) {

			// Da error y nos devuelve a la misma pagina reseteada para volver a introducir
			// los datos
			JOptionPane.showMessageDialog(null, "El Portatil Buscado No Existe o No Tiene Ningun Alumno Asignado",
					"**ERROR**", JOptionPane.ERROR_MESSAGE);
			return new ModelAndView();
		}

	}

}
