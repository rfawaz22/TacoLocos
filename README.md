
# Taco Loco challenge

Taco Loco, a quick service fleet of taco trucks, is building a new
mobile app to enable their customers to place orders for their
delicious tacos. They’ve hired Detroit Labs to build the backend
services to power this app.

# How to start

To test the API download or clone the project and start it. It will run on localhost/8080


# How to use

To test the API go to localhost/8080/menu
This will return  JSON version of the menu 

{
  "menu": {
    "Chorizo Taco": 3.5,
    "Chicken Taco": 3.0,
    "Beef Taco": 3.0,
    "Veggie Taco": 2.5
  }
}

I reccomend using some sort of API testing application, I utilize Insomnia but any will work. 

using localhost/8080/total as the endpoint and inputing the menu items you wish to order will come up with the total order and cost. The input is an integer value, and will throw and error if a negative value is entered or if an item that is not on the menu is entered. 

request:

{
	"orderID": "Detroit labs",
	"foodOrder": {
		"Beef Taco": 15,
		"Veggie Taco": 1
	}
}

response:

{
  "orderID": "Detroit labs",
  "total": 38.0
}









## Acknowledgements
I refrenced the below github users projects for my own

 - [varsha9](https://github.com/varsha9/TacoLoco)
 - [bpresser123](https://github.com/bpresser123/Taco-Loco)
 - [domgarr ](https://github.com/domgarr/MenuCostCalculatorTDD )

