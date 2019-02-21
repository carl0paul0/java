package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
	/* Introduced with Java 1.8.
	 * Streams represent a sequence of elements.
	 * Using the stream api in java we can 
	 * perform operations on these sequences.
	 */
	public void streamSamples() {
		
		List<String> sList = new ArrayList<>();
		sList.add("Carlo");
		sList.add("carlo");
		sList.add("Paulo");
		sList.add("PAulo");
		sList.add("Tolentino");
		sList.add("tolentino");
		sList.add("tolENtino");
		
		System.out.println(sList.toString());
		System.out.println(sList.stream().filter(s -> s.contains("P")).findAny().toString());
		/* even after doing some filter the original list remains intact.
		 * this is similar to a pipe in unix.
		 */
		System.out.println(sList.toString());
	}
	
	public void moreStreamSample() {
		Stream<String> st = Stream.of("a","b","c","d","e","A").map(letter ->{return letter.toLowerCase();}).distinct();
		System.out.println(st.collect(Collectors.toList()));
	}


	public static void main(String[] args) {
		/* There are so many ways Stream can be used.
		 * These are just a few samples on how to use them.
		 */
		
		StreamSample sSam = new StreamSample();
		sSam.streamSamples();
		sSam.moreStreamSample();

	}

}
