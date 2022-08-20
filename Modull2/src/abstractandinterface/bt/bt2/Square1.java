package abstractandinterface.bt.bt2;


    public class Square1 extends Shape implements Colorable{
        public double size;

        public Square1() {
        }

        public Square1(float size){
            this.size= size;
        }

        public Square1(double size, String color, boolean filled) {
            super(color,filled);
            this.size = size;
        }
        public double getSize() {
            return size;
        }

        public void setSize(double size) {
            this.size = size;
        }
        public double getPerimeter(){
            return 4*this.size;
        }
        public double getArea() {
            return size * size;
        }
        @Override
        public String toString(){
            return super.toString()+ " Size: "+ size+ " Chu vi: "+ getPerimeter()+ " Dien tich: "+getArea();
        }
        @Override
        public void howToColor(String cachve) {
            System.out.println("Cach to la: "+ cachve);
        }
    }


