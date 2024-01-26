package FlyweightDP;

public class Client {
	public static void main(String[] args) {
		GenericBullet genericBullet = new GenericBullet(2, 100, 20, "Oval");
		SpecialBullet specialBullet = new SpecialBullet("Brown", "Special Bullet", genericBullet);
		specialBullet.printDetails();
		
	}
}
