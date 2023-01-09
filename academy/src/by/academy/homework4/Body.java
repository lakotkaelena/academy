package by.academy.homework4;

public class Body {
    Heart heart;
    Lungs lungs;





    public Body() {
        // super();
        this.heart =new Heart();
        this.lungs =new Lungs();
    }

    public void live(){
        lungs.live();
        heart.live();
    }


    public class Heart {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 100 == 0) {
                    System.out.println("Knock-knock-knockin' on heaven's door");
                }
            }
        }


    }

    public class Lungs {
        public void live() {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (i % 50 == 0 && i % 100 != 0) {
                    System.out.println("breathe in");
                }
                if (i % 100 == 0) {
                    System.out.println("breathe out");
                }
            }
        }
    }
}
