/*if(myWorld[k][l]==6&&(myWorld[k+1][l]==2||myWorld[k+1][l]==1)&&(myWorld[k][l+1]==2||myWorld[k][l+1]==1)&&(myWorld[k-1][l]==2||myWorld[k-1][l]==1)&&(myWorld[k][l-1]==2||myWorld[k][l-1]==1)){
				int ki=(int)(Math.random()*4+1);
				
				if(ki==2){
				if(myWorld[k][l]==6&&myWorld[k+1][l]!=1){
				    newmyWorld[k+1][l]=6;
				    newmyWorld[k][l]=2;
					}else{
						newmyWorld[k-1][l]=6;
					    newmyWorld[k][l]=2;
					}
				}
				
				if(ki==3){
				    if(myWorld[k][l]==6&&myWorld[k][l+1]!=1){
				        newmyWorld[k][l+1]=6;
				        newmyWorld[k][l]=2;
				    }else{
				    	newmyWorld[k][l-1]=6;
				        newmyWorld[k][l]=2;
				    }
		     	}
				
				    if(ki==4){
				    if(myWorld[k][l]==6&&myWorld[k-1][l]!=1){
				    newmyWorld[k-1][l]=6;
				    newmyWorld[k][l]=2;
				    }else{
				    	newmyWorld[k+1][l]=6;
					    newmyWorld[k][l]=2;
				    }
				    }
				    
				    
				    if(ki==1){
				    if(myWorld[k][l]==6&&myWorld[k][l-1]!=1){
					newmyWorld[k][l-1]=6;
					newmyWorld[k][l]=2;
				    }else{
				    	newmyWorld[k][l+1]=6;
						newmyWorld[k][l]=2;
				    }
				    }
			    
			}
			
			if(myWorld[k][l]==6&&myWorld[k+1][l]==3&&myWorld[k][l-1]==2){
							    newmyWorld[k][l+1]=6;
						        newmyWorld[k][l]=2;
						       
					}
					
					if(myWorld[k][l]==6&&(myWorld[k][l+1]==2)&&myWorld[k+1][l]==3&&myWorld[k][l-1]==3){
								newmyWorld[k][l+1]=6;
							    newmyWorld[k][l]=2;
						
					}
					if(myWorld[k][l]==6&&myWorld[k][l+1]==1&&myWorld[k+1][l]==3&&myWorld[k][l-1]==3){
						newmyWorld[k][l+1]=6;
					    newmyWorld[k][l]=2;
					  
			}*/