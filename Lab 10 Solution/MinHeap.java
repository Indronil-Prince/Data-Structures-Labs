import java.util.ArrayList;
public class MinHeap {
	private ArrayList<Integer> heap;
	
	public MinHeap() {
		heap = new ArrayList<Integer>();
	}
	
	public void add(int e) {
        heap.add(e);
        int i = heap.size() - 1;
        while (i > 0) {
            int parentIndex = (i - 1) / 2;
            if (heap.get(i) < heap.get(parentIndex)) {
                int temp = heap.get(i);
                heap.set(i, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                i = parentIndex;
            } else {
                break;
            }
        }
    }

    public int remove() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            int i = 0;
            while (true) {
                int leftChildIndex = i * 2 + 1;
                int rightChildIndex = i * 2 + 2;
                if (leftChildIndex >= heap.size()) {
                    break;
                }
                int minChildIndex = leftChildIndex;
                if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(leftChildIndex)) {
                    minChildIndex = rightChildIndex;
                }
                if (heap.get(minChildIndex) < heap.get(i)) {
                    int temp = heap.get(i);
                    heap.set(i, heap.get(minChildIndex));
                    heap.set(minChildIndex, temp);
                    i = minChildIndex;
                } else {
                    break;
                }
            }
        }
        return root;
    }

    public int top() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty!");
        }
        return heap.get(0);
    }

	public void print() {
		for(int i = 0; i < heap.size(); i++) {
			System.out.print(heap.get(i) + " ");
			
			int h1 = (int) Math.floor(Math.log(i+1)/Math.log(2));
			int h2 = (int) Math.floor(Math.log(i+2)/Math.log(2));

			if (h2 > h1) {
				System.out.println();
			}
		}
		if (Math.floor(Math.log(heap.size() + 1)/Math.log(2)) <= Math.floor(Math.log(heap.size())/Math.log(2))) {
			System.out.println();
		}
	}

	public int findKthSmallest(int k) {
		for (int i = 0; i < k - 1; i++) {
			remove();
		}
		return top();
	}
}