// How many  combination of 3 numbers can be made from number 1,2,3,4 ? (Each number cannot repeat in the combination)

public class Combination {
    public static void main(String [] args){
      int count=0;
      for(int i =1;i<=4 ; i++){
          for (int j=1; j<=4; j++){
              for (int k=1; k <=4 ; k++){
                  if (i!=k && i!=j && j!=k){
                      System.out.println(100*i+10*j+k);
                      count ++;
                  }
              }
          }
      }
   System.out.println(count);
    }
}
