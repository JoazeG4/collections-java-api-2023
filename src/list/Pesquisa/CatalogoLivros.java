package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    //Attribute
    private final List<Livro> listLivro = new ArrayList<>();

    //Constructor
    public CatalogoLivros(){
    }

    public void adicionarLivro(String titulo, String autor, int ano){
        listLivro.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> novaListaPorAutor = new ArrayList<>();
        for(Livro l : listLivro){
            if (l.getAutor().equalsIgnoreCase(autor)){
                novaListaPorAutor.add(l);
            }
        }
        return novaListaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> novaListaPorAno = new ArrayList<>();
        for(Livro l : listLivro){
            if (anoInicial <= l.getAnoPublicacao() && l.getAnoPublicacao() <= anoFinal ){
                novaListaPorAno.add(l);
            }
        }
        return novaListaPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        for(Livro l : listLivro){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                return l;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Titulo 1", "Autor 2", 2001);
        catalogoLivros.adicionarLivro("Titulo 2", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Titulo 3", "Autor 3", 2003);
        catalogoLivros.adicionarLivro("Titulo 4", "Autor 4", 2004);
        catalogoLivros.adicionarLivro("Titulo 5", "Autor 5", 2005);
        catalogoLivros.adicionarLivro("Titulo 6", "Autor 6", 2006);
        catalogoLivros.adicionarLivro("Titulo 7", "Autor 7", 2007);

        System.out.println(catalogoLivros.listLivro);
        System.out.println(catalogoLivros.pesquisarPorTitulo("Titulo 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAnos(2000,2001));
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    }
}