//Pedro Gabriel Guimarães Fernandes RA: 10437465


public class Palindromo{
    private String texto;

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        if(texto != null){
            this.texto = texto;
        }
    }

    public Palindromo(){
        this.texto = "";
    }

    public Palindromo(String texto){
        this.texto = texto;
    }


    public boolean verificar(){
        //tem que retornar se é palindromo ou não
        char[] palavra = this.texto.toLowerCase().toCharArray();
        for(int i = 0; i < texto.length(); i++){
            if(palavra[i] != palavra[texto.length() - 1 - i] ){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Palindromo palindromo = new Palindromo("Ana");
        if(palindromo.verificar() == true){
            System.out.println("É Palindromo");
        }else{
            System.out.println("Não é Palindromo");
        }
    }
}