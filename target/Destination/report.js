$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Register.feature");
formatter.feature({
  "line": 1,
  "name": "Register feature",
  "description": "",
  "id": "register-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9789764148,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to register successfully.",
  "description": "",
  "id": "register-feature;user-should-be-able-to-register-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Register button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter all required details",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user be able to see Your registration completed message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDeft.user_is_on_Homepage()"
});
formatter.result({
  "duration": 128165466,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_click_on_Register_button()"
});
formatter.result({
  "duration": 3107343146,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_enter_all_required_details()"
});
formatter.result({
  "duration": 4462614965,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.click_on_Register_button()"
});
formatter.result({
  "duration": 3012456806,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDeft.user_be_able_to_see_Your_registration_completed_message()"
});
formatter.result({
  "duration": 62066720,
  "status": "passed"
});
formatter.after({
  "duration": 57570449,
  "status": "passed"
});
});