
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoverTest {


    @Test
    public void facingDirectionShouldReturnTheDirectionWhichCurrentlyRowerIsFacing() throws Exception {
        Rover rower = new Rover("1 3 N");
        assertEquals("N", rower.facingDirection());

    }

    @Test
    public void shouldReturnEastIfCurrentDirectionIsNorthAndCommandForSpinIsL() throws Exception {
        Rover rower = new Rover("1 3 N");

        assertEquals("N", rower.facingDirection());
        rower.rotate("L");
        assertEquals("W", rower.facingDirection());


    }

    @Test
    public void shouldReturnEasttIfCurrentDirectionIsNorthAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 N");

        assertEquals("N", rower.facingDirection());
        rower.rotate("R");
        assertEquals("E", rower.facingDirection());

    }

    @Test
    public void shouldReturnEasttIfCurrentDirectionIsSouthAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 S");

        assertEquals("S", rower.facingDirection());
        rower.rotate("L");
        assertEquals("E",(rower.facingDirection()));


    }

    @Test
    public void shouldReturnWestIfCurrentDirectionIsSouthAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 S");

        assertEquals("S", rower.facingDirection());
        rower.rotate("R");
        assertEquals("W", rower.facingDirection());

    }

    @Test
    public void shouldReturnSouthIfCurrentDirectionIsWestAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 W");

        assertEquals("W", rower.facingDirection());
        rower.rotate("L");
        assertEquals("S", rower.facingDirection());


    }

    @Test
    public void shouldReturnNorthIfCurrentDirectionIsWestAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 W");

        assertEquals("W", rower.facingDirection());
        rower.rotate("R");
        assertEquals("N", rower.facingDirection());

    }

    @Test
    public void shouldReturnEastIfCurrentDirectionIsEastAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 E");

        assertEquals("E", rower.facingDirection());
        rower.rotate("L");
        assertEquals("N", rower.facingDirection());


    }

    @Test
    public void shouldReturnSouthIfCurrentDirectionIsEastAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 E");

        assertEquals("E", rower.facingDirection());
        rower.rotate("R");
        assertEquals("S", rower.facingDirection());

    }

    @Test
    public void shouldMoveOneGridInNorthIfDirectionIsNorthAndCommandIsM() throws Exception {
        Rover rover = new Rover("1 2 N");
        assertEquals("1 3 N", rover.move("M"));

    }

    @Test
    public void moveShouldShouldMoveOnOneTwoEIfInstructionIsLM() throws Exception {

        Rover rower = new Rover("1 2 N");
        String expectedResult = "0 2 W";
        String actualResult = rower.move("LM");

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void itShouldMoveOnTheOneGridOnCurrentDirectionIfDirectionChangedItShouldBeUpdatedAsCurrentDirectionAndThenMove()
            throws Exception {
        Rover rower = new Rover("1 2 N");
        String expectedResult = "1 3 N";
        String actualResult = rower.move("LMLMLMLMM");
        assertEquals(expectedResult, actualResult);
    }

}
