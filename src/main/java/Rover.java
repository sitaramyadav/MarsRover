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
                setDirection("W");
            }
            if (command.equals("R")) {
                setDirection("E");

            }
        } else if (this.direction.equals("S")) {
            if(command.equals("L")){
                setDirection("E");
            } else if(command.equals("R")){
                setDirection("W");
            }

        } else if (this.direction.equals("W")) {
            if(command.equals("L")){
                setDirection("S");
            } else if(command.equals("R")){
                setDirection("N");
            }
        } else if (this.direction.equals("E")) {
            if(command.equals("L")){
                setDirection("N");
            } else if(command.equals("R")){
                setDirection("S");
            }
        }
        return this.direction;
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
            this.xAxis--;
        if (this.direction.equals("E"))
            this.xAxis++;

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
