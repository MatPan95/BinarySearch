/**
 * This package contains classes related to binary search algorithms.
 * <p>
 * The {@code BinarySearch} class provides a generic implementation of binary search
 * for arrays of elements that implement the {@link java.lang.Comparable} interface.
 * <p>
 * The binarySearch method searches for a target element within a sorted array:
 * <ul>
 * <li>It initializes pointers at the beginning and end of the array.</li>
 * <li>Uses a while loop to continue searching while the left pointer is less than
 * or equal to the right pointer.</li>
 * <li>Calculates the middle index of the current segment of the array.</li>
 * <li>Compares the element at the middle index with the target element using
 * {@link java.lang.Comparable#compareTo(Object)} method.</li>
 * <li>Adjusts the search range based on the comparison results:
 * <ul>
 * <li>If the middle element equals the target, returns the index.</li>
 * <li>If the middle element is less than the target, adjusts the left pointer.</li>
 * <li>If the middle element is greater than the target, adjusts the right pointer.</li>
 * </ul>
 * </li>
 * <li>Returns -1 if the target element is not found in the array.</li>
 * </ul>
 * <p>
 * The time complexity of the binarySearch method is O(log n), where n is the size of the array.
 * This is because the algorithm divides the search interval in half at each step, resulting in a
 * logarithmic time complexity relative to the size of the input.
 * <p>
 * The {@code BinarySearch} class is parameterized with type {@code T}, which must
 * implement {@link java.lang.Comparable} for itself or its supertypes.
 */
package org.binarysearch;
