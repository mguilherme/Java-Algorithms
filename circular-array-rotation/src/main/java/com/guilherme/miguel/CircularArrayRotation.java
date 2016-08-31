package com.guilherme.miguel;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Miguel Guilherme
 *
 * Example input:
 * 3 2 3
 * 1 2 3
 * 0
 * 1
 * 2
 *
 */
public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        // Populate Array
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        // Right circular rotation
        for (int i = 0; i < k; i++) {
            list.addFirst(list.removeLast());
        }

        // Print elements
        for (int i = 0; i < q; i++) {
            System.out.println(list.get(in.nextInt()));
        }

    }

}
