
// Create a program that demonstrates the concept of classes and objects using a
// real-world analogy.
 
// concept -- A non-static inner class needs an object of the outer class to exist, so it can’t be directly created inside a static method like main().
public class oops1{
    static class Car{
        private int CarNo;
        private String color;
        private String Model;
        private int year;
        private String brand;

        Car(int CarNo , String color , String Model , int year , String brand){
            this.CarNo = CarNo;
            this.color = color;
            this.Model = Model;
            this.year = year;
            this.brand = brand;
        }

        public void setCarNo(int CarNo){
            this.CarNo = CarNo;
        }
        public void setcolor(String color){
            this.color = color;
        }
        public void setModel(String Model){
            this.Model = Model;
        }
        public void setyear(int year){
            this.year = year;
        }
        public void setbrand(String brand){
            this.brand = brand;
        }
        public int getCarNo(){
            return CarNo;
        }
        public String getcolor(){
            return color;
        }
        public String getModel(){
            return Model;
        }
        public int getyear(){
            return year;
        }
        public String getbrand(){
            return brand;
        }
    }
    public static void main(String[] args){

        Car car1 = new Car(9957 , "BLUE" , "MarutiZLX&" , 2023 , "MarutiSuzuki");
        System.out.println(car1.getCarNo());
        System.out.println(car1.getcolor());
        System.out.println(car1.getModel());
        System.out.println(car1.getbrand());
        System.out.println(car1.getyear());
        
}
}
