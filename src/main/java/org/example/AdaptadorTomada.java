package org.example;

// O adaptador transforma uma tomada antiga em uma tomada nova
class AdaptadorTomada extends TomadaNova {
    private TomadaAntiga tomadaAntiga;

    AdaptadorTomada(TomadaAntiga tomadaAntiga) {
        this.tomadaAntiga = tomadaAntiga;
    }

    @Override
    void conectarNovoPino() {
        tomadaAntiga.conectarPinoAntigo(); // Adapta o formato antigo para o novo
        System.out.println("Adaptador converteu a tomada antiga para nova!");
    }
}
