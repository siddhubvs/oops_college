package Rectangle_constructor;

public class rectangle_constructor {
    public rectangle_constructor(){}


    public rectangle_constructor(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int length;
        int breadth;

        public void setLength(int length) {
            this.length = length;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }

        public int getBreadth() {
            return breadth;
        }
        public int computearea(int length,int breadth){
            return length*breadth;
        }
        public int computeperimeter(int length,int breadth){
            return 2*(length+breadth);
        }
    }

