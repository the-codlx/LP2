package Projeto.exercicio_1;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class sobrenomes {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
    
        PrintWriter print = null;

        try{
            FileWriter arquivo = new FileWriter("Sobrenomes.txt");
            print = new PrintWriter(arquivo);

            String sobrenomes;

            for(int i = 0; i < 20; i++){
                sobrenomes = entrada.nextLine();
                print.println(sobrenomes);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            print.close();
        }
    }
    
}
