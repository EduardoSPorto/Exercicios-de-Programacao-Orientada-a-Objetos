/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revisemana1e2;

import java.util.Scanner;

/**
 *
 * @author eduardop
 */
public class copiaMostra {
    //int i; Nâo é qui

    public static void main(String[] args) {
        //Metodo estranho e menos direto
        float i,n1,n2,resultado;
        

        
        System.out.print("Teste\n\n"); //Codigo fica aqui dentro
        Scanner scan = new Scanner(System.in); 
        //Como é "nextFloat" eu tive que mudar o "int" para "float", sera que se tem alternativa?
        
        i = scan.nextFloat();
        
        System.out.print(+ i +"\n");    

        System.out.print("Diga o primeiro numero\n"); //Codigo fica aqui dentro
        n1 = scan.nextFloat();
        
        System.out.print("Diga o segundo numero\n"); //Codigo fica aqui dentro
        n2 = scan.nextFloat();
        //System.out.print( n1 + n2 +"\n");
        resultado= n1+n2;
        
        System.out.print( resultado + "\n\n");
        
        notaPessoa atual = new notaPessoa();
        atual.nome="Jota";
        atual.altura=6.5f;
        atual.idade=21;
        atual.nota1= 7;
        atual.nota2= 2;
        
        System.out.print("A nota total é " + atual.notaFinal()+" e seu nome é" + atual.nome);

    }
    
}
