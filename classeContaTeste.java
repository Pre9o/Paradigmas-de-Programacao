public class classeContaTeste{
    public static void main(String[] args){
        classeConta conta1 = new classeConta();
        conta1.agencia = 1234;
        conta1.numero_conta = 56789;
        conta1.saldo = 1000.00;
        System.out.println("Saldo inicial: " + conta1.saldo);
        conta1.depositar(100.00);
        System.out.println("Saldo após depósito: " + conta1.saldo);
        conta1.efetuarPagamento(200.00);
        System.out.println("Saldo após pagamento: " + conta1.saldo);
        conta1.colocarCreditosCelular(50.00);
        System.out.println("Saldo após créditos: " + conta1.saldo);
    }
}

    
