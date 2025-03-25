package com.controle.financeiro.model;

import java.math.BigDecimal;
import java.util.Date;

public class Lancamento {

    private Long idLancamento;
    private String descricaoLancamento;
    private Date dataVencimentoLancamento;
    private Date dataPagamentoLancamento;
    private BigDecimal valorLancamento;
    private String observacaoLancamento;
    private TipoLancamento tipoLancamento;
    private Categoria categoriaLancamento;
    private Pessoa pessoa;

    public Long getIdLancamento() {
        return idLancamento;
    }

    public String getDescricaoLancamento() {
        return descricaoLancamento;
    }

    public Date getDataVencimentoLancamento() {
        return dataVencimentoLancamento;
    }

    public Date getDataPagamentoLancamento() {
        return dataPagamentoLancamento;
    }

    public BigDecimal getValorLancamento() {
        return valorLancamento;
    }

    public String getObservacaoLancamento() {
        return observacaoLancamento;
    }

    public TipoLancamento getTipoLancamento() {
        return tipoLancamento;
    }

    public Categoria getCategoriaLancamento() {
        return categoriaLancamento;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setIdLancamento(Long idLancamento) {
        this.idLancamento = idLancamento;
    }

    public void setDescricaoLancamento(String descricaoLancamento) {
        this.descricaoLancamento = descricaoLancamento;
    }

    public void setDataVencimentoLancamento(Date dataVencimentoLancamento) {
        this.dataVencimentoLancamento = dataVencimentoLancamento;
    }

    public void setDataPagamentoLancamento(Date dataPagamentoLancamento) {
        this.dataPagamentoLancamento = dataPagamentoLancamento;
    }

    public void setValorLancamento(BigDecimal valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    public void setObservacaoLancamento(String observacaoLancamento) {
        this.observacaoLancamento = observacaoLancamento;
    }

    public void setTipoLancamento(TipoLancamento tipoLancamento) {
        this.tipoLancamento = tipoLancamento;
    }

    public void setCategoriaLancamento(Categoria categoriaLancamento) {
        this.categoriaLancamento = categoriaLancamento;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
