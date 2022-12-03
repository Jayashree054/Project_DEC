$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/Feature_File.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel booking",
  "description": "",
  "id": "adactin-hotel-booking",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "login functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User need  to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter the username \"\u003cusername\u003e\"in username field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter Password \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User need to click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "It will navigate to search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "adactin-hotel-booking;login-functionality;;1"
    },
    {
      "cells": [
        "Ishu@234",
        "Ishu@234"
      ],
      "line": 13,
      "id": "adactin-hotel-booking;login-functionality;;2"
    },
    {
      "cells": [
        "Ajay@234",
        "Ajay@234"
      ],
      "line": 14,
      "id": "adactin-hotel-booking;login-functionality;;3"
    },
    {
      "cells": [
        "bony1234",
        "bony@1234"
      ],
      "line": 15,
      "id": "adactin-hotel-booking;login-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "login functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User need  to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter the username \"Ishu@234\"in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter Password \"Ishu@234\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User need to click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "It will navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_need_to_launch_the_application()"
});
formatter.result({
  "duration": 3919946700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ishu@234",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_enter_the_username_in_username_field(String)"
});
formatter.result({
  "duration": 239132300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ishu@234",
      "offset": 21
    }
  ],
  "location": "Step_Definition.user_enter_Password_in_password_field(String)"
});
formatter.result({
  "duration": 62014000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_need_to_click_on_the_login_button()"
});
formatter.result({
  "duration": 389276800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.it_will_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 38400,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "login functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User need  to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter the username \"Ajay@234\"in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter Password \"Ajay@234\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User need to click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "It will navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_need_to_launch_the_application()"
});
formatter.result({
  "duration": 365628700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ajay@234",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_enter_the_username_in_username_field(String)"
});
formatter.result({
  "duration": 96334300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ajay@234",
      "offset": 21
    }
  ],
  "location": "Step_Definition.user_enter_Password_in_password_field(String)"
});
formatter.result({
  "duration": 75076900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_need_to_click_on_the_login_button()"
});
formatter.result({
  "duration": 348629400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.it_will_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 20400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "login functionality",
  "description": "",
  "id": "adactin-hotel-booking;login-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User need  to launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter the username \"bony1234\"in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter Password \"bony@1234\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User need to click on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "It will navigate to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_need_to_launch_the_application()"
});
formatter.result({
  "duration": 326221800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bony1234",
      "offset": 25
    }
  ],
  "location": "Step_Definition.user_enter_the_username_in_username_field(String)"
});
formatter.result({
  "duration": 93489000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bony@1234",
      "offset": 21
    }
  ],
  "location": "Step_Definition.user_enter_Password_in_password_field(String)"
});
formatter.result({
  "duration": 63483900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_need_to_click_on_the_login_button()"
});
formatter.result({
  "duration": 2394376300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.it_will_navigate_to_search_hotel_page()"
});
formatter.result({
  "duration": 11100,
  "status": "passed"
});
});