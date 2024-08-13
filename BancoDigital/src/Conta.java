public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta (Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;

    }

    public abstract void imprimirExtrato();

    public void sacar(double valor){
        this.saldo -= valor;

    }

    public void depositar(double valor){
        this.saldo += valor;    
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns(){
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println( "Conta: " + this.getConta());
        System.out.println("Saldo: " + getSaldo());
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }
}
