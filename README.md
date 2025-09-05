# Tecnologías & Versiones

Java: 17
Maven: 3.9.9
Serenity BDD: 4.x (via serenity-core, serenity-cucumber, serenity-junit)
Cucumber: 7.x
Selenium: 4.x
Patrón: Page Object Model (POM) con PageFactory
Navegadores: Chrome (por defecto), Firefox

1- Validar proyecto
mvn -q validate

2-Ejecutar toda la suite

# UI visible (Chrome por defecto)
mvn clean verify -Pui

# Headless (Chrome headless)
mvn clean verify -Pheadless

3-Ejecutar por tags

# Solo login (positivos + negativos)
mvn clean verify -Pui -Dcucumber.filter.tags='@login'

# Solo positivos de login
mvn clean verify -Pui -Dcucumber.filter.tags='@login and @positive'

# Solo negativos de login
mvn clean verify -Pui -Dcucumber.filter.tags='@login and @negative'

# Solo carrito
mvn clean verify -Pui -Dcucumber.filter.tags='@cart'


4- Ejecutar por nombre de navegador

# Chrome UI
mvn clean verify -Pui,chrome

# Firefox UI
mvn clean verify -Pui,firefox

# Chrome headless
mvn clean verify -Pheadless,chrome

# Firefox headless
mvn clean verify -Pheadless,firefox






