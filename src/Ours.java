
public class Ours extends Predator{

	public Ours(int posi ,int posj){
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
		max_children=0;//max 2 enfant
		ours.add(this);
	}
	
	/*public void moveDefault(){
		//int testi=posi;int testj=posj;
		
		//while (test<40){
		int orient =(int)( Math.random()*8);
		int deplacement=(int)( Math.random()*endurance);
		int i=0;
		 switch ( orient ) 
		 {
         	   case 0: // nord
            	while(i<deplacement){		
         		   if(myWorld[posi][posj-1]==2){
         		   			newmyWorld[posi][posj-1]=30;
         		   			newmyWorld[posi][posj]=2;
         		   			posj-=1;
         		   			
         		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
            	}
         	   break;
         	
         	case 1:	// est
         		while(i<deplacement){
         		if(myWorld[posi+1][posj]==2){
 		   			newmyWorld[posi+1][posj]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posi+=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
         		
         	case 2:	// sud
         		while(i<deplacement){
         		if(myWorld[posi][posj+1]==2){
 		   			newmyWorld[posi][posj+1]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posj+=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
 				
         	case 3:	// ouest
         		while(i<deplacement){
         		if(myWorld[posi-1][posj]==2){
 		   			newmyWorld[posi-1][posj]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posi-=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
 				
         	case 4: // nord-est
         		while(i<deplacement){
         		if(myWorld[posi+1][posj-1]==2){
 		   			newmyWorld[posi+1][posj-1]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posi+=1;posj-=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
         		break;
         		
         	case 5:	// nord-ouest
         		while(i<deplacement){
         		if(myWorld[posi-1][posj-1]==2){
 		   			newmyWorld[posi-1][posj-1]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posi-=1;posj-=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
 				
         	case 6:	// sud-est
         		while(i<deplacement){
         		if(myWorld[posi+1][posj+1]==2){
 		   			myWorld[posi+1][posj+1]=30;
 		   			myWorld[posi][posj]=2;
 		   			posi+=1;posj+=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
 				
         	case 7:	// sud-ouest
         		while(i<deplacement){
         		if(myWorld[posi-1][posj+1]==2){
 		   			newmyWorld[posi-1][posj+1]=30;
 		   			newmyWorld[posi][posj]=2;
 		   			posi-=1;posj+=1;
 		   		}
         		i++;
         		try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
         		}
 				break;
 			
 				
 			default:
 				try {
         			Thread.sleep(300);
         		}
         		catch(Exception e){}
 			
		 }
		 
		 System.out.println(posi+","+posj);
		// newmyWorld[testi][testj]=2;
		 try{
			 Thread.sleep(100);
		 }catch(Exception e){}
		
			
	}
*/
}
