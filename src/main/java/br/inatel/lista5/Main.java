package br.inatel.lista5;
import
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Path arquivo = Paths.get("funcionarios.txt");

        try {
            List<String> conteudo = Files.readAllLines(arquivo);
            Map<String,String> empresa = new HashMap<>();
            List<Produto> produto= new List<Produto>()

            Empresários emp = new Empresários();
            conteudo.forEach((linha) -> {
                String[] linhaQuebrada = linha.split(";");
                empresa.put(linhaQuebrada[0],linhaQuebrada[1].strip());
            });

            empresa.forEach((jogo,empresas) -> {
                System.out.println("nome " + emp.isFilho());
                if(emp.isFilho()!=)
                System.out.println("Empresa: " + empresa);
                System.out.println("");
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}