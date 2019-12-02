package de.ibm.issw.requestmetrics;

import javax.swing.SwingUtilities;

import de.ibm.issw.requestmetrics.engine.RmProcessor;
import de.ibm.issw.requestmetrics.gui.RequestMetricsGui;

public class Starter {

	public static void main(String[] args) {
		boolean parametererror = false;
		final RmProcessor processor = new RmProcessor();
		
		if (args.length > 0) {
			for (String param : args) {
				if (param.startsWith("-TIMEBORDER=")) {
					try {
						processor.setElapsedTimeBorder(new Long(param.substring(12)));
					} catch (Exception e) {
						parametererror = true;
						break;
					}
					throw new IllegalArgumentException("-TIMEBORDER not implemented");
				}
			}
		}
		
		if(!parametererror) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					RequestMetricsGui gui = new RequestMetricsGui();
					gui.createAndShowGUI(processor);
				}
			});
		} else {
			System.err.println("");
			System.err.println("ERROR: Parameters must be entered in the following format -<parameter>=<value>!");
			System.err.println("");
			System.err.println("The following parameters are supported/needed:");
			System.err.println("|-----------------------------------------------------------------------------------------|");
			System.err.println("| Parameter  | Mandatory | Default | Description                                          |");
			System.err.println("|------------|-----------|---------|------------------------------------------------------|");
			System.err.println("| TIMEBORDER | No        | null	   | time in milliseconds for the requests that should be |");
			System.err.println("|            |           |         | analyzed (null = all requests are analyzed)          |");
			System.err.println("|-----------------------------------------------------------------------------------------|");
			System.exit(1);
		}
	}
}