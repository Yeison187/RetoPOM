package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ModuloBuzzPage;

import java.util.List;

public class ModuloBuzzSteps {
    ModuloBuzzPage buzzPage = new ModuloBuzzPage();

    @Given("Estoy en la ventana emergente del tercer post más comentado")
    public void post() {
        buzzPage.clickBuzz();
        buzzPage.clickMostLikePost();
        buzzPage.clickThreePost();

    }

    @When("doy click en el corazón")
    public void addLike() {
        buzzPage.likePost();
    }

    @Then("el corazón debe cambiar el color: de gris a naranja")
    public void stateLike() {
        if (buzzPage.like()) {
            System.out.println("El icono corazon esta de color naranja");
        } else {
            System.out.println("El icono corazon esta de color gris");
        }
    }

    @When("^escribo en la caja: (.+)$")
    public void writeBoxComment(String comentario) {
        buzzPage.writeBoxComment(comentario);
    }

    @When("doy clic en el boton Comment")
    public void clickButtonComment() {
        buzzPage.addComment();
    }

    @Then("^se debe agregar a la lista, (.+)$")
    public void viewComment(String comentario) {
        List<String> list = buzzPage.getComment();
        boolean textIsThere = list.contains(comentario);

        if (textIsThere) {
            System.out.println("Se agrego el comentario correctamente");
        } else {
            System.out.println("No se pudo agregar el comentario");
        }
    }


    @When("doy clic en el boton share \\(Compartir)")
    public void clickButtonShare() {
        buzzPage.share();
    }

    @When("confirmo que deseo compartir, dando clic el boton share \\(Compartir)")
    public void confirmShare() {
        buzzPage.confirmShare();
    }

    @Then("^debe aparece el aviso Successfully Shared$")
    public void confirmMessage() {
        buzzPage.validateShare();
    }


}
