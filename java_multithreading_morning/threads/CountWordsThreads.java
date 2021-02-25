package threads;
import java.io.*;

	public class CountWordsThreads extends Thread{
		CountWordsThreads(){
			
		}
		public void run() {
			try {
				 String line;  
			        int count = 0;  
			          
			        FileReader file = new FileReader("C:\\Users\\nooka\\OneDrive\\Desktop\\random.txt");  
			        BufferedReader br = new BufferedReader(file);  
			        while((line = br.readLine()) != null) {  
			            String words[] = line.split(" ");  
			            count = count + words.length;  
			        }  
			          
			        System.out.println("(Through Thread)Number of words present in given file: " + count);  
			        br.close(); 
			    } catch (FileNotFoundException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    } catch (IOException e) {
					e.printStackTrace();
				}
			
		}
		
		

	}
