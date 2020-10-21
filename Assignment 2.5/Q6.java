class Q6{
    public static void main (String[] args) {
        DisplayBox(5,3);
    }
    
    public static void DisplayBox(int width, int height){
        for( int x = 0; x < height; x++) {
            for(int y = 0; y < width; y++){
                System.out.print("$");
            }
            System.out.println("");
        }
        
    }
}


