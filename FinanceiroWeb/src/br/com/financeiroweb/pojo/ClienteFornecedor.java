package br.com.financeiroweb.pojo;
// default package
// Generated 28/09/2014 14:04:16 by Hibernate Tools 4.0.0

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ClienteFornecedor generated by hbm2java
 */
@Entity
@Table(name = "cliente_fornecedor", catalog = "financeiroweb")
public class ClienteFornecedor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Empresa empresa;
	private Endereco endereco;
	private Contato contato;
	private String razao;
	private String fantasia;
	private String cnpj;
	private String cpf;
	private String ie;
	private String im;
	private Set<Movimento> movimentos = new HashSet<Movimento>(0);
	private Set<HistoricoMovimento> historicoMovimentos = new HashSet<HistoricoMovimento>(
			0);

	public ClienteFornecedor() {
	}

	public ClienteFornecedor(Empresa empresa, Endereco endereco,
			Contato contato, String razao, String fantasia, String cnpj,
			String cpf, String ie, String im) {
		this.empresa = empresa;
		this.endereco = endereco;
		this.contato = contato;
		this.razao = razao;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.ie = ie;
		this.im = im;
	}

	public ClienteFornecedor(Empresa empresa, Endereco endereco,
			Contato contato, String razao, String fantasia, String cnpj,
			String cpf, String ie, String im, Set<Movimento> movimentos,
			Set<HistoricoMovimento> historicoMovimentos) {
		this.empresa = empresa;
		this.endereco = endereco;
		this.contato = contato;
		this.razao = razao;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.ie = ie;
		this.im = im;
		this.movimentos = movimentos;
		this.historicoMovimentos = historicoMovimentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empresa_id", nullable = false)
	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "endereco_id", nullable = false)
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contato_id", nullable = false)
	public Contato getContato() {
		return this.contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Column(name = "razao", nullable = false, length = 200)
	public String getRazao() {
		return this.razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	@Column(name = "fantasia", nullable = false, length = 100)
	public String getFantasia() {
		return this.fantasia;
	}

	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}

	@Column(name = "cnpj", nullable = false, length = 13)
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Column(name = "cpf", nullable = false, length = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "ie", nullable = false, length = 8)
	public String getIe() {
		return this.ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	@Column(name = "im", nullable = false, length = 8)
	public String getIm() {
		return this.im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clienteFornecedor")
	public Set<Movimento> getMovimentos() {
		return this.movimentos;
	}

	public void setMovimentos(Set<Movimento> movimentos) {
		this.movimentos = movimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "clienteFornecedor")
	public Set<HistoricoMovimento> getHistoricoMovimentos() {
		return this.historicoMovimentos;
	}

	public void setHistoricoMovimentos(
			Set<HistoricoMovimento> historicoMovimentos) {
		this.historicoMovimentos = historicoMovimentos;
	}

}
