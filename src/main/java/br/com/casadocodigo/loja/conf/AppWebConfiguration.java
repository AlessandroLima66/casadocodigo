package br.com.casadocodigo.loja.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.multiaction.InternalPathMethodNameResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.casadocodigo.loja.controllers.HomeController;

/*
 * classe de configuração do servlet SpringMVC
 * 
 * @EnableWebMvc
 * Habilitando o SpringMVC
 * 
 * @ComponentScan(basePackages = { "br.com.casadocodigo.loja.controllers" })
 * @ComponentScan(basePackageClasses= {HomeController.class})
 * Duas formas de configurar o caminho para o pacote que estão os controllers
 */

@EnableWebMvc
@ComponentScan(basePackageClasses= {HomeController.class})
public class AppWebConfiguration {

	/*
	 * método que indica para o SpringMVC onde estão as views
	 * 
	 * @Bean
	 * indica que o retorno deste metódo é gerenciado pelo SpringMVC
	 */
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
