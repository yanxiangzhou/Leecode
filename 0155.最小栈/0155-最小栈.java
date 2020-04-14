class MinStack {

        /** initialize your data structure here. */

        private List<Integer> list;
        private int topIndex;
        private Map<Integer, Integer> minMap;

        public MinStack() {
            this.list = new ArrayList<>();
            this.topIndex = -1;
            minMap = new HashMap<>();
        }

        public void push(int x) {
            this.topIndex++;
            list.add(x);

            int min;
            if (topIndex == 0) {
                min = Math.min(x, Integer.MAX_VALUE);
            } else {
                min = Math.min(x, this.minMap.get(topIndex - 1));
            }

            minMap.put(this.topIndex, min);
        }

        public void pop() {
            list.remove(this.topIndex);
            this.topIndex--;
        }

        public int top() {
            return list.get(this.topIndex);
        }

        public int getMin() {
            return minMap.get(this.topIndex);
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */