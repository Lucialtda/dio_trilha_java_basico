public class principal {
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Lucia");

        Conta cc1  = new ContaCorrente(cliente);
        Conta cp1  = new ContaPoupanca(cliente);

        cc1.depositar(100);

        cc1.transferir(100, cp1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();


    }
}
