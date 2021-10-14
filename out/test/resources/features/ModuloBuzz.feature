# new feature
# Tags: optional

Feature: Como usuario quiero dar clic al Most liked posts
  poder elegir un post para darle like; comentarlo; y compartirlo

  Scenario: dar like, comentar post y compartir post
    Given necesito dar like, comentar y compartir el tercer post mas comentado
    When abro el tercer post mas comentado
    Then podre dar like, comentar: La vida es elegir, puedes elegir ser una víctima o cualquier otra cosa que te propongas. EL GUERRERO PACÍFICO y compartir
