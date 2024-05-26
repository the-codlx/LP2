package Financeira;

public class Cliente {
    
    private String nome;
    private double valorDoEmprestimo;
    private double juros;
    
    public Cliente(String nome, double valorDoEmprestimo, double juros) {
        this.nome = nome;
        this.valorDoEmprestimo = valorDoEmprestimo;
        this.juros = juros;
    }

    public Cliente() {
        this.nome = "";
        this.valorDoEmprestimo = 0;
        this.juros = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDoEmprestimo() {
        return valorDoEmprestimo;
    }

    public void setValorDoEmprestimo(double valorDoEmprestimo) {
        this.valorDoEmprestimo = valorDoEmprestimo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public String toString() {
        return "Emprestimo [nome=" + nome + ", valorDoEmprestimo=" + valorDoEmprestimo + ", juros=" + juros + "]";
    }
    
}
