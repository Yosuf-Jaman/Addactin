Feature: Hotel Booking In Adactin Application.

Scenario: User Login in The Applications
Given user Launch The Adactin Applications
When user Enter The Username In Username Fields
And user Enter the Password In Password Fields
Then User Click the Login Button sand It Navigates To Search Hotel Pages

Scenario: Search Hotel In The Application
When User search the location
When User Search The Hotels
And User Select The Room Type
And User Select The Number Of Rooms
And User Select The Check In Date
And User Select The Adults Per Room
And User Select The Cheildren Per Room
Then User Click The Search Button And It Navogates to Select Hotel

Scenario: Select Hotel In The Application
When User Select The Hotel
Then User Click The Continue Button And It Navogates To The Book A Hotel Page

Scenario: Book A Hoel In The Application
When User Entered The First Name
And USer Entered The Last Name
And User Entered The Billing Class
And User Entered The Credit Card No
And User Credit Card Type
And User Select The Expiry Month
And User Select The Year
And User Select The CVV Number
Then User Select The Book Now Button Booking Confirmation

Scenario: User check the booking details and Logout from Applcation
When User check the booking details in the Page 
Then User Click the logout button And It Navigates To The Logout Page

Scenario: If User wants to Relogin  We Can Use This Page to ReLogin Again
Then User Click "Click Here To Login Again" And It Navigates To The Login Page












