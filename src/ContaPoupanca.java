public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void renderJuros(double taxa){
        double saldoAtual = super.getSaldo();
        double juros = saldoAtual * taxa;
        super.depositar(juros);
    }
    @Override
    public void imprimirExtrato(){
        System.out.println("===Extrato da Conta Poupanca===");
        super.imprimirInfosComuns();
    }
}
