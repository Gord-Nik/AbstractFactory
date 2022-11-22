public class FrenchDinnerFactory extends AbstractDinnerFactory {
    private Cuisine cuisine = new FrenchCuisine();
    @Override
    public ComplexDinner getComplexDinner() {
        return new ComplexDinner(cuisine.getFirstDish(), cuisine.getSecondDish(), cuisine.getDessert());
    }

}
