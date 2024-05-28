package cr.ac.ucenfotec.misia.visa_ai.egpav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.TemplateLoader;

@Configuration
public class FreemarkerConfig {

    @Bean
    public FreeMarkerConfigurer freeMarkerConfigurer(){
        freemarker.template.Configuration configuration = new freemarker.template.Configuration(freemarker.template.Configuration.VERSION_2_3_32);
        TemplateLoader templateLoader = new ClassTemplateLoader(this.getClass(), "/templates/");
        configuration.setTemplateLoader(templateLoader);
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setConfiguration(configuration);
        return freeMarkerConfigurer;
    }
}
