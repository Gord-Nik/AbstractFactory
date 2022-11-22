public class JapanDinnerFactory extends AbstractDinnerFactory {
    private Cuisine cuisine = new JapanCuisine();
    @Override
    public ComplexDinner getComplexDinner() {
        return new ComplexDinner(cuisine.getFirstDish(), cuisine.getSecondDish(), cuisine.getDessert());
    }

}
