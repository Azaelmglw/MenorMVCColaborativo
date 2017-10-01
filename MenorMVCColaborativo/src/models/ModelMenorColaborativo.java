package models;

/**
 *
 * @author Azael_Mendoza
 */
public class ModelMenorColaborativo {
    private int numero_1  = 6;
    private int numero_2 = 6;
    private int numero_3 = 6;
    private int numero_menor = 0;
    
    public int getNumero_1(){
        return numero_1;
    }
    
    public int getNumero_2(){
        return numero_2;
    }
    
    public int getNumero_3(){
        return numero_3;
    }
    
    public int getNumero_Menor(){
        return numero_menor;
    }
    
    public void setNumero_1(int numero_1){
        this.numero_1 = numero_1;
    }
    
    public void setNumero_2(int numero_2){
        this.numero_2 = numero_2;
    }
    
    public void setNumero_3(int numero_3){
        this.numero_3 = numero_3;
    }
    
    public void setNumero_Menor(int numero_menor){
        this.numero_menor = numero_menor;
    }
    
    public void CalcularMenor(){
        numero_menor = numero_1;
        if(numero_menor > numero_2){
            numero_menor = numero_2;
        }
        else if(numero_menor >numero_3){
            numero_menor = numero_3;
        }
    }
    
}
