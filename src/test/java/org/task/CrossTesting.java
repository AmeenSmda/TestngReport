package org.task;

import org.base.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossTesting extends BaseClass {

	@Parameters({"browser"})
	@Test
	private void tc1(String browse) {
	
		if(browse.equals("chrome")) {
		chromeBrowserLaunch();
		urlLaunch("https://formy-project.herokuapp.com/form");
	}
	else if (browse.equals("ie")) {
		InternetExplorerLaunch();
	} else {
		FirefoxBrowserLaunch();

	}
		urlLaunch("http://www.greenstechnologys.com/");
	}
}
