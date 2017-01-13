public class Rover {
    private int xAxis, yAxis;
    char direction;

    public Rover(String currentPosition) {
        this.xAxis = currentPosition.charAt(0);
        this.yAxis = currentPosition.charAt(2);
        this.direction = currentPosition.charAt(4);
    }


    public char facingDirection() {
        return this.direction;
    }

    public char rotate(char command) {
        if ('N' == this.direction) {
            if (command == 'L') {
                setDirection('E');
            } else if (command == 'R') {
                setDirection('W');
            }
        } else if ('S' == this.direction) {
            if (command == 'R') {
                setDirection('E');
            } else if (command == 'L') {
                setDirection('W');
            }

        } else if ('W' == this.direction) {
            if (command == 'L') {
                setDirection('N');
            } else if (command == 'R') {
                setDirection('S');
            }
        } else if ('E' == this.direction) {
            if (command == 'L') {
                setDirection('S');
            } else if (command == 'R')
                setDirection('N');
        }
        return this.direction;
    }

    private void setDirection(char direction) {
        this.direction = direction;
    }

    private void move() {
        if (this.direction == 'N')
            this.yAxis++;
        if (this.direction == 'S')
            this.yAxis--;
        if (this.direction == 'W')
            this.xAxis++;
        if (this.direction == 'E')
            this.xAxis--;

    }


    public String move(String instructions) {
        String[] commands = instructions.split(" ");
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].charAt(0) == 'L' || commands[i].charAt(0) == 'R') {
                System.out.println("inside the direction=="+commands[i].charAt(0)+"____"+instructions);
                rotate(commands[i].charAt(i));
            } else
                if(commands[i].charAt(i)=='M'){
                move();
            }

        }
        return (char) this.xAxis + " " + (char) this.yAxis + " " + this.direction;
    }
}
