package task1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) {
		
		 
		Outsource thanos = new Outsource("A239", "O", "21/05/2017", 8.4, 19, 10);
		Outsource kwstas = new Outsource("A250", "O", "8/05/2024", 7.6, 15, 8);
		Outsource giorgos = new Outsource("A100", "O", "16/09/2019", 3, 10, 5);
		Outsource maria = new Outsource("A400", "O", "28/11/2015", 11.5, 12, 7);
		Outsource eirini = new Outsource("A239", "I", "3/3/2023", 6.2, 7, 10);
		
	
		ArrayList<Outsource> outEmp = new ArrayList<>();
		outEmp.add(thanos);
		outEmp.add(kwstas);
		outEmp.add(giorgos);
		outEmp.add(maria);
		outEmp.add(eirini);
			
	
		output(outEmp);
		
		 
			InHouse pavlos = new InHouse("A17", "I", "22/05/2017", 7.5, 22, 0);
			InHouse iwanna = new InHouse("A52", "I", "08/01/2012", 0.3, 12, 8);
			InHouse athina = new InHouse("A88", "I", "16/10/2019", 8, 10, 5);
			InHouse iakovos = new InHouse("A40", "I", "27/09/2021", 15, 5, 10);
			InHouse babis = new InHouse("A101", "O", "14/03/2023", 6.2, 7, 10);
			
		
			ArrayList<InHouse> inEmp = new ArrayList<>();
			inEmp.add(pavlos);
			inEmp.add(iwanna);
			inEmp.add(athina);
			inEmp.add(iakovos);
			inEmp.add(babis);
			
			output(inEmp);
	}
	
	public static void output(ArrayList<? extends Employees> list){

		HashMap<Employees, Double> ranking = new HashMap<>();
		ArrayList<Double> rank = new ArrayList<>();
		LinkedHashMap<Employees, Double> empRankings = new LinkedHashMap<>();
		
		double totalCost = 0.0;
		for(int i = 0 ; i <= list.size() - 1; i++) {
			double x = list.get(i).amountOfCosts();
			ranking.put(list.get(i), x);
			rank.add((double) x);
			totalCost += x;
		}
		
		System.out.println(totalCost);
		
		
	Collections.sort(rank, Collections.reverseOrder());
	 for (double num : rank) {
         	for (Entry<Employees, Double> entry : ranking.entrySet()) {
             		if (entry.getValue().equals(num)) {
                 	empRankings.put(entry.getKey(), num);
             		}
         	}
	 }
		
	 	System.out.println(empRankings);
	}
}


