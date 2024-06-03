package ProjetoProfessor;
import java.io.*; 

public class Arquivo {
    
public static void main(String[] args) throws IOException {
    
    //aqui cria a variavel que vai manipular o arquivo
    PrintWriter arquivo = null;

    try{
        //aqui cria o arquivo
        FileWriter out = new FileWriter("Arquivo.txt");

        //fazendo a variavel para manipular arquivos apontar para o "Arquivo.txt"
        arquivo = new PrintWriter(out);

        //fazendo uma anotação nesse arquivo
        arquivo.println("Testando essa nova biblioteca.");
        //arquivo.println("teste");

    }
    catch(Exception e){

        System.out.println("erro");
    }
    finally{
        if(arquivo != null){
            arquivo.close();
        }
    }

}

}
