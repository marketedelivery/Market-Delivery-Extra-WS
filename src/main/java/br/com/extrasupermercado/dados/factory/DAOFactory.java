package br.com.extrasupermercado.dados.factory;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.extrasupermercado.dados.ProdutoDAO;
import br.com.extrasupermercado.dados.SupermercadoDAO;
import br.com.extrasupermercado.interfaces.dados.IProdutoDAO;
import br.com.extrasupermercado.interfaces.dados.ISupermercadoDAO;

public abstract class DAOFactory
{
	// Atributos
	private static final String UNIT_PERSISTENCE_NAME = "db_extra";

	private static EntityManagerFactory factory;

	public static ISupermercadoDAO supermercadoDAO;

	public static IProdutoDAO produtoDAO;
	// Construtores
	static
	{
		factory = Persistence.createEntityManagerFactory(UNIT_PERSISTENCE_NAME);
	}

	// Métodos
	public static ISupermercadoDAO getSupermercadoDAO()
	{
		supermercadoDAO = new SupermercadoDAO(factory.createEntityManager());
		return supermercadoDAO;
	}

	public static IProdutoDAO getProdutoDAO()
	{
		produtoDAO = new ProdutoDAO(factory.createEntityManager());
		return produtoDAO;
	}

	public static void close()
	{
		if (factory != null && factory.isOpen())
		{
			factory.close();
		}
	}
}