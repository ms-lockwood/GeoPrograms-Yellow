public class B0_BasicLoop extends World {
    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime=2;

      fitness();
      gridOfSmallSquares();

    }
    public void rowOfSmallSquares(){
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        for(int x=0; x<100; x=x+1){
            plane.teleport(x*10,300);
            plane.square(10);
        }

    }
    public void columnOfSmallSquares(){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        for(int y=0; y<100; y=y+1){
            plane.teleport(300,y*10);
            plane.square(10);
        }
    }
    public void gridOfSmallSquares(){
        plane.trailWidth=5;
        for(int x=0;x<800;x=x+10){
            for(int y=0;y<500; y=y+10){
                System.out.println("x: "+ x + ", y: " + y);
                plane.setColor(y/2,216,230);
                plane.teleport(x,y);
                plane.square(10);

                //What is the biggest vaule of y?
                //What does 500 need to be divided by so that red is less than 255
            }
        }

    }
    public void fives() {
        for(int x=5;x<36;x=x+5){
            System.out.println(x);
        }
    }
    public void fitness(){
        for(int s=0;s<5;s=s+1){ //sprints
            System.out.println("sprint " + s);
            for(int p=0; p<10; p=p+1){ //pushups
                System.out.println("-pushup " + p);
            }
        }
    }

}
