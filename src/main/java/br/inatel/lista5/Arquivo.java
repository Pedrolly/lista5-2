package br.inatel.lista5;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void inserirempresario(Empresários em) {
        OutputStream op;
        OutputStreamWriter osw;
        BufferedWriter bw = null;

        try {

            op = new FileOutputStream("arquivo.txt", true);
            osw = new OutputStreamWriter(op);
            bw = new BufferedWriter(osw);
            br.inatel.lista5.Empresários empresário = new Empresários();
            empresário = em;
            bw.write("-------------empresários -------------\n");
            bw.write("estado civil: "+em.getEstadoCivil() + "\n");
            bw.write("identificador: "+em.getIdentificador() + "\n");
            bw.write("Salário: "+em.getSalario() + "\n");
            bw.write("Grau de Instituição"+em.getGraudeinstituição() + "\n");
            bw.write("Se tem filho"+em.isFilho() + "\n");
            if (empresário.isFilho() != true) {
                JOptionPane.showMessageDialog(null, em.getIdentificador() + " não possui filho");
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Empresários> buscar() {
        InputStream is;
        InputStreamReader isr;
        BufferedReader br = null;
        ArrayList<Empresários> empresários = new ArrayList<>();

        try {
            is = new FileInputStream("arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);

                Empresários mAux = new Empresários();
                if (linha.contains("-Casa-")) {
                    mAux.setIdentificador(Float.parseFloat(br.readLine()));
                    mAux.setEstadoCivil(br.readLine());
                    mAux.setSalario(Float.parseFloat(br.readLine()));
                    mAux.setGraudeinstituição(br.readLine());
                    mAux.setFilho(Boolean.parseBoolean(br.readLine()));
                    empresários.add(mAux);
                }
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        for (int i = 0; i < empresários.size(); i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Identificador: " + empresários.get(i).getIdentificador());
            System.out.println("Estado Civil: " + empresários.get(i).getEstadoCivil());
            System.out.println("Salário: " + empresários.get(i).getSalario());
            System.out.println("Grau de Instituição: " + empresários.get(i).getGraudeinstituição());
            System.out.println("Se tem filhos " + empresários.get(i).isFilho());
        }
        return empresários;
    }
}
