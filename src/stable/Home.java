package stable;

import sprite.Missile;
import sprite.Sprite;

/**
 * то что нужно защищать
 */
public class Home extends Stable {
	
	public Home() {
		super();
	}

	protected void dealWithCollision(Sprite s) {
		if (s instanceof Missile) {
			health--;
			imageFile = "nohome.gif";//фото убитого дома
			setImage(imageFile);
		}
	}

	@Override
	protected void setImageFile() {
		imageFile = "home.gif";
	}//фото живого дома
}
