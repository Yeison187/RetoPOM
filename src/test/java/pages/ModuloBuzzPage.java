package pages;

public class ModuloBuzzPage extends BasePage{
    private String optionBuzz = "//b[contains(text(),'Buzz')]";
    private String mostLikedPost = "//div[@id='rightBarHeadingMl']";
    private String threePost = "#likeRaw_1";
    private String likePost =   "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]";
    private String boxComment = "";


    public ModuloBuzzPage(){
        super(driver);
    }

    public void clickBuzz(){
        maxWindow();
        clickElement(optionBuzz);
    }

    public void clickMostLikePost(){
        clickElement(mostLikedPost);
    }

    public void clickThreePost(){
        clickElementCss(threePost);
    }

    public void likePost(){
        clickElement(likePost);
    }

    public void agregarComentario(String criterio){
        System.out.println(criterio);
        write(boxComment,criterio);
    }



}
