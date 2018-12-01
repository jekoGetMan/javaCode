package HomeWork4.tsk1;

public class Ring extends Shape implements getSquare {
        double radius;

        public Ring(double radius) {
            this.radius = radius;

        }

        @Override
        public double getSquare() {
            return Math.PI * Math.sqrt(radius);
        }
    }

