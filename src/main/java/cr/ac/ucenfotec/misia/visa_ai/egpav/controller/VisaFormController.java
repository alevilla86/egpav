package cr.ac.ucenfotec.misia.visa_ai.egpav.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import cr.ac.ucenfotec.misia.visa_ai.egpav.client.AIServerClient;
import cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt.Prompt;
import cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt.PromptFactory;
import cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt.PromptFactory.PromptType;
import cr.ac.ucenfotec.misia.visa_ai.egpav.dto.VisaFormDto;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/visa-form")
@Slf4j
public class VisaFormController {

    @Autowired
    private AIServerClient aiServerClient;

    @Autowired
    private PromptFactory promptFactory;

    ObjectMapper mapper = new ObjectMapper();

    @PostMapping()
    public String postMethodName(
        @RequestBody VisaFormDto visaForm,
        @RequestParam(value = "engine", required = true, defaultValue = "OLLAMA") String engine
        ) {
        //1st step: validate the form.
        //TO-D0: validate the form.

        //2nd step: build the prompt.
        String prompt = buildPrompt(engine, visaForm);
        log.info("Prompt built for [name={}, age={}, sex={}, birthCountry={}, maritusStatus={}, primaryOccupation={}]",
            visaForm.getName(), visaForm.getAge(), visaForm.getSex(), visaForm.getBirthCountry(), visaForm.getMaritalStatus(), visaForm.getPrimaryOccupation());

        //3rd step: send the form to the AI server.
        String aiAnalysisRaw = aiServerClient.executePrompt(prompt);
        log.info("AI analysis received for [name={}, age={}, sex={}, birthCountry={}, maritusStatus={}, primaryOccupation={}]", 
            visaForm.getName(), visaForm.getAge(), visaForm.getSex(), visaForm.getBirthCountry(), visaForm.getMaritalStatus(), visaForm.getPrimaryOccupation());

        //4th step: sanitize the response.
        String aiAnalysis = sanitizeResponse(aiAnalysisRaw);
        log.info("AI analysis sanitized for [name={}, age={}, sex={}, birthCountry={}, maritusStatus={}, primaryOccupation={}]", 
            visaForm.getName(), visaForm.getAge(), visaForm.getSex(), visaForm.getBirthCountry(), visaForm.getMaritalStatus(), visaForm.getPrimaryOccupation());
        
        return aiAnalysis;
    }

    private String buildPrompt(String engine, VisaFormDto visaForm) {
        PromptType promptType = PromptType.valueOf(engine);
        Prompt prompt = promptFactory.getPrompt(promptType);
        
        // Convert POJO to Map
        Map<String, Object> model = 
            mapper.convertValue(visaForm, new TypeReference<Map<String, Object>>() {});
        
        return prompt.buildPrompt(model);
    }

    private String sanitizeResponse(String aiAnalysisRaw) {
        //TO-DO: sanitize the response.
        return aiAnalysisRaw;
    }
    
}
