/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.remoteok;

import br.estacio.remoteok.model.Job;
import java.util.ArrayList;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;

/**
 *
 * @author joagabriellima
 */
public class Test {

    public static void main(String[] args) {
        
    }
    public static ArrayList<Job> Jobs(){
        /**
         * Passos:
         * 1 - consumir os dados da API
         * 2 - estruturar os dados em uma lista de Jobs
         */
        // http://kong.github.io/unirest-java/#requests
        HttpResponse<JsonNode> response = (HttpResponse<JsonNode>) Unirest.get("https://remoteok.io/api").asJson();

        // converte a resposta para um array de json
        JSONArray jobs = response.getBody().getArray();
        
        // prepara a lista que ira receber os dados
        ArrayList<Job> list = new ArrayList<>();
        
        // percorre cada indice do array de jsons e cria os objetos Job, adicionando-o na lista 
        for(int i=1; i< jobs.length(); i++) {
            JSONObject job = jobs.getJSONObject(i);
            list.add(new Job(job.getString("slug"), job.getString("id"), job.getString("epoch"), job.getString("date"), job.getString("company"), job.getString("company_logo"), job.getString("position"), null, job.getString("description"), job.getString("url")));
        }
        
        return list;}
}
        

