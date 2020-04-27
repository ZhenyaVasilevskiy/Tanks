package stable;

import sprite.Sprite;

/**
 * Трава. В ней можно спрятаться
 */
public class Grass extends Stable {
	
	public Grass() {
		super();
	}

	@Override
	protected void setImageFile() {
		imageFile = "grass.gif";
	}

	@Override
	protected void dealWithCollision(Sprite s) {
	}
}
