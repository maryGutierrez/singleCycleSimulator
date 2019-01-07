package computerARch;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller processor = new Controller();	// Initialize our processor.
		
		System.out.println("Starting sincySimulator (beta)... ");
		System.out.println("Pre-Read... ");
		processor.loadCode("null");
		System.out.println("Running sincySimulator... ");
		processor.run();
		System.out.println("Finished running");
	}

}
