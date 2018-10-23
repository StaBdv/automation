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

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Contact us'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Contact us - My Store/select_-- Choose --'), '2', true)

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Email address_from'), 'test@mail.com')

WebUI.setText(findTestObject('Object Repository/Page_Contact us - My Store/input_Order reference_id_order'), '1122AABB')

'Attach the file'
WebUI.uploadFile(findTestObject('Page_Contact us - My Store/input_Attach File_fileUpload'), '/Users/StaBdv/Documents/QA/Automation/Final_task/test.txt')

'Submit'
WebUI.click(findTestObject('Object Repository/Page_Contact us - My Store/span_Send'))

'Verify negative message presented'
WebUI.verifyTextPresent('The message cannot be blank.', false)

WebUI.closeBrowser()

