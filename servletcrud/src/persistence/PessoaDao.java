package persistence;

import model.Pessoa;

public class PessoaDao extends Dao {
	public void create(Pessoa p) throws Exception
	{

		 open();

		 stmt = con.prepareStatement("INSERT INTO pessoa(nome, email, idade) VALUES(?,?,?)");

		 stmt.setString(1, p.getNome());
		 stmt.setString(2, p.getEmail());
		 stmt.setInt(3, p.getIdade());

		 stmt.execute();
		 close();
	 } 
}
