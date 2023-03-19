import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
	
public class Main {

	public Main() {
	}

	 public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(AllTests.class);
		 System.out.println("Nº de casos ejecutados "+result.getRunCount());
		     if(result.wasSuccessful()){ 
		     System.out.println("TODO OK");
		        }
		     System.out.println("Fallos: "+result.getFailures().toString());
		    }
	}
