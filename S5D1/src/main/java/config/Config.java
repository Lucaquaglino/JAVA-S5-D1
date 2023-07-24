package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import S5D1.entities.AnanasDecorator;
import S5D1.entities.MargheritaPizza;
import S5D1.entities.Pizza;
import S5D1.entities.ProsciuttoDecorator;

@Configuration
public class Config {

	@Bean("margherita")
	Pizza margheritaPizza() {
		return new MargheritaPizza();
	}

	@Bean("prosciutto")
	Pizza prosciuttoDecorator() {
		return new ProsciuttoDecorator(margheritaPizza());
	}

	@Bean
	Pizza ananasDecorator() {
		return new AnanasDecorator(prosciuttoDecorator());
	}

	@Bean("hawaiian")
	Pizza hawaiianPizza() {
		return new AnanasDecorator(new ProsciuttoDecorator(new MargheritaPizza()));
	}
}
