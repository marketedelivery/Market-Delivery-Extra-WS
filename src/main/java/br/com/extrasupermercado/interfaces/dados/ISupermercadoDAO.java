package br.com.extrasupermercado.interfaces.dados;

import br.com.extrasupermercado.classesBasicas.Supermercado;

public interface ISupermercadoDAO extends IDAOGenerico<Supermercado>
{
	public Supermercado pesquisarSupermercadoPorNome(String nome);

	public Supermercado pesquisarSupermercadoPorCNPJ(String cnpj);
}