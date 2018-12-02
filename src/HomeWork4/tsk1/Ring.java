package HomeWork4.tsk1;

public class Ring extends Shape implements FigureSquare {
        //final static double PI = 3.1415;
        double ringRadius;

        public Ring(double ringRadius) {
            Math.abs(ringRadius);
            this.ringRadius = ringRadius;
        }

        @Override
        public double figureSquare() {
            return Math.PI * Math.pow(ringRadius,2);
        }
    }

