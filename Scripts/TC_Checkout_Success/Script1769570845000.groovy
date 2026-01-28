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

WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/txt_username'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/txt_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/btn_login'))

WebUI.click(findTestObject('Page_Swag Labs/lbl_backpack'))

WebUI.click(findTestObject('Page_Swag Labs/btn_AddToCartDetail'))

WebUI.click(findTestObject('Page_Swag Labs/btn_BackToProducts'))

WebUI.click(findTestObject('Page_Swag Labs/btn_AddToCartProducts'))

WebUI.click(findTestObject('Page_Swag Labs/btn_Remove'))

WebUI.verifyElementText(findTestObject('Page_Swag Labs/cart_value'), '1')

WebUI.click(findTestObject('Page_Swag Labs/btn_Cart'))

WebUI.click(findTestObject('Page_Swag Labs/btn_Checkout'))

WebUI.setText(findTestObject('Page_Swag Labs/txt_CheckoutInformation_FirstName'), var_first)

WebUI.setText(findTestObject('Page_Swag Labs/txt_CheckoutInformation_LastName'), var_last)

WebUI.setText(findTestObject('Page_Swag Labs/txt_CheckoutInformation_PostalCode'), var_zip)

WebUI.click(findTestObject('Page_Swag Labs/btn_continue'))

WebUI.click(findTestObject('Page_Swag Labs/btn_Finish'))

WebUI.verifyElementVisible(findTestObject('Page_Swag Labs/lbl_FinishOrder'))

WebUI.click(findTestObject('Page_Swag Labs/button_Back Home'))

