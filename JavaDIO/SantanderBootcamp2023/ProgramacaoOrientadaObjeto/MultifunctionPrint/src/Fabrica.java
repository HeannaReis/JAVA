import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.Multifuncional;

public class Fabrica {
    public static void main(String[] args) throws Exception {
        Impressora impressora = new Multifuncional();
        Digitalizadora digitalizadora = new Multifuncional();
        Copiadora copiadora = new Multifuncional();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
