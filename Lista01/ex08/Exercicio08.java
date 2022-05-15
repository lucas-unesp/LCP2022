package bc.unesp.rc.lcp_lista01.ex08;

public class Exercicio08 {

    public static boolean validaNumero(int numero){
        double checkNum=0;
      
        int[] list = new int[100];
        int quociente,i=0;
        int result=numero;
        while(result > 0){            
            quociente = result%10;
            list[i] = quociente;
            result = result/10;
            i++;
        }
        for(int j = i-1; j>=0; j--){
            checkNum += Math.pow(list[j], i);
        }
        
        return numero == checkNum;
    }
    
    public static void main(String[] args) {
        int testNum=54749;
        
        if(validaNumero(testNum)){
            System.out.printf("Numero %d valido",testNum);
        }else{
            System.out.printf("Numero %d invalido",testNum);
        }
    }
    
}
