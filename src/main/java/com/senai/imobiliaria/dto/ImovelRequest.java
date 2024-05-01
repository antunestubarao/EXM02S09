package com.senai.imobiliaria.dto;

import com.senai.imobiliaria.model.Tipo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ImovelRequest {

    @NotNull(message = "O código é obrigatório")
    @Positive(message = "O código do imóvel deve ser um número positivo")
    private Integer codigo;
    @NotNull(message = "O código é obrigatório")
    private Tipo tipo;
    @NotEmpty(message = "Campo obrigatório")
    private String descricao;
    @NotEmpty(message = "Campo obrigatório")
    private String endereco;

    private String bairro;

    @NotEmpty(message = "Campo obrigatório")
    @Size(min = 3, max = 50, message = "O nome da cidade deve ter entre 3 e 50 caracteres")
    private String cidade;
    @NotNull(message = "O código é obrigatório")
    @Positive(message = "O valor do imóvel deve ser um número positivo")
    private Float valor;

}
