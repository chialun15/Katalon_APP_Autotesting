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

Mobile.startExistingApplication('tw.net.pic.m.openpoint')

Mobile.tap(findTestObject('OP_Notice_Center/01_ad_close'), 0)

Mobile.tap(findTestObject('OP_Notice_Center/02_notice_center'), 0)

Mobile.tap(findTestObject('OP_Notice_Center/03_ads_first_button'), 0, FailureHandling.OPTIONAL)

Mobile.pressBack()

Mobile.tap(findTestObject('OP_Notice_Center/04_mark_have_read'), 0)

Mobile.tap(findTestObject('OP_Notice_Center/05_non_unread_confirm'), 0)

Mobile.tap(findTestObject('OP_Notice_Center/06_notice_closed'), 0)

