$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("place_holder_reg.feature");
formatter.feature({
  "line": 1,
  "name": "As a user,",
  "description": "I want to be able to see the \r\nplace-holder on the registration page",
  "id": "as-a-user,",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10663147859,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 5,
      "value": "#Gherkin syntax in jobspec, Given When And Then, But"
    }
  ],
  "line": 7,
  "name": "See landing page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I launch the \"url\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I see the \"Login\" page displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "url",
      "offset": 14
    }
  ],
  "location": "landing_main.i_launch_the(String)"
});
formatter.result({
  "duration": 3585694193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 11
    }
  ],
  "location": "landing_main.i_see_the_page_displayed(String)"
});
formatter.result({
  "duration": 13187788,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Confirm place holders are displayed",
  "description": "",
  "id": "as-a-user,;confirm-place-holders-are-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@testcompleted"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I click \"register\" button",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I confirm \"Email_Address\" text_field has a place holder of \"Enter email\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I confirm \"username\" text_field has a place holder of \"Enter username\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "register",
      "offset": 9
    }
  ],
  "location": "register.i_click_button(String)"
});
formatter.result({
  "duration": 701182018,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email_Address",
      "offset": 11
    },
    {
      "val": "Enter email",
      "offset": 60
    }
  ],
  "location": "place_holder_reg.i_confirm_text_field_has_a_place_holder_of(String,String)"
});
formatter.result({
  "duration": 35205697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 11
    },
    {
      "val": "Enter username",
      "offset": 55
    }
  ],
  "location": "place_holder_reg.i_confirm_text_field_has_a_place_holder_of(String,String)"
});
formatter.result({
  "duration": 23851067,
  "status": "passed"
});
formatter.after({
  "duration": 19635,
  "status": "passed"
});
});