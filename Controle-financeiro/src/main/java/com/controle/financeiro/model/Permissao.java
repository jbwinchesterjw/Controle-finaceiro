package com.controle.financeiro.model;

public class Permissao {
    private Long idPermissao;
    private String descricaoPermissao;

    public Long getIdPermissao() {
        return idPermissao;
    }

    public String getDescricaoPermissao() {
        return descricaoPermissao;
    }

    public void setIdPermissao(Long idPermissao) {
        this.idPermissao = idPermissao;
    }

    public void setDescricaoPermissao(String descricaoPermissao) {
        this.descricaoPermissao = descricaoPermissao;
    }
}
