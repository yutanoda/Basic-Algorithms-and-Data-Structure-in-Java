static void selectionSort(int[] lst) {
		int n = lst.length;
		for (int i = 0; i < n; i++) {
			int minj = i;
			for( int j = i; j < n; j++) {
				if (lst[j] < lst[minj]) {
					minj = j;
				}
				int t = lst[i];
				lst[i] = lst[minj];
				lst[minj] = t;
			}
		}
		System.out.println(Arrays.toString(lst));
	}