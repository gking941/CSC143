//This is just a hackjob on the original code to keep it running continuously - modifications in the comments.


public class QueensGregoryKing {
	
	private static int count; //Thank you Will for that hint - had been stumped on that problem!!
    public static void main(String[] args) {
        int size = 8; //set the board size
        System.out.println();
        Board b = new Board(size);
        count = 1; 
        solve(b);
    }

    private static boolean explore(Board b, int col) {
        if (col > b.size()) { 
            b.print();;
            System.out.println(count);;
            System.out.println();;
            count++;
            return true;
        }else {
            for (int row = 1; row <= b.size(); row++)
                if (b.safe(row, col)) {
                    b.place(row, col);
                    explore(b, col + 1); //main difference is I removed this if loop
                    b.remove(row, col);
                }
            return false;
        }
    }

    public static void solve(Board solution) {
        if (!explore(solution, 1)) { 
            System.out.println("No  more solutions."); //and the else loop after this just...never was reached. 

        }
    }
}
