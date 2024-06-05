package Projeto.exercicio_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class exercicio_3 {
    
    public static void main(String[] args) {

        List<String> pessoas = lerArquivo("pessoas_geradas.txt");

        TreeMap<Integer, String> indice = new TreeMap<>();
        for (int i = 0; i < pessoas.size(); i++) {
            String pessoa = pessoas.get(i);
            String[] partes = pessoa.split(" - Idade: ");
            int idade = Integer.parseInt(partes[1]);
            indice.put(idade, "Linha " + (i + 1) + ": " + pessoa);
        }

        escreverIndice(indice, "indice_por_idade.txt");
    }

    private static List<String> lerArquivo(String nomeArquivo) {
        List<String> pessoas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                pessoas.add(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pessoas;
    }

    private static void escreverIndice(TreeMap<Integer, String> indice, String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Map.Entry<Integer, String> entrada : indice.entrySet()) {
                writer.println(entrada.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}
