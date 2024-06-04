package Projeto.exercicio_1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.Random;

public class exercicio_1 {
    
    public static void main(String[] args) {
        
        String[] nomes = readLineFromFiles("nomes.txt");
        RandomAccessFile sobrenomeAleatorio = new RandomAccessFile("sobrenome.txt", "r");

        Random random = new Random();

        try(
            while()
            int index = random.nextInt(3);
        
        )

    }

    public static String[] lerLinhasDeArquivos(String caminho){

        try(BufferedReader br = new BufferedReader(new FileReader(caminho))){

            return br.lines().toArray(String[]::new); 
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{br.close();}
        
    }

}
