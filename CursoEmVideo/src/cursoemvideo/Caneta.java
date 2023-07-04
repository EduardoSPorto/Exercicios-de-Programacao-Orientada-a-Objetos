/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideo;

/**
 *
 * @author eduardop
 */
public class Caneta {
    //char modelo;
    private String modelo;
    public String cor;
    // No privado tu só pode mexer se for dentro da classe então se tu tiver
    // -outra a necessidade de dar uma valor para a caracteristica ponta tu precisa chamar
    // -um metodo(dentro da classe) que ai podera alterar o valor deste especifico atributo 
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //Metodo construtor, monta a objeto
    //(pode também seu utilizado para criar uma configuração padrão, ou cetar o padrãao de alguns atributos)
    
    // !!O nome do construtor é o mesmo da classe
    // Em maiusculo mesmo
    // Sem void
    Caneta(int carga){
        this.tampada = true;
        this.cor = "Azul";
        this.carga = carga;
    }
    
    public void rabiscar(boolean tampada){
        if(tampada)
            System.out.println("ERRO");
        else
            System.out.println("Rabisco");
}           
    //Metodo get, serve para outras classes leiam sem acessar outros this
    //Seter é semelhante, só que tu pode mudar um valor, normalmente recebe parametro
    void setPonta(float tipoPonta){
        this.ponta = tipoPonta;
    }
    float getPonta(){
        return ponta;
    }
    
    
    void tampar(){
        tampada = true; 
}
    void destampar(){
        tampada = false;
    }
    
    void olhar(){
        System.out.println("Modelo é " + this.getModelo());
        System.out.println("A cor da tinta é " + this.cor);
        System.out.println("O tamanho da ponta é " + this.ponta);
        System.out.println("A porcentagem de carga é " + this.carga);
        System.out.println("Status de tampamento: " + this.tampada);
        System.out.println("\n\n");
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
};