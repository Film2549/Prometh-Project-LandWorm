# LandWorm
This is a project for the course 2110215 PROGRAMMING METHODOLOGY I that I worked on with my friend Tawan ([@Dec-48](https://github.com/Dec-48)). 
The course focuses on object-oriented programming (OOP) using Java, along with JavaFX. Our project is a two-player game called LandWorm.

## Introduction
LandWorm was inspired by the game paper.io, which is a real-time territory
control game. In LandWorm, players control a character that moves outside their
area to draw a line and form a new boundary. When they manage to return to
their base successfully, the enclosed area becomes theirs.

## Rules
There are two players, each with a different color. Each player starts with a
safe zone at their initial position. They can move outside their territory, leaving a
trail in their color. If the other player steps on their trail—or if they accidentally
step on it themselves—they die and respawn at their starting area. However, if
they manage to return to their safe zone without being interrupted, the area
enclosed by their trail becomes part of their territory. Territory can always be
invaded and taken over. When time runs out, the winner is the player who controls
the largest area.

## Controls
The player on the left uses the W, A, S, D keys, and the player on the right
uses the arrow keys

## Game Overview

### MainMenuScene
<p float="left">
  <img src="https://github.com/user-attachments/assets/83094470-62f1-42ae-9b71-27b85a12d0d9" width="49%" />
  <img src="https://github.com/user-attachments/assets/9a0fc50e-b3d3-48da-b3d2-f8e96ac953f5" width="49%" />
</p>
Press the PLAY button to go to the color selection screen (PlayerSettingScene).
Press the SETTING button to adjust the BGM and effect volume, as shown in the image below.
Press the EXIT button to quit the game.

### PlayerSettingScene
![unnamed](https://github.com/user-attachments/assets/111b4058-aa1c-4d91-85be-9a13bf215290)
A short tutorial is provided to explain how to play. Each player chooses a color to play, and both players cannot select the same color. After selecting, press the button to start the game.

### GamePlayScene & Example
![unnamed](https://github.com/user-attachments/assets/f4a981bb-f7b5-4c9d-942d-4a1e263e67a9)
You have your own starting area. You go out, leave a trail, and if you make it back, your territory grows.
![unnamed](https://github.com/user-attachments/assets/77e1599b-7b86-4c1c-8cae-e63d28f93b41)
As shown in the image, the blue player will die and return to the point where they left their area. They won’t gain the blue trail as part of their territory.
![unnamed](https://github.com/user-attachments/assets/b8e07d84-acea-4f45-a58e-a28cc8f2f3e1)
You can invade and take over the other player’s territory if you safely return to your own area. You can also collect coins, which act as a bonus, giving you the equivalent of 10 free tiles. This can help determine the winner at the end of the game. In addition, there are potions that temporarily increase the speed of the player who picks them up.

### ResultScene
![unnamed](https://github.com/user-attachments/assets/a0690cab-6b2b-4220-8319-b116e4f10336)
When time runs out, the winner will be shown.


#### You can find the details of each class in the document above, along with the Class diagram.

#### There’s also a video (no longer than 10 minutes) on my YouTube channel. You can check it out here: [Presentation Video](https://youtu.be/enNOoQWkPqA?si=_Xdv-qio8XnlZZ9n)

## NOTE :  This project is intended for learning and reference purposes only. Feel free to explore and get inspired, but PLEASE NOT COPY the whole project as-is😡😡👹.

Lastly, I want to say thank you to all my friends and teachers who helped and supported me. Thanks to them, I was able to finish this course and complete the project.







