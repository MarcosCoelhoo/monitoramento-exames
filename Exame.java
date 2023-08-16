import javax.swing.JOptionPane;

public class Exame {
  private String nome;
  private String tipoSangue;
  private int anoNascimento;

  public String getNome() {
    return this.nome;
  }

  public String getTipoSangue() {
    return this.tipoSangue;
  }

  public int getAnoNascimento() {
    return this.anoNascimento;
  }

  public void cadastrarPaciente() {
    this.nome = JOptionPane.showInputDialog(null, "Seu nome", "", 1);
    this.tipoSangue = JOptionPane.showInputDialog(null, "Tipo sanguineo", "", 1);
    this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ano de nascimento", "", 1));

  }
}
