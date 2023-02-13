package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class GReader {

    public GReader() {}

    public String lerAResposta(Socket socket) {
        String response = null;
        try {
            response = lendoDoSocketUsandoBufferedReader(socket);
        } catch (IOException e) {
            System.out.println("Erro na leitura da resposta: " + e.getMessage());
        }
        return response;
    }

    private String lendoDoSocketUsandoBufferedReader(Socket socket) throws IOException {
        InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        BufferedReader br = new BufferedReader(ir);
        String resposta = "";
        String status = br.readLine();;
        String linha = br.readLine();

        while (linha != null) {
            //System.out.println(linha);
            resposta += (linha + "\n");
            linha = br.readLine();
        }
        return status;
    }
}
