package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private final Map<String, Integer> contatoMap = new HashMap<>();

    public AgendaContatos() {
    }

    public void adicionarContato(String nome, Integer telefone){
        contatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        contatoMap.remove(nome);
    }

    public void exibirContato(){
        System.out.println(contatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        return contatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("joaze", 12457);
        agendaContatos.adicionarContato("Joaze", 1);
        agendaContatos.adicionarContato("Joaze lucas", 89552);
        agendaContatos.adicionarContato("Joaze francisco", 12457);
        agendaContatos.adicionarContato("Joaze", 5);
        System.out.println(agendaContatos.pesquisarPorNome("Joaze"));
        agendaContatos.removerContato("joaze");
        agendaContatos.exibirContato();
    }
}
