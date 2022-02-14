public class algoritmosOrdenamiento  {

    /**
     * @param args the command line arguments
     */
    
    //seleccion directa
    
    public static<T> String imprimirArreglo(T[] arreglo) {
        String res ="";
        for(int i = 0; i<arreglo.length; i++) {
            res = res + arreglo[i] + ", ";
        }
        return res;
    }

    public static<T> void swap(T[] arreglo, int ind1, int ind2) {
        T temp = arreglo[ind1];
        arreglo[ind1] = arreglo[ind2];
        arreglo[ind2] = temp;
    }
    
    
    public static <T extends Comparable<T>> void seleccionDirecta(T[] arreglo) {        
        T temp;
        for(int i = 0; i<arreglo.length; i++) {            
            for(int j = i; j<arreglo.length; j++) {
                if(arreglo[j].compareTo(arreglo[i])<0) {
                    temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }               
    }


    
    public static <T extends Comparable<T>> void insercionDirecta(T[] arreglo) {
        T actual,  temp;
        int ind;
        for(int i = 1; i<arreglo.length; i++) {
            
            ind = i;
            actual = arreglo[ind];

            while(ind!=0&&actual.compareTo(arreglo[ind-1])<0) {
                temp = arreglo[ind-1];
                arreglo[ind-1] = actual;
                arreglo[ind] = temp;
                
                ind = ind-1;
                
                
            }
            
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] arreglo) {
        for(int i = 0; i<arreglo.length; i++) {
            for(int j = 0; j<arreglo.length-i-1; j++) {
                if(arreglo[j].compareTo(arreglo[j+1])>0) {
                    swap(arreglo, j, j+1);
                }
            }
        }
        
        
    }

 

    public static <T extends Comparable<T>> void quickSort(T[] arreglo, int min, int max) {
        if(max==min) {

        } else {
            //reubicaPivote(arreglo, );
        
            
           
        }   
    }

    public static <T extends Comparable<T>> void reubicaPivote(T[] arreglo,  int min, int max) {
        T pivote = arreglo[min];
        min++;

        while(min<=max) {           
            if(arreglo[min].compareTo(pivote)>0) {
                swap(arreglo, max, min);
                max--;
            
            } else {
                min++;

            }
        }

        swap(arreglo, min-1, 0);

        }

    

    

      
    
    
    public static <T extends Comparable<T>> void main(String[] args) {
        // TODO code application logic here
        

        Integer[] nums = {0, -3, 9 , 0, 3, -6};
        reubicaPivote(nums, 0, nums.length-1);
        System.out.println(imprimirArreglo(nums));
        

       ;
    }
    
}
