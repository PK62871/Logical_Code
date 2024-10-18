package p1;

class A {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int arr1[] = { 1, 2, 3 };

        boolean isSubset = isSubset(arr, arr1);
        if (isSubset) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isSubset(int[] arr, int[] arr2) {
        for (int j : arr2) {
            boolean found = false;
            for (int i : arr) {
                if (j == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false; // if any element of arr2 is not found in arr
            }
        }
        return true; // all elements of arr2 were found in arr
    }
}
