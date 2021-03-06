package Sorting;

public class SelectionSortApp {
    
    public static void main(String args[]){
        
        int maxSize=100;    //array size
        ArraySel arr =new ArraySel(maxSize);
        
        arr.insert(77);
        arr.insert(90);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        
        arr.display();
        
        arr.selectionSort();
        
        arr.display();
        
    }// end of main()

    
}// end of Selection sort 


class ArraySel{
    private long[] a; // reference to array a 
    private int nElems; //number of data items 
    
    //-------------------------------
    
    public ArraySel(int max){
        a=new long[max];
        nElems=0;
    }
    
    //-------------------------------
    
    public void insert(long value){  // put element into array 
        a[nElems]=value;
        nElems++;
    }
    
    //--------------------------------
    
    public void display(){       //display array contents
        for(int j=0;j<nElems;j++){
            System.out.print(a[j]+" "); 
        }
        System.out.println();
    }
    
    //------------------------------------------
    
    public void selectionSort(){
        int out, in,min;
        
        for(out=0;out<nElems;out++){ //outer loop 
            min=out;
            for(in=out+1;in<nElems;in++)  //inner loop
                if(a[in]<a[min])
                    min=in;
                swap(out,min);
        }  
        
    }// end SelectionSort()
    
    //--------------------------------------------
    
    private void swap(int one,int two){
        long temp=a[one];
        a[one]=a[two];
        a[two]=temp;
    }
    
    //----------------------------------------------
} 

