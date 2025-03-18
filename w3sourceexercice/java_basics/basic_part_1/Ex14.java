public class Ex14 {
    
      public static void main(String[] args) {
        // Print a pattern to create the Moroccan flag
        // Red background with a properly shaped green five-pointed star in the center
        
        // Define width and height of the flag
        final int WIDTH = 50;
        final int HEIGHT = 25;
        
        // Create a 2D array to represent the flag
        char[][] flag = new char[HEIGHT][WIDTH];
        
        // Fill the background with 'R' to represent red
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                flag[i][j] = 'R';
            }
        }
        
        // Draw a more accurate pentagram star in the center
        // Star coordinates (a proper pentagram)
        drawStar(flag, WIDTH/2, HEIGHT/2, HEIGHT/3);
        
        // Print the flag
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(flag[i][j]);
            }
            System.out.println();
        }
        
        // Print a version with color if supported by the terminal
        System.out.println("\nColor version (if terminal supports ANSI colors):");
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (flag[i][j] == '*') {
                    System.out.print("\033[42m*\033[0m"); // Green star
                } else {
                    System.out.print("\033[41m \033[0m"); // Red background
                }
            }
            System.out.println();
        }
    }
    
    // Method to draw a more accurate pentagram star
    private static void drawStar(char[][] flag, int centerX, int centerY, int size) {
        // Points of a pentagram star
        int[][] points = new int[5][2];
        double angle = -Math.PI / 2; // Start at top
        
        // Calculate the five outer points of the star
        for (int i = 0; i < 5; i++) {
            points[i][0] = centerX + (int)(size * Math.cos(angle));
            points[i][1] = centerY + (int)(size * Math.sin(angle));
            angle += 2 * Math.PI / 5;
        }
        
        // Draw lines between non-adjacent points to form the pentagram
        for (int i = 0; i < 5; i++) {
            // Connect to the point that is 2 positions ahead (mod 5)
            drawLine(flag, points[i][0], points[i][1], 
                         points[(i + 2) % 5][0], points[(i + 2) % 5][1]);
        }
    }
    
    // Method to draw a line using Bresenham's line algorithm
    private static void drawLine(char[][] flag, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;
        
        while (true) {
            if (y1 >= 0 && y1 < flag.length && x1 >= 0 && x1 < flag[0].length) {
                flag[y1][x1] = '*';
            }
            
            if (x1 == x2 && y1 == y2) break;
            
            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (e2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }
}
