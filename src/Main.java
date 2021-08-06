
public class Main implements Runnable {
	GUI gui  = new GUI();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new Main()).start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			gui.repaint();
			if(gui.resetter==false) {
				gui.checkVictoryStatus();
				//System.out.println("Victory: "+gui.victory+", Defeat: "+gui.defeat);
			}
		}
	}
}
