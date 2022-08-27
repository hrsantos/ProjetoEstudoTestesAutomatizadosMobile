package pageObjects;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.google.android.keep:id/skip_welcome")
	private MobileElement botaoGetStarted;
	
	@AndroidFindBy(id = "com.google.android.keep:id/new_note_button")
	private MobileElement botaoNewTextNote;
	
	@AndroidFindBy(id = "com.google.android.keep:id/editable_title")
	private MobileElement campoTitle;
	
	@AndroidFindBy(id = "com.google.android.keep:id/edit_note_text")
	private MobileElement campoNote;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(accessibility = "Open navigation drawer")
	private MobileElement botaoMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ListView//android.widget.LinearLayout")
	private List<MobileElement> menus;
	
	@AndroidFindBy(id = "com.google.android.keep:id/settings_add_new_items_to_bottom")
	private MobileElement chaveSwitch;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='1']")
	private MobileElement editarNote;
	
	
	
	public void acionarBotaoGetStarted() {
		botaoGetStarted.click();
	}
	
	public void acionarBotaoNewTextNote() {
		botaoNewTextNote.click();
	}
	
	public void informarCampoTitle(String title) {
		campoTitle.sendKeys(title);
	}
	
	public void informarCampoNote(String note) {
		campoNote.sendKeys(note);
	}
	
	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}
	
	public void acionarBotaoMenu() {
		botaoMenu.click();
	}
	
	public void acionarBotaoSettings() {
		//System.out.println("indice " + menus.size());
		menus.get(6).click();
	}
	
	public void acionarChaveSwitch() {
		chaveSwitch.click();
		
	}
	
	public void acionarNotaCriada() {
		editarNote.click();
		
	}
	
	// xpath padrão mobile: //android.widget.EditText[@text='Title']
	
}