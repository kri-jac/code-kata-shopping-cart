My thinking when creating the shopping cart was the following: 

1. Create a Scanner to receive a user input with the string of items (I included a line asking for a specific format, but assumed the user would comply)
2. Create variables to store both the total amount later on, and also the ammount of each item where a discount may be pertinent
3. Iterate through the string the user had input using a for loop, (saving space as opposed to converting a char arrray), and using a switch I checked each individual item and added its value to the total, as well as counting the number of items for those where a discount may be applied. 
4. Check the number of items for item A and B, and apply any discounts if pertinent, using two if statements (a simple division of the total number of As and Bs in each case, by the number neede for a discount would sufice since int division would remove decimal places and give the number to be multiplied by the discount for each bundle to get total discount for each). 
5. Return the total to the user.
