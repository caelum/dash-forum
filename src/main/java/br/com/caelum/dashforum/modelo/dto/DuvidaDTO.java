package br.com.caelum.dashforum.modelo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DuvidaDTO {

    @JsonProperty("category")
    private String categoria;
    @JsonProperty("subcategory")
    private String subCategoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }
}
