/**
 * 
 */
package br.com.extrasupermercado.interfaces.negocio;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.extrasupermercado.classesBasicas.Produto;

public interface IControladorProduto
{
	// Métodos
	public String cadastrarProduto(Produto produto);

	public String alterarProduto(Produto produto);

	public List<Produto> consultarTodosProdutos();
	
	public Response consultarProdutoPorId(@PathParam("id") int produtoID);

	public Produto pesquisarProdutoPorNome(String nome);

	public List<Produto> consultarProdutosPorTipo(String tipo);

	public List<Produto> consultarProdutosPorSupermercado(int supermercado);

	public Produto pesquisarProdutoComParametros(String nome, String tipo, String marca);

	public List<Produto> pesquisarProdutoComParametrosLista(String nome, String tipo, String marca);

	public List<Produto> retornarProdutoPorNome(String nome);
}