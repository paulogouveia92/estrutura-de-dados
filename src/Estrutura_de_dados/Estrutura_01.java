
package Estrutura_de_dados;







public class Estrutura_01 {
    public static void main(String[] args) {
  
       
          int x, i, tam, numeros[];
        tam = Input.readInt("Digite o tamanho do Vetor: ");
        numeros = new int [tam];
        
        for (i=0;i<tam;i++){
            numeros[i]=Input.readInt("Digite um valor : ");
            
        }
    x = Input.readInt("Digite o valor de x  : ");
    
   for(i=0;1<tam;i++){
        if (numeros[i] == x)
            System.out.println("Elemento Encontrado!");
    }
   } 
}

                
  
    


    

