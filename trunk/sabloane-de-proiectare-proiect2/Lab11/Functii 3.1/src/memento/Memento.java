package memento;

import Arbori.*;

/**
* Aplicarea sablonului Memento pentru a retine arborele functional
* @author Ordog Dorottya
*/
public class Memento {
	
   private ArboreFunctional arbore;

   public Memento(ArboreFunctional arbore) {
       this.arbore=arbore;
   }
   public ArboreFunctional getMemento()  {
       return this.arbore;
   }
   public void setMemento(ArboreFunctional arbore)  {
       this.arbore=arbore;
   }
  
}
