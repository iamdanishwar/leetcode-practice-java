class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        List<Integer> OutputList = new ArrayList<>();

        if (x < arr[low]) {
            for (int i = 0; i < k; i++) {
                OutputList.add(arr[i]);
            }
            return OutputList;
        } else if (x > arr[high]) {
            for (int i = n - k; i < n; i++) {
                OutputList.add(arr[i]);
            }
            return OutputList;
        }

        while (high - low >= k) {
            if (Math.abs(arr[low] - x) > Math.abs(arr[high] - x)) {
                low++;
            }
            else {
                high--;
            }
        }

        for (int i = low; i <= high; i++) {
            OutputList.add(arr[i]);
        }
        return OutputList;

    }
}