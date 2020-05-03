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
  "duration": 71428185081,
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
  "duration": 10456155455,
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
  "duration": 7225811113,
  "status": "passed"
});
formatter.match({
  "location": "AmazonTest.verifyResults()"
});
formatter.result({
  "duration": 258276688,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters. (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027IS-4971s-MacBook-Pro.local\u0027, ip: \u00272601:644:8003:a7e0:0:0:0:d51%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities {backendRetries: 4, bootstrapPath: /Volumes/Sauce/wda/wda-v1.1..., browserName: Safari, databaseEnabled: false, derivedDataPath: /Volumes/Sauce/wda/wda-v1.1..., deviceName: iPhone XS, eventTimings: true, hasMetadata: true, iosSimulatorLogsPredicate: --predicate \u0027process !\u003d \"lo..., javascriptEnabled: true, keepKeyChains: true, launchTimeout: 180000, locationContextEnabled: false, maxTypingFrequency: 8, networkConnectionEnabled: false, newCommandTimeout: 0, noReset: true, orientation: PORTRAIT, platform: MAC, platformName: MAC, platformVersion: 13.2, preventWDAAttachments: true, showIOSLog: false, takesScreenshot: true, udid: 3694E895-6F1F-4535-B0D1-ADF..., usePrebuiltWDA: true, version: , webStorageEnabled: false, webdriver.remote.quietExceptions: false, webdriver.remote.sessionid: b133865ffb3b4c7bb759527a85c...}\nSession ID: b133865ffb3b4c7bb759527a85cf7bde\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003dnav-search-form]/div[2]/div/input}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:472)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\n\tat automation.guru.steps.AmazonTest$1.apply(AmazonTest.java:57)\n\tat automation.guru.steps.AmazonTest$1.apply(AmazonTest.java:55)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\n\tat automation.guru.steps.AmazonTest.waitForElement(AmazonTest.java:55)\n\tat automation.guru.steps.AmazonTest.verifyResults(AmazonTest.java:67)\n\tat ✽.Then I should see results(amazon.feature:8)\n",
  "status": "failed"
});
formatter.after({
  "duration": 1950366259,
  "status": "passed"
});
