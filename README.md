serenity-pom-cucumber · Demo Saucedemo 

Automatización Web UI con Serenity BDD + Cucumber + Selenium usando Page Object Model (PageFactory).
Incluye casos de Login (positivo/negativo) y Agregar producto al carrito.

Tecnologías & Versiones

Java 17
Maven 3.9.9
Serenity BDD 4.x (core, cucumber, junit)
Cucumber 7.x
Selenium 4.x
Patrón: Page Object Model (POM)
Navegadores: Chrome (por defecto), Firefox

serenity-pom-cucumber/
├─ pom.xml
├─ serenity.properties
├─ README.md
└─ src
└─ test
├─ java
│  └─ saucedemo
│     ├─ hooks/              # WebDriverHooks (NO forzar navegador)
│     ├─ pages/              # PageObjects (POM)
│     ├─ steps/              # Librerías de pasos (negocio + asserts)
│     ├─ stepdefinitions/    # Glue de Cucumber (mínimo)
│     └─ runners/            # Runner con CucumberWithSerenity
└─ resources
├─ features/
│  ├─ auth/login.feature
│  └─ cart/add_product_to_cart.feature
├─ cucumber.properties
└─ serenity.conf


Comandos

Validar proyecto = mvn -q validate

Ejecutar toda la suite

# Chrome (por defecto)
mvn clean verify

# Firefox
mvn clean verify -Dwebdriver.driver=firefox


Headless

# Chrome headless
mvn clean verify -Dwebdriver.driver=chrome  -Dheadless.mode=true

# Firefox headless
mvn clean verify -Dwebdriver.driver=firefox -Dheadless.mode=true

Por tags

# Solo login (positivos + negativos)
mvn clean verify -Dcucumber.filter.tags='@login'

# Solo positivos de login
mvn clean verify -Dcucumber.filter.tags='@login and @positive'

# Solo negativos de login
mvn clean verify -Dcucumber.filter.tags='@login and @negative'

# Solo carrito
mvn clean verify -Dcucumber.filter.tags='@cart'

Por nombre de escenario / por feature

# Por nombre (o parte del nombre) del escenario
mvn clean verify -Dcucumber.filter.name='Agregar productos específicos al carrito'

# Por archivo feature
mvn clean verify -Dcucumber.features='src/test/resources/features/cart/add_product_to_cart.feature'

Reporte

# Abrir reporte HTML de Serenity (Windows)
explorer.exe target/site/serenity/index.html







