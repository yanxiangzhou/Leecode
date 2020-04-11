class Solution {
   List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        process(nums,0);
        return lists;
    }

    //变量start表示到达了某一层。
    private void process(int[] nums, int start) {
        //如果起始位置已经到达了末尾，那么这就是一组解。
        if(start == nums.length){
            List<Integer>list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            lists.add(list);
        }
        for (int i = start; i < nums.length ; i++) {
            //把第一个元素分别与后面的元素进行交换，递归的调用其子数组进行排序
            swap(nums,i,start);
            process(nums,start+1);
            swap(nums,i,start);

        }
    }

    private void swap(int[] nums, int index1, int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }

}