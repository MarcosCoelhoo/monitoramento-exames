import javax.swing.JOptionPane;

public class Triglicerideos extends Exame {
  private int qntTriglicerideos;

  public String classificarResultado() {
    int idade = 2023 - super.getAnoNascimento();
    String classificacao = "";

    if (idade > 0 && idade <= 9) {
      if (qntTriglicerideos < 75) {
        classificacao = "Triglicerideo Bom";
      } else {
        classificacao = "Triglicerideo Ruim";
      }
    }

    if (idade >= 10 && idade <= 19) {
      if (qntTriglicerideos < 90) {
        classificacao = "Triglicerideo Bom";
      } else {
        classificacao = "Triglicerideo Ruim";
      }
    }

    if (idade >= 20) {
      if (qntTriglicerideos < 150) {
        classificacao = "Triglicerideo Bom";
      } else {
        classificacao = "Triglicerideo Ruim";
      }
    }

    return classificacao;
  }

  public void cadastrarExame() {
    super.cadastrarPaciente();

    this.qntTriglicerideos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de Triglicerideos", "", 1));
  }

  public void mostrarResultado() {
    String classificacao = classificarResultado();

    String messagem = "Nome: " + super.getNome() + "\n" + "Resultado Triglicerideo: " + this.qntTriglicerideos + "\n"
        + "Classificacao: "
        + classificacao;

    JOptionPane.showMessageDialog(null, messagem, "", 1, null);
  }
}
