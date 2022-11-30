

@test
Feature: Validar formulario de usuario
  Como usuario
  Quero enviar formulario
  Para validar o envio

  Scenario: Enviar formulario
   Given que esteja no formulario
   And preencho os dados pessoais
   And preencho os dados de endereco
   And preencho os dados de login
   When enviar
   Then formulario enviado com sucesso