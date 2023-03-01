/**
 * 
 */
package gestionMaterialV2.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author JOD
 *
 */

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfiguracionContexto {

    @Bean
    public ViewResolver mapeo() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/views/");
        irvr.setSuffix(".jsp");
        return irvr;
    }
    
  
	
}
