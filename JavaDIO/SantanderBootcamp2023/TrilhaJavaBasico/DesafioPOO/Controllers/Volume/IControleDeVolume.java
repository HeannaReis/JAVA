package DesafioPOO.Controllers.Volume;

public interface IControleDeVolume {
    public void aumentarVolume();
    public void diminuirVolume();
    public int getVolume();
    public void setVolume(int novoVolume); // Adicionando o método setVolume
}
