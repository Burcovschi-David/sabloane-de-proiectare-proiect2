package memento;
import java.util.*;

/**
* Clasa care retine lista memento-urilor salvate 
* @author Ordog Dorottya
*/


public class MemoryMemento {
	
	/**
	 * lista arborilor functionali salvati in memoryMemento
	 */
   private ArrayList<Memento> memento;
   
   /**
    * obiect de tip MemoryMemento (Singleton)
    */
   public static MemoryMemento m=new MemoryMemento();
   public static int pozitieCurenta=-1;
   
   private MemoryMemento()   {
       memento=new ArrayList<Memento>();
   }
   
   public Memento getMementoUndo() {
       pozitieCurenta--;
       return memento.get(pozitieCurenta);
   }
   
   public Memento getMementoRedo(){
       pozitieCurenta++;
       return memento.get(pozitieCurenta);
   }
   
   public int getSize() {
       return memento.size();
   }
   
   public void setMemento(Memento m) {        
       memento.add(m);
       pozitieCurenta=MemoryMemento.m.getSize()-1;//setam pozitia curenta pe ultimul arbore adaugat
       System.out.println("size:"+memento.size()+" poz curenta"+pozitieCurenta);
   }


}
