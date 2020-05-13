/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.remoteok.model;

import java.util.ArrayList;

/**
 *
 * @author joagabriellima
 *
 */
public class Job {

    private String slug;
    private String id;
    private String epoch;
    private String date;
    private String company;
    private String company_logo;
    private String position;
    private ArrayList<String> tags;
    private String description;
    private String url;

    public Job(String slug, String id, String epoch, String date, String company, String company_logo, String position, ArrayList<String> tags, String description, String url) {
        this.slug = slug;
        this.id = id;
        this.epoch = epoch;
        this.date = date;
        this.company = company;
        this.company_logo = company_logo;
        this.position = position;
        this.tags = tags;
        this.description = description;
        this.url = url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany_logo() {
        return company_logo;
    }

    public void setCompany_logo(String company_logo) {
        this.company_logo = company_logo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Job{" + "slug=" + slug + ", id=" + id + ", epoch=" + epoch + ", date=" + date + ", company=" + company + ", company_logo=" + company_logo + ", position=" + position + ", tags=" + tags + ", description=" + description + ", url=" + url + '}';
    }

}
