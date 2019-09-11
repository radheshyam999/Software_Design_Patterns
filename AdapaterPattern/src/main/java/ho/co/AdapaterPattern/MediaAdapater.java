package ho.co.AdapaterPattern;

public class MediaAdapater implements MediaPlayer {
	AdvancedPlayer Ap;
	
	public MediaAdapater(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			Ap = new Vlc();
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			Ap = new Mp4();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
	     if(audioType.equalsIgnoreCase("vlc")) {
	    	 Ap.playVlc(audioType);
	     }
	     else if(audioType.equalsIgnoreCase("Mp4")) {
	    	 Ap.playMp4(audioType);
	     }
	}
	
	
	

}
