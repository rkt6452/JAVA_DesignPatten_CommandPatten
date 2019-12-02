package Button;

public class main {

	public static void main(String[] args) {
		Button button = new Button();
		CarEngineCommand carCMD = new CarEngineCommand();
		Car car = new Car();
		carCMD.setTheCar(car);
		
		RobotFireGunCommand robotCMD = new RobotFireGunCommand();
		Robot robot = new Robot();
		robotCMD.setRobot(robot);
		
		LampPowerCommand lampCMD = new LampPowerCommand();
		Lamp lamp = new Lamp();
		lampCMD.setlamp(lamp);
		
		button.setTheCommand(lampCMD);//lampCMD, robotCMD, carCMD
		
		button.pressed();
		button.pressed();
		button.pressed();
		/*
		 * Car car = new Car(); button.setCar(car);
		 * 
		 * button.pressed(); button.pressed(); button.pressed(); button.pressed();
		 * button.pressed();
		 */
		/*
		 * Robot robot = new Robot(); button.setFire(robot); button.pressed1();
		 * button.pressed1(); button.pressed1();
		 */
		

	}

}
