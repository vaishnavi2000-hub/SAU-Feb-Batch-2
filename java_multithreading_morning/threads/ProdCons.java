package threads;

import java.util.LinkedList;

public class ProdCons {
		  
      
        LinkedList<Integer> l = new LinkedList<>(); 
        int capacity = 4; 
        
        public void produce() throws InterruptedException 
        { 
            int items = 4; 
            while (true) { 
                synchronized (this) 
                {  
                    while (l.size() == capacity) 
                        wait(); 
  
                    System.out.println("Producer produced-"
                                       + items); 
  
                    
                    l.add(items++); 
   
                    notify(); 
  
                    Thread.sleep(1000); 
                } 
            } 
        } 
  
        public void consume() throws InterruptedException 
        { 
            while (true) { 
                synchronized (this) 
                { 
                    while (l.size() == 0) 
                        wait(); 
  
                 
                    int val = l.removeFirst(); 
  
                    System.out.println("Consumer consumed-"
                                       + val); 
  
                    
                    notify(); 
  
                  
                    Thread.sleep(1000); 
                } 
            } 
        }

    
} 


