Feature: Passing multiple parameters to the same step
@gb
Scenario: Searching multiple items
  Given user is on Google search page
  Then user searches the following item
    | items        |
    | java         |
    | selenium     |
    | cucumber bdd |
    | sql          |
    | anna         |
    | anything     |

#    option + command + L - mac
#    CTRL + ALT + L window