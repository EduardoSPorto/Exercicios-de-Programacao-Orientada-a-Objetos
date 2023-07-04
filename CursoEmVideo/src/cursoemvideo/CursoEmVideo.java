/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author eduardop
 */
public class CursoEmVideo {

    public static void main(String[] args) {
        Caneta canetaPreta = new Caneta(100);
        
        canetaPreta.olhar();
        /*canetaPreta.Caneta();
        canetaPreta.olhar();
*/
        
        System.out.println(canetaPreta.getModelo());
        //canetaPreta.setModelo("Cassio");
        canetaPreta.setModelo("Cassio");
        System.out.println(canetaPreta.getModelo());
        
        canetaPreta.cor = "Preta";
        //canetaPreta.ponta = 1.5f;
        System.out.println("Ponta antes: " + canetaPreta.getPonta());
        canetaPreta.setPonta(1.5f);
        System.out.println("Ponta depois: " + canetaPreta.getPonta()+"\n\n");

        canetaPreta.carga = 98;
        //canetaPreta.tampada = true;
        canetaPreta.olhar();
        //canetaPreta.destampar();
        canetaPreta.tampar();
        canetaPreta.olhar();
    }
    
}
