/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */

// tudo dentro desta classe aula2Data
    public class aula2Data {
        private final int dia;
        private final int mes;
        private final int ano;

    public /*class */ aula2Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    // Então não precisa "get" no nome da função?
    public int dia (){
        return dia;
}

    public int mes() {
        return mes;
    }

    public int ano() {
        return ano;
    }
    
    //depois que tudo funcionar tentar mexer com isso
    //Resposta: result = a > b ? x : y;
    //boolean statement ? true result : false result;
    //Resposta final= é para que fique "01","04" e não "1", "4"
    public void Imprimir(){
        System.out.println((dia < 10 ? "0"+ dia : dia)+"/"+(mes <10 ? "0"+ mes : mes) + "/" + ano);
    }
    
}

