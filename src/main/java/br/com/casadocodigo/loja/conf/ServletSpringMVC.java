package br.com.casadocodigo.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
 * classe do Spring que vai atender as requisições da aplicação
 */
public class ServletSpringMVC  extends 
	AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	
	/*
	 *array de classes de configurações
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class};
	}
	
	/*
	 *array com os mapeamentos que queremos que nosso servlet atenda
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
