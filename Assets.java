package citySaver.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	
private static final int  width = 64 , height = 64 ;

	
	public static BufferedImage playerLeft , playerRight,playerDown,playerUp , grass , water , ice , brickWall , steelWall , Base , Blank   ;
	
	
	
public static void init() {
		
playerUp = ImageLoader.loadImage("/Creature/tankU.gif");
		
playerDown = ImageLoader.loadImage("/Creature/tankD.gif");
		
playerLeft = ImageLoader.loadImage("/Creature/tankL.gif");
		
playerRight = ImageLoader.loadImage("/Creature/tankR.gif");
		
grass =ImageLoader.loadImage("/Textures/tree.gif");
		
water = ImageLoader.loadImage("/Textures/river.jpg");
		
brickWall = ImageLoader.loadImage("/Textures/commonWall.gif");
		
steelWall = ImageLoader.loadImage("/Textures/metalWall.jpg");
		
Base = ImageLoader.loadImage("/Base(Eagle)/home.jpg");
		
Blank = ImageLoader.loadImage("/Textures/BackGround.png");
		





	}
	 
}  

