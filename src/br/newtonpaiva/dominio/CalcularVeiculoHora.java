package br.newtonpaiva.dominio;

import java.math.BigDecimal;

public class CalcularVeiculoHora implements Calcular{
    private Long horas;
    private BigDecimal valorHora;

    public CalcularVeiculoHora(Long horas, BigDecimal valorHora) {
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal execute() {
        return valorHora.multiply(new BigDecimal((horas)));
    }
}
