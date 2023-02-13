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

WebUI.openBrowser('https://automationexercise.com/')

WebUI.click(findTestObject('Object Repository/SignUp Page Objects/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input_New User Signup_name'), 'Ahmed')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input_New User Signup_email'), 'ahmedmarwan105@gmail.com')

WebUI.click(findTestObject('Object Repository/SignUp Page Objects/button_Signup'))

WebUI.click(findTestObject('Object Repository/SignUp Page Objects/input_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/SignUp Page Objects/input__password'), 'Z93SQjXcpN+/SlLrF+Ja6A==')

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp Page Objects/select_Day123456789101112131415161718192021_40ab5b'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp Page Objects/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/SignUp Page Objects/select_Year20212020201920182017201620152014_f874ed'), 
    '2000', true)

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__first_name'), 'Ahmed')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__last_name'), 'AbuAli')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input_Company_company'), 'Inspire')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input_(Street address, P.O. Box, Company na_957d3e'), 
    'Str Zain')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__state'), 'Irbid')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__city'), 'Aydoun')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__zipcode'), '1234')

WebUI.setText(findTestObject('Object Repository/SignUp Page Objects/input__mobile_number'), '0788622752')

WebUI.click(findTestObject('Object Repository/SignUp Page Objects/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Object Repository/SignUp Page Objects/b_Account Created'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

