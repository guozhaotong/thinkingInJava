package beforeChapter7;

/**
 * @author 郭朝彤
 * @date 2017/11/18.
 */
class Game{
    Game(){
        System.out.println("Game constructor");
    }
    private void test(){
        System.out.println("test for game");
    }
}

class BoardGame extends Game{
    BoardGame(int i){
//        super();
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame{
//    private BoardGame boardGame;
    Chess(){
        super(11);
//        this.boardGame=boardGame;
        System.out.println("Chess constructor");
    }
     public static void main(String[] args){
         Chess x = new Chess();
        BoardGame boardGame = x;
        Game game = x;
//        game.test();
     }
}
