package Game;

import Rooms.Room;
import Rooms.America;
import Rooms.Infirmary;


public class Board {
    
    private Room [] [] map; //field//
    public int count = 0;
    private int area;


    public Board (Room [][] map){
                this.map = map;
        }

    public void build() {
        String row = "";

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                area++;
                row = map[i][j].toString();
                map[i][j] = new Room(i, j);
            }
        }

        //winning room//
        int i  = (int)(Math.random()*map.length);
        int j  = (int)(Math.random()*map.length);

        if (i==0 && j==0)
        {
            i  = (int)(Math.random()*map.length);
            j  = (int)(Math.random()*map.length);
        }
        map[i][j] = new America (i,j);

        public void print {
            String printstr = " ";
            for(int x = 0 ; i < map.length; i++)
            {
                for(int y = 0; j<map[j].length; j++)
                {
                    printstr += map[i][j];
                }
                printstr += "/n";
            }
            System.out.println(printstr);
        }



    }


}



