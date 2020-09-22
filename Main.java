
/*
Lab 4
Partners: Jaelee Jones and Suraj Shah
Date: 09/22/2020
*/


import java.util.Random;

class Main {
  public static void main(String[] args) {
   
    Random r = new Random();
    int randomNum = r.nextInt(50)+1;
    System.out.println("Random number is:  " + randomNum );


  if(randomNum < 25)
      {
      for(int i = randomNum; i >=0; --i)
    {
        System.out.println(i);

    }
      System.out.println("Ahoy Mateys!");
    } 
  

  else if (randomNum>=25 && randomNum <=42){

    for(int i = randomNum;  i >= 0  ; --i)
    {       
      System.out.println(i);
     
    }
     System.out.println("Cannonball!");
  }
  
   else
    {
      for(int i = randomNum;  i >=0  ; --i)
    {
      System.out.println(i);
      
    }
       System.out.println("Blast off!");
    }
    


  } 
  

  // if (randomInt >=25){
  // while (randomInt >= 25) {
  // System.out.println (randomInt);
  // randomInt--;
  // System.out.println("Blast off!");}}

}
