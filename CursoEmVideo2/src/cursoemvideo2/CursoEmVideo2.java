
package cursoemvideo;

public class CursoEmVideo {

    public static void main(String[] args) {
        Caneta canetaPreta = new Caneta();
        canetaPreta.modelo = "Cassio";
        canetaPreta.cor = "Preta";
        canetaPreta.ponta = 1.5f;
        canetaPreta.carga = 98;
        canetaPreta.tampada = true;
        canetaPreta.olhar();
        canetaPreta.destampar();
        canetaPreta.olhar();
        canetaPreta.tampar();
        canetaPreta.olhar();
    }
    
}