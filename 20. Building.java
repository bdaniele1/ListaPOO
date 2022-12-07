class Building implements InterfaceCarbonFootprint {
    int nPessoas;
    boolean energiarenovavel;
    int nlampadas;
    boolean arcondicionado;

    public Building(int nPessoas, boolean energiarenovavel, int nlampadas, boolean arcondicionado) {
        this.nPessoas = nPessoas;
        this.energiarenovavel = energiarenovavel;
        this.nlampadas = nlampadas;
        this.arcondicionado = arcondicionado;
    }

    @Override
    public String getCarbonFootprint() {
        System.out.println(nlampadas * nPessoas);

    }

}