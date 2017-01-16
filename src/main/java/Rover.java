public class Rover {
    private int xAxis;
    private int yAxis;
    private String direction;

    public Rover(String currentPosition) {
        String positions[] = currentPosition.split(" ");
        this.xAxis = Integer.parseInt(positions[0]);
        this.yAxis = Integer.parseInt(positions[1]);
        this.direction = positions[2];
    }


    public String facingDirection() {
        return this.direction;
    }

    public String rotate(String command) {
        if (this.direction.equals("N")) {
            if (command.equals("L")) {
                setDirection("E");
            }
            if (command.equals("R")) {
                setDirection("W");

            }
        } else if (this.direction.equals("S")) {
            getCommand(command, "R", "E", "L", "W");

        } else if (this.direction.equals("W")) {
            getCommand(command, "L", "N", "R", "S");
        } else if (this.direction.equals("E")) {
            getCommand(command, "L", "S", "R", "N");
        }
        return this.direction;
    }

    private void getCommand(String command, String l, String n, String r, String s) {
        if (command.equals(l)) {
            setDirection(n);
        } else if (command.equals(r)) {
            setDirection(s);
        }
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private void move() {
        if (this.direction.equals("N"))
            this.yAxis++;
        if (this.direction.equals("S"))
            this.yAxis--;
        if (this.direction.equals("W"))
            this.xAxis++;
        if (this.direction.equals("E"))
            this.xAxis--;

    }


    public String move(String instructions) { //"LML"
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == 'L' || instructions.charAt(i) == 'R') {
                rotate("" + instructions.charAt(i));
            }
            if (instructions.charAt(i) == 'M') {
                move();
            }

        }
        return this.xAxis + " " + this.yAxis + " " + this.direction;
    }
}
