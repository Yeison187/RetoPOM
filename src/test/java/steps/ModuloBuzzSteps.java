package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ModuloBuzzPage;

import java.util.List;

public class ModuloBuzzSteps {
    ModuloBuzzPage buzzPage = new ModuloBuzzPage();

    @Given("necesito dar like, comentar y compartir el tercer post mas comentado")
    public void necesitoDarLikeComentarYCompartirElTercerPostMasComentado() {
        buzzPage.clickBuzz();
        buzzPage.clickMostLikePost();
    }
    @When("abro el tercer post mas comentado")
    public void clikPost() {
        buzzPage.clickThreePost();
    }
    @Then("^podre dar like, comentar: (.+) y compartir$")
    public void addLikeCommentShere(String comentario) {
        buzzPage.likePost();

        if (buzzPage.like()) {
            System.out.println("El icono corazon esta de color naranja");
        } else {
            System.out.println("El icono corazon esta de color gris");
        }

        buzzPage.writeBoxComment(comentario);
        buzzPage.addComment();
        List<String> list = buzzPage.getComment();
        boolean textIsThere = list.contains(comentario);

        if (textIsThere) {
            System.out.println("Se agrego el comentario correctamente");
        } else {
            System.out.println("No se pudo agregar el comentario");
        }

        buzzPage.share();
        buzzPage.confirmShare();
    }


}
