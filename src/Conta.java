public class Conta {
    protected int agencia;
    protected int numero;   
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente){
        agencia = Conta.AGENCIA_PADRAO;
        numero = SEQUENCIAL++;
        saldo = 0.0;
        this.cliente = cliente;
  }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {    
        this.saldo -= valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
    public void imprimirExtrato() {
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void imprimirInfosComuns() {
        System.out.println("===Infos Comuns===");
        System.out.println("Cliente: " + this.cliente.nome);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void renderJuros(double d) {
    }
}
