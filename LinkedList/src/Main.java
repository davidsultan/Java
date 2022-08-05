import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	private static List<Album> albums = new Vector<Album>();
		// They are linked with interfaces
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Album album = new Album("Stormbringer", "Deep Purple");
		album.addSong("Stormbringer", 4.0);
		album.addSong("Love don't mean anyting", 4.2);
		album.addSong("Holy Man", 4.4);
		album.addSong("Hold On", 4.6);
		album.addSong("Lady double eealer", 4.8);
		album.addSong("You can't do it", 4.10);
		album.addSong("High ball shooter", 4.20);
		album.addSong("The gypsy", 4.30);
		album.addSong("Soldier of fortune", 4.40);
		albums.add(album);
		
		album = new Album("For those about to rock", "AC,Dc");
		album.addSong("For those about to rock", 4.0);
		album.addSong("I put the finger on your ass Lol", 4.2);
		album.addSong("Let's go", 4.4);
		album.addSong("Inject the venom", 4.6);
		album.addSong("Snowballed", 4.8);
		album.addSong("Evill walks", 4.10);
		album.addSong("C.O.D", 4.20);
		album.addSong("Breaking the rules", 4.30);
		album.addSong("Night of the long knives", 4.40);
		albums.add(album);
		
		List<Song> playList = new ArrayList<Song>();
		albums.get(0).addToPlayList("You can't do it", playList);
		albums.get(0).addToPlayList("Holy Man", playList);
		albums.get(0).addToPlayList("Speed King", playList); // Doesn't exist.
		albums.get(0).addToPlayList(9, playList);
		albums.get(1).addToPlayList(8, playList);
		albums.get(1).addToPlayList(3, playList);
		albums.get(1).addToPlayList(2, playList);
		albums.get(1).addToPlayList(24, playList);// There's no track 24
		
		play(playList);
		
		
	}
	
	private static void play(List<Song> playList){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0){
			System.out.println("No song in playlist");
			return;
		}else{
			System.out.println("Now playing " + listIterator.next().toString());
			printMenu();
		}
			
		
		while(!quit){
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action){
			
			case 0:
				System.out.println("Playlist complete.");
				quit = true;
				break;
			case 1:
				if(!forward){
					if(listIterator.hasNext())
						listIterator.next();
					forward = true;
				}
				if(listIterator.hasNext())
					System.out.println("Now playing " + listIterator.next().toString());
				else{
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward){
					if(listIterator.hasPrevious())
						listIterator.previous();
					forward = false;
				}
				if(listIterator.hasPrevious())
					System.out.println("Now playing " + listIterator.previous().toString());
				else{
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward){
					if(listIterator.hasPrevious()){
						System.out.println("Now playing " + listIterator.previous().toString());
						forward = false;
					}else{
						System.out.println("We are at the start of the list");
					}
				}else
					if(listIterator.hasNext()){
						System.out.println("Now replaying " + listIterator.next().toString());
						forward = true;
					}else
						System.out.println("We haev rached the end of the list");
				break;			
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() >0){
					listIterator.remove();
					if(listIterator.hasNext())
						System.out.println("Now playing " + listIterator.next());
					else if(listIterator.hasPrevious())
						System.out.println("Now playing " + listIterator.previous());
				}
				break;
			}
		}
	}
	
	private static void printMenu(){
		System.out.println("Available options:\npress");
		System.out.println("0 - to quit\n" +
		"1 - to play next song\n"+
		"2 - to play previous soong\n" +
		"3 - to replay the current song\n" +
		"4 - to list songs in the olay list\n" + 
		"5 - to print available actions.\n" + 
		"6 - to delete current song");
	}
	
	private static void printList(List<Song> playList){
		Iterator<Song> iterator = playList.iterator();
		System.out.println("======================================");
		while(iterator.hasNext())
			System.out.println(iterator.next());
		System.out.println("======================================");
	}

}





