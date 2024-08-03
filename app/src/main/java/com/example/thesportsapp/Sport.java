// This class will act as a model class.

package com.example.thesportsapp;

public class Sport
{
    int SportImage;
    String SportName;

    public Sport(int sportImage, String sportName)
    {
        this.SportImage = sportImage;
        this.SportName = sportName;
    }

    public int getSportImage()
    {
        return SportImage;
    }

    public void setSportImage(int sportImage)
    {
        SportImage = sportImage;
    }

    public String getSportName()
    {
        return SportName;
    }

    public void setSportName(String sportName)
    {
        SportName = sportName;
    }
}
