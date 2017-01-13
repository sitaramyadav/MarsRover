
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {


    @Test
    public void facingDirectionShouldReturnTheDirectionWhichCurrentlyRowerIsFacing() throws Exception {
        Rover rower = new Rover("1 3 N");
        assertEquals('N',rower.facingDirection());

    }


    //    @Test
//    public void shouldReturnEastIfCurrentDirectionIsNorthAndCommandForSpinIsL() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('N',rower.facingDirection());
//        rower.spin('L');
//        assertEquals('E',rower.facingDirection());
//
//
//    }
//
//    @Test
//    public void shouldReturnWestIfCurrentDirectionIsNorthAndCommandForSpinIsR() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('N',rower.facingDirection());
//        rower.spin('R');
//        assertEquals('W',rower.facingDirection());
//
//    }
//
//    @Test
//    public void shouldReturnEastIfCurrentDirectionIsSouthAndCommandForSpinIsL() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('S',rower.facingDirection());
//        rower.spin('L');
//        assertEquals('W',rower.facingDirection());
//
//
//    }
//
//    @Test
//    public void shouldReturnWestIfCurrentDirectionIsSouthAndCommandForSpinIsR() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('S',rower.facingDirection());
//        rower.spin('R');
//        assertEquals('E',rower.facingDirection());
//
//    }
//
//    @Test
//    public void shouldReturnSouthIfCurrentDirectionIsWestAndCommandForSpinIsL() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('W',rower.facingDirection());
//        rower.spin('L');
//        assertEquals('N',rower.facingDirection());
//
//
//    }
//
//    @Test
//    public void shouldReturnSouthIfCurrentDirectionIsWestAndCommandForSpinIsR() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('W',rower.facingDirection());
//        rower.spin('R');
//        assertEquals('S',rower.facingDirection());
//
//    }
//
//    @Test
//    public void shouldReturnSouthIfCurrentDirectionIsEastAndCommandForSpinIsL() throws Exception {
//        Rover rower = new Rover("1 3 N");
//
//        assertEquals('E',rower.facingDirection());
//        rower.spin('L');
//        assertEquals('S',rower.facingDirection());
//
//
//    }
//
    @Test
    public void shouldReturnNorthIfCurrentDirectionIsEastAndCommandForSpinIsR() throws Exception {

        Rover rower = new Rover("1 3 N");

        assertEquals('E',rower.facingDirection());
        rower.rotate('R');
        assertEquals('N',rower.facingDirection());
//
//    }
//
//    @Test
//    public void shouldMoveOneGridInNorthIfDirectionIsNorthAndCommandIsM() throws Exception {
//        RoverPosition roverPosition = new RoverPosition(1,3,'N');
//        Rover rover = new Rover("1 3 N");
//        rover.move("M");
//
//        assertEquals("1 2 N", rover.position());
//
//    }
//
////    @Test
//    public void moveShouldMoveTheRowerAccordingToInstruction() throws Exception {
//
//        RoverPosition "1 3 N" = new RoverPosition(5, 5, 'N');
//        Rover rower = new Rover("1 3 N");
//        String expectedResult = "1 3 N";
//        assertEquals(expectedResult,rower.move("LMLMLMLMM"));
    }

}
