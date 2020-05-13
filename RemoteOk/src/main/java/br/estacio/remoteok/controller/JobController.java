package br.estacio.remoteok.controller;

import br.estacio.remoteok.model.Job;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

/**
 *
 * @author joagabriellima
 */
public class JobController {
    
    public ArrayList<Job> getAll() {
        
        /**
         * Passos:
         * 1 - consumir so dados da API
         * 2 - estruturar os dados em uma lista de Jobs
         */
        HttpResponse<JsonNode> response = (HttpResponse<JsonNode>) Unirest.get("https://remoteok.io/api").asJson();
        System.out.println(response.body().toPrettyString());
        
        return new ArrayList<>();
    }
}
