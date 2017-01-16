
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
        assertEquals("E", rower.facingDirection());


    }

    @Test
    public void shouldReturnWestIfCurrentDirectionIsNorthAndCommandForSpinIsR() throws Exception {
        Rover rower = new Rover("1 3 N");

        assertEquals("N", rower.facingDirection());
        rower.rotate("R");
        assertEquals("W", rower.facingDirection());

    }

    @Test
    public void shouldReturnWestIfCurrentDirectionIsSouthAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 S");

        assertEquals("S", rower.facingDirection());
        rower.rotate("L");
        assertEquals("W",(rower.facingDirection()));


    }

    @Test
    public void shouldReturnEastIfCurrentDirectionIsSouthAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 S");

        assertEquals("S", rower.facingDirection());
        rower.rotate("R");
        assertEquals("E", rower.facingDirection());

    }

    @Test
    public void shouldReturnNorthIfCurrentDirectionIsWestAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 W");

        assertEquals("W", rower.facingDirection());
        rower.rotate("L");
        assertEquals("N", rower.facingDirection());


    }

    @Test
    public void shouldReturnSouthIfCurrentDirectionIsWestAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 W");

        assertEquals("W", rower.facingDirection());
        rower.rotate("R");
        assertEquals("S", rower.facingDirection());

    }

    @Test
    public void shouldReturnSouthIfCurrentDirectionIsEastAndCommandForRotateIsL() throws Exception {
        Rover rower = new Rover("1 3 E");

        assertEquals("E", rower.facingDirection());
        rower.rotate("L");
        assertEquals("S", rower.facingDirection());


    }

    @Test
    public void shouldReturnNorthIfCurrentDirectionIsEastAndCommandForRotateIsR() throws Exception {
        Rover rower = new Rover("1 3 E");

        assertEquals("E", rower.facingDirection());
        rower.rotate("R");
        assertEquals("N", rower.facingDirection());

    }

    @Test
    public void shouldMoveOneGridInNorthIfDirectionIsNorthAndCommandIsM() throws Exception {
        Rover rover = new Rover("1 2 N");
        assertEquals("1 3 N", rover.move("M"));

    }

    @Test
    public void moveShouldShouldMoveOnOneTwoEIfInstructionIsLM() throws Exception {

        Rover rower = new Rover("1 2 N");
        String expectedResult = "1 2 E";
        String actualResult = rower.move("L");

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
