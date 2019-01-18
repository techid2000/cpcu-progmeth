import static org.junit.Assert.*;

import org.junit.Test;

public class TransformerRobotTest {

	@Test
	public void testTransformerRobot() {
		TransformerRobot a = new TransformerRobot(100, 90, 40, false);
		assertEquals(100, a.hp);
		assertEquals(90, a.x);
		assertEquals(40, a.y);
		assertEquals(false, a.isRobot);
		
		a = new TransformerRobot(-100, 90, 40, true);
		assertEquals(0, a.hp);
		assertEquals(90, a.x);
		assertEquals(40, a.y);
		assertEquals(true, a.isRobot);
	}

	@Test
	public void testIsRobot() {
		TransformerRobot a = new TransformerRobot(100, 90, 40, false);
		a.isRobot = true;
		assertEquals(true, a.isRobot());
		a.isRobot = false;
		assertEquals(false, a.isRobot());
		
	}

	@Test
	public void testSetRobot() {
		TransformerRobot a = new TransformerRobot(100, 90, 40, false);
		a.setRobot(true);
		assertEquals(true, a.isRobot);
		a.setRobot(false);
		assertEquals(false, a.isRobot);
	}

}
