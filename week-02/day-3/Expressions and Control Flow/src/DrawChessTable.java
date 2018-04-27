public class DrawChessTable {
// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {

            if ((i & 1) == 0)
            {
                System.out.println("% % % %");
            }
            else
            {
                System.out.println(" % % % %");
            }

        }


    }
}
