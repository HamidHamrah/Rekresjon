package RekresjonOppgaver;

public class EkstraOppgave1 {
    public static void main(String[] args) {
        int liste[]={1, 3, 4, 5, 6, 7};
        System.out.println(binarysearch(liste,3,0, (liste.length-1)));
    }
    public static int binarysearch(int[] array,int value,int start,int end ){
            if ((end-start)<=1){
                if (start==value){
                    return start;
                }
                if (end==value){
                    return end;
                }
                return -1;
            }
            int midtpoint=(start+end)/2;
            if(array[midtpoint]<value){
                return binarysearch(array,value,start,end);
            }
            else{
                return binarysearch(array,value,midtpoint,end);
            }

    }
}
