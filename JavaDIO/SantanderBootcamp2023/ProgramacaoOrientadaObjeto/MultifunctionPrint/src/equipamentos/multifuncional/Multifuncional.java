package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Impressora, Digitalizadora{

    @Override
    public void digitalizar() {
        System.out.println("\nMultifuncional Executando 'digitalizar'");
    }

    @Override
    public void imprimir() {
        System.out.println("\nMultifuncional Executando 'imprimir'");
    }

    @Override
    public void copiar() {
        System.out.println("\nMultifuncional Executando 'copiar'");
    }
    
    
}
