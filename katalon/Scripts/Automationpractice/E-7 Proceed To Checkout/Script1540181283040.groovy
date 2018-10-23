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

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.setText(findTestObject('Object Repository/Page_My Store/input_Call us now_search_query (1) (1)'), 'Dress')

WebUI.click(findTestObject('Object Repository/Page_My Store/button_Search (1) (1)'))

WebUI.mouseOver(findTestObject('Page_Search - My Store/img_Showing 1 - 7 of 7 items_r (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Search - My Store/span_Add to cart'), 2)

WebUI.click(findTestObject('Page_Search - My Store/span_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Page_Search - My Store/Proceed to checkout'), 2)

WebUI.click(findTestObject('Page_Search - My Store/Proceed to checkout'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/Proceed to checkout 2'), 2)

WebUI.click(findTestObject('Page_Order - My Store/Proceed to checkout 2'))

int RN

RN = ((Math.random() * 10000) as int)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_crea'), ('test' + RN) + 
    '@mail.com')

WebUI.click(findTestObject('Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Page_Login - My Store/input__customer_firstname'), 'Test')

WebUI.setText(findTestObject('Page_Login - My Store/input__customer_lastname'), 'User')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/input__passwd'), 'ZhoXY4AqUcFX7MOTc35DtQ==')

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/select_-1234567891011121314151'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/select_-JanuaryFebruaryMarchAp'), '1', true)

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/select_-2018201720162015201420'), '1980', true)

WebUI.setText(findTestObject('Page_Login - My Store/input__firstname'), 'Test')

WebUI.setText(findTestObject('Page_Login - My Store/input__lastname'), 'User')

WebUI.setText(findTestObject('Page_Login - My Store/input__address1'), '107  Columbia Mine Road')

WebUI.setText(findTestObject('Page_Login - My Store/input__city'), 'Martinsburg')

WebUI.selectOptionByValue(findTestObject('Page_Login - My Store/select_-AlabamaAlaskaArizonaAr'), '48', true)

WebUI.setText(findTestObject('Page_Login - My Store/input__postcode'), '25401')

WebUI.setText(findTestObject('Page_Login - My Store/input__phone_mobile'), '304-671-7539')

WebUI.setText(findTestObject('Page_Login - My Store/input__alias'), '107  Columbia Mine Road')

WebUI.click(findTestObject('Page_Login - My Store/span_Register'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/Proceed to checkout 3'), 2)

WebUI.click(findTestObject('Page_Order - My Store/Proceed to checkout 3'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/input_2.00_cgv'), 2)

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/input_2.00_cgv'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/Proceed to checkout 4'), 2)

WebUI.click(findTestObject('Page_Order - My Store/Proceed to checkout 4'))

WebUI.waitForElementVisible(findTestObject('Page_Order - My Store/a_Pay by check (order processi'), 2)

WebUI.click(findTestObject('Object Repository/Page_Order - My Store/a_Pay by check (order processi'))

WebUI.click(findTestObject('Object Repository/Page_My Store/span_I confirm my order'))

WebUI.click(findTestObject('Object Repository/Page_Order confirmation - My Store/a_Test User'))

WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_Order history and details'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Order history - My Store/span_On backorder'), 2)

WebUI.closeBrowser()

