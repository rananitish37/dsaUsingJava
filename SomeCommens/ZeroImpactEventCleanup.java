public class ZeroImpactEventCleanup {
    public static void main(String[] args) {
        int events[] = {1, 0, 3, 0, 5};

        int slow=0,fast = 0;

        while(fast<events.length){
            if(events[fast] != 0){
                events[slow] = events[fast];
                slow++;
                fast++;
            }else{
                fast++;
            }
        }

        while(slow<events.length){
            events[slow++]=0;
        }

        for(int x: events){
            System.out.print(x+" ");
        }
    }
}
