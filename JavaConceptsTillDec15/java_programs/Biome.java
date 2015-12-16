public enum Biome {
    Equatorial("\nEquatorial:"
            + "\nAlways moist"
            + "\nLittle temperature seasonality"
            + "\nEvergreen tropical rain forest"),

    Tropical("\nTropical:"
            + "\nSummer rainy season and cooler “winter” dry season"
            + "\nSeasonal forest, scrub, or savanna"),

    Subtropical("\nSubtropical:"
            + "\nHighly seasonal, arid climate"
            + "\nDesert vegetation with considerable exposed surface"),

    Mediterranean("\nMediterranean:"
            + "\nWinter rainy season and summer drought"
            + "\nSclerophyllous (drought-adapted), frost-sensitive shrublands and woodlands"),

    WarmTemperate("\nWarm temperate:"
            + "\nOccasional frost, often with summer rainfall maximum"
            + "\nTemperate evergreen forest, somewhat frost-sensitive"),

    Nemoral("\nNemoral:"
            + "\nModerate climate with winter freezing"
            + "\nFrost-resistant, deciduous, temperate forest"),

    Continental("\nContinental:"
            + "\nArid, with warm or hot summers and cold winters"
            + "\nGrasslands and temperate deserts"),

    Boreal("\nBoreal:"
            + "\nCold temperate with cool summers and long winters"
            + "\nEvergreen, frost-hardy, needle-leaved forest "),

    Polar("\nPolar:"
            + "\nShort, cool summers and long, cold winters"
            + "\nLow, evergreen vegetation, without trees, growing over permanently frozen soils");

    private final String biomeDescription;

    private Biome(String biomeDescription) {
        this.biomeDescription = biomeDescription;
    }

    String getDescription() {
        return biomeDescription;
    }

    public void printBiomes(Biome... arguments) {
        for (Biome biomeObject : arguments)
            System.out.println(biomeObject.getDescription());
    }
}
