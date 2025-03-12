class Computer {
    public String PlayMusic(){
        return "Playing LAla Land Music";
    }
    public void GetMeApen(int cost) {
        int n; // Category variable

        if (cost >= 10 && cost <= 15) {
            n = 1;
        } else if (cost >= 16 && cost <= 30) {
            n = 2;
        } else if (cost > 30) {
            n = 3;
        } else {
            n = 0; // Default case for invalid cost
        }

        switch (n) {
            case 1:
                System.out.println("Reynolds Granted");
                break;
            case 2:
                System.out.println("Trimax Granted");
                break;
            case 3:
                System.out.println("Stop Wasting Money dumbo, get something cheaper!");
                break;
            default:
                System.out.println("Give at least a rupee, man!");
        }
    }
}

public class Methods {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Gap.bar();
        comp.GetMeApen(10);
        comp.GetMeApen(20);
        comp.GetMeApen(50);
        comp.GetMeApen(0);

       String music= comp.PlayMusic();
       System.out.println(music);

       System.out.println();
       
       
       

        
    }
}