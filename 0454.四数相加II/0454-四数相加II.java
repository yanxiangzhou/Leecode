class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
       HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
       int res = 0;
       for(int i = 0;i < A.length;i++){
           for(int j = 0;j < B.length;j++){
                int sumAB = A[i] + B[j];
                if(hashMap.containsKey(sumAB)){
                    hashMap.put(sumAB,hashMap.get(sumAB) + 1);
                }else {
                    hashMap.put(sumAB,1);
                }

           }
       }

       for(int i = 0;i < C.length;i++){
           for(int j = 0;j < D.length; j++){
               int sumCD = -(C[i] + D[j]);
               if(hashMap.containsKey(sumCD)){
                   res += hashMap.get(sumCD);
               }
           }
       }

       return res;
    }
}

