package cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt;

import java.util.Map;

public interface Prompt {

    public String buildPrompt(Map<String, Object> model);
}
