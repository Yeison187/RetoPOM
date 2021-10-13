package pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ModuloBuzzPage extends BasePage{
    private String optionBuzz = "//b[contains(text(),'Buzz')]";
    private String mostLikedPost = "//div[@id='rightBarHeadingMl']";
    private String threePost = "#likeRaw_1";
    private String likePost =   "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]";
    private String boxComment = "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/form[1]/textarea[1]";
    private String closeAlert = "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[1]/img[1]";
    private String buttonComment = "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[4]/div[1]/form[1]/div[2]/input[1]";
    private String listComments = "//ul[id='commentListNew_popShareId1']";
    private String share = "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[3]/div[2]/div[3]/a[1]/img[1]";
    private String confirmShare = "//body[1]/div[1]/div[3]/div[1]/div[6]/div[5]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]";
    private String messageConfirmShare = "//body[1]/div[1]/div[1]/div[4]/div[1]/div[4]";
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
        clickElement(closeAlert);
    }

    public void addComment(String criterio){
        write(boxComment,criterio);
        clickElement(buttonComment);
        clickElement(closeAlert);
    }

    public List<String> getComment(){
        List<WebElement> list = bringMeAllElements(listComments);
        List<String> stringFromList = new ArrayList<>();
        for (WebElement e : list){
            stringFromList.add(e.getText());
        }
        return stringFromList;
    }

    public void share(){
        clickElement(share);
    }

    public void confirmShare(){
        clickElement(confirmShare);
    }

    public String getMessageConfirmShare(){
        System.out.println(textFromElement(messageConfirmShare));
        return textFromElement(messageConfirmShare);
    }




}
