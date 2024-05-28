package cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import freemarker.template.Template;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class OllamaPrompt implements Prompt {

    @Autowired
    FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public String buildPrompt(Map<String, Object> model) {

        try {
            //Load the template from the resources/templates folder.
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate("ollama-prompt.ftl");

            String prompt = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);

            if (log.isDebugEnabled()) {
                log.debug("Prompt generated: {}", prompt);
            }

            return prompt;
        } catch (Exception e) {
            log.error("Error trying to build ollama prompt template", e);
            return null;
        }
    }

}
