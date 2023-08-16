import javax.swing.JOptionPane;

public class Glicemia extends Exame {
  private int qntGlicose;

  public String classificarResultado() {
    String resultado = "";

    if (this.qntGlicose < 100) {
      resultado = "Normoglicemia";
      System.out.println(resultado);
    } else if (this.qntGlicose >= 100 && this.qntGlicose < 126) {
      resultado = "Pre-diabetes";
      System.out.println(resultado);
    } else if (this.qntGlicose >= 126) {
      resultado = "Diabetes estabelecida";
      System.out.println(resultado);
    }

    return resultado;
  }

  public void cadastrarExame() {
    super.cadastrarPaciente();

    this.qntGlicose = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de glicemia", "", 1));
  }

  public void mostrarResultado() {

    String classificacao = this.classificarResultado();

    String messagem = "Nome: " + super.getNome() + "\n" + "Resultado: " + this.qntGlicose + "\n" + "Classificacao: "
        + classificacao;

    JOptionPane.showMessageDialog(null, messagem, "", 1, null);
  }
}