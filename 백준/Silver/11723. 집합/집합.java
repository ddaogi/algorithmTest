
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		HashSet<Integer> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();

		while (M-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int n = 0;
			if (st.hasMoreTokens())
				n = Integer.parseInt(st.nextToken());
			if (str.equals("all")) {
				for (int i = 1; i <= 20; i++) {
					set.add(i);
				}
			} else if (str.equals("empty")) {
				set.clear();
			} else if (str.equals("add")) {
				set.add(n);
			} else if (str.equals("remove")) {
				set.remove(n);
			} else if (str.equals("check")) {
				if (set.contains(n))
					sb.append("1\n");
					
				else
					sb.append("0\n");
			} else if (str.equals("toggle")) {
				if (set.contains(n))
					set.remove(n);
				else {
					set.add(n);
				}
			}
		}
		System.out.println(sb);

	}

}
