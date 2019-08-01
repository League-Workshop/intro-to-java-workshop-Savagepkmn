int foodX = 100;
int foodY = 20;
void setup() {
  size(800,800);
}
void draw() {
background(141,233,237);

fill(255, 0 , 0);
noStroke();
ellipse(foodX, foodY, 100,50);
foodY++;
if(foodY >= height-25) {
foodY = 20;
}
}
