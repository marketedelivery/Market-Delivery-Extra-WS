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
	public Response cadastrarProduto(Produto produto);

	public Response alterarProduto(Produto produto);

	public Response consultarTodosProdutos();
	
	public Response consultarProdutoPorId(@PathParam("id") int produtoID);

	public Response pesquisarProdutoPorNome(String nome);

	public Response consultarProdutosPorTipo(String tipo);

	public Response consultarProdutosPorSupermercado(int supermercado);

	public Produto pesquisarProdutoComParametros(String nome, String tipo, String marca);

	public List<Produto> pesquisarProdutoComParametrosLista(String nome, String tipo, String marca);

	public Response retornarProdutoPorNome(String nome);
}