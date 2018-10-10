import static javax.swing.JOptionPane.showMessageDialog; //exibir menssagens

import static javax.swing.JOptionPane.showInputDialog;//receber dados do usuario

import static java.lang.Integer.parseInt;//converter string -> int

import static java.lang.Float.parseFloat;//converter  string -> float

public class AprendendoFuncoes {
    public static void main(String[] args) {
        
        int n1 = parseInt(showInputDialog("fihite n1"));
        int n2 = parseInt(showInputDialog("fihite n2"));
        int resultado = calculaSoma(n1, n2);
        showMessageDialog(null, resultado);
        
    }//main
    
    //somar dois numeros[int]: [int] 
    public static int calculaSoma(int num1, int num2) {
         int soma = num1 + num2;
         
         return soma;
}
            
}//class