class Solution {
   public int maxSubArray(int[] nums) {
    if (nums == null) {
        return 0;
    }
    int max = nums[0];    // ȫ�����ֵ
    int subMax = nums[0];  // ǰһ������ϵ����ֵ,״̬ѹ��
    for (int i = 1; i < nums.length; i++) {
        if (subMax > 0) {
            // ǰһ����������ֵ����0��������
            subMax = subMax + nums[i];
        } else {
            // ǰһ����������ֵС��0������ǰ��Ľ��
            subMax = nums[i];
        }
        // ����ȫ�����ֵ
        max = Math.max(max, subMax);
    }

    return max;
}


}