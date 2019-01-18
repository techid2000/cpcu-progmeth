
public class Robot {
	int hp,x,y;

	public Robot(int hp, int x, int y) {
		setHp(hp);
		setX(x);
		setY(y);
	}
	
	public int getHp() {
		return this.hp;
	}
	public void setHp(int a) {
		this.hp = Math.max(0,Math.min(100, a));
	}
	public int getX() {
		return this.x;
	}
	public void setX(int a) {
		this.x = a;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int a) {
		this.y = a;
	}
}
