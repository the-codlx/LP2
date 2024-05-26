package Financeira;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDeClientes {
    
    private Cliente vetFinanceiro[];
    private int quantClientes;
    
    public ListaDeClientes() {
        vetFinanceiro = new Cliente[1500];
        quantClientes = 0;
    }

    public Cliente[] getVetFinanceiro() {
        return vetFinanceiro;
    }

    public void setVetFinanceiro(Cliente[] vetFinanceiro) {
        this.vetFinanceiro = vetFinanceiro;
    }

    public int getQuantClientes() {
        return quantClientes;
    }

    public void setQuantClientes(int quantClientes) {
        this.quantClientes = quantClientes;
    }

    @Override
    public String toString() {
        String resposta = "";
        for(int i = 0; i < this.quantClientes; i++){
           resposta += (i + 1) + "." + " " + this.vetFinanceiro[i].toString(); 
        }
        return resposta;
    }

    public boolean verificarSeTemEmprestimo(String cliente){
        if(this.quantClientes == 0){
            return false;
        }else{
        for(int i = 0; i < this.quantClientes; i++){
            if(this.vetFinanceiro[i].getNome().equalsIgnoreCase(cliente)){
                return true;
            }
        }
        return false;
        }
    }

    public void cadastrarCliente(Cliente cliente){
        if(this.getQuantClientes() >= this.vetFinanceiro.length){
            return;
        }
        else{
            if(!verificarSeTemEmprestimo(cliente.getNome())){
                vetFinanceiro[quantClientes] = cliente;
                quantClientes++;
            }
            else{System.out.println("O cliente já está cadastrado.");}
        }
    }

    public void cadastrarClientes(int quantidade){   
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < quantidade; i++){
            Cliente cliente = new Cliente();
            System.out.println("------------------------");
            System.out.println("Digite o nome do cliente: ");
            String nome = entrada.nextLine();
            if(verificarSeTemEmprestimo(nome) == false){
                System.out.println("------------------------");
                cliente.setNome(nome);
                System.out.println("Digite o valor do empréstimo: ");
                Double emprestimo = Double.parseDouble(entrada.nextLine());
                cliente.setValorDoEmprestimo(emprestimo);
                System.out.println("------------------------");
                System.out.println("Digite a taxa de juros: ");
                double juros = Double.parseDouble(entrada.nextLine());
                cliente.setJuros(juros);
                System.out.println("------------------------");
                }
            else{
                System.out.println("Cliente já cadastrado.");
            }
        }
        entrada.close();
    }

    public void mostrarValorDeJuros(){

        DecimalFormat df = new DecimalFormat("#.##");

        int i = 0;
        while(i < quantClientes){
            double valorTotal = vetFinanceiro[i].getValorDoEmprestimo() * ((this.vetFinanceiro[i].getJuros() / 100) + 1); 
            double juros = valorTotal - vetFinanceiro[i].getValorDoEmprestimo();
            System.out.println(vetFinanceiro[i].getNome() + " R$" + df.format(juros));
            i++;
        }
    
    }

    public void alterarJurosCLienteMaiorValor(double juros){
        
        double maior = 0;
        int indice = 1, indiceMaior = 0;

        while(indice < quantClientes){
            maior = vetFinanceiro[0].getValorDoEmprestimo();
            if(vetFinanceiro[indice].getValorDoEmprestimo() > maior){
                maior = vetFinanceiro[indice].getValorDoEmprestimo();
                indiceMaior = indice;
                indice++;
            }
        }
        vetFinanceiro[indiceMaior].setJuros(juros);
    }

    
}
