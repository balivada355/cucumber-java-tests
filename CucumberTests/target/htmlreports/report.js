$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/nameTest.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "  Verify if user is able to Login in to the site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login as a authenticated user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testPico"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps01_StepDef.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps01_StepDef.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps02_StepDef.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps02_StepDef.success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login as a authenticated user_01",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@testPico01"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user is  on homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TestSteps01_StepDef.user_is_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "TestSteps01_StepDef.user_navigates_to_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and Password",
  "keyword": "And "
});
formatter.match({
  "location": "TestSteps02_StepDef.user_enters_username_and_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.beforestep({
  "status": "passed"
});
formatter.step({
  "name": "success message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps02_StepDef.success_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});