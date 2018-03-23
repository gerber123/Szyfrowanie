
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

public class Zaszyfruj
{
public static String zmiennik(String wiadomosc)
{
    String wyraz = "";
    int a = 0;
    char tab[] = new char[wiadomosc.length()];
    for(int i=0; i<=wiadomosc.length()-1;i++)
    {
        tab[i] = wiadomosc.charAt(i);
        
        
        if(tab[i]=='a')
            tab[i]='*';
        else if(tab[i]=='b'||tab[i]=='B')
            tab[i]='x';
        else if(tab[i]=='c'||tab[i]=='C')
            tab[i]='c';
        else if(tab[i]=='d'||tab[i]=='D')
            tab[i]='v';
        else if(tab[i]=='e'||tab[i]=='E')
            tab[i]='b';
        else if(tab[i]=='f'||tab[i]=='F')
            tab[i]='n';
        else if(tab[i]=='g'||tab[i]=='G')
            tab[i]='m';
        else if(tab[i]=='h'||tab[i]=='H')
            tab[i]='l';
        else if(tab[i]=='i'||tab[i]=='I')
            tab[i]='k';
        else if(tab[i]=='j'||tab[i]=='J')
            tab[i]=',';
        else if(tab[i]=='k'||tab[i]=='K')
            tab[i]='w';
        else if(tab[i]=='l'||tab[i]=='L')
            tab[i]='e';
        else if(tab[i]=='m'||tab[i]=='M')
            tab[i]='r';
        else if(tab[i]=='n'||tab[i]=='N')
            tab[i]='t';
        else if(tab[i]=='o'||tab[i]=='O')
            tab[i]='y';
        else if(tab[i]=='p'||tab[i]=='P')
            tab[i]='u';
        else if(tab[i]=='q'||tab[i]=='Q')
            tab[i]='i';
        else if(tab[i]=='r'||tab[i]=='R')
            tab[i]='o';
        else if(tab[i]=='s'||tab[i]=='S')
            tab[i]='p';
        else if(tab[i]=='t'||tab[i]=='T')
            tab[i]='!';
        else if(tab[i]=='u'||tab[i]=='U')
            tab[i]='s';
        else if(tab[i]=='v'||tab[i]=='V')
            tab[i]='d';
        else if(tab[i]=='w'||tab[i]=='W')
            tab[i]='f';
        else if(tab[i]=='x'||tab[i]=='X')
            tab[i]='g';
        else if(tab[i]=='y'||tab[i]=='Y')
            tab[i]='h';
        else if(tab[i]=='z'||tab[i]=='Z')
            tab[i]='j';
        else if(tab[i]=='1')
            tab[i]='-';
        else if(tab[i]=='2')
            tab[i]=';';
        else if(tab[i]=='3')
            tab[i]=':';
        else if(tab[i]=='4')
            tab[i]='[';
        else if(tab[i]=='5')
            tab[i]='{';
        else if(tab[i]=='6')
            tab[i]=']';
        else if(tab[i]=='7')
            tab[i]='}';
        else if(tab[i]=='8')
            tab[i]='+';
        else if(tab[i]=='9')
            tab[i]='=';
        else if(tab[i]=='0')
            tab[i]=')';
        else if(tab[i]==' ')
            tab[i]='a';
        else if(tab[i]=='?')
            tab[i]='#';
        
        wyraz+=tab[i];
        
        
    }
     
    
   // String ostatni = tab.toString();
    
    return wyraz;
}
}

