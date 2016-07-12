interface Iplayer{
	void attack();
	void run();
	void jump();
	void powerIncrement();
	int DEFAULTPOWER=20;
}
class WhitePlayer implements Iplayer{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("white player attack");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerIncrement() {
		// TODO Auto-generated method stub
		int power=10;
		if(power<DEFAULTPOWER){
			power=DEFAULTPOWER+20;
		}
		System.out.println("power is"+power);
	}
	void print(){
		System.out.println("white player print method");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhitePlayer player=new WhitePlayer();
		player.attack();
		player.powerIncrement();
		player.print();

	}

}
