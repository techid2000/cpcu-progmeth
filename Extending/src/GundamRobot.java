
public class GundamRobot extends Robot {
	int bullets;

	public GundamRobot(int bullets, int hp, int x, int y) {
		super(hp,x,y);
		setBullets(bullets);
	}

	public int getBullets() {
		return bullets;
	}

	public void setBullets(int bullets) {
		this.bullets = Math.max(0, bullets);
	}
}
