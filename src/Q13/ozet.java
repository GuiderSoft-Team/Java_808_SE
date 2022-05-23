package Q13;

class ozet {
    int x;

    ozet() {
        this(10);
    }

    ozet(int x) {
        this.x = x;
    }
}
    class Car extends ozet {
        int y;

        Car() {
            super(10);
        }

        Car(int y) {
            super(y);
            this.y = y;
        }

        public String toString() {
            return super.x + ":" + this.y;
        }


        public static void main(String[] args) {
            ozet y = new Car(30);
            System.out.println(y);
        }
    }