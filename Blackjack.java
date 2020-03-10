import java.util.Scanner;


public class Blackjack {
    public static void main (String[] args)
    {
        Scanner myScanner = new Scanner(System.in); //github comment


        float percentWins;
        int option= 1, handNum, gameNum, dealerWins, tieGames, cardNum, dealerNum, playerWins = 0;
        handNum = 0; dealerWins = 0; tieGames = 0;


        //initializes the number of games as 1
        gameNum = 1;
        P1Random myP1Random = new P1Random();
        cardNum = myP1Random.nextInt(13) + 1;
        handNum = handNum + cardNum;


        System.out.println(
                "START GAME #" + gameNum + "\n");
        // creates a random number between 1 and 13
        // adds the number on the card to the total number in your hand
        System.out.println(
                "Your card is a " + cardNum + "!\n" +
                "Your hand is: " + handNum + "\n");
//starts while loop
        while (option != 4) {
            if (option < 1 || option > 4)
            {
                System.out.println(
                        "Invalid input!\n" +
                        "Please enter an integer value between 1 and 4.\n");
            }


            //System.out.println(
            //        "Your card is a " + cardNum + "\n" +
            //        "Your hand is: " + handNum);

            System.out.println(
                    "1. Get another card\n" +
                            "2. Hold hand\n" +
                            "3. Print statistics\n" +
                            "4. Exit\n\n" +
                            "Choose an option:\n");
            option = myScanner.nextInt();

            switch (option) {
                case 1:
                    //option = myScanner.nextInt();
                    cardNum = myP1Random.nextInt(13) + 1;
                    //handNum = handNum + cardNum;
//changes 11 12 13 and 1 to jack queen king ace
                    if (cardNum == 11)
                    {
                        cardNum = 10;
                        handNum = handNum + cardNum;
                        System.out.println(
                                "Your card is a JACK!\n" +
                                "Your hand is: " + handNum);
                    }
                    else if (cardNum == 12)
                    {
                        cardNum = 10 ;
                        handNum = handNum + cardNum;
                        System.out.println(
                                "Your card is a QUEEN!\n" +
                                "Your hand is: " + handNum);
                    }
                    else if (cardNum == 13)
                    {
                        cardNum = 10;
                        handNum = handNum + cardNum;
                        System.out.println(
                                "Your card is a KING!\n" +
                                "Your hand is: " + handNum);
                    }
                    else if (cardNum == 1)
                    {
                        handNum = handNum + cardNum;
                        System.out.println(
                                "Your card is a ACE!\n" +
                                "Your hand is: " + handNum);
                    }
                    else
                    {
                        handNum = handNum + cardNum;
                        System.out.println(
                                "Your card is a " + cardNum + "!\n" +
                                "Your hand is: " + handNum + "\n");
                    }


                    if (handNum == 21) {
                        System.out.println("BLACKJACK! You win!\n");
                        handNum = 0;
                        gameNum = gameNum +1;
                        cardNum = myP1Random.nextInt(13) + 1;
                        handNum = handNum + cardNum;
                        playerWins = playerWins + 1;
                        System.out.println(
                                "START GAME #" + gameNum + "\n\n" +
                                "Your card is a " + cardNum + "!\n" +
                                "Your hand is: " + handNum + "\n");
                    }

                    else if (handNum > 21) {

                        //System.out.println(
                          //      "Your card is a " + cardNum + "\n" +
                            //    "Your hand is: " + handNum + "\n");
                        System.out.println("You exceeded 21! You lose.\n"
                                );

                        gameNum = gameNum + 1;

                        cardNum = myP1Random.nextInt(13) + 1;
                        handNum = 0;
                        //handNum = handNum + cardNum;

                                // if else here
                        if (cardNum == 11)
                        {
                            cardNum = 10;
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a JACK!\n" +
                                            "Your hand is: " + handNum + "\n");
                        }
                        else if (cardNum == 12)
                        {
                            cardNum = 10 ;
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a QUEEN!\n" +
                                            "Your hand is: " + handNum + "\n");
                        }
                        else if (cardNum == 13)
                        {
                            cardNum = 10;
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a KING!\n" +
                                            "Your hand is: " + handNum + "\n");
                        }
                        else if (cardNum == 1)
                        {
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a ACE!\n" +
                                            "Your hand is: " + handNum + "\n");
                        }
                        else
                        {
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "START GAME #" + gameNum + "\n\n");
                            System.out.println(
                                    "Your card is a " + cardNum + "!\n" +
                                            "Your hand is: " + handNum + "\n");
                        }


                        dealerWins = dealerWins + 1;

                        //"Your card is a " + cardNum + "!\n" +
                        //"Your hand is: " + handNum + "\n");

                    }
                    break;
//controls situations where the dealer goes over 21
                case 2:
                    dealerNum = 0;
                    dealerNum = dealerNum + myP1Random.nextInt(11) + 16;
                    System.out.println(
                            "Dealer's hand: " + dealerNum + "\n" +
                            "Your hand is: " + handNum + "\n");
                    if ((dealerNum > 21) || handNum > dealerNum)
                    {
                        System.out.println("You win!\n");
                        playerWins = playerWins + 1;
                        gameNum = gameNum + 1;
                        System.out.println(
                                "START GAME #" + gameNum + "\n");
                        handNum = 0;
                        if (cardNum == 11)
                        {
                            cardNum = 10;
                            System.out.println(
                                    "Your card is a JACK!\n" +
                                            "Your hand is: " + handNum);
                        }
                        else if (cardNum == 12)
                        {
                            cardNum = 10 ;
                            System.out.println(
                                    "Your card is a QUEEN!\n" +
                                            "Your hand is: " + handNum);
                        }
                        else if (cardNum == 13)
                        {
                            cardNum = 10;
                            System.out.println(
                                    "Your card is a KING!\n" +
                                            "Your hand is: " + handNum);
                        }
                        else if (cardNum == 1)
                        {
                            handNum += cardNum ;
                            System.out.println(
                                    "Your card is a ACE!\n" +
                                    "Your hand is: " + handNum);
                        }
                        else
                        {
                            System.out.println(
                                    "Your card is a " + cardNum + "!\n" +
                                            "Your hand is: " + handNum);
                        }
                        //handNum = 0;
                        cardNum = myP1Random.nextInt(13) + 1;
                        //handNum = handNum + cardNum;
                    }
                    else if (handNum < dealerNum)
                    
                    {
                        System.out.println("Dealer wins!\n");
                        dealerWins = dealerWins + 1;
                        gameNum = gameNum + 1;
                        handNum = 0;
                        cardNum = myP1Random.nextInt(13) + 1;
                        //handNum = handNum + cardNum;
                        System.out.println(
                                "START GAME #" + gameNum + "\n");
                        if (cardNum == 13)
                        {
                            cardNum = 10;
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a KING!\n" +
                                            "Your hand is: " + handNum);
                        }
                        else
                        {
                            handNum = handNum + cardNum;
                            System.out.println(
                                    "Your card is a " + cardNum + "!\n" +
                                            "Your hand is: " + handNum);
                        }

                    }
                    else if (handNum == dealerNum) {
                        System.out.println("It's a tie! No one wins!\n");
                        tieGames = tieGames + 1;
                        gameNum = gameNum + 1;
                        handNum = 0;
                        cardNum = myP1Random.nextInt(13) + 1;
                        handNum = handNum + cardNum;
                        System.out.println(
                                "START GAME #" + gameNum + "\n\n" +
                                "Your card is a " + cardNum + "!\n" +
                                "Your hand is: " + handNum + "\n");
                    }
                    break;

                case 3:
                    gameNum = gameNum - 1;
                    percentWins = (float)playerWins/gameNum;
                    System.out.println(
                            "Number of Player wins: " + playerWins + "\n" +
                                    "Number of Dealer wins: " + dealerWins + "\n" +
                                    "Number of tie games: " + tieGames + "\n" +
                                    "Total # of games played is: " + gameNum + "\n" +
                                    "Percentage of Player wins: " + percentWins * 100 + "%\n");

                    // print # games played, #player wins, #dealer wins,# ties
                    break;
            }
        }
        System.out.println(" ");
    }

    }










