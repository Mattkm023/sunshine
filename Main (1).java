class Main{
        public static void moon() {
          System.out.print( "dim" );
        }
        public static void winter(int temp) {   //boooooooooo
            if( temp > 50){
                System.out.print( " * " );
                temp -= 1;
                winter(temp);
            }
        }
        public static void main(String[] args) {
            winter(65);
            moon();
      }
}
          
