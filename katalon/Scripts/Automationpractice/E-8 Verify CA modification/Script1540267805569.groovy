import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Page_My Store/a_Sign in (1)'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email'), 'e-8test@testmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in'))

WebUI.click(findTestObject('Page_My account - My Store/span_My addresses'))

WebUI.click(findTestObject('Page_Addresses - My Store/span_Delete'))

'Switch to window that has title \'Addressess - My Store\''
not_run: WebUI.switchToWindowTitle('Addressess - My Store')

WebUI.acceptAlert()

WebUI.refresh()

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('No addresses are available. ', false)

WebUI.click(findTestObject('Page_Addresses - My Store/span_Add a new address'))

WebUI.setText(findTestObject('Page_Address - My Store/input__postcode'), '77411')

WebUI.selectOptionByValue(findTestObject('Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), '43', true)

WebUI.setText(findTestObject('Page_Address - My Store/input__city'), 'Alief')

WebUI.setText(findTestObject('Page_Address - My Store/input__address1'), '2078  Private Lane')

WebUI.setText(findTestObject('Page_Address - My Store/input__phone_mobile'), '817-829-2937')

WebUI.setText(findTestObject('Page_Address - My Store/input__phone'), '229-253-4172')

WebUI.click(findTestObject('Page_Address - My Store/span_Save'))

WebUI.verifyTextNotPresent('No addresses are available', false)

WebUI.click(findTestObject('Page_Addresses - My Store/a_Sign out'))

WebUI.verifyTextPresent('AUTHENTICATION', false)

WebUI.closeBrowser()

