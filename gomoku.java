/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TestClass {
    public static void main(String args[] ) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[][] = new int[10][10],sum=0;
        for (int i = 0; i < 10; i++) {
        	StringTokenizer input1=new StringTokenizer(br.readLine());
        	for (int j = 0; j < 10; j++) {
        		a[i][j]=Integer.parseInt(input1.nextToken());
        		sum+=a[i][j];
        	}
        }
        
        int player=Integer.parseInt(br.readLine());
        int opponent=player%2+1;
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For winning move*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0;
        		if(a[i][j]==0){
        		    a[i][j]=player;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==5 && !(player==1 && x!=9 && a[i][x+1]==1)){
        		            System.out.println(i+" "+j);
        		            return;
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==5 && !(player==1 && x!=9 && a[x+1][j]==1)){
        		            System.out.println(i+" "+j);
        		            return;
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5 && !(player==1 && m!=9 && a[m+1][n+1]==1)){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5 && !(player==1 && m!=9 && a[m+1][n+1]==1)){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5 && !(player==1 && m!=0 && a[m+1][n-1]==1)){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5 && !(player==1 && m!=9 && a[m+1][n-1]==1)){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For stopping the other guy*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0;
        		if(a[i][j]==0){
        		    a[i][j]=opponent;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==5){
        		            System.out.println(i+" "+j);
        		            return;
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==5){
        		            System.out.println(i+" "+j);
        		            return;
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==5){
            		            System.out.println(i+" "+j);
            		            return;
            		        }
        		        }
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For getting into winning move*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0;
        		if(a[i][j]==0){
        		    a[i][j]=player;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if(x!=9 && x!=3 && a[i][x+1]==0 && a[i][x-4]==0){
        		                System.out.println(i+" "+j);
        		                return;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if(x!=9 && x!=3 && a[x+1][j]==0 && a[x-4][j]==0){
        		                System.out.println(i+" "+j);
        		                return;
        		            }
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=9 && m!=3 && n!=3 && a[m+1][n+1]==0 && a[m-4][n-4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=9 && m!=3 && n!=3 && a[m+1][n+1]==0 && a[m-4][n-4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=6 && m!=3 && n!=0 && a[m+1][n-1]==0 && a[m-4][n+4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=6 && m!=3 && n!=0 && a[m+1][n-1]==0 && a[m-4][n+4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
         /*For not letting the opponent to win the game*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0;
        		if(a[i][j]==0){
        		    a[i][j]=opponent;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if(x!=9 && x!=3 && a[i][x+1]==0 && a[i][x-4]==0){
        		                System.out.println(i+" "+j);
        		                return;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if(x!=9 && x!=3 && a[x+1][j]==0 && a[x-4][j]==0){
        		                System.out.println(i+" "+j);
        		                return;
        		            }
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=9 && m!=3 && n!=3 && a[m+1][n+1]==0 && a[m-4][n-4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=9 && m!=3 && n!=3 && a[m+1][n+1]==0 && a[m-4][n-4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=6 && m!=3 && n!=0 && a[m+1][n-1]==0 && a[m-4][n+4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if(m!=9 && n!=6 && m!=3 && n!=0 && a[m+1][n-1]==0 && a[m-4][n+4]==0){
                		            System.out.println(i+" "+j);
                		            return;
            		            }
            		        }
        		        }
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For creating a tactic*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=player;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) && (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) || (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) && (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) || (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
        		                count1++;
        		            }
        		            
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    
        		    /*Horizontal*/
        		    count=0;
        		    boolean flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[i][x]==player){
        		                count++;
        		            }else if(count>0 && a[i][x]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[i][x]==player){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[x][j]==player){
        		                count++;
        		            }else if(count>0 && a[x][j]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[x][j]==player){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Forward Diagonal*/
        		    m=i;n=j;
        		    count=0;
        		    flag1=true;
        		    
        		   if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Backward Diagonal*/
        		    k=i+j;
        		    count=0;
        		    flag1=true;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For not letting him create a tactic*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=opponent;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) && (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) || (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) && (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) || (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
        		                count1++;
        		            }
        		            
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    
        		    /*Horizontal*/
        		    count=0;
        		    boolean flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[i][x]==opponent){
        		                count++;
        		            }else if(count>0 && a[i][x]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[i][x]==opponent){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[x][j]==opponent){
        		                count++;
        		            }else if(count>0 && a[x][j]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[x][j]==opponent){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Forward Diagonal*/
        		    m=i;n=j;
        		    count=0;
        		    flag1=true;
        		    
        		   if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    
        		    /*Backward Diagonal*/
        		    k=i+j;
        		    count=0;
        		    flag1=true;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1>1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*start*/
        if(sum==0){
            System.out.println("5 5");
            return;
        }else if(sum==1){
            if(a[5][5]==0){
                System.out.println("5 5");
                return;
            }else{
                System.out.println("3 3");
                return;
            }
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For generating a tactic*/
        for (int x2 = 0; x2 < 10; x2++) {
        	for (int y2 = 0; y2 < 10; y2++) {
        	    if(a[x2][y2]==0){
        		    a[x2][y2]=player;
        		    int total=0;
                    for (int i = 0; i < 10; i++) {
        	            for (int j = 0; j < 10; j++) {
        	                int count=0,count1=0;
        		            if(a[i][j]==0){
        		                a[i][j]=player;
        		    
                    		    /*Horizontal*/
                    		    for(int x=0;x<10;x++){
                    		        if(a[i][x]==player){
                    		            count++;
                    		        }else{
                    		            count=0;
                    		        }
                    		        if(count==4){
                    		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
                    		                count1++;
                    		            }
                    		        }else if(count==3){
                    		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) && (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
                    		                count1++;
                    		                count1++;
                    		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
                    		                count1++;
                    		            }
                    		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) || (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Vertical*/
                    		    count=0;
                    		    for(int x=0;x<10;x++){
                    		        if(a[x][j]==player){
                    		            count++;
                    		        }else{
                    		            count=0;
                    		        }
                    		        if(count==4){
                    		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
                    		                count1++;
                    		            }
                    		        }else if(count==3){
                    		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) && (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
                    		                count1++;
                    		                count1++;
                    		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
                    		                count1++;
                    		            }
                    		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) || (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
                    		                count1++;
                    		            }
                    		            
                    		        }
                    		    }
        		    
                    		    /*Forward Diagonal*/
                    		    int m=i,n=j;
                    		    count=0;
                    		    
                    		    if(m>n){
                    		        for(m=m-n,n=0;m<10;m++,n++){
                    		            if(a[m][n]==player){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }else{
                    		        for(n=n-m,m=0;n<10;m++,n++){
                    		            if(a[m][n]==player){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Backward Diagonal*/
                    		    int k=i+j;
                    		    count=0;
                    		   
                    		    if(k<10){
                    		        for(m=0,n=k;n>=0;m++,n--){
                    		            if(a[m][n]==player){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }else{
                    		        for(m=k-9,n=9;m<10;m++,n--){
                    		            if(a[m][n]==player){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Horizontal*/
                    		    count=0;
                    		    boolean flag1=true;
                    		    for(int x=0;x<10;x++){
                    		        if(flag1){
                    		            if(a[i][x]==player){
                    		                count++;
                    		            }else if(count>0 && a[i][x]==0){
                    		                flag1=false;
                    		            }else{
                    		                count=0;
                    		            }
                    		        }else{
                    		            if(a[i][x]==player){
                    		                count++;
                    		            }else{
                    		                flag1=true;
                    		                count=0;
                    		            }
                    		        }
                    		        if(count==3 && flag1){
                    		            count=0;
                    		        }
                    		        if(count==3 && !flag1){
                    		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Vertical*/
                    		    count=0;
                    		    flag1=true;
                    		    for(int x=0;x<10;x++){
                    		        if(flag1){
                    		            if(a[x][j]==player){
                    		                count++;
                    		            }else if(count>0 && a[x][j]==0){
                    		                flag1=false;
                    		            }else{
                    		                count=0;
                    		            }
                    		        }else{
                    		            if(a[x][j]==player){
                    		                count++;
                    		            }else{
                    		                flag1=true;
                    		                count=0;
                    		            }
                    		        }
                    		        if(count==3 && flag1){
                    		            count=0;
                    		        }
                    		        if(count==3 && !flag1){
                    		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Forward Diagonal*/
                    		    m=i;n=j;
                    		    count=0;
                    		    flag1=true;
                    		    
                    		   if(m>n){
                    		        for(m=m-n,n=0;m<10;m++,n++){
                    		            if(flag1){
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }else{
                    		        for(n=n-m,m=0;n<10;m++,n++){
                    		            if(flag1){
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Backward Diagonal*/
                    		    k=i+j;
                    		    count=0;
                    		    flag1=true;
                    		   
                    		    if(k<10){
                    		        for(m=0,n=k;n>=0;m++,n--){
                    		            if(flag1){
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }else{
                    		        for(m=k-9,n=9;m<10;m++,n--){
                    		            if(flag1){
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==player){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }
                    		    
                    		    if(count1>1){
                    		        total++;
                    		    }
        		                a[i][j]=0;
        		            }
        	            }
                    }
                    if(total>1){
                        System.out.println(x2+" "+y2);
                        return;
                    }
                    a[x2][y2]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For not letting him generate a tactic*/
        for (int x2 = 0; x2 < 10; x2++) {
        	for (int y2 = 0; y2 < 10; y2++) {
        	    if(a[x2][y2]==0){
        		    a[x2][y2]=opponent;
        		    int total=0;
                    for (int i = 0; i < 10; i++) {
        	            for (int j = 0; j < 10; j++) {
        	                int count=0,count1=0;
        		            if(a[i][j]==0){
        		                a[i][j]=opponent;
        		    
                    		    /*Horizontal*/
                    		    for(int x=0;x<10;x++){
                    		        if(a[i][x]==opponent){
                    		            count++;
                    		        }else{
                    		            count=0;
                    		        }
                    		        if(count==4){
                    		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
                    		                count1++;
                    		            }
                    		        }else if(count==3){
                    		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) && (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
                    		                count1++;
                    		                count1++;
                    		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
                    		                count1++;
                    		            }
                    		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) || (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Vertical*/
                    		    count=0;
                    		    for(int x=0;x<10;x++){
                    		        if(a[x][j]==opponent){
                    		            count++;
                    		        }else{
                    		            count=0;
                    		        }
                    		        if(count==4){
                    		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
                    		                count1++;
                    		            }
                    		        }else if(count==3){
                    		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) && (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
                    		                count1++;
                    		                count1++;
                    		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
                    		                count1++;
                    		            }
                    		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) || (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
                    		                count1++;
                    		            }
                    		            
                    		        }
                    		    }
        		    
                    		    /*Forward Diagonal*/
                    		    int m=i,n=j;
                    		    count=0;
                    		    
                    		    if(m>n){
                    		        for(m=m-n,n=0;m<10;m++,n++){
                    		            if(a[m][n]==opponent){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }else{
                    		        for(n=n-m,m=0;n<10;m++,n++){
                    		            if(a[m][n]==opponent){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Backward Diagonal*/
                    		    int k=i+j;
                    		    count=0;
                    		   
                    		    if(k<10){
                    		        for(m=0,n=k;n>=0;m++,n--){
                    		            if(a[m][n]==opponent){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }else{
                    		        for(m=k-9,n=9;m<10;m++,n--){
                    		            if(a[m][n]==opponent){
                        		            count++;
                        		        }else{
                        		            count=0;
                        		        }
                        		        if(count==4){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }else if(count==3){
                        		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
                    		                    count1++;
                    		                    count1++;
                    		                }
                    		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                            		            count1++;
                        		            }
                        		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
                    		                    count1++;
                    		                }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Horizontal*/
                    		    count=0;
                    		    boolean flag1=true;
                    		    for(int x=0;x<10;x++){
                    		        if(flag1){
                    		            if(a[i][x]==opponent){
                    		                count++;
                    		            }else if(count>0 && a[i][x]==0){
                    		                flag1=false;
                    		            }else{
                    		                count=0;
                    		            }
                    		        }else{
                    		            if(a[i][x]==opponent){
                    		                count++;
                    		            }else{
                    		                flag1=true;
                    		                count=0;
                    		            }
                    		        }
                    		        if(count==3 && flag1){
                    		            count=0;
                    		        }
                    		        if(count==3 && !flag1){
                    		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Vertical*/
                    		    count=0;
                    		    flag1=true;
                    		    for(int x=0;x<10;x++){
                    		        if(flag1){
                    		            if(a[x][j]==opponent){
                    		                count++;
                    		            }else if(count>0 && a[x][j]==0){
                    		                flag1=false;
                    		            }else{
                    		                count=0;
                    		            }
                    		        }else{
                    		            if(a[x][j]==opponent){
                    		                count++;
                    		            }else{
                    		                flag1=true;
                    		                count=0;
                    		            }
                    		        }
                    		        if(count==3 && flag1){
                    		            count=0;
                    		        }
                    		        if(count==3 && !flag1){
                    		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
                    		                count1++;
                    		            }
                    		        }
                    		    }
        		    
                    		    /*Forward Diagonal*/
                    		    m=i;n=j;
                    		    count=0;
                    		    flag1=true;
                    		    
                    		   if(m>n){
                    		        for(m=m-n,n=0;m<10;m++,n++){
                    		            if(flag1){
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }else{
                    		        for(n=n-m,m=0;n<10;m++,n++){
                    		            if(flag1){
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }
        		    
                    		    /*Backward Diagonal*/
                    		    k=i+j;
                    		    count=0;
                    		    flag1=true;
                    		   
                    		    if(k<10){
                    		        for(m=0,n=k;n>=0;m++,n--){
                    		            if(flag1){
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }else{
                    		        for(m=k-9,n=9;m<10;m++,n--){
                    		            if(flag1){
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else if(count>0 && a[m][n]==0){
                        		                flag1=false;
                        		            }else{
                        		                count=0;
                        		            }
                        		        }else{
                        		            if(a[m][n]==opponent){
                        		                count++;
                        		            }else{
                        		                flag1=true;
                        		                count=0;
                        		            }
                        		        }
                        		        if(count==3 && flag1){
                    		                count=0;
                    		            }
                        		        if(count==3 && !flag1){
                        		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                            		            count1++;
                        		            }
                        		        }
                    		        }
                    		    }
                    		    
                    		    if(count1>1){
                    		        total++;
                    		    }
        		                a[i][j]=0;
        		            }
        	            }
                    }
                    if(total>1){
                        System.out.println(x2+" "+y2);
                        return;
                    }
                    a[x2][y2]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For creating 3 line*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=player;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) && (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==player) || (x>3 && a[i][x-3]==0 && a[i][x-4]==player)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==player){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) && (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==player) || (x>3 && a[x-3][j]==0 && a[x-4][j]==player)){
        		                count1++;
        		            }
        		            
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==player) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==player){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==player) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==player)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    if(count1==1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=player;
        		    
        		    /*Horizontal*/
        		    count=0;
        		    boolean flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[i][x]==player){
        		                count++;
        		            }else if(count>0 && a[i][x]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[i][x]==player){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[x][j]==player){
        		                count++;
        		            }else if(count>0 && a[x][j]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[x][j]==player){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    flag1=true;
        		    
        		   if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		    flag1=true;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==player){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==player){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1==1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For not letting him create a 3 line*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=opponent;
        		    
        		    /*Horizontal*/
        		    for(int x=0;x<10;x++){
        		        if(a[i][x]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[i][x+1]==0) || (x!=3  && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) && (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[i][x+1]==0) && (x!=2 && a[i][x-3]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[i][x+1]==0 && a[i][x+2]==opponent) || (x>3 && a[i][x-3]==0 && a[i][x-4]==opponent)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    
        		    /*Vertical*/
        		    count=0;
        		    for(int x=0;x<10;x++){
        		        if(a[x][j]==opponent){
        		            count++;
        		        }else{
        		            count=0;
        		        }
        		        if(count==4){
        		            if((x!=9 && a[x+1][j]==0) || (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }else if(count==3){
        		            if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) && (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
        		                count1++;
        		                count1++;
        		            }else if((x!=9 && a[x+1][j]==0) && (x!=2 && a[x-3][j]==0)){
        		                count1++;
        		            }
        		            else if((x<8 && a[x+1][j]==0 && a[x+2][j]==opponent) || (x>3 && a[x-3][j]==0 && a[x-4][j]==opponent)){
        		                count1++;
        		            }
        		            
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    
        		    if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) || (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) && (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=2 && n!=2 && a[m-3][n-3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n<8 && a[m+1][n+1]==0 && a[m+2][n+2]==opponent) || (m>3 && n>3 && a[m-3][n-3]==0 && a[m-4][n-4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(a[m][n]==opponent){
            		            count++;
            		        }else{
            		            count=0;
            		        }
            		        if(count==4){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) || (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }else if(count==3){
            		            if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) && (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                    count1++;
        		                }
        		                else if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=7 && m!=2 && a[m-3][n+3]==0)){
                		            count1++;
            		            }
            		            else if((m<8 && n>1 && a[m+1][n-1]==0 && a[m+2][n-2]==opponent) || (m>3 && n<6 && a[m-3][n+3]==0 && a[m-4][n+4]==opponent)){
        		                    count1++;
        		                }
            		        }
        		        }
        		    }
        		    
        		    if(count1==1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        	    int count=0,count1=0;
        		if(a[i][j]==0){
        		    a[i][j]=opponent;
        		    
        		    /*Horizontal*/
        		    count=0;
        		    boolean flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[i][x]==opponent){
        		                count++;
        		            }else if(count>0 && a[i][x]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[i][x]==opponent){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[i][x+1]==0) && (x!=3 && a[i][x-4]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Vertical*/
        		    count=0;
        		    flag1=true;
        		    for(int x=0;x<10;x++){
        		        if(flag1){
        		            if(a[x][j]==opponent){
        		                count++;
        		            }else if(count>0 && a[x][j]==0){
        		                flag1=false;
        		            }else{
        		                count=0;
        		            }
        		        }else{
        		            if(a[x][j]==opponent){
        		                count++;
        		            }else{
        		                flag1=true;
        		                count=0;
        		            }
        		        }
        		        if(count==3 && flag1){
        		            count=0;
        		        }
        		        if(count==3 && !flag1){
        		            if((x!=9 && a[x+1][j]==0) && (x!=3 && a[x-4][j]==0)){
        		                count1++;
        		            }
        		        }
        		    }
        		    
        		    /*Forward Diagonal*/
        		    int m=i,n=j;
        		    count=0;
        		    flag1=true;
        		    
        		   if(m>n){
        		        for(m=m-n,n=0;m<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(n=n-m,m=0;n<10;m++,n++){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=9 && a[m+1][n+1]==0) && (m!=3 && n!=3 && a[m-4][n-4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    /*Backward Diagonal*/
        		    int k=i+j;
        		    count=0;
        		    flag1=true;
        		   
        		    if(k<10){
        		        for(m=0,n=k;n>=0;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }else{
        		        for(m=k-9,n=9;m<10;m++,n--){
        		            if(flag1){
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else if(count>0 && a[m][n]==0){
            		                flag1=false;
            		            }else{
            		                count=0;
            		            }
            		        }else{
            		            if(a[m][n]==opponent){
            		                count++;
            		            }else{
            		                flag1=true;
            		                count=0;
            		            }
            		        }
            		        if(count==3 && flag1){
        		                count=0;
        		            }
            		        if(count==3 && !flag1){
            		            if((m!=9 && n!=0 && a[m+1][n-1]==0) && (n!=6 && m!=3 && a[m-4][n+4]==0)){
                		            count1++;
            		            }
            		        }
        		        }
        		    }
        		    
        		    if(count1==1){
        		        System.out.println(i+" "+j);
                	    return;
        		    }
        		    a[i][j]=0;
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For creating 2*/
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        		if(a[i][j]==1){
        		    
        		    /*With blanks*/
        		    if(i>1 && j>1 && i<9 && j<9 && a[i-1][j-1]==0 && a[i-2][j-2]==0 && a[i+1][j+1]==0){
        		        System.out.println((i-1)+" "+(j-1));
        		        return;
        		    }
        		    if(i>1 && j>0 && i<9 && j<8 && a[i+1][j-1]==0 && a[i-2][j+2]==0 && a[i-1][j+1]==0){
        		        System.out.println((i-1)+" "+(j+1));
        		        return;
        		    }
        		    if(i>1 && i<9 && a[i-1][j]==0 && a[i-2][j]==0 && a[i+1][j]==0){
        		        System.out.println((i-1)+" "+j);
        		        return;
        		    }
        		    if(j>1 && j<9 && a[i][j-1]==0 && a[i][j-2]==0 && a[i][j+1]==0){
        		        System.out.println(i+" "+(j-1));
        		        return;
        		    }
        		    if(i>0 && i<8 && a[i-1][j]==0 && a[i+2][j]==0 && a[i+1][j]==0){
        		        System.out.println((i+1)+" "+j);
        		        return;
        		    }
        		    if(i>0 && j>0 && i<8 && j<8 && a[i-1][j-1]==0 && a[i+2][j+2]==0 && a[i+1][j+1]==0){
        		        System.out.println((i+1)+" "+(j+1));
        		        return;
        		    }
        		    if(j>0 && j<8 && a[i][j-1]==0 && a[i][j+2]==0 && a[i][j+1]==0){
        		        System.out.println(i+" "+(j+1));
        		        return;
        		    }
        		    if(i>0 && j>1 && i<8 && j<9 && a[i+1][j-1]==0 && a[i+2][j-2]==0 && a[i-1][j+1]==0){
        		        System.out.println((i+1)+" "+(j-1));
        		        return;
        		    }
        		    
        		    /*With only 1 blank*/
        		    if(i>1 && j>1 && i<9 && j<9 && a[i-1][j-1]==0 && (a[i-2][j-2]==0 || a[i+1][j+1]==0)){
        		        System.out.println((i-1)+" "+(j-1));
        		        return;
        		    }
        		    if(i>0 && j>0 && i<8 && j<8 && (a[i-1][j-1]==0 || a[i+2][j+2]==0) && a[i+1][j+1]==0){
        		        System.out.println((i+1)+" "+(j+1));
        		        return;
        		    }
        		    if(i>0 && i<8 && (a[i-1][j]==0 || a[i+2][j]==0) && a[i+1][j]==0){
        		        System.out.println((i+1)+" "+j);
        		        return;
        		    }
        		    if(i>1 && i<9 && a[i-1][j]==0 && (a[i-2][j]==0 || a[i+1][j]==0)){
        		        System.out.println((i-1)+" "+j);
        		        return;
        		    }
        		    if(j>0 && j<8 && (a[i][j-1]==0 || a[i][j+2]==0) && a[i][j+1]==0){
        		        System.out.println(i+" "+(j+1));
        		        return;
        		    }
        		    if(j>1 && j<9 && a[i][j-1]==0 && (a[i][j-2]==0 || a[i][j+1]==0)){
        		        System.out.println(i+" "+(j-1));
        		        return;
        		    }
        		    if(i>0 && j>1 && i<8 && j<9 && a[i+1][j-1]==0 && (a[i+2][j-2]==0 || a[i-1][j+1]==0)){
        		        System.out.println((i+1)+" "+(j-1));
        		        return;
        		    }
        		    if(i>1 && j>0 && i<9 && j<8 && (a[i+1][j-1]==0 || a[i-2][j+2]==0) && a[i-1][j+1]==0){
        		        System.out.println((i-1)+" "+(j+1));
        		        return;
        		    }
        		}
        	}
        }
        
        /*---------------------------------------------------------------------------------------------------------------------------*/
        /*For creating 1 in open area - Worst case choice*/
        int max=0,x1=0,y1=0;
        for (int i = 0; i < 10; i++) {
        	for (int j = 0; j < 10; j++) {
        		if(a[i][j]==0){
        		    int count2=0;
        		    
        		    if(i>0 && j>0 && a[i-1][j-1]==0){
        		        count2++;
        		    }
        		    if(i>0 && a[i-1][j]==0){
        		        count2++;
        		    }
        		    if(j>0 && a[i][j-1]==0){
        		        count2++;
        		    }
        		    if(i>0 && j<9 && a[i-1][j+1]==0){
        		        count2++;
        		    }
        		    if(i<9 && j>0 && a[i+1][j-1]==0){
        		        count2++;
        		    }
        		    if(i<9 && a[i+1][j]==0){
        		        count2++;
        		    }
        		    if(j<9 && a[i][j+1]==0){
        		        count2++;
        		    }
        		    if(i<9 && j<9 && a[i+1][j+1]==0){
        		        count2++;
        		    }
        			if(count2>=max){
        			    max=count2;
        			    x1=i;
        			    y1=j;
        			}
        		}
        	}
        }
        
        System.out.println(x1+" "+y1);
    }
}
