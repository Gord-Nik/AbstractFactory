abstract class AbstractDinnerFactory {
    abstract ComplexDinner getComplexDinner();

    static ComplexDinner getComplexDinnerSelectedCuisine(String cuisineName) {
        if (cuisineName.equalsIgnoreCase("French")) return new FrenchDinnerFactory().getComplexDinner();
        if (cuisineName.equalsIgnoreCase("Japan")) return new JapanDinnerFactory().getComplexDinner();
        else return new JapanDinnerFactory().getComplexDinner();
    }
}
