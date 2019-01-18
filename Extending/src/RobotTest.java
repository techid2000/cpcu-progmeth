import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.*;

public class RobotTest {

	@Test
	public void testRobot() {
		Robot a = new Robot(100, 30, 40);
		assertEquals(100, a.hp);
		assertEquals(30, a.x);
		assertEquals(40, a.y);

		a = new Robot(-100, 30, 40);
		assertEquals(0, a.hp);

		a = new Robot(500, 30, 40);
		assertEquals(100, a.hp);
	}

	@Test
	public void testGetHp() {
		Robot a = new Robot(100, 30, 40);
		assertEquals(100, a.getHp());
		a = new Robot(-100, 30, 40);
		assertEquals(0, a.getHp());

		a = new Robot(500, 30, 40);
		assertEquals(100, a.getHp());
	}

	@Test
	public void testSetHp() {
		Robot a = new Robot(100, 30, 40);
		a.setHp(55);
		assertEquals(55, a.hp);

		a.setHp(-55);
		assertEquals(0, a.hp);

		a.setHp(155);
		assertEquals(100, a.hp);
	}

	@Test
	public void testGetX() {
		Robot a = new Robot(100, 30, 40);
		assertEquals(30, a.getX());
		a.x = 100;
		assertEquals(100, a.getX());
		a.x = -100;
		assertEquals(-100, a.getX());
	}

	@Test
	public void testSetX() {
		Robot a = new Robot(100, 30, 40);

		a.setX(-10);
		assertEquals(-10, a.x);
		a.setX(222);
		assertEquals(222, a.x);
	}

	@Test
	public void testGetY() {
		Robot a = new Robot(100, 30, 40);
		assertEquals(40, a.getY());
		a.y = 100;
		assertEquals(100, a.getY());
		a.y = -100;
		assertEquals(-100, a.getY());

	}

	@Test
	public void testSetY() {
		Robot a = new Robot(100, 30, 40);

		a.setY(-10);
		assertEquals(-10, a.y);
		a.setY(222);
		assertEquals(222, a.y);
	}

}
