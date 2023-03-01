package gestionMaterialV2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import gestionMaterialV2.aplicaciones.AplicacionConfiguracionContexto;
import gestionMaterialV2.web.WebConfiguracionContexto;

/**
 * @author JOD
 */
public class EnrutadorEjemploWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AplicacionConfiguracionContexto.class };
	}
 
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfiguracionContexto.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
