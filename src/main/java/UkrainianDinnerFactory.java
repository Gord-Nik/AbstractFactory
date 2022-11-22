public class UkrainianDinnerFactory extends AbstractDinnerFactory {
    private Cuisine cuisine = new UkrainianCuisine();
    @Override
    public ComplexDinner getComplexDinner() {
        return new ComplexDinner(cuisine.getFirstDish(), cuisine.getSecondDish(), cuisine.getDessert());
    }
}
