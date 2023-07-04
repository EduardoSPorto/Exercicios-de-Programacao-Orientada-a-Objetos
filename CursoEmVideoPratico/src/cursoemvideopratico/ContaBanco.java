/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoemvideopratico;

/**
 *
 * @author eduardop
 */
public class ContaBanco {
    private int nunConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status; 
    
    //Como capturar?, como classificar algo dentre duas opções? é char?
    ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void abrirConta(String tipoEscolhido, int numero, String nome){
        if (status == false){
            this.setTipo(tipoEscolhido);
            //Sera que não se usa get?
            this.setStatus(true);
            //numero da conta?, como contar?
            this.setNunConta(1);
            this.setDono(nome);

            if (this.getTipo() == "cp")    
                this.depositar(150);
            else
                this.depositar(50);
        }
    }

    void fecharConta(){
        if(getSaldo() == 0){
            this.setStatus(false);
        System.out.println("Conta fechada\n");
        }
        else 
            if(getSaldo() >= 0)
            System.out.println("O saldo " + this.getSaldo() +" não é vazio\n");
        else 
            if (getSaldo() < 0)
            System.out.println("Você tem debito no valor de "+ this.getSaldo() + "\n");
    }
    
    void depositar(float depositado){
        if(this.isStatus())
            setSaldo(getSaldo() + depositado);
    }
    
    void sacar(float retirado){
        if(this.isStatus())
            if(this.getSaldo() >= retirado)
                setSaldo(getSaldo() - retirado);
    }
    
    //preciso saber como lidar com tipo
    
    void pagarMensal(){
        if (this.getTipo() == "cp")
            this.saldo = this.saldo - 12;
            
        else
            this.saldo = this.saldo - 20;
}


    /**
     * @return the nunConta
     */
    public int getNunConta() {
        return nunConta;
    }

    /**
     * @param nunConta the nunConta to set
     */
    public void setNunConta(int nunConta) {
        this.nunConta = nunConta;
    }
    void status(){
        System.out.println("Numero da conta é " + this.getNunConta());
        System.out.println("Tipo é " + this.getTipo());
        System.out.println("Dono é " + this.getDono());
        System.out.println("Saldo é " + this.getSaldo());
        System.out.println("Status é " + this.isStatus());        
    }
    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }
    


    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

