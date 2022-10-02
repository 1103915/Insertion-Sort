class insertionsort{
    public static void main(String args[]){
    int array[] = {0,5,3,9,4,8,7};
    int first_element;
    int key;
    
    System.out.println("Unsorted Elements");
    for(int i = 0;i<array.length;i++){System.out.println(array[i]);}
    for(int i = 1; i<array.length; i++){
         first_element = i-1;
         key = array[i];
       while(array[first_element] > key && first_element>=0){array[first_element+1]=array[first_element];first_element--;}    
   // System.out.println(array[i]);
    array[first_element + 1]=key;
   } 
    System.out.println("Sorted Elements");
   for(int loop = 0; loop<array.length; loop++){System.out.println(array[loop]);}
 }
} 