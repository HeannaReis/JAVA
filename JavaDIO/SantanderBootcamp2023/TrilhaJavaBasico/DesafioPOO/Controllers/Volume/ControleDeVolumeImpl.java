package DesafioPOO.Controllers.Volume;

public class ControleDeVolumeImpl implements IControleDeVolume {
    private int volume; // Atributo para armazenar o volume

    public ControleDeVolumeImpl() {
        this.volume = 50; // Volume inicial
    }

    @Override
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    @Override
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}
