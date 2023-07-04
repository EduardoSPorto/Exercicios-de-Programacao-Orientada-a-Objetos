/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo2;


public class ControleRemoto implements DoisInterface{
    private int volume; 
    private boolean ligado;
    
    public ControleRemoto(){
        this.setVolume(50);
}
    void status(){
        System.out.println("Volume: " + this.getVolume()+"\n" + "Ligado: "+ this.isLigado() + "\n");
    }
    
    void ligar(){
        this.setLigado(true);
    }
    void desligar(){
        this.setLigado(false);
    }
    void maisVolume(){
        if(this.getVolume() >=0)
            this.setVolume(this.volume - 1);
            
    }
    void menosVolume(){
        if(this.getVolume() <= 100)
            this.setVolume(this.volume +1);
    }

    /**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
