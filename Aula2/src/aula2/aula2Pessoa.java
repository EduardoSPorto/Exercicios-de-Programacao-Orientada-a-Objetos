/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author eduardop
 */
public class aula2Pessoa {
    private String nome;
    private aula2Data dataDeNascimento;
    private float altura;
    
    /*//coloca mesmo nome, e assume um contrutor que da os valores em ( ... )
    public aula2Pessoa(String nome, Data d, float altura) {
        this.nome = nome;
        this.dataDeNascimento = d;
        this.altura = altura;
    }
    */

    //para acessar privados
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public aula2Data getDataDeNascimento() {
        return dataDeNascimento;
    }


    public void setDataDeNascimento(aula2Data dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    /*
        // getaltura/ set  etc
        public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + getDataDeNascimento());
        System.out.println("Altura: " + getAltura());    
    }
    */
    
    //Reler essa logica
    //Relido, basciamente excluindo gradualmente excessão que podem fazer -
    //- o aniversario sair errado
    
    public int CalcularIdade(aula2Data dataAtual){
        int idade = dataAtual.ano() - this.dataDeNascimento.ano();
        if (dataAtual.mes() < this.dataDeNascimento.mes())
            idade--;
        else if (dataAtual.mes() == this.dataDeNascimento.mes() &&
                dataAtual.dia() < this.dataDeNascimento.dia())
               idade--;
        return idade;
    }
    
        public void Imprimir(){
            System.out.println("\nNome: "+ this.nome);
     /*
            System.out.println("Nasceu no dia " +
                    this.dataDeNascimento.dia() + "/" +
                    this.dataDeNascimento.mes() + "/" +
                    this.dataDeNascimento.ano());
 */
    System.out.print("\nData de nascimento: ");
    this.dataDeNascimento.Imprimir();// chamando metodo imprimit
System.out.println("Altura:" + this.altura);

        }
        
        // static é porque essa função não precisa de ser executada, algo necessaria para uma "main"
        public static void main(String[] args){
            //intancia, e não seta valores
            aula2Pessoa p1 = new aula2Pessoa();
            //Apartir de agora seta
            p1.setNome("Gordom Beruga");
            //Data é um objeto, obviamente
            aula2Data d = new aula2Data(24,3,23);
            p1.setDataDeNascimento(d);
            p1.setAltura(0.3f);
            
            
            p1.Imprimir();
            // intancia nova data adicionando tal valor, mesma coisa da linha (93?)
            System.out.println("Idade "+ p1.CalcularIdade(new aula2Data(25, 06, 2023)));

        }



}