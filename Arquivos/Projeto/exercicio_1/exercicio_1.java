package Projeto.exercicio_1;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class exercicio_1 {
    
    public static void main(String[] args) {

        Scanner lerDoTeclado = new Scanner(System.in);

        System.out.println("Digite quantas pessoas deseja gerar: ");
        int num = lerDoTeclado.nextInt();

        try(
            Scanner lerArquivo1 = new Scanner(new FileReader("nomes.txt"));
            Scanner lerArquivo2 = new Scanner(new FileReader("sobrenomes.txt"));
            
            PrintWriter pessoas = new PrintWriter("pessoas_geradas.txt");)
        {

            Random random = new Random();

            for(int i = 0; i < num && lerArquivo1.hasNext() && lerArquivo2.hasNext(); i++){

                String nome = lerArquivo1.next();
                String sobrenome = lerArquivo2.next();

                String iniciaisDoMeio = gerarIniciaisDoMeio(random);
                
                int idade = random.nextInt(101);

                pessoas.println(nome + " " + iniciaisDoMeio + " " + sobrenome + " " + " - Idade: " + idade);

                }

            }
            catch(Exception e){

                System.out.println(e);
                
            }

        }

        private static String gerarIniciaisDoMeio(Random random) {

            int numIniciais = random.nextInt(3); 
            StringBuilder iniciais = new StringBuilder();

            for (int i = 0; i < numIniciais; i++) {

                char inicial = (char) (random.nextInt(26) + 'A');
                iniciais.append(inicial).append(". ");

            }

            return iniciais.toString();
       
    }

}
