public class classeConta{
    int agencia;
    int numero_conta;
    double saldo;    

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void efetuarPagamento(double valor){
        this.saldo -= valor;
    }

    public void colocarCreditosCelular(double valor){
        this.saldo -= valor;
    }
}


