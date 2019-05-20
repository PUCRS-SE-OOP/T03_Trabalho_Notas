import java.util.Arrays;

public class Notas{
    private final int notaMaxima = 10;
    private final int notaMinima = 0;
    private final int size = 7;
    private int insertNota = 0;
    private int notas[];

        //Construtor
    public Notas(){
    notas = new int[size];
    Arrays.fill(notas, -1);
    }

    
    //Métodos public

        //Informa uma nova nota
    public boolean infoNota(int i){
        if(i >= notaMinima && i <= notaMaxima){
            notas[insertNota] = i;
            insertNota++;
            return true;
        }
        return false;
    }

        //reorna quantidade de notas já foram inseridas
    public int getQtdade(){
        int i = insertNota;
    return i;
    }

        //retorna a nota de i posição
    public int getNota(int i){
        int j = notas[i];
    return j;
    }

        //Faz o calculo de nota final
    public boolean calculaNotaFinal(){
        if(insertNota > 2){
            int pos = findSmaller();
            notaRemove(pos);
            notas[insertNota + 1] = notasFinal();
            return true;
        }   
        return false; 
    }

        //Retorna a nota final
    public int getNotaFinal(){
    return notas[insertNota + 1];
    }


    //Métodos private ----------------------------------------------------------------------------------
        
        //Achar a posição do menor número na lista
        private int findSmaller(){
            int pos = 0;
                for(int i = 0, a = notaMaxima; i < insertNota; i++)
                if(a > notas[i]){
                    a = notas[i];
                    pos = i;
                }
                return pos;
            }
        
            //Remove o número de pos e reorganiza o Array
        private void notaRemove(int pos){
            if(pos != insertNota-1)
            for(; pos < insertNota-1; pos++)
                notas[pos] = notas[pos+1];  
    
            notas[pos] = -1;
            insertNota--;
        }

            //soma as notas do Array
        private int notasFinal(){
            int notaFinal = 0;
            
            for(int i = 0; i < insertNota; i++)
                notaFinal += notas[i];
        
        return notaFinal;
        }

    //Métodos private
}