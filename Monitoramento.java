
public class Monitoramento {
  public static void main(String[] args) {
    Glicemia glicemiaFunc = new Glicemia();
    glicemiaFunc.cadastrarExame();
    glicemiaFunc.mostrarResultado();

    Colesterol colesterolFunc = new Colesterol();
    colesterolFunc.cadastrarExame();
    colesterolFunc.mostrarResultado();

    Triglicerideos triglicerideoFunc = new Triglicerideos();
    triglicerideoFunc.cadastrarExame();
    triglicerideoFunc.mostrarResultado();

  }

}