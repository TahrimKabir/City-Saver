package citySaver.gfx;

import citySaver.Game;
import citySaver.Handler;
import citySaver.entities.Entity;
import citySaver.tiles.Tile;

public class GameCamera {
	private Handler handler;
	private float xOffset, yOffset;
	public GameCamera(Handler handler,float xOffset,float yOffset) {
		this.handler = handler;
		this.xOffset = xOffset;
		this.yOffset = yOffset;
	}
	
	public void XoffSet() {
		float temp = handler.getWorld().getWidth()*Tile.TILEWIDTH - handler.getWidth();
		xyOffset(xOffset, temp);
		
//		if(xOffset>handler.getWorld().getWidth()*Tile.TILEWIDTH - handler.getWidth()) {
//			xOffset = handler.getWorld().getWidth()*Tile.TILEWIDTH - handler.getWidth();
//		}
	}
	
	public void Yoffset() {
		float tempr = handler.getWorld().getHeight()*Tile.TILEHEIGHT - handler.getHeight();
		xyOffset(yOffset, tempr);
		// if(yOffset>handler.getWorld().getHeight()*Tile.TILEHEIGHT - handler.getHeight()) {
		//	yOffset = handler.getWorld().getHeight()*Tile.TILEHEIGHT - handler.getHeight();
		//}
	}
	
	public void xyOffset(float Offset, float value) {
		if(Offset<0) {
			Offset=0;
		} else if (Offset > value) {
			Offset = value;
		}
		
	}
	
	public void CheckBlankSpace() {
		XoffSet();
		YoffSet();
		
	}
	
	public void move(float xAmt, float yAmt) {
		xOffset = xAmt;
		yOffset = yAmt;
		CheckBlankSpace();
	}
	
	public void centerOnEntity(Entity e) {
		
		xOffset = e.getX() - handler.getWidth()/2 + e.getWidth()/2;
		yOffset = e.getY() - handler.getHeight()/2 + e.getHeight()/2;
		CheckBlankSpace();
				
	}
	
	
	public float getxOffset() {
		return xOffset;
	}
	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}
	public float getyOffset() {
		return yOffset;
	}
	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
	
	

}
