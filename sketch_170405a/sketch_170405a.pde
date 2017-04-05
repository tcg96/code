PImage img;

void setup() {
  size(1280, 720);
  background(255);
  imageMode(CENTER);
  img = loadImage("bitch.png");
}

void draw() {
  image(img, mouseX, mouseY+55);
}