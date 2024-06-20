public class Main {
    public static void main(String[] args) {
       
        Cliente Fabio = new Cliente();
        Fabio.nome = "Fabio";
        Conta cc = new ContaCorrente(Fabio);
        Conta poupanca = new ContaPoupanca(Fabio);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        System.out.println("Depositando 1k nas contas...");
        cc.depositar(1000);
        poupanca.depositar(1000);
        System.out.println("Saldo Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + poupanca.getSaldo());
        System.out.println("Sacando 100 reais das contas...");
        cc.sacar(100);
        poupanca.sacar(100);
        System.out.println("Saldo Conta Corrence: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + poupanca.getSaldo());
        System.out.println("Transferindo 100creais conta corrente!! ");
        cc.transferir(100, poupanca);
        System.out.println("Saldo Conta Corrence: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + poupanca.getSaldo());
        System.out.println("Transferindo 100creais conta poupanca!! ");
        poupanca.transferir(100, cc);
        System.out.println("Saldo Conta Corrence: " + cc.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + poupanca.getSaldo());
        System.out.println("Rendendo juros de 1% nas conta poupanca...");
        poupanca.renderJuros(0.01);
        System.out.println("Saldo Conta Poupanca: " + poupanca.getSaldo());
        System.out.println("Saldo Conta corrente: " + cc.getSaldo());
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
