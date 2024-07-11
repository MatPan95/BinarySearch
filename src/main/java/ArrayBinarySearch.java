public class ArrayBinarySearch<T extends Comparable<? super T>> {

        public int binarySearch(T[] array, T target) {
            int left = 0;
            int right = array.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (array[mid].compareTo(target) == 0) {
                    return mid;
                }
                if (array[mid].compareTo(target) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
}
