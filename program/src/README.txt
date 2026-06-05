Part 1: Explicitly Required Core Features
1. Add appliance
Description: Add household appliances, such as lights, fans, and air conditioners.
2. Record energy usage
Description: Record the usage time or energy consumption of an appliance.
3. View total consumption
Description: View the total energy consumption of all appliances.
4. Display summary reports
Description: Display the total energy consumption, average energy consumption, and estimated cost.
5. Identify high energy-consuming appliances
Description: Find out which appliances consume the most energy.
6. Exit program
Description: Close and exit the program.


Part 2: Additional Features
1. View all appliances
Description: Display all the appliances that have been added, including details like name, type, power, usage time, and energy consumption.
2. Calculate estimated cost
Description: Calculate the electricity bill based on the total kWh (for example, total kWh multiplied by the price per kWh).
3. Show energy saving suggestion
Description: Provide energy-saving suggestions based on high energy-consuming appliances. For example, if the air conditioner is used for too long, it will prompt you to reduce the usage time.


Part 3: Menu Functions and Responsible Modules
1. Add appliance
Mainly handled by: EnergyTrackerApp, Household, and Appliance subclasses
Description: Receives appliance information input by the user, and then creates the corresponding object.
2. Record energy usage
Mainly handled by: EnergyUsageRecord and Household
Description: Records how long a specific appliance was used or how much energy it consumed.
3. View total consumption
Mainly handled by: EnergyService
Description: Calculates the total kWh by adding up the energy consumption of all appliances.
4. Display summary reports
Mainly handled by: EnergyService
Description: Displays the calculated total energy consumption, average energy consumption, and estimated cost.
5. Identify high energy-consuming appliances
Mainly handled by: EnergyService
Description: Finds the appliances with high energy consumption among all appliances.
6. Exit program
Mainly handled by: EnergyTrackerApp
Description: Ends the menu loop to stop the program.
7. View all appliances
Mainly handled by: Household
Description: Displays the list of all appliances that have already been added.
8. Calculate estimated cost
Mainly handled by: EnergyService
Description: Performs the math calculation (total kWh multiplied by the price per kWh).
9. Show energy saving suggestion
Mainly handled by: EnergyService
Description: Outputs specific energy-saving suggestions based on the high energy-consuming appliances.