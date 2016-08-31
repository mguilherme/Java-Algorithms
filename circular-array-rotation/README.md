# Circular Array Rotation

John Watson performs an operation called a right circular rotation on an array of integers, _`[a0, a1,...an-1]`_. After performing one right circular rotation operation, the array is transformed from _`[a0, a1,...an-1]`_ to _`[an-1, a0,..., an-2]`_.

Watson performs this operation _`k`_ times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks _`q`_ queries, where each query consists of a single integer, _`m`_, for which you must print the element at index _`m`_ in the rotated array (i.e., the value of _`am`_).

#### Input Format

The first line contains _`3`_ space-separated integers, _`n`_, _`k`_, and _`q`_, respectively. 
The second line contains _`n`_ space-separated integers, where each integer _`i`_ describes array element _`ai`_ (where _`0 <= i < n`_ ). 
Each of the _`q`_ subsequent lines contains a single integer denoting _`m`_.

#### Constraints

* _`1 <= n <= 10⁵`_
* _`1 <= ai <= 10⁵`_
* _`1 <= k <= 10⁵`_
* _`1 <= q <= 500`_
* _`0 <= m <= N - 1`_

#### Output Format

For each query, print the value of the element at index  of the rotated array on a new line.

#### Sample Input

```
3 2 3
1 2 3
0
1
2
```

#### Sample Output

```
2
3
1
```

#### Explanation

After the first rotation, the array becomes _`[3, 1, 2]`_. 
After the second (and final) rotation, the array becomes _`[2, 3, 1]`_.

Let's refer to the array's final state as array _`b`_. For each query, we just have to print the value of _`bm`_ on a new line:

1. _`m = 0`_, so we print _`2`_ on a new line.
2. _`m = 1`_, so we print _`3`_ on a new line.
3. _`m = 2`_, so we print _`1`_ on a new line.
