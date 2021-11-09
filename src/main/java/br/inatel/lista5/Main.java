package br.inatel.lista5;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Empresários empresários = new Empresários();
        Scanner teclado = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();
        do {
            empresários.setIdentificador(teclado.nextInt());
        empresários.setEstadoCivil(teclado.nextLine());
        empresários.setGraudeinstituição(teclado.nextLine());
        empresários.setSalario(teclado.nextFloat());
        empresários.setFilho(teclado.nextBoolean());
            arquivo.inserirempresario(empresários);
        }while(empresários.getIdentificador()<=0);


        ArrayList<Empresários> empre = new ArrayList<>();
        empre = arquivo.buscar();
    }
}