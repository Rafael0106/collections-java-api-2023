package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //adicionando tarefa na lista
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //removendo a tarefa com tal descrição, ou seja, irá remover todas as tarefas caso bata com a descrição
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        //quantidade de elementos que tenho na lista
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        //imprimindo uma lista de tarefas
        System.out.println(tarefaList);
    }
}
