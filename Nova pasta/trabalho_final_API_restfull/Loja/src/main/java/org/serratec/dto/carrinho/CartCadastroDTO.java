package org.serratec.dto.carrinho;

import java.util.ArrayList;
import java.util.List;

import org.serratec.exceptions.ClienteException;
import org.serratec.exceptions.ProdutoException;
import org.serratec.model.Carrinho;
import org.serratec.model.CarrinhoProduto;
import org.serratec.model.Cliente;
import org.serratec.repository.ClienteRepository;
import org.serratec.repository.ProdutoRepository;

public class CartCadastroDTO {

    private String user;

    private List<CarrinhoProdutoCadastroDTO> produtos = new ArrayList<>();

    public Carrinho toCarrinho(ProdutoRepository produtoRepository, ClienteRepository clienteRepository)
            throws ProdutoException, ClienteException {
        Carrinho carrinho = new Carrinho();

        Cliente cliente = clienteRepository.findByUsuario(this.user)
                .orElseThrow(() -> new ClienteException("Cliente não cadastrado."));

        carrinho.setCliente(cliente);

        for (CarrinhoProdutoCadastroDTO dto : produtos) {
            CarrinhoProduto pd = dto.toCarrinhoProduto(produtoRepository);
            pd.setCarrinho(carrinho);
            carrinho.getProdutos().add(pd);
        }

        return carrinho;
}

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<CarrinhoProdutoCadastroDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<CarrinhoProdutoCadastroDTO> produtos) {
        this.produtos = produtos;
    }

}