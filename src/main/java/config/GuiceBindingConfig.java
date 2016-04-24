package config;


import com.google.inject.AbstractModule;
import handson.entities.Injectable;
import handson.entities.Product;

public class GuiceBindingConfig extends AbstractModule {

    @Override
    protected void configure() {
        bind(Injectable.class).to(Product.class);
    }

}
