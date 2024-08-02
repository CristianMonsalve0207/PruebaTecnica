# author: Cristian Stiven Monsalve Ruiz
# language: es
# se procede a crear la estructura, prosa y gramatica del gherkin en español, por buenas practicas.

@authenticationLogin
Característica: Autenticación exitosa

  Yo como Analista de Calidad de pruebas automatizadas
  Quiero realizar una prueba de autenticación al sitio web de orange
  Para comprobar la robustes y control de errores del aplicativo web, funcione correctamente


  Antecedentes:
    Dado "Cristian" abre el sitio web de pruebas

  @authenticationSuccess
  Escenario: Autenticación de usuario exitosa.
    Cuando ingresa las credenciales
    Entonces visualizara el home y espera una validacion

    @authenticationFail
    Escenario: Autenticación de usuario fallida.
    Cuando ingresa las credenciales incorrectas
    Entonces visualizara el mensaje de error

