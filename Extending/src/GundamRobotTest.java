import static org.junit.Assert.*;

import org.junit.Test;

public class GundamRobotTest {

	@Test
	public void testGundamRobot() {
		GundamRobot g = new GundamRobot(100, 90, 33, 33);
		assertEquals(100, g.bullets);
		assertEquals(90, g.hp);
		assertEquals(33, g.x);
		assertEquals(33, g.y);

		g = new GundamRobot(-100, -90, 33, 33);
		assertEquals(0, g.bullets);
		assertEquals(0, g.hp);

		g = new GundamRobot(100, 990, 33, 33);
		assertEquals(100, g.hp);

	}

	@Test
	public void testGetBullets() {
		GundamRobot g = new GundamRobot(100, 990, 33, 33);
		assertEquals(100, g.getBullets());

		g = new GundamRobot(-100, 990, 33, 33);
		assertEquals(0, g.getBullets());

	}

	@Test
	public void testSetBullets() {
		GundamRobot g = new GundamRobot(100, 990, 33, 33);
		g.setBullets(444);
		assertEquals(444, g.bullets);
		g.setBullets(-444);
		assertEquals(0, g.bullets);

	}

}
