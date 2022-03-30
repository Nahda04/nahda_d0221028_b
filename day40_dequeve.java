    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer>himpunan = new HashSet<>();
            int max = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               
                deque.add(num);
                himpunan.add(num);
                
                if(deque.size()==m){
                    if(himpunan.size()>max){
                        max = himpunan.size();
                    }
                    int firs = deque.remove();
                    if(!deque.contains(firs)){
                        himpunan.remove(firs);
                    } 
                }
                
            }
            
            System.out.println(max);
        }
    }



