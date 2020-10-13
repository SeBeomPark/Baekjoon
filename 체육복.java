class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int person = n - lost.length;
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    reserve[j] = -1;
                    lost[i] = - 1;
                    person++;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j] - 1 || lost[i] == reserve[j] + 1){
                    lost[i] = -1;
                    reserve[j] = -1;
                    person++;
                }
            }
        }
        return person;
    }
}