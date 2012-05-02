package org.sevenhill.spongemail;

import org.junit.Test;

import com.dumbster.smtp.SimpleSmtpServer;

public class MailServerTest {

	@Test
	public void hello() throws Exception {
		SimpleSmtpServer server = SimpleSmtpServer.start(4000);
		Thread.sleep(5000);
		server.stop();
	}
}
