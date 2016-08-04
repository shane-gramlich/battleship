package co.gramlich.battleship;



import android.content.Context;
import android.media.MediaPlayer;

public class SoundFX {

	private MediaPlayer leftGun;
	private MediaPlayer rightGun;
	private MediaPlayer planeExplode;
	private MediaPlayer subExplode;
	private MediaPlayer dcBeep;
	private Context context;

	public SoundFX(Context c) {
		context = c;
		leftGun = MediaPlayer.create(c, R.raw.left_gun);
		rightGun = MediaPlayer.create(c, R.raw.right_gun);
		planeExplode = MediaPlayer.create(c, R.raw.plane_explode);
		subExplode = MediaPlayer.create(c, R.raw.sub_explode);
		dcBeep = MediaPlayer.create(c, R.raw.depth_charge);
	}

	public void leftGun() {
		if (Options.getSoundFX(context)) {
			leftGun.start();
		}
	}

	public void rightGun() {
		if (Options.getSoundFX(context)) {
			rightGun.start();
		}
	}


	public void planeExplode() {
		if (Options.getSoundFX(context)) {
			planeExplode.start();
		}
	}

	public void subExplode() {
		if (Options.getSoundFX(context)) {
			subExplode.start();
		}
	}

	public void dcBeep() {
		if (Options.getSoundFX(context)) {
			dcBeep.start();
		}
	}

}