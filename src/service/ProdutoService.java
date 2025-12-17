package service;

import model.Produto;

public class ProdutoService {

    private Produto[] produtos = new Produto[100];
    private int total = 0;

    public void cadastrarProduto(Produto p){
        if(total < produtos.length){
            produtos[total] = p;
            total++;
            System.out.println("Produto cadastrado com sucesso!");
        }else{
            System.out.println("Produto não cadastrado!");
        }
    }

    public Produto buscarPorId(int id){
        for(int i = 0; i < total; i++){
            if (produtos[i].getId() == id){
                return produtos[i];
            }
        }
        return null;
    }


    public void listarProduto(){
        if (total == 0){
            System.out.println("Nenhum produto!");
        }

        for (int i = 0; i < total; i++) {
            Produto p = produtos[i];
            System.out.println(
                    "ID: " + p.getId() +
                            " | Nome: " + p.getNome() +
                            " | Descrição: " + p.getDescricao() +
                            " | Valor: R$ " + p.getValor() +
                            " | Quantidade: " + p.getQuantidade()
            );
        }
    }

    public void removerProduto(int id){
        for (int i = 0; i < total ; i++){
            if (produtos[i].getId() == id){
                 produtos[i] = produtos[total - 1];
                 produtos[total - 1] = null;
                 total--;
                 System.out.println("Produto removido");
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void entradaProduto(int id, int quantidade) {
        Produto p = buscarPorId(id);
        if (p != null) {
            p.setQuantidade(p.getQuantidade() + quantidade);
            System.out.println("Entrando " + quantidade + " " + p.getNome());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void saidaProduto(int id, int quantidade) {
        Produto p = buscarPorId(id);
        if (p != null) {
            if (p.getQuantidade() >= quantidade) {
                p.setQuantidade(p.getQuantidade() - quantidade);
                System.out.println("Saíndo " + quantidade + " " + p.getNome());
            } else {
                System.out.println("Quantidade insuficiente em estoque. Quantidade atual: " + p.getQuantidade());
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

}



