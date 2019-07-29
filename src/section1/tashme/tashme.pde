PImage mustache;
PImage LennyFace;
void setup() {
 mustache = loadImage("moostache.png"); 

  LennyFace = loadImage("LennyFace.jpg");
size(800,600);
LennyFace.resize(800,600);

}
void draw() {
  background(LennyFace);
  image(mustache,mouseX,mouseY);
  if (mousePressed) {
 image(mustache, mouseX,mouseY);

  }
  
  }
