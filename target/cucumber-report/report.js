$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Search Process",
  "description": "",
  "id": "amazon-search-process",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to Navigate to Amazon com page and search for a product",
  "description": "",
  "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am open Amazon Webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for a \"\u003cproduct\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see results",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 11,
      "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;;1"
    },
    {
      "cells": [
        "watch"
      ],
      "line": 12,
      "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;;2"
    },
    {
      "cells": [
        "iphone"
      ],
      "line": 13,
      "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 36528232548,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to Navigate to Amazon com page and search for a product",
  "description": "",
  "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am open Amazon Webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for a \"watch\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see results",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTest.navigateToAmazonWebPage()"
});
formatter.result({
  "duration": 4735956807,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "watch",
      "offset": 16
    }
  ],
  "location": "AmazonTest.searchForaProduct(String)"
});
formatter.result({
  "duration": 3832151372,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.verifyResults()"
});
formatter.result({
  "duration": 7062580538,
  "status": "passed"
});
formatter.after({
  "duration": 954506342,
  "status": "passed"
});
formatter.before({
  "duration": 31874040840,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should be able to Navigate to Amazon com page and search for a product",
  "description": "",
  "id": "amazon-search-process;user-should-be-able-to-navigate-to-amazon-com-page-and-search-for-a-product;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am open Amazon Webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for a \"iphone\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see results",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonTest.navigateToAmazonWebPage()"
});
formatter.result({
  "duration": 5387827117,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "iphone",
      "offset": 16
    }
  ],
  "location": "AmazonTest.searchForaProduct(String)"
});
formatter.result({
  "duration": 4436692226,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.verifyResults()"
});
formatter.result({
  "duration": 7425571306,
  "status": "passed"
});
formatter.after({
  "duration": 970364921,
  "status": "passed"
});
});