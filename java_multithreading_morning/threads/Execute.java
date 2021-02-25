package threads;

public class Execute {
		public static void main(String[] args) throws Exception {
		    countWords w=new countWords();
		    long st1=System.nanoTime();
		    w.wcmethod();
		    long end1=System.nanoTime();
		    System.out.println(end1-st1);
		   CountWordsThreads wt=new CountWordsThreads();
		   long st2=System.nanoTime();
			wt.start();
			long end2=System.nanoTime();
			 System.out.println(end2-st2);
		}
	}
