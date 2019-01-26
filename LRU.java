import java.util.*;
public class LRU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int count=0,page_faults=0;
            Queue<Integer> new_que = new LinkedList<>();
            for(int i=0;i<n;i++)
            {
                int x = sc.nextInt();
                boolean not_present = new_que.contains(x);
                if( !not_present && count<4)
                {
                    count++;
                    new_que.add(x);
                    page_faults++;
                }
                else if(count==4 && !not_present)
                {
                    new_que.poll();
                    new_que.add(x);
                    page_faults++;
                }
            }
            System.out.println(page_faults);
        }
    }
}
