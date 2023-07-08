
/**
 * This checkSortRec handles and check if the array is sorted or not
 *
 * @author (Yousuf Borno)
 * @version (7/8/2023)
 */
public class checkSortRec
{
    public static void iterateRec(int n,int myNum[]){
    
         if(n < myNum.length){
             System.out.println(myNum[n]);
             iterateRec(n+1,myNum);
            }
            else{
                return;
            }
    
    
    }
    
    public static boolean checkSort(int n, int myNum[],boolean bool){
        
        if(n == myNum.length-1 && bool == true ){
            return true;
        }
        
        else if(n < myNum.length-1 && (myNum[n] <= myNum[n+1])){
            
            System.out.println(myNum[n]);
            System.out.println(myNum[n+1]);
            boolean output = myNum[n] <= myNum[n+1];
            System.out.println("myNum[n] <= myNum[n+1] : "+output);
           return true && checkSort(n+1,myNum,bool);
        }
        else{
            System.out.println("myNum[n] <= myNum[n+1] : ");
            System.out.println(myNum[n]);
            System.out.println(myNum[n+1]);
            //boolean output = myNum[n] <= myNum[n+1];
            
           return false;
        }
        
        
    }
    
    
    public static void main(String args[]){
    
        int [] mynumbers= {18,12,14,15,17};
        int start =0;
        
        //iterateRec(start,mynumbers);
        System.out.println(checkSort(start,mynumbers,true));
        
        
    }
   
}
