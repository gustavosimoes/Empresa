package empresa;

import java.util.ArrayList;

public class RecursosHumanos {

    private ArrayList<Funcionario> empresa;

    public RecursosHumanos() {
        empresa = new ArrayList<>();
    }

    public void verFuncionarios() {
        if(!empresa.isEmpty()){
            for (int i = 0; i < empresa.size(); i++) {
                empresa.get(i).getNome();
            }
        }
        else System.out.println("Nenhum Funcionário.");
    }

}
