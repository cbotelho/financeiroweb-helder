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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Empresa generated by hbm2java
 */
@Entity
@Table(name = "empresa", catalog = "financeiroweb")
public class Empresa implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private ContaBancaria contaBancaria;
	private Endereco endereco;
	private PlanoDeContas planoDeContas;
	private Contato contato;
	private String razao;
	private String fantasia;
	private String cnpj;
	private String cpf;
	private String ie;
	private String im;
	private Set<ClienteFornecedor> clienteFornecedors = new HashSet<ClienteFornecedor>(
			0);
	private Set<Funcionario> funcionarios = new HashSet<Funcionario>(0);

	public Empresa() {
	}

	public Empresa(ContaBancaria contaBancaria, Endereco endereco,
			PlanoDeContas planoDeContas, Contato contato, String razao,
			String fantasia, String cnpj, String cpf, String ie, String im) {
		this.contaBancaria = contaBancaria;
		this.endereco = endereco;
		this.planoDeContas = planoDeContas;
		this.contato = contato;
		this.razao = razao;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.ie = ie;
		this.im = im;
	}

	public Empresa(ContaBancaria contaBancaria, Endereco endereco,
			PlanoDeContas planoDeContas, Contato contato, String razao,
			String fantasia, String cnpj, String cpf, String ie, String im,
			Set<ClienteFornecedor> clienteFornecedors,
			Set<Funcionario> funcionarios) {
		this.contaBancaria = contaBancaria;
		this.endereco = endereco;
		this.planoDeContas = planoDeContas;
		this.contato = contato;
		this.razao = razao;
		this.fantasia = fantasia;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.ie = ie;
		this.im = im;
		this.clienteFornecedors = clienteFornecedors;
		this.funcionarios = funcionarios;
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
	@JoinColumn(name = "conta_id", nullable = false)
	public ContaBancaria getContaBancaria() {
		return this.contaBancaria;
	}

	public void setContaBancaria(ContaBancaria contaBancaria) {
		this.contaBancaria = contaBancaria;
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
	@JoinColumn(name = "plano_de_contas_id", nullable = false)
	public PlanoDeContas getPlanoDeContas() {
		return this.planoDeContas;
	}

	public void setPlanoDeContas(PlanoDeContas planoDeContas) {
		this.planoDeContas = planoDeContas;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empresa")
	public Set<ClienteFornecedor> getClienteFornecedors() {
		return this.clienteFornecedors;
	}

	public void setClienteFornecedors(Set<ClienteFornecedor> clienteFornecedors) {
		this.clienteFornecedors = clienteFornecedors;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "funcionario_has_empresa", catalog = "financeiroweb", joinColumns = { @JoinColumn(name = "empresa_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "funcionario_id", nullable = false, updatable = false) })
	public Set<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}

	public void setFuncionarios(Set<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
