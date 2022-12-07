class Computadores {
    String modelo, memoria, armazenamento, processador, placaVideo;

    public static void main(String[] args) {
    }

    public Computadores(String modelo, String memoria, String armazenamento, String processador, String placaVideo) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.placaVideo = placaVideo;
    }

    public String getmodelo() {
        return modelo;

    }

    public String getmemoria() {
        return memoria;
    }

    public String getarmazenamento() {
        return armazenamento;
    }

    public String getprocessador() {
        return processador;
    }

    public String getplacaVideo() {
        return placaVideo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }

    public void setmemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setarmazenamento(String armazenamnto) {
        this.armazenamento = armazenamnto;
    }

    public void setprocessador(String processador) {
        this.processador = processador;
    }

    public void setplacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public void cadastrarComputador(String modelo, String memoria, String armazenamento, String processador,
            String placaVideo) {

    }

    public void removerComputador(String modelo) {

    }

    public void upgrade(String memoria, String armazenamento, String processador, String placaVideo) {

    }
}
