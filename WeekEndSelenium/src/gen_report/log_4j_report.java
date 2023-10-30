package gen_report;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

public class log_4j_report {
	@Test
	public void run() throws IOException {
		
		
		PatternLayout loyout = new PatternLayout("%d %c %m %n");
		
		FileAppender app = new FileAppender(loyout, "./reports/log.html");
		//configure the log4j
		BasicConfigurator.configure(app);
		//get the object of log4j
		Logger log = Logger.getLogger(this.getClass().getName());
		
		log.warn("warning");
		log.info("information");
		log.error("error");
		
		
	}
}
