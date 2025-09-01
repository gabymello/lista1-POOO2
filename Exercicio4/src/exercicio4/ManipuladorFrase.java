
package exercicio4;


public class ManipuladorFrase {
    private String frase = "Esta é uma frase de exemplo para exercicio";
    
    public void exibirtamanho(){
        System.out.println("Tamanho da frase:" + frase.length());
    }
    
    public void exibirMaiuscula(){
        System.out.println("Maiuscula:" + frase.toUpperCase());
    }
    
    public void exibirMinuscula(){
        System.out.println("minuscula: " + frase.toLowerCase());
    }
    
    public void exibirSubstring(){
        String sub = frase.substring(12, 29); 
        System.out.println("Substring extraida:" + sub);
    }
    
}
