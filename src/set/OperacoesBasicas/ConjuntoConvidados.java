package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private final Set<Convidado> convidadoSet = new HashSet<>();

    public ConjuntoConvidados(){}

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidado(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Nome 1", 1);
        conjuntoConvidados.adicionarConvidado("Nome 2", 2);
        conjuntoConvidados.adicionarConvidado("Nome 3", 3);
        conjuntoConvidados.adicionarConvidado("Nome 4", 4);
        System.out.println(conjuntoConvidados.contarConvidado());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        System.out.println(conjuntoConvidados.contarConvidado());
        conjuntoConvidados.exibirConvidados();
    }
}
