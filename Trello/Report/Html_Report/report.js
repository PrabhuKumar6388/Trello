$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Trello.feature");
formatter.feature({
  "line": 1,
  "name": "Create List and drag the card in Trello Application",
  "description": "",
  "id": "create-list-and-drag-the-card-in-trello-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create List and drag the card in Trello Application",
  "description": "",
  "id": "create-list-and-drag-the-card-in-trello-application;create-list-and-drag-the-card-in-trello-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "a user login into application",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user create a new Board",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user create a \"list A\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user create a \"list B\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user add a card in \"list A\" parameter as \"Test\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user drag and drop the \"list A\" card to \"list B\" card",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user logout the application",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definitions.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6970757001,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.userEnterUsername()"
});
formatter.result({
  "duration": 19060128900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.userCreateANewBoard()"
});
formatter.result({
  "duration": 27409096100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "list A",
      "offset": 15
    }
  ],
  "location": "Step_Definitions.userCreateList(String)"
});
formatter.result({
  "duration": 6667902499,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "list B",
      "offset": 15
    }
  ],
  "location": "Step_Definitions.userCreateList(String)"
});
formatter.result({
  "duration": 6473404300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "list A",
      "offset": 20
    },
    {
      "val": "Test",
      "offset": 42
    }
  ],
  "location": "Step_Definitions.userAddCardInList(String,String)"
});
formatter.result({
  "duration": 11033572900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "list A",
      "offset": 24
    },
    {
      "val": "list B",
      "offset": 41
    }
  ],
  "location": "Step_Definitions.userDragAndDropCard(String,String)"
});
formatter.result({
  "duration": 8580747200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.userLogoutTheApplication()"
});
formatter.result({
  "duration": 22349755100,
  "status": "passed"
});
});