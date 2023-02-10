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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Object Repository/Page_Explore  Twitter/div_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/input_Phone, email, or username_text'), 
    'Hayabuzya')

WebUI.sendKeys(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/input_Phone, email, or username_text'), 
    Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/input_Password_password'), 'GEMRn+q0A1uLN18HOOsmxw==')

WebUI.click(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/div_Password_css-1dbjc4n r-18u37iz r-16y2uo_0e8144'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/svg_Password_r-18jsvk2 r-4qtqp9 r-yyyyoo r-_56ca33'))

WebUI.click(findTestObject('Object Repository/Page_Log in to Twitter  Twitter/div_Log in'))

