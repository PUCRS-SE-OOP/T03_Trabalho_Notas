public class app{ 
    public static void main(String args[]){ 
        Notas n = new Notas(); 
         
        n.infoNota(10); 
        n.infoNota(6); 
        n.infoNota(4); 
        n.infoNota(8); 
        n.infoNota(9); 
        n.calculaNotaFinal(); 
        System.out.println("Notas consideradas: "); 
        for(int i=0;i<n.getQtdade();i++){ 
            System.out.println(n.getNota(i)); 
        } 
        System.out.println("Nota final: "+n.getNotaFinal()); 
        System.out.println("----------------------"); 
        n.infoNota(7); 
        n.infoNota(3); 
        n.calculaNotaFinal(); 
        System.out.println("Notas consideradas: "); 
        for(int i=0;i<n.getQtdade();i++){ 
            System.out.println(n.getNota(i)); 
        } 
        System.out.println("Nota final: "+n.getNotaFinal()); 
    } 
} 