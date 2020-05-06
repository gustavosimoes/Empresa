package empresa;

import java.util.ArrayList;

public class Gestor extends Funcionario {

    private float gratificacaoAnual;
    private ArrayList<Funcionario> time;

    public float getGratificacaoAnual() {
        return gratificacaoAnual;
    }

    public void setGratificacaoAnual(float gratificacaoAnual) {
        this.gratificacaoAnual = gratificacaoAnual;
    }

    public Gestor() {
        time = new ArrayList<>();
    }
    
    public void mostrarTime(){
        if(!time.isEmpty()){
            for (int i = 0; i < time.size(); i++) {
                time.get(i).getNome();
                System.out.println("\n");
            }
        }
    }
    
    public void addFuncionario(Funcionario f){
        time.add(f);
    }
    
    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Gratificação Anual: " + this.getGratificacaoAnual());
    }
}
