package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaLista;

    public ListaTarefas(){
        this.tarefaLista = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaLista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaLista.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaLista.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }
}
