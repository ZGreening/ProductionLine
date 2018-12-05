# ProductionLine
### September 28, 2018
### Updated November 22, 2018

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

## Getting Started


### Installation

  Clone repository from github.
  
### Prerequisites

  none

## Running the tests

Several test driver classes have been created in this program. Create a main method or add method calls for them to the
existing main method and remove the line "launch(args);" so that the GUI app does not launch.

### Test Methods

Main.testCollection() --Creates a small collection consisting of Movie and Audio players and returns them.

AudioPlayerDriver.testAudioPlayer() --Creates an Audio player prints it to the console and tests the methods implemented from MultimediaControl.

CollectionDemonstrationDriver.testCollectionSort() --Receives a Arraylist of items and prints them out before and after sorting.

MoviePlayerDriver.testMoviePlayer() --Creates a Movie player prints it to the console and tests the methods implemented from MultimediaControl.

MultimediaControlDriver.testMultimediaControlArray() --Creates an array of a Movie and Audio player and tests their functionality implemented from MultimediaControl in by looping through the array of multimedia devices, printing them and calling their multimedia functionality.

ScreenDriver.testScreen() --Creates a screen prints it to the console and tests its get methods.

## Class Diagram

![Package productionline Class Diagram](https://github.com/zgreening/ProductionLine/blob/master/Class%20Diagrams/Package%20productionline%20Class%20Diagram.png)

![Package audioplayercreator Class Diagram](https://github.com/zgreening/ProductionLine/blob/master/Class%20Diagrams/Package%20audioplayercreator%20Class%20Diagram.png)

![Package movieplayercreator Class Diagram](https://github.com/zgreening/ProductionLine/blob/master/Class%20Diagrams/Package%20movieplayercreator%20Class%20Diagram.png)

![Package mainscreen Class Diagram](https://github.com/zgreening/ProductionLine/blob/master/Class%20Diagrams/Package%20mainscreen%20Class%20Diagram.png)


## Built With

* [Scenebuilder](https://gluonhq.com/products/scene-builder/) - FXML Editor
* [IntelliJ Idea](https://www.jetbrains.com/idea/) - IDE
* [README-Template.md](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2#file-readme-template-md) - Readme

## Authors

* **Zachary Greening** - *Lead Developer* - [ZGreening](https://github.com/zgreening)

## License

This project is a school project for educational purposes and is for personal use only.

