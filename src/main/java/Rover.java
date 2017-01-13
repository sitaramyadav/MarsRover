import java.util.ArrayList;

public class Rover {
    ArrayList rowerPosition = new ArrayList();
    private String currentPosition;
    private int xAxis, yAxis;
    char direction;
    private RoverPosition roverPosition;

    public Rover (String currentPosition){
//        this.xAxis = currentPosition.charAt(0);
//        this.yAxis = currentPosition.charAt(1);
//        this.direction = currentPosition.charAt(2);
        this.currentPosition = currentPosition;
        setPosition(currentPosition);
    }

    private void setPosition(String currentPosition) {
        for(String retval: currentPosition.split(" ")){
            rowerPosition.add(retval);
        }
    }

    public char facingDirection() {
        return this.currentPosition.charAt(2);
    }

    public void rotate(char r) {

    }

    private class RoverPosition {


        public RoverPosition(int xAxis, int yAxis, char direction) {

            rowerPosition.add(xAxis);
            rowerPosition.add(yAxis);
            rowerPosition.add(direction);
        }

//        public static ArrayList getPosition() {
//            return rowerPosition;
//        }

//        public static char getDirection(char command){
//            if( 'N' == (char) rowerPosition.get(2)) {
//                if(command=='L') {
//                    setDirection('E');
//                } else
//                if(command == 'R'){
//                    setDirection('W');
//                } else {
//
//                }
//            } else
//            if('S'== (char) rowerPosition.get(2) ){
//                if(command =='R'){
//                    setDirection('E');
//                } else
//                if(command=='L'){
//                    setDirection('W');
//                }
//
//            }
//            else
//            if('W' == (char) rowerPosition.get(2)){
//                if(command =='L'){
//                    setDirection('N');
//                } else
//                if(command =='R'){
//                    setDirection('S');
//                }
//            }
//            else
//            if ('E' == (char) rowerPosition.get(2)) {
//                if(command == 'L'){
//                    setDirection('S');
//                } else
//                if(command == 'R')
//                    setDirection('N');
//            }
//            return (char) rowerPosition.get(2);
//        }
//
//        private void setDirection(char e) {
//            rowerPosition.remove(2);
//            rowerPosition.add(e);
//        }
//
//        @Override
//        public String toString() {
//            return "RoverPosition{" +
//                    "rowerPosition=" + rowerPosition +
//                    '}';
//        }
//
//        public static char getDirection() {
//            return (char) rowerPosition.get(2);
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
    }
}
