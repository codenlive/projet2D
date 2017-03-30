
public class Lion extends Predator {

	
	public Lion(int posi ,int posj){
		alive=true;
		age_reproductif=20;
		reserve_eau=20;
		reserve_food=20;
		age=1;
		id=6;
		endurance=3;
		this.posi=posi;
		this.posj=posj;
		perimeterVisionOriental=4;
		perimeterVisionDiagonal=1;
		SpriteDemo.myWorld[posi][posj]=this.id;
	}
	
		//	}

		//	}
	
	//-------------------fin de deplacement
	public void chasse(){
		double []tab=new double[8]; //tableau pour recuperer la plus petite distance parmis la distance de chaque voisins
		int t=0;//variable pour sortir de la boucle
		int posx=0,posy=0;//recupere les coordonees du mouton 
		int d=0,d1=0,d2=0,d3=0,d4=0,d5=0,d6=0,d7=0;// les distances des 8 voisins jusqu au mouton
		
			for(int i=0;i<120;i++){
				for(int j=0;j<64;j++){ //recherche de mouton dans la map
					if(SpriteDemo.myWorld[i][j]==38){
						posx=i;
						posy=j;    //si on trouve un mouton on stocke sa position 
					}
					
					//on calcule la distance entre les 8 voisins du lion et la position i,j du mouton
					d=(int)(Math.sqrt(((posx-posi)*(posx-posi))+((posy-posj+1)*(posy-posj+1))));
					d1=(int)(Math.sqrt(((posx-posi-1)*(posx-posi-1))+((posy-posj+1)*(posy-posj+1))));
					d2=(int)(Math.sqrt(((posx-posi-1)*(posx-posi-1))+((posy-posj)*(posy-posj))));
					d3=(int)(Math.sqrt(((posx-posi-1)*(posx-posi-1))+((posy-posj-1)*(posy-posj-1))));
					d4=(int)(Math.sqrt(((posx-posi)*(posx-posi))+((posy-posj-1)*(posy-posj-1))));
					d5=(int)(Math.sqrt(((posx-posi+1)*(posx-posi+1))+((posy-posj-1)*(posy-posj-1))));
					d6=(int)(Math.sqrt(((posx-posi+1)*(posx-posi+1))+((posy-posj)*(posy-posj))));
					d7=(int)(Math.sqrt(((posx-posi+1)*(posx-posi+1))+((posy-posj+1)*(posy-posj+1))));
					
					//si un des voisins du lion est un obstacle on prend pas en consideration sa distance
					if(SpriteDemo.myWorld[i][j+1]!=2){
						d=0;}
					if(SpriteDemo.myWorld[i-1+120%64][j+1]!=2){
						d1=0;}
					if(SpriteDemo.myWorld[i-1+120%64][j]!=2){
						d2=0;}
					if(SpriteDemo.myWorld[i-1+120%64][j-1+120%64]!=2){
						d3=0;}
					if(SpriteDemo.myWorld[i][j-1+120%64]!=2){
						d4=0;}
					if(SpriteDemo.myWorld[i+1][j-1+120%64]!=2){
						d5=0;}
					if(SpriteDemo.myWorld[i+1][j]!=2){
						d6=0;}
					if(SpriteDemo.myWorld[i+1][j+1]!=2){
						d7=0;}
					
					//on stocke toute les distances des voisins dans un tableau et on en recherche le
					//minimum pour avoir le chemin le plus cour
					tab[0]=d;
					tab[1]=d1;
					tab[2]=d2;
					tab[3]=d3;
					tab[4]=d4;
					tab[5]=d5;
					tab[6]=d6;
					tab[7]=d7;
					double min=tab[0];
					for(int k=0;k<tab.length;k++){
						if(tab[k]<tab[k+1]){
							min=tab[k];
						}else{
							min=tab[k+1];
						}
					}
				
					//si le minimum correspond a un certain voisin et que ce voisin n a pas d obstacle 
					//alors le lion va sur la case de ce voisin 
				if(min==d&&SpriteDemo.myWorld[i][j+1]==2){
					SpriteDemo.myWorld[i][j+1]=6;
					SpriteDemo.myWorld[i][j]=2;//ou herbe
				}
				if(min==d1&&SpriteDemo.myWorld[i-1+120%64][j+1]==2){
					SpriteDemo.myWorld[i-1+120%64][j+1]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				if(min==d2&&SpriteDemo.myWorld[i-1+120%64][j]==2){
					SpriteDemo.myWorld[i-1+120%64][j]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				if(min==d3&&SpriteDemo.myWorld[i-1+120%64][j-1+120%64]==2){
					SpriteDemo.myWorld[i-1+120%64][j-1+120%64]=6;
					SpriteDemo.myWorld[i][j]=2;  
				}
				if(min==d4&&SpriteDemo.myWorld[i][j-1+120%64]==2){
					SpriteDemo.myWorld[i][j-1+120%64]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				if(min==d5&&SpriteDemo.myWorld[i][j+1]==2){
					SpriteDemo.myWorld[i][j+1]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				if(min==d6&&SpriteDemo.myWorld[i][j+1]==2){
					SpriteDemo.myWorld[i][j+1]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				if(min==d7&&SpriteDemo.myWorld[i][j+1]==2){
					SpriteDemo.myWorld[i][j+1]=6;
					SpriteDemo.myWorld[i][j]=2;
				}
				
				//si la distance restante equivaut a une case pour atteindre le mouton le lion le bouffe
				
				if(d==1||d1==1||d2==1||d3==1||d4==1||d5==1||d6==1||d7==1){
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i][j+1]==38){
						SpriteDemo.myWorld[i][j+1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i-1][j+1]==38){
						SpriteDemo.myWorld[i-1][j+1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i+1][j+1]==38){
						SpriteDemo.myWorld[i+1][j+1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i-1][j]==38){
						SpriteDemo.myWorld[i-1][j]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i+1][j]==38){
						SpriteDemo.myWorld[i+1][j]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i-1][j-1]==38){
						SpriteDemo.myWorld[i-1][j-1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i][j-1]==38){
						SpriteDemo.myWorld[i][j-1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					if(SpriteDemo.myWorld[i][j]==6&&SpriteDemo.myWorld[i+1][j-1]==38){
						SpriteDemo.myWorld[i+1][j-1]=6;
						SpriteDemo.myWorld[i][j]=2;
					}
					
				 //ET ON SORT DU WHILE
				}else{ //sinon on reinitiaise les distances a 0 pour reboucler
					d=0;
					d1=0;
					d2=0;
					d3=0;
					d4=0;
					d5=0;
					d6=0;
					d7=0;
					}
				}
			}
		}
	}
	
	
	/*public int[] getNearestAgent(){
		int orient=0;
		int tab_localisation[]=new int[3];
		
		orient=0;
		//a modifier car prend pas en compte lorsque plusieurs animaux sont a cote
		while(orient<perimeterVisionDiagonal){//bas droite
			for (Agent a:agents){
			if(myWorld[posi+orient][posj+orient]==a.id){
				tab_localisation[0]=posi+orient;
				tab_localisation[1]=posj+orient;
				tab_localisation[2]=a.id;
			}
			else
				orient++;
			}
		}
			
		orient=0;
		while(orient<perimeterVisionDiagonal){//bas gauche 
			for (Agent a:agents){
			if(myWorld[posi+orient][posj-orient]==a.id){
				tab_localisation[0]=posi+orient;
				tab_localisation[1]=posj-orient;
				tab_localisation[2]=a.id;
			}
			else
				orient++;
			}
		}
		
		
		
		
			orient=perimeterVisionDiagonal;
			while(orient<perimeterVisionDiagonal){//haut gauche
				for (Agent a:agents){
				if(myWorld[posi-orient][posj-orient]==a.id){
					tab_localisation[0]=posi-orient;
					tab_localisation[1]=posj-orient;
					tab_localisation[2]=a.id;
					
				}
				else
					orient--;
				
				}
		}
			orient=0;
			while(orient<perimeterVisionDiagonal){//haut droite
				for (Agent a:agents){
				if(myWorld[posi-orient][posj+orient]==a.id){
					tab_localisation[0]=posi-orient;
					tab_localisation[1]=posj+orient;
					tab_localisation[2]=a.id;
					
				}
				else
					orient++;
				
				}
		}
			
			
			orient=0;
			while(orient<perimeterVisionOriental){//droite
				for (Agent a:agents){
				if(myWorld[posi][posj+orient]==a.id){
					tab_localisation[0]=posi;
					tab_localisation[1]=posj+orient;
					tab_localisation[2]=a.id;
					
				}
				else
					orient++;
				
				}
		}
			orient=0;
			while(orient<perimeterVisionOriental){//gauche
				for (Agent a:agents){
				if(myWorld[posi][posj-orient]==a.id){
					tab_localisation[0]=posi;
					tab_localisation[1]=posj-orient;
					tab_localisation[2]=a.id;
					
				}
				else
					orient++;
				
				}
		}
			orient=0;
			while(orient<perimeterVisionOriental){//haut
				for (Agent a:agents){
				if(myWorld[posi-orient][posj]==a.id){
					tab_localisation[0]=posi-orient;
					tab_localisation[1]=posj;
					tab_localisation[2]=a.id;
					
				}
				else
					orient++;
				
				}
		}
			orient=0;
			while(orient<perimeterVisionOriental){//bas
				for (Agent a:agents){
				if(myWorld[posi+orient][posj]==a.id){
					tab_localisation[0]=posi+orient;
					tab_localisation[1]=posj;
					tab_localisation[2]=a.id;
					
				}
				else
					orient++;
				
				}
		}
			
			return tab_localisation;
			
	}
	
	public void getTarget(){
		for (Prey p:proies){
			if (getNearestAgent()[2]==p.id){ //a changer pour mettre id de l'animal qu'il peut manger
			this.target=p;
			}
		}
	}
	public int [] posTypeAgentNorth(){
		int [] tab_pos=new int [3];
		//test nord
		tab_pos[0]=posi-1;tab_pos[1]=posj;tab_pos[2]=myWorld[posi-1][posj];
		return tab_pos;
	}
	
	public int [] posTypeAgentNorthEast(){
	int [] tab_pos=new int [3];	
		//test nord est
			tab_pos[0]=posi-1;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi-1][posj];
			return tab_pos;
	}
	public int [] posTypeAgentEast(){
		int [] tab_pos=new int [3];	
		//test est
		tab_pos[0]=posi;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi][posj+1];
		return tab_pos;
	}
	
	public int [] posTypeAgentSouthEast(){
		int [] tab_pos=new int [3];	
		//test sud est
		tab_pos[0]=posi+1;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi+1][posj+1];
		return tab_pos;
	}
	public int [] posTypeAgentSouth(){
		int [] tab_pos=new int [3];	
		//test sud
		tab_pos[0]=posi+1;tab_pos[1]=posj;tab_pos[2]=myWorld[posi+1][posj];
		return tab_pos;
	}
	public int [] posTypeAgentSouthWest(){
		int [] tab_pos=new int [3];	
		//test sud ouest
		tab_pos[0]=posi+1;tab_pos[1]=posj-1;tab_pos[2]=myWorld[posi+1][posj-1];
		return tab_pos;
	}
	public int [] posTypeAgentWest(){
		int [] tab_pos=new int [3];		
		//test ouest
		tab_pos[0]=posi;tab_pos[1]=posj+1;tab_pos[2]=myWorld[posi][posj+1];
		return tab_pos;
	}
	public int [] posTypeAgentNorthWest(){
		int [] tab_pos=new int [3];	
		//test nord ouest
		tab_pos[0]=posi-1;tab_pos[1]=posj-1;tab_pos[2]=myWorld[posi-1][posj-1];
		return tab_pos;
	}
		
	
	public void hunt(){

		
	}
	public int [] posCaseVideAutour(int i,int j){
		int espace_vide[]=new int[2];
		//cherche espace vide 
			if(posTypeAgentNorthEast()[2]==2)
				espace_vide[0]=posTypeAgentNorthEast()[0];espace_vide[1]=posTypeAgentNorthEast()[1];
		
			if(posTypeAgentNorth()[2]==2)
				espace_vide[0]=posTypeAgentNorth()[0];espace_vide[1]=posTypeAgentNorth()[1];
		
			if(posTypeAgentEast()[2]==2)
				espace_vide[0]=posTypeAgentEast()[0];espace_vide[1]=posTypeAgentEast()[1];
		
			if(posTypeAgentSouthEast()[2]==2)
				espace_vide[0]=posTypeAgentSouthEast()[0];espace_vide[1]=posTypeAgentSouthEast()[1];
		
			if(posTypeAgentSouth()[2]==2)
				espace_vide[0]=posTypeAgentSouth()[0];espace_vide[1]=posTypeAgentSouth()[1];
			
			if(posTypeAgentSouthWest()[2]==2)
				espace_vide[0]=posTypeAgentSouthWest()[0];espace_vide[1]=posTypeAgentSouthWest()[1];
			
			if(posTypeAgentWest()[2]==2)
				espace_vide[0]=posTypeAgentWest()[0];espace_vide[1]=posTypeAgentWest()[1];
			
			if(posTypeAgentNorthWest()[2]==2)
				espace_vide[0]=posTypeAgentNorthWest()[0];espace_vide[1]=posTypeAgentNorthWest()[1];

				return espace_vide;
	}

	public void eat(){
		for (Prey p:proies){//a changer pour mettre type animal qui mange
			if(getNearestAgent()[2]==p.id){
				p.alive=false;
				this.reserve_food+=15;
				this.reserve_eau+=5;
				proies.remove(p);
			}
		}
	}
	public void reproduce(){
		
		//cherche espace vide pour nouveau lion
			
		//cherche si deux lions sont a cote
		int cpt=0;
		
		for (Lion l:lions){
			if( posTypeAgentNorth()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif && cpt<1){
				
					lions.add(new Lion(posTypeAgentNorth()[0],posTypeAgentNorth()[1]));
				
				
					if( posTypeAgentNorthEast()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentNorthEast()[0],posTypeAgentNorthEast()[1]));				
					if( posTypeAgentEast()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentEast()[0],posTypeAgentEast()[1]));				
					if( posTypeAgentSouthEast()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentSouthEast()[0],posTypeAgentSouthEast()[1]));				
					if( posTypeAgentSouth()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentSouth()[0],posTypeAgentSouth()[1]));				
					if( posTypeAgentSouthWest()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentSouthWest()[0],posTypeAgentSouthWest()[1]));				
					if( posTypeAgentWest()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentWest()[0],posTypeAgentNorthEast()[1]));				
					if( posTypeAgentNorthWest()[2]==l.id && l.id != this.id && this.age>=this.age_reproductif )
					 lions.add(new Lion(posTypeAgentNorthWest()[0],posTypeAgentNorthWest()[1]));				
			
					
					
			
				
		
		}
		}
	}
	
	
}
*/