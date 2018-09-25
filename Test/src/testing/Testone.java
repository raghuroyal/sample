package testing;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Testone {
	@Test
	public void smokeSuit()
	{
		launch();
		login();
	}
	@Test
	public void closuresuit() {
		logout();
		close();
	}
	
	@Test
	public void composemail() {
		System.out.println("-----This is in compose mail-------");
		// launch();
		// login();
		compose();
		// logout();
		// close();

	}

	@Test
	public void replymail() {
		System.out.println("-----This is in reply mail-----");
		// launch();
		// login();
		reply();
		// logout();
		// close();

	}

	@Test
	public void forwardmail() {
		System.out.println("-------This is in forward mail--------");
		// launch();
		// login();
		farword();
		// logout();
		// close();
	}

	@Before
	public void launch() {
		System.out.println("launch");
	}

	@Before
	public void login() {
		System.out.println("login");
	}

@After
	public void logout() {
		System.out.println("logout");
	}
@After

	public void close() {
		System.out.println("close");
	}

	public void compose() {
		System.out.println("compose");
	}

	public void farword() {
		System.out.println("farword");
	}

	public void reply() {
		System.out.println("reply");
	}
}
