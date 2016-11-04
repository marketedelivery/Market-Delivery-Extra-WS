/**
 * 
 */
package br.com.extrasupermercado.util;

/**
 * @author Audry Martins
 *
 */
public class Mensagens
{
	private String msg_produto_cadastrado_com_sucesso;

	private String msg_produto_alterado_com_sucesso;

	private String msg_produto_excluido_com_sucesso;

	private String msg_supermercado_cadastrado_com_sucesso;

	private String msg_supermercado_alterado_com_sucesso;

	private String msg_supermercado_excluido_com_sucesso;

	// Validação de campos
	private String msg_campo_invalido;

	/**
	 * 
	 */
	public Mensagens()
	{
		super();
		this.msg_produto_cadastrado_com_sucesso = "O produto foi cadastrado com sucesso.";
		this.msg_produto_alterado_com_sucesso = "O produto foi alterado com sucesso.";
		this.msg_produto_excluido_com_sucesso = "O produto foi excluido com sucesso.";
		this.msg_supermercado_cadastrado_com_sucesso = "O supermercado foi cadastrado com sucesso.";
		this.msg_supermercado_alterado_com_sucesso = "O supermercado foi alterado com sucesso.";
		this.msg_supermercado_excluido_com_sucesso = "O supermercado foi excluido com sucesso.";
		this.msg_campo_invalido = "O(s) campo(s) a seguir não está(ão) preenchido(s): ";
	}

	/**
	 * @param msg_produto_cadastrado_com_sucesso
	 * @param msg_produto_alterado_com_sucesso
	 * @param msg_produto_excluido_com_sucesso
	 * @param msg_supermercado_cadastrado_com_sucesso
	 * @param msg_supermercado_alterado_com_sucesso
	 * @param msg_supermercado_excluido_com_sucesso
	 * @param msg_campo_invalido
	 */
	public Mensagens(String msg_produto_cadastrado_com_sucesso, String msg_produto_alterado_com_sucesso,
			String msg_produto_excluido_com_sucesso, String msg_supermercado_cadastrado_com_sucesso,
			String msg_supermercado_alterado_com_sucesso, String msg_supermercado_excluido_com_sucesso,
			String msg_campo_invalido)
	{
		super();
		this.msg_produto_cadastrado_com_sucesso = msg_produto_cadastrado_com_sucesso;
		this.msg_produto_alterado_com_sucesso = msg_produto_alterado_com_sucesso;
		this.msg_produto_excluido_com_sucesso = msg_produto_excluido_com_sucesso;
		this.msg_supermercado_cadastrado_com_sucesso = msg_supermercado_cadastrado_com_sucesso;
		this.msg_supermercado_alterado_com_sucesso = msg_supermercado_alterado_com_sucesso;
		this.msg_supermercado_excluido_com_sucesso = msg_supermercado_excluido_com_sucesso;
		this.msg_campo_invalido = msg_campo_invalido;
	}

	// Gets e Sets
	/**
	 * @return the msg_produto_cadastrado_com_sucesso
	 */
	public String getMsg_produto_cadastrado_com_sucesso()
	{
		return msg_produto_cadastrado_com_sucesso;
	}

	/**
	 * @return the msg_produto_alterado_com_sucesso
	 */
	public String getMsg_produto_alterado_com_sucesso()
	{
		return msg_produto_alterado_com_sucesso;
	}

	/**
	 * @return the msg_produto_excluido_com_sucesso
	 */
	public String getMsg_produto_excluido_com_sucesso()
	{
		return msg_produto_excluido_com_sucesso;
	}

	/**
	 * @return the msg_supermercado_cadastrado_com_sucesso
	 */
	public String getMsg_supermercado_cadastrado_com_sucesso()
	{
		return msg_supermercado_cadastrado_com_sucesso;
	}

	/**
	 * @return the msg_supermercado_alterado_com_sucesso
	 */
	public String getMsg_supermercado_alterado_com_sucesso()
	{
		return msg_supermercado_alterado_com_sucesso;
	}

	/**
	 * @return the msg_supermercado_excluido_com_sucesso
	 */
	public String getMsg_supermercado_excluido_com_sucesso()
	{
		return msg_supermercado_excluido_com_sucesso;
	}

	/**
	 * @return the msg_campo_invalido
	 */
	public String getMsg_campo_invalido()
	{
		return msg_campo_invalido;
	}
}