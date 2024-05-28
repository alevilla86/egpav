package cr.ac.ucenfotec.misia.visa_ai.egpav.client.prompt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PromptFactory {

    @Autowired
    private OllamaPrompt ollamaPrompt;

    public enum PromptType {
        OLLAMA,
        CHAT_GPT;

        public static PromptType fromString(String promptType) {
            promptType = promptType.toLowerCase();
            switch (promptType) {
                case "ollama":
                    return OLLAMA;
                case "chat-gpt":
                    return CHAT_GPT;
                default:
                    log.error("Invalid Prompt type (engine). Valid engines are: {}", 
                        (Object[]) PromptType.values());
                    return null;
            }
        }
    }

    public Prompt getPrompt(PromptType promptType) {
        switch (promptType) {
            case OLLAMA:
                return ollamaPrompt;
            case CHAT_GPT:
                return null;
            default:
                return null;
        }
    }
}
