/**
 * 
 */
package computerARch;

import computerARch.components.ControlPanel;

//import computerARch.viewComponents.ControlPanel;
//import computerARch.viewComponents.RegistersTable;

/**
 * @author martip23
 * This class is the controller (control unit) of the single cycle processor. 
 * It is the first thing to boot up. It starts by pulling a text field into 
 * instruction memory. It then initializes the program counter to 0. 
 * It then reads the first instruction and executes it using a 4 step
 * program. The 4 steps are fetch, decode, execute and store. The control unit
 * passes most of these tasks to other units and only takes care of decoding 
 * directly.
 */
public class Controller {
	
	ControlPanel cp = new ControlPanel(this);// Reference to ControlPanel window
	RegistersTable rt = new RegistersTable();//Reference to RegistersTable
	
	int delay = 0;		// This sets the delay of execution between code steps.
	int PC; 			// This creates a program counter for use by the control unit
	String currentIns; 	// Holds instruction being worked on NOW
	
	Memory memory; 			// Initializing the memory unit
	Registers registers; 	// Initializing the register units
	ALU alu; 				// Initializing the ALU
	
	Controller() {
		PC = 0;
		System.out.println("Controller created");
	}
	
	/**
	 * Reads a file and loads all instructions into instruction memory.
	 * @param filename the name of the file
	 */
	void loadCode(String filename) {
		// Program Stub
	}
	
	/**
	 * Starts the processor.
	 */
	void run() {
		while(true) {
			fetch();
			decode();
			execute();
			store();
		}
	}
	
	/**
	 * Gets the next instruction from instruction memory and 
	 * loads into currentIns.
	 */
	void fetch() {
		
	}
	
	/**
	 * Decodes an instruction and sends instruction and sends the required data
	 * to the correct location.
	 */
	void decode() {
		
	}
	
	/**
	 * Passes the required calculation to the ALU.
	 */
	void execute() {
		
	}
	
	/**
	 * Stores the result into a register.
	 */
	void store () {
		
	}
	
	/**
	 * Notify the GUI that the state of one of the models has changed.
	 * @param msg String declaring the type of change.
	 */
	void notifyChanged(String msg) {
		
	}
	
	/**
	 * Operations on Button Presses
	 * @param option - Button that was clicked
	 */
	public void operation(String option) {
		if (option.equals("Start Execution")) {
			System.out.println("Starting Exectuion");			
		} else if (option.equals("Resume")) {
			System.out.println("Resuming Exectuion");	
		} else if (option.equals("Pause")) {
			System.out.println("Pausing Exectuion");	
		} else if (option.equals("Step")) {
			System.out.println("Stepping through Exectuion");	
		} else if (option.equals("View Registers")) {
			rt.setVisible(true);
		} else if (option.equals("View Data Memory")) {
			System.out.println("Viewing Data Memory");	
		} else if (option.equals("View Instruction Memory")) {
			System.out.println("Viewing Instruction Memory");	
		} 
	}
}
