package com.example.myfirstpackage;


	interface Playable{
		int number =10;
		void play();
	}
class Guitar implements Playable {
	@Override
	public void play() {
		System.out.println("once");
			
		}
		
	}
class Piano implements Playable{
	@Override
	public void play() {
		System.out.println("two");
			
		}
	
	

	public static void main(String[] args) {
		Guitar g1 = new Guitar();
		g1.play();
		Piano p1 = new Piano();
		p1.play();
		System.out.println(g1.number);
		
		

	}

	}
