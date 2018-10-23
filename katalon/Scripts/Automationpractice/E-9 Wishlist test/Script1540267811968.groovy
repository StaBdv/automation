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

WebUI.click(findTestObject('Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Page_Login - My Store/input_Email address_email'), 'e-8test@testmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input_Password_passwd'), 'p4y+y39Ir5PJb2ispxT0Ew==')

WebUI.click(findTestObject('Page_Login - My Store/span_Sign in'))

WebUI.mouseOver(findTestObject('Page_My account - My Store/a_Dresses'))

WebUI.waitForElementVisible(findTestObject('Page_My account - My Store/a_Evening Dresses'), 2)

WebUI.click(findTestObject('Page_My account - My Store/a_Evening Dresses'))

WebUI.click(findTestObject('Page_Evening Dresses - My Store/img_Showing 1 - 1 of 1 item_re_2'))

WebUI.click(findTestObject('Page_Printed Dress - My Store/a_Add to wishlist'))

WebUI.click(findTestObject('Page_Evening Dresses - My Store/span_Henry  Ralston'))

WebUI.click(findTestObject('Page_My account - My Store/span_My wishlists'))

WebUI.click(findTestObject('Page_My Store/a_View'))

WebUI.verifyTextNotPresent('No products', false)

WebUI.click(findTestObject('Page_My Store/i_View_icon-remove'))

WebUI.closeBrowser()

