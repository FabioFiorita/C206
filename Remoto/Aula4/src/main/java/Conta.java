public class Conta {
    public int numero;
    public double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //Mostrando as informações da conta
    public void exibirConta() {
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
    }
}
