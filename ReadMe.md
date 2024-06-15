 # Vehicle Rental System

This project aims to design a simple yet functional vehicle rental system that manages the rental and return processes
of different types of vehicle. The system should be able to calculate rental and insurance costs based 
on specific business rules and print out the invoice to the customer.

## Project Requirements

* Basic Requirements :
  -  Develop a command-line interface application;
  - Incorporate an Invoice class that generates a rental invoice for the user, at the moment of returning the rented vehicle;
  - This invoice will be displayed as the final output of the application without requiring any user input during the interaction;
  - input values should calculate given parameters and output an invoice for the user;
  - the output example is shown at the end of the document.

## Functionality:
- Develop the rental logic using Java.
- Available vehicle types are motorcycle, car and cargo van
- Rental information required:
    - vehicle brand
    - vehicle model
    - vehicle value
- If the vehicle type is a car, it also has a car safety rating - the range of rating is 1-5. Vehicle with ratings 4 and 5 are considered to have a high safety rating.
- If the rental type is a motorcycle, information on the rider's age is needed.
- If the rental type is a cargo van, information on a driver's experience is needed.

### Rental period:
- For how many days did the customer rent the vehicle
- Calculate the rental and insurance cost based cost is $15 for cars, $10 for motorcycles and $40 for caron the selected parameters and business rules
- All calculations and currency values should be presented with two decimals.

## Business Rules:
- The daily rental cost is $20 for cars, $15 for the motorcycle and $50 for cargo vans if rented for a week or less.
- if rented for more than a week, the daily rental cargo vans.
- The insurance cost per day is 0.01% of the car's value, 0.02$ of the motorcycle's value and 0.03% of the cargo van's value.

- The insurance cost is reduced by 10% for cars with a high safety rating, increased by 20% for motorcycles if the rider is under 25 years old and reduced by 15% for cargo vans if the driver has more than 5 years of experience.
  -When a vehicle is returned ahead of schedule (e.g. rented for 10 days abut returned on the 5th day), the customer is charged as follows:
    - rental costs are charged at the full price for the days that have elapsed and half the price for the remaining days.
    - insurance coverage is charged the full price for the days that have elapsed and not charged for the remaining days.

## Evaluation Criteria:
We'll assess your solution based on the following criteria:
- Code quality: Well-structured and maintainable code.
- Accuracy: Ensure accurate calculations and adherence to business rules.






