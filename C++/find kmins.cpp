int find_kmin(int left, int right, int k) {
    find median of a[left, right]
    divide the [left, right] into two sub-arrays [left, mid], [mid + 1, right];
    if (k <= mid - left + 1) {
        find_kmin(left, mid, k);
    } else {
        add a[left, mid] to ans
        find_kmin(mid + 1, right, k - (mid - left + 1));
    }
    return 0;
}