package Projeto.exercicio_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class exercicio_4 {
    
    public static void main(String[] args) {
        
        List<String> pessoas = lerArquivo("pessoas_geradas.txt");

        TreeMap<Double, String> indice = new TreeMap<>();
        for (int i = 0; i < pessoas.size(); i++) {
            String pessoa = pessoas.get(i);
            String[] partes = pessoa.split(" - Idade: | - Altura: ");
            String nome = partes[0];
            int idade = Integer.parseInt(partes[1]);
            double altura = Double.parseDouble(partes[2].substring(0, partes[2].indexOf(" cm")));
            indice.put(altura, "Linha " + (i + 1) + ": " + pessoa); // Adiciona o número da linha ao valor
        }
        escreverIndice(indice, "indice_por_altura.txt");
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

    private static void escreverIndice(TreeMap<Double, String> indice, String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Map.Entry<Double, String> entrada : indice.entrySet()) {
                writer.println(entrada.getValue());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
