package FlyweightDP;


public class GenericBullet implements Bullet{
	//we have intrinsic properties that won't change( remain same for all type of bullets )
	int radius;
	int weight;
	int damage;
	String shape;
	
	public GenericBullet(int radius, int weight, int damage, String shape) {
		this.radius = radius;
		this.weight = weight;
		this.damage = damage;
		this.shape = shape;
	}
	
	@Override
	public String bulletType() {
		return "Generic Bullet";
	}

}
