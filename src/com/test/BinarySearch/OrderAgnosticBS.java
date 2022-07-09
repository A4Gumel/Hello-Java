package com.test.BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {99, 87, 67, 55, 45, 33, 22, 12, 6, 5, 4, 1};
        int target = 22;

        System.out.println(orderAgnosticBS(arr, target));

    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]) {

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {

                    start = mid + 1;

                } else if (target < arr[mid]) {

                    end = mid - 1;

                } else if (target == arr[mid]) {

                    return mid;
                }

            }

        } else {

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {

                    end = mid - 1;

                } else if (target < arr[mid]) {

                    start = mid + 1;

                } else if (target == arr[mid]) {

                    return mid;
                }

            }

        }

        return -1;
    }
}
