package cr.ac.ucenfotec.misia.visa_ai.egpav.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClient;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Requests to Ollama API are handled from this class.
 */
@Repository
@Slf4j
public class OllamaClient implements AIServerClient {

    @Value("${ollama.server.url}")
    private String ollamaUrl;

    @Value("${ollama.server.api.generative.endpoint}")
    private String ollamaGenerativeEndpoint;

    private RestClient restClient;
    private OllamaRequest ollamaRequest;

    public OllamaClient() {
        restClient = RestClient.create();
        ollamaRequest = new OllamaRequest();
    }

    @Override
    public String executePrompt(String prompt) {
        String url = ollamaUrl + ollamaGenerativeEndpoint;

        //Ollama requests are pre-build, we just need to add the prompt.
        ollamaRequest.setPrompt(prompt);

        log.info("Calling Ollama API with prompt");

        ResponseEntity<OllamaResponse> response = restClient.post()
            .uri(url)
            .contentType(MediaType.APPLICATION_JSON)
            .body(ollamaRequest)
            .retrieve()
            .toEntity(OllamaResponse.class);

        log.info("Ollama API response received");

        return response.getBody().getResponse();
    }
}

@Getter
@Setter
class OllamaRequest {
    private String model = "llama3";
    private boolean stream = false;
    private String prompt;
}

@Getter
@Setter
class OllamaResponse {
    private String model;
    @JsonAlias("created_at")
    private String createdAt;
    private String response;
    private boolean done;
    @JsonAlias("done_reason")
    private String doneReason;
    @JsonAlias("total_duration")
    private long totalDuration;
}