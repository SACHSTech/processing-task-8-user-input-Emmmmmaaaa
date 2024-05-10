import processing.core.PApplet;

public class Sketch extends PApplet {
	
  float fltSqrX = width/2;
  float fltSqrY = width/2; 
  float fltSqrSpeed = 5; 
  float fltSqrDirectionX = -1; 
  float fltSqrDirectionY = -1; 

  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  if (keyPressed) {
      if (keyCode == UP) {
        background(106, 112, 230);
      }
      else if (keyCode == DOWN) {
        background(36, 227, 157);
      }
      else if (keyCode == LEFT) {
        background(217, 227, 36);
      }
      else if (keyCode == RIGHT) {
        background (36, 227, 61);
      }
    }
    
  }
  public void mousePressed(){
    background (0); 
  }

  public void mouseDragged(){
    fill(255,0,0); 
    rect(mouseX, mouseY, 50, 50);
  }

  public void mouseWheel() {
    fill(0, 255, 0);
    ellipse(mouseX, mouseY, 50, 50);
  }
}