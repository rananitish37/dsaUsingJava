public class LongestFocusTimeWithoutDistraction {
    public static void main(String[] args) {
        char states[] = {'F', 'D', 'F', 'D', 'F', 'F', 'D', 'F'};

        int badCout=0;
        int maxCount=0;
        int leftWindow=0;
        int rightWindow=0;
        int windowCount=0;
        while(rightWindow < states.length){
            if(states[rightWindow]=='F'){
                windowCount++;
                rightWindow++;
            }else{
                if(badCout==1){
                    while (states[leftWindow] != 'D') {
                        leftWindow++;
                        windowCount--;
                    }
                    leftWindow++;
                    windowCount--;
                    badCout--;
                    continue;
                }
                rightWindow++;
                windowCount++;
                badCout++;
            }
            if (windowCount>maxCount) {
                maxCount=windowCount;
            }
        }
        System.out.println(maxCount);
    }
}
