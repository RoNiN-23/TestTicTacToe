package ru.ronin.tictactoe;

public class Game
{
    private Square[][] field;
    private int squareCount;

    public Game()
    {
        field = new Square[3][3];
        squareCount = 0;
        // заполнение поля
        for (int i = 0, l = field.length; i < l; i++)
        {
            for (int j = 0, l2 = field[i].length; j < l2; j++)
            {
                field[i][j] = new Square();
                squareCount++;
            }
        }
    }

    public Square[][] getField()
    {
        return field;
    }
}
