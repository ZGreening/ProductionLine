# ProductionLine --Beta 1
# September 28, 2018
# Updated October 32, 2018
# By Zachary Greening


This project comes from the Oracle Academy and is for educational purposes.
It was written using Google style java formatting in the intellij IDEA IDE.
The program is designed from the given scenario:

OracleProduction Ltd are specialists in producing production line 
manufacturing plants. They could be asked to create a production plant for
any type of product ranging from a simple packaging system to a variety of 
electronic devices. Recently they have been asked to create a production 
line for multimedia devices which include music and movie players. They wish
to employee you to design a template in Java for creating and recording all
future production line items. For this particular production facility you 
will only implement a concrete class for music and movie players.Your task
is to create a flexible structure that could be used in any production line. 
This structure would then allow easy modification to handle different products.

Steps 1-3 of JP instructions
As of September 28, 2018, the interfaces "Item" and "MultimediaControl", 
the abstract class "Product", and the enumerator "productionline.ItemType" have been created,
documented, and added to the project. These will serve as a modular base for 
continuing work on the project and as well as keeping the flexibility that is
a requirement for this project.

# Update:

Steps 4-16 of JP instructions
As of October 31, 2018, the interface "MultimediaControl" was added defining controls used by
a multimedia device. A class representing an audio player was added (AudioPlayer). It stores
information about the media type and audio specification. A driver class was set upt to test
the multimedia controls implemented in AudioPlayer as well as the toString method to display 
all relevant data to the class. 

An enumerator "MonitorType" and interface "ScreenSpec were
created as helper classes for class "Screen". Class Screen stores values for a resolution,
refreshRate and responseTime. A driver class was created to test the functionality of the 
screen class.

A class "MoviePlayer", which is an extension of type product, is composed of a Screen and 
MonitorType. MoviePlayer also implements MultimediaControl and the toString method. A
driver class was created to test the functionality of MoviePlayer. Another driver class
was also created to demonstrate the use of polymorphism. Both MoviePlayer and AudioPlayer
have MultimediaControls implemented. Thus, the driver class stores both types in a
MultimediaControl array, and iterates through each item, demonstrating the use of its
functions. 

Functionality was added to the "Product" class to allow products to be sorted by name.
In the Main class driver, a function for creating an ArrayList of sample products was added. As
well as, a function to print all the objects of a collection. For deomostration, the Main class gets
the array list of sample products, prints them, sorts them, then prints them again after they have been
sorted.

# Todo:

Steps 17-23 of the JP instructions
