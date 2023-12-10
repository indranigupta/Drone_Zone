public class DroneZone {

    private static void placeDrone(int[][] grid, int x, int y) {
        grid[x][y] = 1;
    }

    private static void findDrone(int[][] grid, int targetX, int targetY) {
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    System.out.println("Drone found at coordinates : (" + i + ", " + j + ")");
                    findTarget(grid, i, j, targetX, targetY);
                }
            }
        }
    }

    private static void findTarget(int[][] grid, int startX, int startY, int targetX, int targetY) {
        System.out.println("The path taken by the drone:");

        int currX = startX;
        int currY = startY;

        while (currX != targetX || currY != targetY) {
            System.out.println("(" + currX + ", " + currY + ")");
            if(currX < targetX) {
                currX++;
            }
            else if(currX > targetX) {
                currX--;
            }

            if(currY < targetY) {
                currY++;
            }
            else if(currY > targetY) {
                currY--;
            }
        }
        System.out.println("(" + currX + ", " + currY + ")");
    }

    public static void main(String[] args) {
        int row = 5;
        int col = 5;

        int[][] grid = new int[row][col];

        placeDrone(grid, 1, 1);
        placeDrone(grid, 3, 3);
        placeDrone(grid, 0, 4);
        placeDrone(grid, 2, 0);

        int targetX = 3;
        int targetY = 2;

        findDrone(grid, targetX, targetY);
    }
}

