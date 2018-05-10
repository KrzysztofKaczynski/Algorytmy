package kolkoikrzyzyk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ElementsListener implements ActionListener {
    private Element[][] elemenst;
    private int[][] ints;
    JPanel plansza;
    public ElementsListener(Element[][] el, int[][] w, JPanel p) {
        elemenst=el;
        ints=w;
        plansza=p;
    }

    private boolean sprawdz(int a, boolean t)
    {
        if(a==1){
            //===== poziom
            if(ints[0][0]==1 && ints[0][1]==1 && ints[0][2]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[1][0]==1 && ints[1][1]==1 && ints[1][2]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[2][0]==1 && ints[2][1]==1 && ints[2][2]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }
        }
        if(a==2){
            //==== pion dla usera
            if(ints[0][0]==1 && ints[1][0]==1 && ints[2][0]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[0][1]==1 && ints[1][1]==1 && ints[2][1]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[0][2]==1 && ints[1][2]==1 && ints[2][2]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[0][0]==1 && ints[1][1]==1 && ints[2][2]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }

            if(ints[0][2]==1 && ints[1][1]==1 && ints[2][0]==1) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygrales!!");
                }
                return true;
            }



            if(ints[0][2]==2 && ints[1][1]==2 && ints[2][0]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[0][0]==2 && ints[0][1]==2 && ints[0][2]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[1][0]==2 && ints[1][1]==2 && ints[1][2]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[2][0]==2 && ints[2][1]==2 && ints[2][2]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }
            //========== w dol to pion
            if(ints[0][0]==2 && ints[1][0]==2 && ints[2][0]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[0][1]==2 && ints[1][1]==2 && ints[2][1]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[0][2]==2 && ints[1][2]==2 && ints[2][2]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }

            if(ints[0][0]==2 && ints[1][1]==2 && ints[2][2]==2) {
                if(t) {
                    JOptionPane.showMessageDialog(null, "Wygral komputer!!");
                }
                return true;
            }
        }
        return false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Element source = (Element) e.getSource();
        int x = 0,y = 0;

        boolean koniec = false;

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(elemenst[i][j]== source)// [1]
                {
                    x=i;
                    y=j;
                    break;
                }
            }
        }

        elemenst[x][y].stan=1;//[2]
        ints[x][y]=1;//[2]
        koniec = sprawdz(1, true);//[2]


        if(koniec)
        {

            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    elemenst[i][j].stan=0;//[3]
                    ints[i][j]=0;//[3]
                }
            }
            plansza.repaint();//[3]

        }

        Random rn = new Random();
        int rn1=0,rn2=0;

        int time=0;
        if(koniec == false) {//[4]
            while(true)
            {
                time++;
                rn1=rn.nextInt(3);//[4]
                rn2=rn.nextInt(3); //[4]
                if(time>70)//[5]
                {
                    koniec=true;//[5]
                    break;//[5]
                }
                if(elemenst[rn1][rn2].stan == 0) {//[6]
                    elemenst[rn1][rn2].stan=2;
                    ints[rn1][rn2]=2;//[6]
                    break;
                }
                else {
                    continue;
                }


            }
        }

        plansza.repaint();
        koniec=sprawdz(2, true);//[7]
        boolean end=true;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(ints[i][j]==0) {
                    end = false;
                }
            }
        }
        if(sprawdz(1, false)==false && sprawdz(2, false)==false && end == true) {//[8]
            JOptionPane.showMessageDialog(null, "Remis!");
            koniec=true;
        }
        if(koniec)//[9]
        {

            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    elemenst[i][j].stan=0;
                    ints[i][j]=0;
                }
            }
            plansza.repaint();//[9]
            koniec=false;

        }





    }
}
