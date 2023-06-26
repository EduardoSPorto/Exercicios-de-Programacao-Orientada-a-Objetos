/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisemana1e2;

/**
 *
 * @author eduardop
 */
public class notaPessoa {
    String nome;
    int idade;
    float altura;
    float nota1;
    float nota2;
    
    float notaFinal(){
        float notaTotal;
        notaTotal = nota1 + nota2;
        return notaTotal;
    }
    
}
