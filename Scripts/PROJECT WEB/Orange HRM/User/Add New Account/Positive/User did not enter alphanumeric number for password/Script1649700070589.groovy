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

WebUI.callTestCase(findTestCase('PROJECT WEB/common/Login/Positive/login-with-valid-credential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('PROJECT WEB/User/Page_OrangeHRM/b_Admin'))

WebUI.mouseOver(findTestObject('PROJECT WEB/User/Page_OrangeHRM/a_User Management'))

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/a_Users'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/User/Page_OrangeHRM/verify system users'), 5)

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input_Status_btnAdd'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/User/Page_OrangeHRM/Verify Add User'), 5)

WebUI.selectOptionByValue(findTestObject('PROJECT WEB/User/Page_OrangeHRM/select_AdminESS'), '1', true)

WebUI.setText(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input__systemUseremployeeNameempName'), 'Harry Kane')

WebUI.setText(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input__systemUseruserName'), 'Harry Kane100')

WebUI.selectOptionByValue(findTestObject('PROJECT WEB/User/Page_OrangeHRM/select_EnabledDisabled'), '1', true)

WebUI.setText(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input__systemUserpassword'), 'harrykane')

WebUI.setText(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input__systemUserconfirmPassword'), 'harrykane')

WebUI.click(findTestObject('PROJECT WEB/User/Page_OrangeHRM/input__btnSave'))

WebUI.verifyElementPresent(findTestObject('PROJECT WEB/User/Page_OrangeHRM/div_Successfully Saved       Close'), 5)

WebUI.closeBrowser()

