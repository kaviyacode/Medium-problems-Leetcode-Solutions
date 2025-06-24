class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - k;

        // Binary search for the best starting index of the window
        while (left < right) {
            int mid = (left + right) / 2;

            // Compare distances to x on both sides of the window
            if (x - arr[mid] > arr[mid + k] - x) {
                // Move right if right side is closer
                left = mid + 1;
            } else {
                // Stay or move left if left side is closer or equal
                right = mid;
            }
        }

        // Build and return result from the best window
        List<Integer> result = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
