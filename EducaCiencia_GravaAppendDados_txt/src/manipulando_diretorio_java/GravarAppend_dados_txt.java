package manipulando_diretorio_java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravarAppend_dados_txt {

   // public String codigo, nome, email;

    public String gravar(String path, String nomeArquivo, String nome, String email) {

        //String nomeArquivo = "JavaGrava";
        //String nome = "EducaCiencia - ";
        //String email = "educaciencia_fastcode@outlook.com.br";
        try {
            File diretorio = new File(path);
            if (!diretorio.exists()) {
                System.out.println("Pasta criada");
                diretorio.mkdir();
            }
            try (FileWriter escreve = new FileWriter(path + "/" + nomeArquivo + ".txt", true)) {
                escreve.append(nome);
                escreve.append(email);
                escreve.flush();
                System.out.println("Arquivo gravado com sucesso !");
                return "Arquivo gravado com sucesso !";
            }
        } catch (IOException e) {
            System.out.println("Falha ao gravar arquivo - " + e.toString());
            return "Falha ao gravar arquivo - " + e.toString();
        }
    }

}
