package threads;
import java.io.*;


	public class countWords{
		
		public void wcmethod() throws IOException {
		try {
			
			 String line;  
		        int count = 0;  
		          
		        
		        FileReader file = new FileReader("C:\\Users\\nooka\\OneDrive\\Desktop\\random.txt");  
		        BufferedReader br = new BufferedReader(file);  
		              
		        while((line = br.readLine()) != null) {  
		            String words[] = line.split(" ");  
		            count = count + words.length;  
		        }  
		          
		        System.out.println("Number of words present in given file: " + count);  
		        br.close(); 
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	
		}
		
}
