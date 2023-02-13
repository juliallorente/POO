package model;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class GWriter {

    public GWriter(String requisicao, String path, Socket socket) {
        try {
            escreverARequisicao(requisicao, path, socket);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escreverARequisicao(String requisicao, String path, Socket socket) throws IOException {
        PrintStream ps = new PrintStream(socket.getOutputStream());
        ps.println( "GET " + path + requisicao + " HTTP/1.0" ); // envia para o google a pesquisa
        ps.println();
    }
}
