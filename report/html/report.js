$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "Demo automating Testing",
  "description": "",
  "id": "demo-automating-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Automation testing URl demo",
  "description": "",
  "id": "demo-automating-testing;automation-testing-url-demo",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is on Demo Site Testing page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user launch app with URL",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user clicks on skip sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on Automation Demo Site page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Enter as \"Yashini\" into firstname",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steplogin1.login()"
});
formatter.result({
  "duration": 11578117036,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.launch()"
});
formatter.result({
  "duration": 4135614056,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.skip()"
});
formatter.result({
  "duration": 3357528951,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.verify()"
});
formatter.result({
  "duration": 66363331,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yashini",
      "offset": 10
    }
  ],
  "location": "steplogin1.first(String)"
});
formatter.result({
  "duration": 320300143,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.close()"
});
formatter.result({
  "duration": 2208919907,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Register Page Testing",
  "description": "",
  "id": "demo-automating-testing;register-page-testing",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user is on Demo Site Testing page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "user launch app with URL",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user clicks on skip sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user is on Automation Demo Site page",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "enter text for name field",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "steplogin1.login()"
});
formatter.result({
  "duration": 2610106453,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.launch()"
});
formatter.result({
  "duration": 4309340700,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.skip()"
});
formatter.result({
  "duration": 4785456401,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.verify()"
});
formatter.result({
  "duration": 94178455,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.register()"
});
formatter.result({
  "duration": 12390965487,
  "status": "passed"
});
formatter.match({
  "location": "steplogin1.close()"
});
formatter.result({
  "duration": 2144606375,
  "status": "passed"
});
});