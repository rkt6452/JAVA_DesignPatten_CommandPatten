package Button;

public class Button {
	private Command theCommand;
	/*
	 * private Car theCar; private Robot robot; public void setCar(Car theCar) {
	 * this.theCar = theCar; }
	 * 
	 * public void setFire(Robot robot) { this.robot = robot; }
	 * 
	 * public void pressed() { theCar.engine(); } public void pressed1() {
	 * robot.fireGun(); }
	 */
	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}	
	public void pressed() {
		theCommand.excute();
	}//�� �ڵ�� ���� �� �̻� ������ �ʴ´�.FrameWork ��ĥ �ʿ䰡 ����.
}
