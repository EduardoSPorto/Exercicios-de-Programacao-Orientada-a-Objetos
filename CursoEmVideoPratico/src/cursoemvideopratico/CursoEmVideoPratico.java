/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoemvideopratico;

/**
 *
 * @author eduardop
 */
/*
    -Exercicio
ContaBanco
>Atributos
+numConta
#tipo (aceita dois valores, conta poupança (cp), conta corrente (cc))
-dono
-saldo
-status
- - -
>Metodos
+abrirConta() (Se conta fechada falso, quando abre tem que falar o tipo, se for corretne ganha 50, de poupança 150;)
+fecharConta() (Não pode ter dinheiro ou debito)
+depositar() (A conta tem que estar aberta)
+sacar()(A conta tem que estar aberta e precisa se ter o deinheito sacado)
+pagarMensal() (Quando chamar cobra, cobra 12 reais, se poupança 20 reais)
*/

public class CursoEmVideoPratico {

    public static void main(String[] args) {
        ContaBanco jubi = new ContaBanco();
        
        jubi.status();
        System.out.println("- - - -\n\n");
        jubi.abrirConta("cp",123,"Jubi");
        jubi.status();
        System.out.println("- - - -\n\n");
        jubi.fecharConta();

        jubi.depositar(7999.99f);
        jubi.status();
        System.out.println("- - - -\n\n");        
        jubi.sacar(2000.5f);
        jubi.status();
        System.out.println("- - - -\n\n");
        jubi.depositar(1000.5f);
        jubi.status();
        jubi.pagarMensal();
        jubi.status();
    }
    
}
