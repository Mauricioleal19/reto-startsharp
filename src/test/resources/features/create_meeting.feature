@stories
Feature: create a meeting in StartSharp
  As a user, I want to create a meeting in platform StartSharp
  @scenario1
  Scenario Outline: Create Business Units
    Given that an user want to login in StartSharp
    When the user insert the information of the business units
      |strNameBUnits  |
      |<strNameBUnits>|
    Then it should show Unit name
      |strUnit  |
      |<strUnit>|

    Examples:
      |strNameBUnits|strUnit   |
      |FirstUnits   |FirstUnits|

  @scenario2
  Scenario Outline: Create meeting
    Given that an user want to login in StartSharp
    When the user insert the information of the meeting
      |strMeetingName  |strMeetingNumber  |strStartDate  |strEndDate  |
      |<strMeetingName>|<strMeetingNumber>|<strStartDate>|<strEndDate>|
    Then it should show meeting name
      |strNameMeeting  |strNumberMeeting|
      |<strNameMeeting>|<strNumberMeeting>|

    Examples:
      |strMeetingName|strMeetingNumber|strStartDate|strEndDate|strNameMeeting  |strNumberMeeting|
      |FirstMeet     |20001           |05/20/2022  |05/21/2022|FirstMeet       |20001           |



