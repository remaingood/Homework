package hackerrank.dataStructures.javaDequeue;

import java.util.*;

/*
In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .
 */
public class Solution {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayDeque<Integer> deque     = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {

            if (i >= m) {
                int old = deque.removeFirst();
                if (map.get(old) == 1) {
                    map.remove(old);
                } else {
                    map.merge(old, -1, Integer::sum);
                }
            }


            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());
        }

        scan.close();
        System.out.println(max);
        }
    }

