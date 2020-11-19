package sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	public static void main(String[] args) {
		Integer[][] numbers = new Integer[][] {{1,2,3},{10,20,30}};
		List<Integer[]> list = Arrays.asList(/*new ArrayList<>();*/
//				new Sample(10),
//				new Sample(20),
//				new Sample(30));
				numbers[1],
				new Integer[] {10,20,30});
		System.out.println(new Integer[] { 10, 20, 30 }); /*この二つはインスタンスなので*/
		System.out.println(list.get(1)); 				/*当然同じ参照(アドレス)ではない*/
//		list.add(new Integer[] {1,2,3});
//		list.add(new Integer[] {10,20,30});
		System.out.println(list.contains(numbers[1]));
		System.out.println(list.contains(new Integer[] {10,20,30}));

		Predicate<Integer[]> f = x -> list.contains(x);
//		System.out.println(list.contains(new Sample(10)));
		System.out.println(f.test(new Integer[] {10,20,30}));
		System.out.println(f.test(numbers[1]));
//		if(f.test("f")) {
//		if(f.test(new Sample(20))) {
		if(f.test(new Integer[] {10,20,30})) {
			System.out.println("ok");
		}else {
			System.out.println("there is nothing");
		}
	}
}
class Sample{
	private int num;
	public Sample(int num) {
		this.num = num;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Sample == false) {
			return false;
		}
		if(this.num == ((Sample) obj).num) {
			return true;
		}
		return false;
	}
}

//結果
//[Ljava.lang.Integer;@3712b94
//[Ljava.lang.Integer;@2833cc44
//true
//false
//false
//true
//ok








