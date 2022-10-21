Feature: Hear Shout
  Scenario: Listener is within range
    Given Lucy is located 15 metres from Sean
    When Sean shouts "Free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener hears a different message
    Given Lucy is located 15 metres from Sean
    When Sean shouts "Free coffee!"
    Then Lucy should hear Sean's message
