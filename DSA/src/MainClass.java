import java.util.Scanner;

class SDA {
    int[] arr;
    public SDA(int size){
        arr = new int[size];
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int index,int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                    arr[index]=value;
                    System.out.println("the value " +value+ " is added.");
            }else {
                System.out.println("The cell is filled");
            }
        }catch (Exception e){
            System.out.println("Invalid data/index");
        }
    }
    public void traverse(){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.println("The value is " +arr[i]);
        }
    }
    public void serachbyindex(int index){
        try{
            if(arr[index]!= Integer.MIN_VALUE){
                System.out.println("The value at the index "+index+" is "+arr[index]);
            }else {
                System.out.println("Invalid index");
            }
        }catch (Exception e){
            System.out.println("Invalid Index");
        }
    }
    public void searchbyvalue(int value){
        try{
            for(int i = 0; i <arr.length; i++){
                if(arr[i]==value){
                    System.out.println("The value is present at index "+i);
                    return;
                }
            }
            System.out.println("Value is not present");
        }catch (Exception e ){
            System.out.println("Invalid value");
        }
    }
    public void deletebyindex(int index){
        try{
            if(arr[index]!= Integer.MIN_VALUE){
               arr[index] = Integer.MIN_VALUE;
                System.out.println("The value is deleted..!");
            }else {
                System.out.println("Invalid index");
            }
        }catch (Exception e){
            System.out.println("Invalid Index");
        }
    }
    public void deletebyvalue(int value){
        try{
            for(int i = 0; i <arr.length; i++){
                if(arr[i]==value){
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("The value is deleted");
                    return;
                }
            }
            System.out.println("Value is not present");
        }catch (Exception e ){
            System.out.println("Invalid value");
        }
    }
}
class MainClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        SDA s = new SDA(size);

            System.out.println("Enter the values f");
        s.insert(0,1);
        s.insert(1,2);
        s.insert(2,3);
        s.insert(3,4);
        s.insert(4,5);
        s.traverse();
        s.serachbyindex(2);
        s.searchbyvalue(5);
        s.deletebyindex(0);
        s.deletebyvalue(3);

        }


    }