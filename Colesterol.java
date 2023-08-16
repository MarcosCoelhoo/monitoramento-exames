import javax.swing.JOptionPane;

public class Colesterol extends Exame {
  private int qntHDL;
  private int qntLDL;
  private String riscoPaciente;

  public String classificarResultado(int hdl, int ldl) {
    int idade = 2023 - super.getAnoNascimento();
    String resultadoHDL = "";
    String resultadoLDL = "";

    if ((idade >= 0 && idade <= 19) && hdl > 45) {
      resultadoHDL = "HDL Bom";
    } else if (idade > 20 && hdl > 40) {
      resultadoHDL = "HDL Bom";
    } else {
      resultadoHDL = "HDL Ruim";
    }

    switch (riscoPaciente.toLowerCase()) {
      case "b":
        if (ldl < 100) {
          resultadoLDL = "LDL Bom";
        } else {
          resultadoLDL = "LDL Ruim";
        }
        break;
      case "m":
        if (ldl < 70) {
          resultadoLDL = "LDL Bom";
        } else {
          resultadoLDL = "LDL Ruim";
        }
        break;
      case "a":
        if (ldl < 50) {
          resultadoLDL = "LDL Bom";
        } else {
          resultadoLDL = "LDL Ruim";
        }
        break;
      default:
        break;
    }

    return resultadoHDL + " - " + resultadoLDL;
  }

  public void cadastrarExame() {
    super.cadastrarPaciente();

    this.qntHDL = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de HDL", "", 1));
    this.qntLDL = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade de LDL", "", 1));
    this.riscoPaciente = JOptionPane.showInputDialog(null, "Risco do paciente (B - Baixo; M - Medio; A - Alto)", "", 1);
  }

  public void mostrarResultado() {
    String classificacao = classificarResultado(this.qntHDL, this.qntLDL);

    String messagem = "Nome: " + super.getNome() + "\n" + "Resultado HDL: " + this.qntHDL + "\n" + "Resultado LDL: "
        + this.qntLDL + "\n" + "Resultado Risco: " + this.riscoPaciente + "\n" + "Classificacao: "
        + classificacao;

    JOptionPane.showMessageDialog(null, messagem, "", 1, null);
  }

}
