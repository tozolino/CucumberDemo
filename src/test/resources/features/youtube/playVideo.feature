@youtube
Feature: Play YouTube video

  This feature enables user to play desired video from the list

  Scenario: User plays the video
    Given User has launched YouTube app
    And YouTube home screen is displayed
    When User taps on any available video
    Then Video starts playing