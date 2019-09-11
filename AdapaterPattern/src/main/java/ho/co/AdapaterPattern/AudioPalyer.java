package ho.co.AdapaterPattern;

public class AudioPalyer implements MediaPlayer {
	MediaAdapater Ma;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			Ma = new MediaAdapater(fileName, fileName);
		}
		else if(audioType.equalsIgnoreCase("mp4")) {
			Ma = new MediaAdapater(fileName, fileName);
		}
		else {
			System.out.println("invalid Type");
		}
		
	}

}
