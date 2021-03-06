public class Funcionario {
    protected String nome;
    protected int horasTrabalhadas;
    protected double salarioHora;
    protected int matricula;

    public Funcionario(String nome, int horasTrabalhadas, double salarioHora, int matricula) {
        //System.out.println("Novo funcionario");
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
        this.matricula = matricula;
    }

    public double calculaSalarioMes() {
        return salarioHora * horasTrabalhadas;
    }

    public void apresentar() {
        System.out.println("Meu nome é "+ nome);
        System.out.println("Minha matricula é " + matricula);
    }

}
