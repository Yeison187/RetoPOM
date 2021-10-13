# new feature
# Tags: optional

Feature: Como usuario quiero dar clic al Most liked posts
  poder elegir un post para darle like; comentarlo; y compartirlo

  Background: Tercer post
    Given Estoy en la ventana emergente del tercer post más comentado

  Scenario: dar like
    When doy click en el corazón
    Then el corazón debe cambiar el color: de gris a naranja

  Scenario: comentar post
    When escribo en la caja: La vida es elegir, puedes elegir ser una víctima o cualquier otra cosa que te propongas. EL GUERRERO PACÍFICO
    And doy clic en el boton Comment
    Then se debe agregar a la lista, el nuevo comentario.

    Scenario: compartir post
      When doy clic en el boton share (Compartir)
      And confirmo que deseo compartir, dando clic el boton share (Compartir)
      Then debe aparece el aviso Success! Successfully


