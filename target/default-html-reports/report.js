$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Search.feature");
formatter.feature({
  "name": "Searching",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in the wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.contentsstepdefinitions.the_user_is_in_the_wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter following \"Document\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.Searchstepdefinitions.the_user_enter_following(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click search button",
  "keyword": "When "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.Searchstepdefinitions.the_user_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title should be contain \"Document\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.Searchstepdefinitions.the_title_should_be_contain(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/changelanguage.feature");
formatter.feature({
  "name": "Language",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Change Language",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in the wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.contentsstepdefinitions.the_user_is_in_the_wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user select Espanol",
  "keyword": "When "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.changelanguagestepdefinitions.the_user_select()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "language should be changed as \"español\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.changelanguagestepdefinitions.language_should_be_changed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/contents.feature");
formatter.feature({
  "name": "Content",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check contents",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in the wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.contentsstepdefinitions.the_user_is_in_the_wikipedia_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks Contents",
  "keyword": "When "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.contentsstepdefinitions.the_user_clicks_Contents()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see following options",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.llemonade.stepdefinitions.contentsstepdefinitions.the_user_should_be_able_to_see_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});