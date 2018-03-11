package com.example.lenovo.miwoks;

/**
 * Created by lenovo on 3/11/2018.
 */

public class word {

    String Defalutm;
    String Miwoksm;
    int has_image = -1;
    int imageURl = has_image;

    word(String a,String b)
    {
        Defalutm = a;
        Miwoksm =b;

    }


    word(String a,String b , int image)
    {
       Defalutm = a;
       Miwoksm =b;
       imageURl = image;
    }

    public String VersionName()
    {
        return Defalutm;
    }
    public String VersionNumber()
    {
        return Miwoksm;
    }
    public int getImageURL()
    {
        return imageURl;
    }
    public boolean has_image_check()
    {
        return has_image != imageURl;
    }
}
