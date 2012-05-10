package org.sevenhill.spongemail;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

public class MailServerTest {

	@Test
	public void hello() throws Exception {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("I am TimerTask, and I do nothing!");
				
			}
		}, new Date());
//		timer.scheduleAtFixedRate(new TimerTask() {
//
//			@Override
//			public void run() {
//				System.out.println("I am TimerTask, and I live!");
//
//			}
//		}, new Date(System.currentTimeMillis() + 2000), 1500);
		//
		// Thread.sleep(10000);
		// timer.cancel();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000);
			System.out.println("Cancelling the timer");
			timer.cancel();
		}
		// SimpleSmtpServer server = SimpleSmtpServer.start(4000);
		// Thread.sleep(5000);
		// server.stop();
	}
}
