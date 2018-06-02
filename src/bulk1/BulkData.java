package bulk1;



import java.util.*;
import java.util.stream.*;
public class BulkData {

	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<100;i++) {
			list.add(i);
		}
		Stream<Integer> seq=list.stream();
		Stream<Integer> par =list.parallelStream();
		System.out.println("***************************7n ");
		
		Stream<Integer> parnumbers=par.filter(p->p>80);
		parnumbers.forEach(System.out::println);
		System.out.println("***************************8");
		Stream<Integer> seqnumbers=seq.filter(p->p>95);
		seqnumbers.forEach(System.out::println);
		System.out.println("***************************9");
		
	}
}
