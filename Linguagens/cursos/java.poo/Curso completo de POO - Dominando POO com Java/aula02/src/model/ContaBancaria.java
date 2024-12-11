import java.util.InputMismatchException;

public class ContaBancaria {

    //#region Atributos 

    private String agencia;
    private String conta;
    private Integer digito;
    private Double saldo;
    private final Double VALOR_MINIMO_DEPOSITO = 10.0;

    //#endregion

    //#region Construtores 

    public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
    }

    //#endregion

    //#region Getters e Setters 

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Integer getDigito() {
        return digito;
    }

    public void setDigito(Integer digito) {
        this.digito = digito;
    }

    public Double getSaldo() {
        return saldo;
    }

    //#endregion
    
    //#region Métodos

    public void depositar(Double valor) {
        // Verifica se o valor do depósito é menor que o valor mínimo
        if (valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor mínimo de depósito é R$ " + VALOR_MINIMO_DEPOSITO);
        }
        // Adiciona o valor ao saldo
        this.saldo += valor;
    }

    public Double sacar(Double valor) {
        // Verifica se o valor solicitado é maior que o saldo da conta
        if (valor > this.saldo) {
            throw new InputMismatchException("Saldo insuficiente.");
        }
        // Aqui removemos o valor de saque do saldo atual
        this.saldo -= valor;  
        // Retorna o valor sacado ao usuário
        return valor;
    }

    //#endregion
}