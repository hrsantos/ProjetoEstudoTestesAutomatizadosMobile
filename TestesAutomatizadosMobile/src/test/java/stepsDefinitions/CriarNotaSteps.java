package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CriarNotaSteps {
	
	TelaInicialPage telaInicial = new TelaInicialPage(driver);
	
	@Dado("que eu aciono o botao get started")
	public void queEuAcionoOBotaoGetStarted() {
	    telaInicial.acionarBotaoGetStarted();
	}
	
	@Quando("^eu acionar no botao New text note$")
	public void euAcionarNoBotaoNewTextNote() throws Throwable {
		telaInicial.acionarBotaoNewTextNote();
	}
	
	@Quando("eu informa no campo title {string}")
	public void euInformaNoCampoTitle(String title) {
	    telaInicial.informarCampoTitle(title);
	}

	@Quando("eu eu informa no campo nota {string}")
	public void euEuInformaNoCampoNota(String note) {
	   telaInicial.informarCampoNote(note);
	}

	@Quando("eu acionar o botao voltar")
	public void euAcionarOBotaoVoltar() {
	    telaInicial.acionarBotaoVoltar();
	}

	@Entao("o aplicativo cadastra a nota com o titulo {string}")
	public void oAplicativoCadastraANotaComOTitulo(String title) {
	    assertEquals(title, driver.findElement(By.id("com.google.android.keep:id/editable_title")).getText());
	}
	
	@Quando("eu acionar o menu")
	public void euAcionarOMenu() {
	    telaInicial.acionarBotaoMenu();
	}

	@Quando("eu acionar a aba setting")
	public void euAcionarAAbaSetting() {
	    telaInicial.acionarBotaoSettings();
	}

	@Quando("eu eu tocar no switch")
	public void euEuTocarNoSwitch() {
	    telaInicial.acionarChaveSwitch();
	}

	@Entao("o switch fica desabilitado")
	public void oSwitchFicaDesabilitado() {
	    assertEquals("false", driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	    //System.out.println(driver.findElement(By.id("com.google.android.keep:id/settings_add_new_items_to_bottom")).getAttribute("checked"));
	}

	@Quando("^eu acionar a nota$")
	public void euAcionarANota() throws Throwable {
		telaInicial.acionarNotaCriada();
	}

	
}
