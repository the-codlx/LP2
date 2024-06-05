package Projeto.exercicio_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class exercicio_2 {
    
    public static void main(String[] args) {
        
        List<String> pessoas = lerArquivo("pessoas_geradas.txt");

        Map<String, List<String>> indice = new TreeMap<>();
        for (String pessoa : pessoas) {
            String[] partes = pessoa.split(" - ");
            String nome = partes[0];
            String idade = partes[1].substring(8); // Remover "Idade: "
            List<String> dadosPessoa = new ArrayList<>();
            dadosPessoa.add(nome);
            dadosPessoa.add(idade);
            indice.put(nome, dadosPessoa);
        }

        escreverIndice(indice, "indice_por_nome.txt");
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

    private static void escreverIndice(Map<String, List<String>> indice, String nomeArquivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (Map.Entry<String, List<String>> entrada : indice.entrySet()) {
                String nome = entrada.getKey();
                List<String> dadosPessoa = entrada.getValue();
                String idade = dadosPessoa.get(1);
                writer.println(nome + " - Idade: " + idade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
