# chess-board-solution
Sample Chess Board Solution implemented over java, spring and unit tested with junit5

## Problem Statement
You are required to create a program, which simulates a chessboard and the movements of various types of pieces on the chessboard.

Chessboard:
The chessboard is an 8 x 8 grid with 64 cells in it.
With 8 rows (A, B, C.... H) and 8 columns (1, 2, 3.... 8), each cell can be
uniquely
identified with its cell number. This can be seen illustrated below.

            A8 B8 C8 D8 E8 F8 G8 H8
            A7 B7 C7 D7 E7 F7 G7 H7
            A6 B6 C6 D6 E6 F6 G6 H6
            A5 B5 C5 D5 E5 F5 G5 H5
            A4 B4 C4 D4 E4 F4 G4 H4
            A3 B3 C3 D3 E3 F3 G3 H3
            A2 B2 C2 D2 E2 F2 G2 H2
            A1 B1 C1 D1 E1 F1 G1 H1

## Chess pieces and their movements
The game of chess has 6 unique types of pieces, with their own unique
types of movements. These are:

- King – Can move only 1 step at a time in all 8 directions (horizontal, vertical
and diagonal)

- Queen – Can move across the board in all 8 directions

- Bishop – Can move across the board only diagonally

- Horse – Can move across the board only in 2.5 steps (2 vertical steps and
1
horizontal step)
- Rook – Can move across the board only vertically and horizontally
- Pawn – Can move only 1 step at a time, in the forward direction, vertically. Can also move 1 step forward diagonally, in order to eliminate an opposing
piece.

### Objective and Sample inputs, outputs:
Your program should simulate the movement of each unique chess piece on
an empty chessboard.

- Sample Input 1 – “King D5”

    Output 1 – “D6, E6, E5, E4, D4, C4, C5,C6”

- Sample Input 2 – “Horse E3”

    Output 2 – “F5, G4, G2, F1, D1, C2, C4, D5”