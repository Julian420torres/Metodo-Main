class Felinos implements Animal {
    private String nombreCientifico;
    private String sonido;
    private String alimentos;
    private String habitat;

    public Felinos(String nombreCientifico, String sonido, String alimentos, String habitat) {
        this.nombreCientifico = nombreCientifico;
        this.sonido = sonido;
        this.alimentos = alimentos;
        this.habitat = habitat;
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }
}
