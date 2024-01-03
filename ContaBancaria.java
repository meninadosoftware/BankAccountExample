package contabancaria;

/**
 *
 * @author camila
 */
public class ContaBancaria {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(11111);
        p1.setDono("Jane ");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Spencer");
        p2.abrirConta("CP");
        p2.depositar(300);
        p2.sacar(100);
        
        p1.statusAtual();
        p2.statusAtual();
    }
    
}
