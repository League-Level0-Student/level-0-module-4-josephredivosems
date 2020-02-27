PImage face;


void setup() {
   face = loadImage("mocking-spongebob-meme1---mocking-spongebob-meme.png");
  size(800,600);
  face.resize(width,height);
  
}

void draw() {
  background(face);
  int xEye = mouseX;
  int yEye = mouseY;
  
  fill(#FFFFFF);
  ellipse(375,260,150,100);
  ellipse(100,260,150,100);
  fill(#030303);
  if(xEye > 375 && xEye < 260){
    xEye = 375;
  }
  else if(xEye < 375 && xEye > 260){
   xEye = 260; 
  else{
  ellipse(xEye,yEye,60,40);
  ellipse(xEye+275,yEye, 60, 40);
  
  }












  }}
