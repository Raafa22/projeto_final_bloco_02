package projeto_final_bloco_01;

public  class Computadores {
	
	private String nome;
	private String marca;
    private double preco;
	public Computadores(String nome, String marca, double preco) {
			super();
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

}
