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
    - [Composite](#composite)
    - [Observer](#observer)
  - [Resources](#resources)


## Topic
We implemented a Space shooter game, with a Back to the Future theme. This Project was designed and implemented using Design Patterns.

---
## Videos
TODO

---
## Team Members
| Name          | Student ID    |  XP Core Value  | Journals  |
| ------------- |---------------| --------------- | --------------- |
| [Waqas Kureshy](https://github.com/kureshy)  | 015421575     |  Communication       | [Weekly Journal](Journals/Waqas%20Kureshy's%20Project%20Journal.md) |
| [Vidas Sileikis](https://github.com/vs256)      | 016315897     |  Feedback       | [Weekly Journal](Journals/Vidas%20Sileikis's%20Project%20Journal.md) |

---
## Project Summary
<<<<<<< HEAD
We were tasked to take a predesigned game and implement Design patterns. This Project was implemented on the Greenfoot platform. The original game we chose to modify was a basic space shooter game that had one player, and enemies were randomly generated. The player functionality included shooting lasers at the enemy, movement in all four directions and a score for every enemy killed was kept.

We pursued this project using the Scrum Methodology, where by practicing its principles we held regular meetings in which we discussed modifications that needed to be implemented to the original codebase, Design pattern choices, what blockers we were facing and working on diagrams and documentation related to the project.

In terms of modifications to the original game we implemented three design patterns which include the Observer pattern for updating player health, Factory method Design pattern for generating enemies and the Observer pattern for updating player score. Our modifications also included changing the game screens, changed players and enemies as well as their functionalities.
=======

This project is a video game where you play as a space shooter destroyings enemy biff's that are coming at you. Get your space ship ready because the enemies are coming and it is up to you to save the world with your mighty space ship that shoots out hoverboards!


### Goal
The goal is to create a well-designed video game that implements design patterns & encourages team collaboration through a Scrum setting.
>>>>>>> f362257defff57671b2e5cf00c4420d4d36d02fc

---
## High Level Architecture Diagram
The figure show above is our complete Class Diagram, details of the individual components are elaborated below.

- There are three game screens:
* MyWorld: is the main screen that displays the games logo and features a play button. The playbutton when clicked, opens the main game screen.
* GameScreen: This is the main game screen arena, it features two player statistics, the score and the player health. The actors interact with each other on this screen.
* GameOver screen: This screen is displayed when the player dies and the game finishes. On this screen two buttons that direct the user to replay the game or to quit to the main menu are displayed. This screen also displays the players final accumulated score.

- Player: The player class represents the main entity that the user controls, the user has the ability to move in all 4 directions and it also shoots hoverboards. Our player in the game is depicted by a DeLorean.

- Health indicator: The player starts with 100 health poionts, the player looses 25 health points as it comes into contact with the enemy. This indicator was implemented using the Observer pattern.

- Score indicator: The player gets 25 points for every enemy it kills, and this score is indicated in the score indicator on the top right. This indicator was implemented through the Observer pattern.

- Biffs (enemies): There are two sort of enemies in the game, an old biff and a young biff. These enemies are generated through the Factory method design matter.

- Hoverboards: Hoverboards are fired at the enemies by the DeLorean. 25 points are added to the Player's score for a successful hit of the Hoverboard with the Enemy.

---
## Key Feature Summary

<<<<<<< HEAD
- The player is represented by a DMC DeLorean, it shoots Hoverboards from a press of a spacebar.

- Observer Pattern was used for keeping and displaying the score that the player attains.

- Observer pattern was used for displaying the Player's health. Once the health drops below 100 the game ends.

- There are two sort of enemies that are depicted by Biffs, if our player comes in contact with the biffs, the player losses health by 25 points. The enemies are generated by the Factory Method.

- When the Game ends, a Game over screen is displayed, the players accumulated score is shown and the user is given two options:
* To play again
* To Quit to Main menu

=======
Key Features:
- Screens:
  - Home
  - Gameplay
  - Game Over

- Player (Spaceship)
  - Can shoot hoverboards to attack flying enemies
  - The observer design pattern is implemented for the following functionalities:
    - Health
    - Score
- Enemies
  - Generator that continually spawns enemies to attack the player.
  - Factory method design pattern is implemented here.
>>>>>>> f362257defff57671b2e5cf00c4420d4d36d02fc

---

## Design Patterns






---

## Resources
[Project Task Board](https://github.com/orgs/nguyensjsu/projects/14)

[Sprint Task Sheet](https://docs.google.com/spreadsheets/d/1_7OaH0Ns1McdoYEcVgvOgk_x9eFzFv0BA5ryzZEm2_c/edit?usp=sharing)
