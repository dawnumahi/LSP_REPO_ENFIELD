package org.howard.edu.lsp.midterm.question5;

public class Music implements StreamingService{
    private String title;

        //Constructor.    
        public Music(String title){
            this.title = title;
        }
/** 
 * Overrides the methods of the inteface.
*/
        public void play(){
            System.out.println("Playing music: " + title);
        }

        public void pause(){
            System.out.println("Pausing music: " + title);
        }  

        public void stop(){
            System.out.println("Stopping music: " + title);
        }

        public void addToPlaylist(String playlistName){
            System.out.println("Added " + title + "to " + playlistName + ".");
        }
}
