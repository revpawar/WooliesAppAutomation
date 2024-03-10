Feature: cart and checkout

 Scenario: Add items to the cart 
 Given open url 'https://www.woolworths.com.au/'
 When Search for Products and click add to cart
 |product|
 |lindt|
 |Ferrero|
 And Click cart button on the homepage 
 And Click Checkout
 Then verify the mini cart 
 
 
