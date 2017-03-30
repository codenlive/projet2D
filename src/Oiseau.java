
public class Oiseau extends Prey {

public Oiseau(int i,int j){
	
}
public void moveDefault1(){
	int orient =(int)( Math.random()*8);
	//int deplacement=(int)( Math.random()*endurance);
	//int i;
	 switch ( orient ) 
	 {							//eau0, oiseau40,sable1
     	case 0: // nord
     		   		if(SpriteDemo.myWorld[posi][(posj-1+64)%64]==0||SpriteDemo.myWorld[posi][(posj-1+64)%64]==2){
     		   		SpriteDemo.newmyWorld[posi][(posj-1+64)%64]=40;
     		   	if(SpriteDemo.myWorld[posi][(posj-1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
     		   }
     		
     	break;
     	
     	case 1:	// est
     		if(SpriteDemo.myWorld[(posi+1+120)%120][posj]==0||SpriteDemo.myWorld[(posi+1+120)%120][posj]==2){
     			SpriteDemo.newmyWorld[(posi+1+120)%120][posj]=40;
     			if(SpriteDemo.myWorld[(posi+1+120)%120][posj]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   		}
     		
     		break;
     		
     	case 2:	// sud
     		if(SpriteDemo.myWorld[posi][(posj+1+64)%64]==0||SpriteDemo.myWorld[posi][(posj+1+64)%64]==2){
     			SpriteDemo.newmyWorld[posi][(posj+1+64)%64]=40;
     			if(SpriteDemo.myWorld[posi][(posj+1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   		}
     		
				break;
				
     	case 3:	// ouest
     		if(SpriteDemo.myWorld[(posi-1+120)%120][posj]==0||SpriteDemo.myWorld[(posi-1+120)%120][posj]==2){
     			SpriteDemo.newmyWorld[(posi-1+120)%120][posj]=40;
     			if(SpriteDemo.myWorld[(posi-1+120)%120][posj]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   		 }
     		
				break;
				
     	case 4: // nord-est
     		if(SpriteDemo.myWorld[(posi+1+120)%120][(posj-1+64)%64]==0||SpriteDemo.myWorld[(posj-1+120)%120][(posj-1+64)%64]==2){
     			SpriteDemo.newmyWorld[(posi+1+120)%120][(posj-1+64)%64]=40;
     			if(SpriteDemo.myWorld[(posi+1+120)%120][(posj-1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   		}
     		
     		break;
     		
     	case 5:	// nord-ouest
     		if(SpriteDemo.myWorld[(posi-1+120)%120][(posj-1+64)%64]==0||SpriteDemo.myWorld[(posi-1+120)%120][posj-1+64%64]==2){
     			SpriteDemo.newmyWorld[(posi-1+120)%120][(posj-1+64)%64]=40;
     			if(SpriteDemo.myWorld[(posi-1+120)%120][(posj-1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   		}
     		
				break;
				
     	case 6:	// sud-est
     		
     		if(SpriteDemo.myWorld[(posi+1+120)%120][(posj+1+64)%64]==0||SpriteDemo.myWorld[(posi+1+120)%120][(posj+1+64)%64]==2){
     			SpriteDemo.newmyWorld[(posi+1+120)%120][(posj+1+64)%64]=40;
     			if(SpriteDemo.myWorld[(posi+1+120)%120][(posj+1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			} 		   			
		   		}
     		
				break;
				
     	case 7:	// sud-ouest
     		if(SpriteDemo.myWorld[(posi-1+120)%120][(posj+1+64)%64]==0||SpriteDemo.myWorld[(posi-1+120)%120][(posj+1+64)%64]==2){
     			SpriteDemo.newmyWorld[(posi-1+120)%120][(posj+1+64)%64]=40;
     			if(SpriteDemo.myWorld[(posi-1+120)%120][(posj+1+64)%64]==2){
     				SpriteDemo.newmyWorld[posi][posj]=2;
     			}else{
     			SpriteDemo.newmyWorld[posi][posj]=0;
     			}
		   			
		   		}
				break;
	 }
  }
}