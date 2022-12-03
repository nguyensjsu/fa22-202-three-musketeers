# Team Project (fa22-202 Three Musketeers and Journal)
------------------
## Table of Contents
- [Team Project (fa22-202 Three Musketeers and Journal)](#team-project-fa22-202-three-musketeers-and-journal)
  - [Table of Contents](#table-of-contents)
  - [Topic](#topic)
  - [Videos](#videos)
  - [Team Members](#team-members)
  - [Project Summary](#project-summary)
    - [Goal](#goal)
  - [High Level Architecture Diagram](#high-level-architecture-diagram)
  - [Key Feature Summary](#key-feature-summary)
  - [Design Patterns](#design-patterns)
    - [Observer](#observer)
    - [Factory - Method](#facotry)
  - [Resources](#resources)


## Topic
We implemented a Space shooter game, with a Back to the Future theme. This Project was designed and implemented using Design Patterns.

---
## Videos

[Team Project Demo](https://www.youtube.com/watch?v=XU_tGzfe4os)
[Game User Story Ad video](https://youtu.be/u7zjtWyvq_E)

---
## Team Members
| Name          | Student ID    |  XP Core Value  | Journals  |
| ------------- |---------------| --------------- | --------------- |
| [Waqas Kureshy](https://github.com/kureshy)  | 015421575     |  Communication       | [Weekly Journal](Journals/Waqas%20Kureshy's%20Project%20Journal.md) |
| [Vidas Sileikis](https://github.com/vs256)      | 016315897     |  Feedback       | [Weekly Journal](Journals/Vidas%20Sileikis's%20Project%20Journal.md) |

---
## Project Summary

This project is a video game where you play as a space shooter destroying enemy biff's that are coming at you. Get your space ship ready because the enemies are coming and it is up to you to save the world with your mighty space ship that shoots out hoverboards!

For this project we were tasked to take a predesigned game and modify it by implementing Design patterns. This Project was implemented on the Greenfoot platform. The original game we chose to modify was a basic space shooter game that had one player, and enemies were randomly generated. The player functionality included shooting lasers at the enemy, movement in all four directions and a score for every enemy killed was kept.

We pursued this project using the Scrum Methodology, where by practicing its principles we held regular meetings in which we discussed modifications that needed to be implemented to the original codebase, Design pattern choices, what blockers we were facing and working on diagrams and documentation related to the project.

In terms of modifications to the original game we implemented three design patterns which include the Observer pattern for updating player health, Factory method Design pattern for generating enemies and the Observer pattern for updating player score. Our modifications also included changing the game screens, changed players and enemies as well as their functionalities.


### Goal
The goal is to create a well-designed video game that implements design patterns & encourages team collaboration through a Scrum setting.


---
## High Level Architecture Diagram
The figure show above is our complete Class Diagram, details of the individual components are elaborated below.

- There are three game screens:
  - MyWorld: is the main screen that displays the games logo and features a play button. The playbutton when clicked, opens the main game screen.
  - GameScreen: This is the main game screen arena, it features two player statistics, the score and the player health. The actors interact with each other on this screen.

  - GameOver screen: This screen is displayed when the player dies and the game finishes. On this screen two buttons that direct the user to replay the game or to quit to the main menu are displayed. This screen also displays the players final accumulated score.

- Player: The player class represents the main entity that the user controls, the user has the ability to move in all 4 directions and it also shoots hoverboards. Our player in the game is depicted by a DeLorean.

- Health indicator: The player starts with 100 health points, the player looses 25 health points as it comes into contact with the enemy. This indicator was implemented using the Observer pattern.

- Score indicator: The player gets 25 points for every enemy it kills, and this score is indicated in the score indicator on the top right. This indicator was implemented through the Observer pattern.

- Biffs (enemies): There are two sort of enemies in the game, an old biff and a young biff. These enemies are generated through the Factory method design matter.

- Hoverboards: Hoverboards are fired at the enemies by the DeLorean. 25 points are added to the Player's score for a successful hit of the Hoverboard with the Enemy.

---
## Key Feature Summary
The image below is the complete **UML Class Diagram** of our project.<br>
![image](https://user-images.githubusercontent.com/78277453/205449702-15fa8041-1e0e-4b44-8c14-f4ed3aa8ceb9.png)


- The player is represented by a DMC DeLorean, it shoots Hoverboards from a press of a spacebar.

- Observer Pattern was used for keeping and displaying the score that the player attains.

- Observer pattern was used for displaying the Player's health. Once the health drops below 100 the game ends.

- There are two sort of enemies that are depicted by Biffs, if our player comes in contact with the biffs, the player losses health by 25 points. The enemies are generated by the Factory Method.

- When the Game ends, a Game over screen is displayed, the players accumulated score is shown and the user is given two options:
* To play again
* To Quit to Main menu

---

## Design Patterns

- **Observer Patter (Health indicator)**

![image](https://user-images.githubusercontent.com/78277453/205449423-6246c00f-bcfe-4a06-8d24-f0abfbd393e0.png)

The Observer pattern was used for displaying the Players Health onto the GameScreen. The player starts with 100 health points, and subsequently looses 25 points by coming in contact with the enemy.In this pattern Player is the Concrete Subject, it implements the HealthSubject Interface and the Health is the Concrete Observer.


- **Observer Patter (Score indicator)**

![image](https://user-images.githubusercontent.com/78277453/205449411-19585629-b30a-4ebd-8a8a-085dab1067e6.png)


The Observer pattern was used for displaying the Players accumulated score onto the GameScreen. The player starts with a score of 0, and gets +25 points for shooting down an enemy. In this pattern Player is the Concrete Subject, it implements the HealthSubject Interface and the Health is the Concrete Observer.

- **Factory Method (Biff/enemy generator)**

![image](https://user-images.githubusercontent.com/78277453/205449488-c23183c4-b8c9-4fc1-bce3-7333aec798fa.png)


The Factory Method Design pattern was used to generate enemy Biffs. These biffs if they come into contact with the player, cause the player to loose 25 health points. These Biffs/enemies are randomly generated and move from right to left.
The components of the pattern are:
  - IBiff Interface: is the **Product** interface it defines the  interface of objects the factory method creates.
  - OldBiff : is the **Concrete Product** that implements the IBiff interface.
  - YoungBiff : is the **Concrete Product** that implements the IBiff inerface.
  - BiffCreator: declares the factory method, which returns an object of type Product. This serves as our **application** and also provides move, kill methods for the biffs.
  -  BiffOneFactory: is the **Concrete creator** it overrides the factory method to return an instance of a Concrete Product.
  -  BiffTwoFactory: is the **Concrete creator** it overrides the factory method to return an instance of a Concrete Product.

---

## UI Wireframes

The UI Wireframes for each Game screen and its respective components are elaborated as follows:

- **Main Screen**

![image](https://user-images.githubusercontent.com/78277453/205449224-8a7d5648-a710-42ec-b886-210eadd82441.png)

----------

- **Game Screen**

![image](https://user-images.githubusercontent.com/78277453/205449253-af0a847f-bd16-4dec-95e6-5055690880aa.png)

-----------

- **Game Over Screen**

![image](https://user-images.githubusercontent.com/78277453/205449272-728c1f8b-8ea7-42dc-a81c-afd8e4046cc8.png)

<br>


---------------

## Sprint Task Sheet
This task sheet contains information about our tasks and time spent on them for the entire course of the project.

![image](https://user-images.githubusercontent.com/78277453/205450222-68ead9dd-b2ee-4584-bdd1-ee9a89aa21ba.png)

-----------

## Kanban Board
We maintained a Kanban board on GitHub, for logging our tasks for this project.

![image](https://user-images.githubusercontent.com/78277453/205450229-00b71743-4b05-48b2-96f8-30e6fc544153.png)


---------------------

## Burndown Chart

![image](https://user-images.githubusercontent.com/78277453/205450243-89544acc-06ae-45c8-b185-d6103b6dc080.png)


----------

## Resources
[Project Task Board](https://github.com/orgs/nguyensjsu/projects/14)

[Sprint Task Sheet](https://docs.google.com/spreadsheets/d/1_7OaH0Ns1McdoYEcVgvOgk_x9eFzFv0BA5ryzZEm2_c/edit?usp=sharing)
