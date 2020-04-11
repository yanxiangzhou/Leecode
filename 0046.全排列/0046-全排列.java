class Solution {
   List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        process(nums,0);
        return lists;
    }

    //����start��ʾ������ĳһ�㡣
    private void process(int[] nums, int start) {
        //�����ʼλ���Ѿ�������ĩβ����ô�����һ��⡣
        if(start == nums.length){
            List<Integer>list = new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            lists.add(list);
        }
        for (int i = start; i < nums.length ; i++) {
            //�ѵ�һ��Ԫ�طֱ�������Ԫ�ؽ��н������ݹ�ĵ������������������
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