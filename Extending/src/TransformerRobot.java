
public class TransformerRobot extends Robot {
	boolean isRobot;

	public TransformerRobot(int hp, int x, int y, boolean r) {
		super(hp,x,y);
		isRobot = r;
	}

	public boolean isRobot() {
		return isRobot;
	}

	public void setRobot(boolean isRobot) {
		this.isRobot = isRobot;
	}
}
