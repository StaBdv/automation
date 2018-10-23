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

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

int RN

RN = ((Math.random() * 10000) as int)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_crea'), ('testreg' + RN) + 
    '@mail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'User')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-1234567891011121314151'), '2', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAp'), '1', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-2018201720162015201420'), '1980', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__firstname'), 'Test')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__lastname'), 'User')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), '3004 Baker Avenue')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Westland')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaAr'), '38', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '153567')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '817-803-6082')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'My address3004  Baker Avenue')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.delay(2)

'Verify successfull message presented'
WebUI.verifyTextPresent('The Zip/Postal code you\'ve entered is invalid. It must follow this format: 00000', false)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '15567')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.delay(2)

'Verify successfull message presented'
WebUI.verifyTextPresent('Welcome to your account. Here you can manage all of your personal information and orders.', false)

WebUI.closeBrowser()

