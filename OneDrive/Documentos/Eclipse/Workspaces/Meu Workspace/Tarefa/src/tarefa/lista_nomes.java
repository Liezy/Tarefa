package tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lista_nomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();     
        
        nomes.add("Murilo");
        nomes.add("José");
        nomes.add("Ana");
        nomes.add("Pedro");
        nomes.add("Luiza");
        
        Collections.sort(nomes);
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
