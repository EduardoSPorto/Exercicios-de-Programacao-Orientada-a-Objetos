/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideopratico2;


public class ControleRemoto implements Interface{
    private int volume; 
    private boolean ligado;
    
    public ControleRemoto(){
        this.setVolume(50);
    }
    public void status(){
        System.out.println("Volume: " + this.getVolume()+"\n" + "Ligado: "+ this.isLigado() + "\n");
    }
    
    public void ligar(){
        this.setLigado(true);
    }
    public void desligar(){
        this.setLigado(false);
    }
    public void maisVolume(){
        if(this.getVolume() >=0)
            this.setVolume(this.getVolume() - 1);
            
    }
    public void menosVolume(){
        if(this.getVolume() <= 100)
            this.setVolume(this.getVolume() +1);
    }

    /**
     * @return the volume
     */
    private int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return the ligado
     */
    private boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
