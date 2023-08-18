package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgentaContatos {

    private final Set<Contato> contatoSet = new HashSet<>();

    public AgentaContatos(){}

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNomes = new HashSet<>();
        for (Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNomes.add(c);
            }
        }
        return contatoPorNomes;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AgentaContatos agentaContatos = new AgentaContatos();
        agentaContatos.adicionarContato("joaze", 12457);
        agentaContatos.adicionarContato("Joaze", 1);
        agentaContatos.adicionarContato("Joaze lucas", 89552);
        agentaContatos.adicionarContato("Joaze francisco", 12457);
        agentaContatos.adicionarContato("Joaze souza", 12457);

        agentaContatos.exibirContatos();
        System.out.println(agentaContatos.pesquisarPorNome("Joaze"));
        System.out.println(agentaContatos.atualizarNumeroContato("Joaze", 864));
        agentaContatos.exibirContatos();
    }
}