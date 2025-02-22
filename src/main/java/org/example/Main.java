package org.example;

public class Main {
    public static void main(String[] args) {
        TomadaAntiga tomadaAntiga = new TomadaAntiga();
        TomadaNova adaptador = new AdaptadorTomada(tomadaAntiga);

        adaptador.conectarNovoPino(); // Usa o adaptador para conectar a tomada antiga no novo padrão
    }
}
