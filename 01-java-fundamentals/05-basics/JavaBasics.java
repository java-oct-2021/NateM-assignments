import java.util.ArrayList;

public class JavaBasics {
    //print 1-255
    public void oneTo255(){
        for (int i = 1; i<256; i++){
            System.out.println(i);
        }
    }

    //print odd numbers 1-255
    public void oddTo255() {
        for(int i = 1; i<256; i+=2){
            System.out.println(i);
        }
    }
    
    //Sum to 255
    public int sumTo255(){
        int sum = 0;
        for(int i = 1; i<256; i++){
            sum+=i;
        }
        return sum; 
    }

    //Iterate through an array
    public void itArray(int[] arrayX){
        for (int i = 0;i < arrayX.length; i++){
            System.out.println(arrayX[i]);
    }
}

    //Find max value in array
    public void maxValue(int arrayX[]){
        int max = arrayX[0];
        for(int i : arrayX){
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }


    //Array with odd numbers(1-255)
    public void oddNums(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i<256; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }

    }
