static void bubbleSort(int[] lst) {
		int n = lst.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (lst[j] > lst[j + 1]) {
					int temp = lst[j];
					lst[j] = lst[j + 1];
					lst[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(lst));
	}