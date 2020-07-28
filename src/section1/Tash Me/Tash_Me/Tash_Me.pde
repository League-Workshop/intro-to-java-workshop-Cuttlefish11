PImage mustache;
PImage face;
void setup() {
mustache = loadImage("tash.png");
  face = loadImage("face.jpg");
size(800,600);
face.resize(width,height);
}

void draw() {
  background(face); 
image(mustache,mouseX,mouseY);
}
