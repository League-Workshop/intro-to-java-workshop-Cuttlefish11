void setup (){
size (400,600);

}
void draw (){
  if (mousePressed){

    background (#49B21D);
  }
 
 fill (#000BBF);
  ellipse  (125,125,50,50);
  ellipse  (80,125,50,50);
   fill (#2F6767);
  rect (55,55,101,48); 
  fill(#1188ED);
  rect (55,55,55,30);  
  ellipse (mouseX,mouseY,21,51);
}
