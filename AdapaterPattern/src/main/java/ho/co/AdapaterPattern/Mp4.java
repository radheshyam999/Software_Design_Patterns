package ho.co.AdapaterPattern;

public class Mp4 implements AdvancedPlayer {

	@Override
	public void playVlc(String audio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String audio) {
		System.out.println("Mp4 player is playing"+audio);
		
	}

}
