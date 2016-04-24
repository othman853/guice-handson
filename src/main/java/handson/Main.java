package handson;

import com.google.inject.Guice;
import com.google.inject.Injector;
import handson.entities.DependentEntity;

public class Main {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector();

        DependentEntity entity = injector.getInstance(DependentEntity.class);

        entity.printDependencyDetails();
    }

}
