package Lec43;

public class Heap_Clinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heap hp = new Heap();
		hp.add(2);
		hp.add(3);
		hp.add(5);
		hp.add(1);
		hp.add(7);
		hp.add(-2);
		hp.add(4);
		hp.add(-7);
		hp.add(-11);
		hp.display();
		System.out.println(hp.remove());
		hp.display();
	}

}
