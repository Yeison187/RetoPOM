package steps;

import io.cucumber.java.en.*;
import pages.ModuloBuzzPage;

public class ModuloBuzzSteps {
    ModuloBuzzPage buzzPage = new ModuloBuzzPage();

    @Given("Estoy en la ventana emergente del tercer post más comentado")
    public void estoy_en_la_ventana_emergente_del_tercer_post_más_comentado() {
        buzzPage.clickBuzz();
        buzzPage.clickMostLikePost();
        buzzPage.clickThreePost();

    }

    @When("doy click en el corazón")
    public void doy_click_en_el_corazón() {
        buzzPage.likePost();
    }
    @Then("el corazón debe cambiar el color: de gris a naranja")
    public void el_corazón_debe_cambiar_el_color_de_gris_a_naranja() {

    }

    @When("^escribo en la caja: (.+)$")
    public void escribo_en_la_caja_de_comentario(String comentario) {
     buzzPage.agregarComentario(comentario);
        System.out.println(comentario);
    }
    @When("doy clic en el boton Comment")
    public void doy_clic_en_el_boton_comment() {

    }
    @Then("se debe agregar a la lista, el nuevo comentario.")
    public void se_debe_agregar_a_la_lista_el_nuevo_comentario() {

    }


    @When("doy clic en el boton share \\(Compartir)")
    public void doy_clic_en_el_boton_share_compartir() {

    }
    @When("confirmo que deseo compartir, dando clic el boton share \\(Compartir)")
    public void confirmo_que_deseo_compartir_dando_clic_el_boton_share_compartir() {

    }
    @Then("debe aparece el aviso Success! Successfully")
    public void debe_aparece_el_aviso_success_successfully() {

    }




}