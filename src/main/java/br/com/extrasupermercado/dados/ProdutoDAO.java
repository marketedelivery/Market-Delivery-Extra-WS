package br.com.extrasupermercado.dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.extrasupermercado.classesBasicas.Produto;
import br.com.extrasupermercado.interfaces.dados.IProdutoDAO;

public class ProdutoDAO extends DAOGenerico<Produto> implements IProdutoDAO
{
	EntityManager manager;

	// Construtores
	public ProdutoDAO(EntityManager em)
	{
		super(em);
		this.manager = em;
	}

	// Métodos
	public Produto pesquisarProdutoPorNome(String nome)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.nome LIKE :N";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("N", nome);
		Produto resultado;
		try
		{
			resultado = retorno.getSingleResult();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	// Método não usado
	public Produto pesquisarProdutoPorMarca(String marca)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.nome = :N";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("N", marca);
		Produto resultado;
		try
		{
			resultado = retorno.getSingleResult();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public List<Produto> pesquisarProdutoPorSupermercado(int supermercado)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.supermercado.codigo = :codigo";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("codigo", supermercado);
		try
		{
			List<Produto> resultado = retorno.getResultList();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public List<Produto> consultarProdutosPorTipo(String tipo)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.tipo LIKE :tipo";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("tipo", "%" + tipo + "%");
		try
		{
			List<Produto> resultado = retorno.getResultList();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public Produto pesquisarProdutoComParametros(String nome, String tipo, String marca)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.nome =:nome AND p.tipo =:tipo AND p.marca =:marca";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("nome", nome);
		retorno.setParameter("tipo", tipo);
		retorno.setParameter("marca", marca);
		Produto resultado;
		try
		{
			resultado = retorno.getSingleResult();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public List<Produto> pesquisarProdutoComParametrosLista(String nome, String tipo, String marca)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.nome =:nome AND p.tipo =:tipo AND p.marca =:marca";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("nome", nome);
		retorno.setParameter("tipo", tipo);
		retorno.setParameter("marca", marca);
		List<Produto> resultados;
		try
		{
			resultados = retorno.getResultList();
			return resultados;
		}
		catch (Exception e)
		{
			return null;
		}
	}

	public List<Produto> retornarProdutoPorNome(String nome)
	{
		String consulta = "SELECT p FROM Produto p WHERE p.nome LIKE :N";
		TypedQuery<Produto> retorno = getEntityManager().createQuery(consulta, Produto.class);
		retorno.setParameter("N","%" + nome + "%");
		List<Produto> resultado;
		try
		{
			resultado = retorno.getResultList();
			return resultado;
		}
		catch (Exception e)
		{
			return null;
		}
		finally
		{
			manager.close();
		}
	}
}