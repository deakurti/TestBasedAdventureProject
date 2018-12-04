public class Board {
    
        private Room [] [] map; //field//
            public Board (Room [][] map){
                this.map = map;
        }

    public void print() {
        String row = "";
        for (int i = 0; i < map.length; i++){
            row = ""
        for (int j = 0; j < map.length; j++) {
            row = map[i][j].toString();
        }
            System.out.println(row);

    }
}

