package Financeira;

import java.util.Scanner;

public class MenuInterativo {

    public static void main(String[] args) {

        ListaDeClientes lista = new ListaDeClientes();

        Scanner entrada = new Scanner(System.in);
    
        while(true){

            System.out.println("==Menu Principal==");
            System.out.println("1. Cadastrar cliente.");
            System.out.println("2. Mostrar valor que cada cliente pagará de juros no mês.");    
            System.out.println("3. Alterar o juros do cliente com maior valor do empréstimo.");
            System.out.println("4. Mostrar clientes cadastrados.");
            System.out.println("5. Sair.");
        
            System.out.println("------------------------");
            int opcao = entrada.nextInt();

            System.out.println("------------------------");
        
            switch (opcao) {
            
                case 1:
                    System.out.println("Digite a quantidade de clientes que deseja cadastrar: ");
                    int quantidade = entrada.nextInt(); 
                    lista.cadastrarClientes(quantidade);
                case 4:
                    System.out.println(lista.toString());
                    break;
            
                }entrada.close(); 
            }
               
    }
    
}
