package ClassAndObiect.Th;

public class TV {
    int chane=1;
    int volume=1;
    boolean status = false;
    public TV(){
    }
    public void turnOn(){
        status=true;
    }
    public void turnOff(){
        status=false;
    }

    public void setChane(int newChane){
        if(status && newChane >=1 && newChane<=200)
        {
            chane= newChane;
        }
    }
    public void setVolume(int newVolume){
        if(status && newVolume>=1 && newVolume<=100){
            volume= newVolume;
        }
    }
    public void upChane(){
        if(status && chane<200)
        {
            chane++;
        }
    }
    public  void downChane(){
        if(status && chane>1)
        {
            chane--;
        }
    }
    public void upVolume(){
        if(status && volume<100){
            volume++;
        }
    }
    public void downVolume(){
        if(status && volume>1){
            volume--;
        }
    }
    public static void main(String[] args){
        TV tv1= new TV();
        tv1.turnOn();
        tv1.setVolume(30);
        tv1.setChane(30);

        TV tv2= new TV();
        tv2.turnOn();;
        tv2.upChane();;
        tv2.upVolume();
        tv2.upChane();

        System.out.println("chane tv1 "+ tv1.chane+" volume tv1 "+ tv1.volume);
        System.out.println("chane tv1 "+ tv2.chane+" volume tv1 "+ tv2.volume);
    }

}
