package handson.entities;

import javax.inject.Inject;

public class DependentEntity {

    private Product productDependency;

    @Inject
    public DependentEntity(Product productDependency) {
        this.productDependency = productDependency;
    }

    public void printDependencyDetails() {
        System.out.println(productDependency.toString());
    }
}
