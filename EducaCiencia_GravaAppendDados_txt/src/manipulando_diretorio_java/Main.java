package manipulando_diretorio_java;

public class Main {

    public static void main(String[] args) {

        //Endereço - path
        String pasta = "C:\\EducaCienciaFastCode\\";
        //Nome do arquivo
        String nomeArquivo = "Manipulando_diretorio_java";
        //Para append
        String nome1 = "EducaCiencia_01 - ";
        String email1 = "educaciencia_fastcode_01@outlook.com.br";

        GravarAppend_dados_txt gravaTXTAppend = new GravarAppend_dados_txt();
        gravaTXTAppend.gravar(pasta, nomeArquivo, nome1, email1);

    }
}
