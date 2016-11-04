/**
 * 
 */
package br.com.extrasupermercado.interfaces.negocio;

import java.util.List;

import br.com.extrasupermercado.classesBasicas.Supermercado;

/**
 * @author Audry Martins
 *
 */
public interface IControladorSupermercado
{
	// Métodos
	public String cadastrarSupermercado(Supermercado supermercado);

	public String alterarSupermercado(Supermercado supermercado);

	public List<Supermercado> consultarTodosSupermercados();

	public Supermercado pesquisarSupermercadoPorNome(String nome);

	public Supermercado pesquisarSupermercadoPorCodigo(int codigo);
}