interface Camera{
	void takePhoto();
}

interface MusicPlayer{
	void playMusic();
}

class SmartPhone implements Camera, MusicPlayer{
	@Override
	public void takePhoto() {
		System.out.println("Click! photo");
		}
	@Override
	public void playMusic() {
		System.out.println("Streaming your favorite playlist...");
	}
}
public class MultipleInterface {
	public static void main(String[] args ) {
		SmartPhone myPhone = new SmartPhone();
		myPhone.takePhoto();
		myPhone.playMusic();
	}
}
