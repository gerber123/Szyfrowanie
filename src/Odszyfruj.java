
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class Odszyfruj
{
public static String zmiennik(String wiadomosc)
{
   int a =12;
   String wyraz ="";
    char tab[] = new char[wiadomosc.length()];
    for(int i=0; i<=wiadomosc.length()-1;i++)
    {
        tab[i] = wiadomosc.charAt(i);
        
        
        if(tab[i]=='*')
            tab[i]='a';
        else if(tab[i]=='x')
            tab[i]='b';
        else if(tab[i]=='c')
            tab[i]='c';
        else if(tab[i]=='v')
            tab[i]='d';
        else if(tab[i]=='b')
            tab[i]='e';
        else if(tab[i]=='n')
            tab[i]='f';
        else if(tab[i]=='m')
            tab[i]='g';
        else if(tab[i]=='l')
            tab[i]='h';
        else if(tab[i]=='k')
            tab[i]='i';
        else if(tab[i]==',')
            tab[i]='j';
        else if(tab[i]=='w')
            tab[i]='k';
        else if(tab[i]=='e')
            tab[i]='l';
        else if(tab[i]=='r')
            tab[i]='m';
        else if(tab[i]=='t')
            tab[i]='n';
        else if(tab[i]=='y')
            tab[i]='o';
        else if(tab[i]=='u')
            tab[i]='p';
        else if(tab[i]=='i')
            tab[i]='g';
        else if(tab[i]=='o')
            tab[i]='r';
        else if(tab[i]=='p')
            tab[i]='s';
        else if(tab[i]=='!')
            tab[i]='t';
        else if(tab[i]=='s')
            tab[i]='u';
        else if(tab[i]=='d')
            tab[i]='v';
        else if(tab[i]=='f')
            tab[i]='w';
        else if(tab[i]=='g')
            tab[i]='x';
        else if(tab[i]=='h')
            tab[i]='y';
        else if(tab[i]=='j')
            tab[i]='z';
                else if(tab[i]=='-')
            tab[i]='1';
        else if(tab[i]==';')
            tab[i]='2';
        else if(tab[i]==':')
            tab[i]='3';
        else if(tab[i]=='[')
            tab[i]='4';
        else if(tab[i]=='{')
            tab[i]='5';
        else if(tab[i]==']')
            tab[i]='6';
        else if(tab[i]=='}')
            tab[i]='7';
        else if(tab[i]=='+')
            tab[i]='8';
        else if(tab[i]=='=')
            tab[i]='9';
        else if(tab[i]==')')
            tab[i]='0';
        else if(tab[i]=='a')
            tab[i]=' ';
        else if(tab[i]=='#')
            tab[i]='?';

        wyraz+=tab[i];
    }
     
    
    
    return wyraz;
}
}



