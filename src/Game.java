import java.util.Random;

public class Game {
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;

    public Game(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;

        // Dit maakt het random wie met het spel begint!
        Random randomizer = new Random();
        int number = 2;
        if(randomizer.nextInt(number) == 0) {
            this.currentPlayer = playerA;
        }
        else {
            this.currentPlayer = playerB;
        }

    }

// zorgt ervoor dat er na elke beurt verandert kan worden van speler deze method wordt ingezet in de main!

    public void switchPlayer() {
        if (currentPlayer == playerA) {
            this.currentPlayer = playerB;
        }
        else {
            this.currentPlayer = playerA;
        }
    }

    public Player getCurrentPlayer () {
        return currentPlayer;
    }

// De token moet helemaal naar de bodem zakken tenzij deze bezet is! Dit geeft het 4 op rij effect.
    //De methode fourOnOneLine() zorgt ervoor dat de token naar beneden zakt!


    public void fourOnOneLine(Field board[], int userInput) {
        String currentPlayerToken = currentPlayer.getToken();
        if (userInput == 0) {
            if (board[0].getOccupation() == false) {
                if (board[6].getOccupation() == false) {
                    if (board[12].getOccupation() == false) {
                        if (board[18].getOccupation() == false) {
                            if (board[24].getOccupation() == false) {
                                if (board[30].getOccupation() == false) {
                                    board[30].setField(currentPlayerToken);
                                } else {
                                    board[24].setField(currentPlayerToken);
                                }
                            } else {
                                board[18].setField(currentPlayerToken);
                            }
                        } else {
                            board[12].setField(currentPlayerToken);

                        }
                    } else {
                        board[6].setField(currentPlayerToken);
                    }
                } else {
                    board[0].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
        else if (userInput == 1) {
            if (board[1].getOccupation() == false) {
                if (board[7].getOccupation() == false) {
                    if (board[13].getOccupation() == false) {
                        if (board[19].getOccupation() == false) {
                            if (board[25].getOccupation() == false) {
                                if (board[31].getOccupation() == false) {
                                    board[31].setField(currentPlayerToken);
                                } else {
                                    board[25].setField(currentPlayerToken);
                                }
                            } else {
                                board[19].setField(currentPlayerToken);
                            }
                        } else {
                            board[13].setField(currentPlayerToken);

                        }
                    } else {
                        board[7].setField(currentPlayerToken);
                    }
                } else {
                    board[1].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
        else if (userInput == 2) {
            if (board[2].getOccupation() == false) {
                if (board[8].getOccupation() == false) {
                    if (board[14].getOccupation() == false) {
                        if (board[20].getOccupation() == false) {
                            if (board[26].getOccupation() == false) {
                                if (board[32].getOccupation() == false) {
                                    board[32].setField(currentPlayerToken);
                                } else {
                                    board[26].setField(currentPlayerToken);
                                }
                            } else {
                                board[20].setField(currentPlayerToken);
                            }
                        } else {
                            board[14].setField(currentPlayerToken);

                        }
                    } else {
                        board[8].setField(currentPlayerToken);
                    }
                } else {
                    board[2].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
        else if (userInput == 3) {
            if (board[3].getOccupation() == false) {
                if (board[9].getOccupation() == false) {
                    if (board[15].getOccupation() == false) {
                        if (board[21].getOccupation() == false) {
                            if (board[27].getOccupation() == false) {
                                if (board[33].getOccupation() == false) {
                                    board[33].setField(currentPlayerToken);
                                } else {
                                    board[27].setField(currentPlayerToken);
                                }
                            } else {
                                board[21].setField(currentPlayerToken);
                            }
                        } else {
                            board[15].setField(currentPlayerToken);

                        }
                    } else {
                        board[9].setField(currentPlayerToken);
                    }
                } else {
                    board[3].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
        else if (userInput == 4) {
            if (board[4].getOccupation() == false) {
                if (board[10].getOccupation() == false) {
                    if (board[16].getOccupation() == false) {
                        if (board[22].getOccupation() == false) {
                            if (board[28].getOccupation() == false) {
                                if (board[34].getOccupation() == false) {
                                    board[34].setField(currentPlayerToken);
                                } else {
                                    board[28].setField(currentPlayerToken);
                                }
                            } else {
                                board[22].setField(currentPlayerToken);
                            }
                        } else {
                            board[16].setField(currentPlayerToken);

                        }
                    } else {
                        board[10].setField(currentPlayerToken);
                    }
                } else {
                    board[4].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
        else if (userInput == 5) {
            if (board[5].getOccupation() == false) {
                if (board[11].getOccupation() == false) {
                    if (board[17].getOccupation() == false) {
                        if (board[23].getOccupation() == false) {
                            if (board[29].getOccupation() == false) {
                                if (board[35].getOccupation() == false) {
                                    board[35].setField(currentPlayerToken);
                                } else {
                                    board[29].setField(currentPlayerToken);
                                }
                            } else {
                                board[23].setField(currentPlayerToken);
                            }
                        } else {
                            board[17].setField(currentPlayerToken);

                        }
                    } else {
                        board[11].setField(currentPlayerToken);
                    }
                } else {
                    board[5].setField(currentPlayerToken);
                }
            }
            else {
                System.out.println("Dit veld is al bezet");
            }
        }
    }

/* {
            if (i < 6) {
                board[i] = new Field (Integer.toString(i));
            }
            else {
                board[i] = new Field("*");
            }
        } */

    //Een winconditie om het spel te winnen.

    public boolean gameWinCondition(Field[] board) {
        String currentPlayerToken = currentPlayer.getToken();
        //horizontale rijen!
        if (board[0].getField() == currentPlayerToken && board[1].getField() == currentPlayerToken &&
                board[2].getField() == currentPlayerToken && board[3].getField() == currentPlayerToken ||
                board[1].getField() == currentPlayerToken && board[2].getField() == currentPlayerToken &&
                        board[3].getField() == currentPlayerToken && board[4].getField() == currentPlayerToken ||
                board[2].getField() == currentPlayerToken && board[3].getField() == currentPlayerToken &&
                        board[4].getField() == currentPlayerToken && board[5].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[12].getField() == currentPlayerToken && board[13].getField() == currentPlayerToken &&
                board[14].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken ||
                board[13].getField() == currentPlayerToken && board[14].getField() == currentPlayerToken &&
                        board[15].getField() == currentPlayerToken && board[16].getField() == currentPlayerToken ||
                board[14].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken &&
                        board[16].getField() == currentPlayerToken && board[17].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[18].getField() == currentPlayerToken && board[19].getField() == currentPlayerToken &&
                board[20].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken ||
                board[19].getField() == currentPlayerToken && board[20].getField() == currentPlayerToken &&
                        board[21].getField() == currentPlayerToken && board[22].getField() == currentPlayerToken ||
                board[20].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken &&
                        board[22].getField() == currentPlayerToken && board[23].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[24].getField() == currentPlayerToken && board[25].getField() == currentPlayerToken &&
                board[26].getField() == currentPlayerToken && board[27].getField() == currentPlayerToken ||
                board[25].getField() == currentPlayerToken && board[26].getField() == currentPlayerToken &&
                        board[27].getField() == currentPlayerToken && board[28].getField() == currentPlayerToken ||
                board[26].getField() == currentPlayerToken && board[27].getField() == currentPlayerToken &&
                        board[28].getField() == currentPlayerToken && board[29].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[30].getField() == currentPlayerToken && board[31].getField() == currentPlayerToken &&
                board[32].getField() == currentPlayerToken && board[33].getField() == currentPlayerToken ||
                board[31].getField() == currentPlayerToken && board[32].getField() == currentPlayerToken &&
                        board[33].getField() == currentPlayerToken && board[34].getField() == currentPlayerToken ||
                board[32].getField() == currentPlayerToken && board[33].getField() == currentPlayerToken &&
                        board[34].getField() == currentPlayerToken && board[35].getField() == currentPlayerToken) {
            return true;
        }
        // verticale rijen
        else if (board[0].getField() == currentPlayerToken && board[6].getField() == currentPlayerToken &&
                board[12].getField() == currentPlayerToken && board[18].getField() == currentPlayerToken ||
                board[6].getField() == currentPlayerToken && board[12].getField() == currentPlayerToken &&
                        board[18].getField() == currentPlayerToken && board[24].getField() == currentPlayerToken ||
                board[12].getField() == currentPlayerToken && board[18].getField() == currentPlayerToken &&
                        board[24].getField() == currentPlayerToken && board[30].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[1].getField() == currentPlayerToken && board[7].getField() == currentPlayerToken &&
                board[13].getField() == currentPlayerToken && board[19].getField() == currentPlayerToken ||
                board[7].getField() == currentPlayerToken && board[13].getField() == currentPlayerToken &&
                        board[19].getField() == currentPlayerToken && board[25].getField() == currentPlayerToken ||
                board[13].getField() == currentPlayerToken && board[19].getField() == currentPlayerToken &&
                        board[25].getField() == currentPlayerToken && board[31].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[2].getField() == currentPlayerToken && board[8].getField() == currentPlayerToken &&
                board[14].getField() == currentPlayerToken && board[20].getField() == currentPlayerToken ||
                board[8].getField() == currentPlayerToken && board[14].getField() == currentPlayerToken &&
                        board[20].getField() == currentPlayerToken && board[26].getField() == currentPlayerToken ||
                board[14].getField() == currentPlayerToken && board[20].getField() == currentPlayerToken &&
                        board[26].getField() == currentPlayerToken && board[32].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[3].getField() == currentPlayerToken && board[9].getField() == currentPlayerToken &&
                board[15].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken ||
                board[9].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken &&
                        board[21].getField() == currentPlayerToken && board[27].getField() == currentPlayerToken ||
                board[15].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken &&
                        board[27].getField() == currentPlayerToken && board[33].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[4].getField() == currentPlayerToken && board[10].getField() == currentPlayerToken &&
                board[16].getField() == currentPlayerToken && board[22].getField() == currentPlayerToken ||
                board[10].getField() == currentPlayerToken && board[16].getField() == currentPlayerToken &&
                        board[22].getField() == currentPlayerToken && board[28].getField() == currentPlayerToken ||
                board[16].getField() == currentPlayerToken && board[22].getField() == currentPlayerToken &&
                        board[28].getField() == currentPlayerToken && board[34].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[5].getField() == currentPlayerToken && board[11].getField() == currentPlayerToken &&
                board[17].getField() == currentPlayerToken && board[23].getField() == currentPlayerToken ||
                board[11].getField() == currentPlayerToken && board[17].getField() == currentPlayerToken &&
                        board[23].getField() == currentPlayerToken && board[29].getField() == currentPlayerToken ||
                board[17].getField() == currentPlayerToken && board[23].getField() == currentPlayerToken &&
                        board[29].getField() == currentPlayerToken && board[35].getField() == currentPlayerToken) {
            return true;
        }
    /* diagonaal win conditie
verschil +7
12 19 26 33
6 13 20 27 | 13 20 27 34
0 7 14 21 | 7 14 21 28 | 14 21 28 35
1 8 15 22 | 8 15 22 29
2 9 16 23
 */
        else if (board[12].getField() == currentPlayerToken && board[19].getField() == currentPlayerToken &&
                board[26].getField() == currentPlayerToken && board[33].getField() == currentPlayerToken ||
                board[6].getField() == currentPlayerToken && board[13].getField() == currentPlayerToken &&
                        board[20].getField() == currentPlayerToken && board[27].getField() == currentPlayerToken ||
                board[13].getField() == currentPlayerToken && board[20].getField() == currentPlayerToken &&
                        board[27].getField() == currentPlayerToken && board[34].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[0].getField() == currentPlayerToken && board[7].getField() == currentPlayerToken &&
                board[14].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken ||
                board[7].getField() == currentPlayerToken && board[14].getField() == currentPlayerToken &&
                        board[21].getField() == currentPlayerToken && board[28].getField() == currentPlayerToken ||
                board[14].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken &&
                        board[28].getField() == currentPlayerToken && board[35].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[1].getField() == currentPlayerToken && board[8].getField() == currentPlayerToken &&
                board[15].getField() == currentPlayerToken && board[22].getField() == currentPlayerToken ||
                board[8].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken &&
                        board[22].getField() == currentPlayerToken && board[29].getField() == currentPlayerToken ||
                board[2].getField() == currentPlayerToken && board[9].getField() == currentPlayerToken &&
                        board[16].getField() == currentPlayerToken && board[23].getField() == currentPlayerToken) {
            return true;
        }
    /* verschil -5
    18 13 8 3
    24 19 14 9 | 19 14 9 4
    30 25 20 15 | 25 20 15 10 | 20 15 10 5
    31 26 21 16 | 26 21 16 11
    32 27 22 17
     */
        else if (board[18].getField() == currentPlayerToken && board[13].getField() == currentPlayerToken &&
                board[8].getField() == currentPlayerToken && board[3].getField() == currentPlayerToken ||
                board[24].getField() == currentPlayerToken && board[19].getField() == currentPlayerToken &&
                        board[14].getField() == currentPlayerToken && board[9].getField() == currentPlayerToken ||
                board[19].getField() == currentPlayerToken && board[14].getField() == currentPlayerToken &&
                        board[9].getField() == currentPlayerToken && board[4].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[30].getField() == currentPlayerToken && board[25].getField() == currentPlayerToken &&
                board[20].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken ||
                board[25].getField() == currentPlayerToken && board[20].getField() == currentPlayerToken &&
                        board[15].getField() == currentPlayerToken && board[10].getField() == currentPlayerToken ||
                board[20].getField() == currentPlayerToken && board[15].getField() == currentPlayerToken &&
                        board[10].getField() == currentPlayerToken && board[5].getField() == currentPlayerToken) {
            return true;
        }
        else if (board[31].getField() == currentPlayerToken && board[26].getField() == currentPlayerToken &&
                board[21].getField() == currentPlayerToken && board[16].getField() == currentPlayerToken ||
                board[26].getField() == currentPlayerToken && board[21].getField() == currentPlayerToken &&
                        board[16].getField() == currentPlayerToken && board[11].getField() == currentPlayerToken ||
                board[32].getField() == currentPlayerToken && board[27].getField() == currentPlayerToken &&
                        board[22].getField() == currentPlayerToken && board[17].getField() == currentPlayerToken) {
            return true;
        }

        else {
            return false;
        }
    }
}

