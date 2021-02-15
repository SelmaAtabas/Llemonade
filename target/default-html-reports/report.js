$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ApinoFotoFutureDate.feature");
formatter.feature({
  "name": "Apitest 1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "return no foto in the future date",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "the user enter a future date as earth_date and send a get request",
  "keyword": "Given "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.APIstepdefinitions.the_user_enter_a_future_date_as_earth_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the status code should be \"200\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the result shouldn\u0027t have a foto id",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});