public class App {


    public static void main(String[] args) {
        System.out.println("Criando nosso Banco Digital");
        System.out.println();


        ContaBancaria conta = new    ContaBancaria("0001", "7322", 5, 100.0);
        
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        conta.depositar(250.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();

        var saque = conta.sacar(150.0);
        System.out.println("Saldo atual de R$" + conta.getSaldo());
        System.out.println();
    }
}
    