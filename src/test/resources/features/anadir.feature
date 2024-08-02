#author: Cristian Stiven Monsalve Ruiz
#language: es

@anadirCandidato
Característica: Contratar un candidato

  Yo como Analista de Calidad
  Quiero realizar una prueba en la funcionalidad de anadir un candidato
  Para verificar la funcionalidad de contratacion de un candidato

  Antecedentes:
    Dado "Cristian" abre ingresa el sitio de orange

  Escenario: Anadir un candidato
    Cuando ingresa los datos del candidato
    Y este pasa los filtros de contratacion
    Entonces el canditadto es contratado
