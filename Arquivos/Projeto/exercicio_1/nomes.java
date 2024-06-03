package Projeto.exercicio_1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class nomes {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        
        PrintWriter arquivo = null;
        
        try{
            
            String nome;

            FileWriter out = new FileWriter("nomes.txt");
            arquivo = new PrintWriter(out);
            
            System.out.println("Informe os nomes: ");
            for(int i = 0; i < 20; i++){

                nome= entrada.nextLine();
                arquivo.println(nome);
            }

            System.out.println("Nomes impressos no arquivo!");

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            arquivo.close();
        }

    }
}