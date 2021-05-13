package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{

    public void setup() {
	size(400,400);
	background(200,200,200);
    }
    
    public void draw() {
	int[] color = sunColorSec(second());
	fill(color[0],color[1],color[2]);
	ellipse(200,200,300,300);
	fill(0,0,0);
	ellipse(140, 140, 50, 50);
	ellipse(260, 140, 50, 50);
	arc(200, 220, 180, 160, 0, PI);
	
    }
    
    public int[] sunColorSec(float seconds) {
	int[] rgb = new int[3];
	float diffFrom30 = Math.abs(30-seconds);
	
	float ratio = diffFrom30/30;
	rgb[0] = (int)(255*ratio);
	rgb[1] = (int)(255*ratio);
	rgb[2] = 0;
	
	return rgb;
    }
}
