package prog6112test2021q1;

/**
 *
 * @author lindelo Desiree Nkosi.
 */
public class PROG6112TEST2021Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] Deliveries = {{128, 135, 139},
                                 {155, 129, 175},
                                 {129, 130, 185}
                                                };
        
        
       
//        printing the report
        System.out.println("*****************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("*****************************************************");
        System.out.print("\t");  
        System.out.print("\tJAN");
        System.out.print("\tFEB");
        System.out.print("\tMAR");
        System.out.println();
        
        for(int i = 0; i < Deliveries.length; i++){
            System.out.println();
             switch(i){
               case 0 : System.out.print("DELIVERIES 2018");break;
               case 1 : System.out.print("DELIVERIES 2019");break;
               case 2 : System.out.print("DELIVERIES 2010");break;
              
             }
            
            for(int j = 0; j < Deliveries[i].length;j++){
                System.out.print( "\t" + Deliveries[i][j]);
                
            }
            System.out.println();  
        }
//        System.out.println("                      JAN                 FEB                   MAR ");
//        System.out.println("DELIVERIES 2018       128                 135                   139 ");
//        System.out.println("DELIVERIES 2019       155                 129                   175 ");
//        System.out.println("DELIVERIES 2020       129                 130                   185    ");
       
        
        System.out.println("*******************************************************");
        System.out.println("DELIVERIES STATISTICS");
        System.out.println("*******************************************************");
      
               
        
        
        
        //finding the sum of the array
        
        int sum = 0;
        for(int l = 0; l < Deliveries.length; l++){
            for(int y = 0; y < Deliveries[l].length; y++ ){
                sum += Deliveries[l][y];
            }
        }
        System.out.println("Total Deliveries : " + sum );
        
        
         //finding the largest number 
    int largest = 0;
    
    for(int i = 0; i < Deliveries.length; i++){
        
        for(int j = 0; j < Deliveries[i].length; j++){
        
       if(Deliveries[i][j] > largest){
           largest = Deliveries[i][j];
       }
    
     }
    }
        System.out.println("Maximun Deliveries : " + largest);
        
        
         //finding the smallest value
         int smallest= largest;
    
    for(int index = 0; index < Deliveries.length; index++){
        
        for(int j = 0; j < Deliveries[index].length; j++){
        
       if(smallest > Deliveries[index][j]){
          smallest = Deliveries[index][j];
       }
    
     }
    }
        System.out.println("Minimum Deliveries : " + smallest);  
        
        System.out.println("**********************************************");  
    }
    
    
   
}
