package model;

import java.io.IOException;
import java.net.Socket;

public class GoogleTalker {
    private GReader reader;
    private GWriter writer;
    private Socket socket = new Socket();              // socket para conectar no servidor
    private String path = "/search?q="; // texto padrão para pesquisa do google

    private HttpHelper httpHelper = new HttpHelper();

    public GoogleTalker() {
        System.out.println(">> Criando um objeto GoogleTalker.");
    }

    public String requisitarDados(String requisicao) throws IOException {
        String res = "";
        if(requisicao.getClass().equals(httpHelper.oQueEscrever().getClass())) { // valida se o tipo da requisicao é string
            res = conectarNoGoogle(requisicao);
        } else {
            res = "Pesquisa Inválida";
        }
        return res;
    }

    public String conectarNoGoogle(String requisicao) throws IOException {
        GReader reader = new GReader();
        String res = "";
        try {
            socket = new Socket("google.com", 80); // tenta conectar com o google
            writer = new GWriter(requisicao, path, socket);
            return reader.lerAResposta(socket);
        } catch (IOException e) {
            return "HTTP/1.0 502 Bad Gateway";
        }
    }

    public void fecharConexao() throws IOException{
        socket.close();
    }
}
