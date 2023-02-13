import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.click(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise/a_Contact us'))

WebUI.setText(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/input_Get In Touch_name'), 
    'Ahmed')

WebUI.setText(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/input_Get In Touch_email'), 
    'ahmedmarwan105@gmail.com')

WebUI.setText(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/input_Get In Touch_subject'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/textarea_Get In Touch_message'), 
    'This is a test')

WebUI.click(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/input_Get In Touch_submit'))

try {
	WebUI.acceptAlert()
	
} catch (Exception e) {
	System.out.println("NO ALER WAS FOUND")
	}


WebUI.takeScreenshotAsCheckpoint('Check', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Contact us Page Objects/Page_Automation Exercise - Contact Us/div_Success Your details have been submitte_fc584e'))

