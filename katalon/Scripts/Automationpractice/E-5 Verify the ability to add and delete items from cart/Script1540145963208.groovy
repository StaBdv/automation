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

WebUI.waitForElementVisible(findTestObject('Page_Printed Summer Dress - My Stor/span_Continue shopping'), 2)

WebUI.click(findTestObject('Object Repository/Page_Printed Summer Dress - My Stor/span_Continue shopping'))

WebUI.delay(2)

WebUI.waitForPageLoad(2)

WebUI.waitForElementVisible(findTestObject('Page_My Store/b_Cart'), 2)

WebUI.click(findTestObject('Page_My Store/b_Cart'))

WebUI.verifyTextNotPresent('Your shopping cart is empty.', false)

WebUI.click(findTestObject('Page_Order - My Store/i_28.98_icon-trash'))

WebUI.refresh()

WebUI.waitForPageLoad(2)

'\n\n'
WebUI.verifyTextPresent('Your shopping cart is empty.', false)

WebUI.closeBrowser()

