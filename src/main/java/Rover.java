import java.util.ArrayList;

public class Rover {
    ArrayList rowerPosition = new ArrayList();
    private String currentPosition;
    private int xAxis, yAxis;
    char direction;
//    private RoverPosition roverPosition;

    public Rover (String currentPosition){
        this.xAxis = currentPosition.charAt(0);
        this.yAxis = currentPosition.charAt(2);
        this.direction = currentPosition.charAt(4);
        this.currentPosition = currentPosition;
        setPosition(currentPosition);
    }

    private void setPosition(String currentPosition) {
        for(String retval: currentPosition.split(" ")){
            rowerPosition.add(retval);
        }
    }




    public char facingDirection() {
        return this.direction;
    }


//    private class RoverPosition {
//
//
//        public RoverPosition(int xAxis, int yAxis, char direction) {
//
//            rowerPosition.add(xAxis);
//            rowerPosition.add(yAxis);
//            rowerPosition.add(direction);
//        }

//        public static ArrayList getPosition() {
//            return rowerPosition;
//        }

        public char rotate(char command){
            if( 'N' == this.direction) {
                if(command=='L') {
                    setDirection('E');
                } else
                if(command == 'R'){
                    setDirection('W');
                } else {

                }
            } else
            if('S'== (char) this.direction){
                if(command =='R'){
                    setDirection('E');
                } else
                if(command=='L'){
                    setDirection('W');
                }

            }
            else
            if('W' == (char) this.direction){
                if(command =='L'){
                    setDirection('N');
                } else
                if(command =='R'){
                    setDirection('S');
                }
            }
            else
            if ('E' == (char) this.direction) {
                if(command == 'L'){
                    setDirection('S');
                } else
                if(command == 'R')
                    setDirection('N');
            }
            return (char) this.direction;
        }

        private void setDirection(char direction) {
            this.direction = direction;
        }

//
//        private void setDirection(char e) {
//            rowerPosition.remove(2);
//            rowerPosition.add(e);
//        }
//

//
//        public static char getDirection() {
//            return (char) this.direction;
//        }
//    }

//    public Rover(int xAxis, int yAxis, char direction){
//       RoverPosition roverPosition = new RoverPosition(xAxis, yAxis, direction);
//        this.roverPosition = roverPosition;
//    }
//
//
//    public char facingDirection() {
//        return RoverPosition.getDirection();
//    }
//
//    public void spin(char command) {
//        RoverPosition.getDirection(command);
//    }
//
//    public String position() {
//        return String.valueOf(RoverPosition.getPosition());
//    }
}
