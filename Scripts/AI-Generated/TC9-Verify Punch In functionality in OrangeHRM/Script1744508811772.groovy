import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to web/index.php/*/*"

TrueTestScripts.navigate("web/index.php/${index_php_id}/${path_param_4}")

"Step 2: Click on i attendance"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/i_attendance'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on i attendance.png')

"Step 3: Click on link punchInOut"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/link_punchInOut'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link punchInOut.png')

"Step 4: Enter input value in textarea typeHere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dynamic_content/textarea_typeHere'), textarea_typeHere)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Enter input value in textarea typeHere.png')

"Step 5: Click on button in -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'web/index.php/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dynamic_content/button_in'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on button in - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Punch In functionality in OrangeHRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}