/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;
import java.util.*;

class chain{
    int i,j,n,m,count=0;
    static String game[][];
    String play1,play2;
    Scanner obj=new Scanner(System.in);
    
    void create_board(){
        System.out.println("select no of row and column:");
        n=obj.nextInt();
        m=obj.nextInt();
        game=new String[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                game[i][j]="-";
            }
        }      
    }
    void print_board(){
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(game[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int select_key(){
        obj.nextLine();
        System.out.println("player 1 select your key :");
        play1=obj.nextLine();
        System.out.println("player 2 select your key :");
        play2=obj.nextLine();
        if(play1.equals(play2)){
            System.out.println("both keys are some so plases try again ");
            return select_key();
        }
        return 0;
    }
    String play1(){
        System.out.println("player 1 select your row and column :");
        int ro =obj.nextInt()-1;
        int co=obj.nextInt()-1;
        if(ro>=n||co>=m||ro<0||co<0){
            System.out.println("your value is wrong so,try again ");
            return play1();
        }  
        if(game[ro][co]=="-"){
                 game[ro][co]=play1+1;
         }else{
            int b=0;
           if(game[ro][co]!="-"){
            if(game[ro][co].charAt(0)==play1.charAt(0)){
                b+=(game[ro][co].charAt(1)-'0');
                b+=1;
                game[ro][co]=play1+b;
            }else{
            System.out.println("your select option is player 2 key is here so, try again :");
            return play1();
              }
            }
        }
        if(game[ro][co]!="-"){
            if(game[ro][co].charAt(1)>51){
               return play1_reg(ro,co);
            }
        }
        return null;
    }
    String play1_reg(int row,int column){
//        for(int row=0;row<n;row++){
//            for(int column=0;column<m;column++){
              //  try{
            //   int row=0,column=0;     
       // if(game[row][column].charAt(0)==play1.charAt(0)){
            //game[row][column]=play1;
            if(game[row][column].charAt(0)==play1.charAt(0)&&game[row][column].charAt(1)>51||game[row][column].length()>=3){
              if(column==0&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play1+c;
                    }else{
                      game[row+1][column]=play1+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row-1][column]=play1+d;
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                    
                }else if(column==m-1&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play1+c;
                    }else{
                      game[row+1][column]=play1+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row-1][column]=play1+d;
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                    game[row][column]="-";
                }
              else if(row==0){
                if(row==0&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play1+c;
                   
                    }else{
                        game[row+1][column]=play1+1;
                    }
                }else if(row==0&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play1+c;
                    //game[row][column]="-";
                    }else{
                      game[row+1][column]=play1+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play1+c;
                   
                    }else{
                        game[row+1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
             }else if(row==n-1){
                 if(row==n-1&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                    }
                }else if(row==n-1&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play1+c;
                    
                    }else{
                      game[row-1][column]=play1+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
             }else{
                 int f=0;
                    if(game[row+1][column]!="-"){
                    f+=game[row+1][column].charAt(1)-'0';
                    //f+=game[row][column].charAt(1)-'0';
                    f+=1;
                    game[row+1][column]=play1+f;
                    
                    }else{
                        game[row+1][column]=play1+1;
                       
                    }
                 int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
            }
     //   }
          print_board();
          System.out.println();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(game[i][j]!="-"){
                    if(game[i][j].charAt(0)==play1.charAt(0)&&game[i][j].charAt(1)>51||game[row][column].charAt(0)==play1.charAt(0)&&game[row][column].length()>=3){
                        return play1_reg(i,j);
                    }
                }
            }
        }
        return null;
    }
    String play2(){
        System.out.println("player 2 select your row and column :");
        int ro =obj.nextInt()-1;
        int co=obj.nextInt()-1;
        if(ro>=n||ro<0||co>=m||co<0){
            System.out.println("your value is wrong so,try again ");
            return play2();
        }
        if(game[ro][co]=="-"){
                 game[ro][co]=play2+1;
         }else{
            int b=0;
           if(game[ro][co]!="-"){
            if(game[ro][co].charAt(0)==play2.charAt(0)){
                b+=(game[ro][co].charAt(1)-'0');
                b+=1;
                game[ro][co]=play2+b;
            }else{
            System.out.println("your select option is player 2 key is here so, try again :");
            return play2();
              }
            }
        }
        if(game[ro][co]!="-"){
            if(game[ro][co].charAt(1)>51){
               return play2_reg(ro,co);
            }
        }
        return null;
    }
    String play2_reg(int row,int column){
            if(game[row][column].charAt(0)==play2.charAt(0)&&game[row][column].charAt(1)>51||game[row][column].length()>=3){
              if(column==0&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play2+b;
                    }else
                        game[row][column+1]=play2+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play2+c;
                    }else{
                      game[row+1][column]=play2+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row-1][column]=play2+d;
                    }else{
                        game[row-1][column]=play2+1;
                       
                    }
                    
                }else if(column==m-1&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play2+c;
                    }else{
                      game[row+1][column]=play2+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row-1][column]=play2+d;
                    }else{
                        game[row-1][column]=play2+1;
                       
                    }
                    game[row][column]="-";
                }
              else if(row==0){
                if(row==0&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play2+b;
                    }else
                        game[row][column+1]=play2+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play2+c;
                   
                    }else{
                        game[row+1][column]=play2+1;
                    }
                }else if(row==0&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play2+c;
                    //game[row][column]="-";
                    }else{
                      game[row+1][column]=play2+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play2+d;
                    }else{
                        game[row][column+1]=play2+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row+1][column]=play2+c;
                   
                    }else{
                        game[row+1][column]=play2+1;
                       
                    }
                }
                 game[row][column]="-";
             }else if(row==n-1){
                 if(row==n-1&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column+1]=play2+b;
                    }else
                        game[row][column+1]=play2+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play2+c;
                    
                    }else{
                        game[row-1][column]=play2+1;
                    }
                }else if(row==n-1&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play2+c;
                    
                    }else{
                      game[row-1][column]=play2+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play2+d;
                    }else{
                        game[row][column+1]=play2+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play2+c;
                    
                    }else{
                        game[row-1][column]=play2+1;
                       
                    }
                }
                 game[row][column]="-";
             }else{
                 int f=0;
                    if(game[row+1][column]!="-"){
                    f+=game[row+1][column].charAt(1)-'0';
                    //f+=game[row][column].charAt(1)-'0';
                    f+=1;
                    game[row+1][column]=play2+f;
                    
                    }else{
                        game[row+1][column]=play2+1;
                       
                    }
                 int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    //d+=game[row][column].charAt(1)-'0';
                    d+=1;
                    game[row][column+1]=play2+d;
                    }else{
                        game[row][column+1]=play2+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    //b+=game[row][column].charAt(1)-'0';
                    b+=1;
                    game[row][column-1]=play2+b;
                    }else
                        game[row][column-1]=play2+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    //c+=game[row][column].charAt(1)-'0';
                    c+=1;
                    game[row-1][column]=play2+c;
                    
                    }else{
                        game[row-1][column]=play2+1;
                       
                    }
                }
                 game[row][column]="-";
            }
     //   }
          print_board();
          System.out.println();
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(game[i][j]!="-"){
                    if(game[i][j].charAt(0)==play2.charAt(0)&&game[i][j].charAt(1)>51||game[row][column].charAt(0)==play2.charAt(0)&&game[row][column].length()>=3){
                        return play2_reg(i,j);
                    }
                }
            }
        }
        return null;
    }
    void game_start(){
        while(true){
            int x_check=0,y_check=0;
            play1();
            print_board();
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    if(game[i][j].charAt(0)==play1.charAt(0))
                        x_check++;
                    if(game[i][j].charAt(0)==play2.charAt(0))
                        y_check++;
                }
            }
            if(x_check==0&&count==1){
                System.out.println("player 2 is winner");
                break;
            }
            else if(y_check==0&&count==1){
                System.out.println("player 1 is winner");
                break;
            }
            play2();
            print_board();
            x_check=0;y_check=0;
            for(i=0;i<n;i++){
                for(j=0;j<m;j++){
                    if(game[i][j].charAt(0)==play1.charAt(0))
                        x_check++;
                    if(game[i][j].charAt(0)==play2.charAt(0))
                        y_check++;
                }
            }
            if(x_check==0&&count==1){
                System.out.println("player 2 is winner");
                break;
            }
            else if(y_check==0&&count==1){
                System.out.println("player 1 is winner");
                break;
            }
            count=1;
        }
    }
}
public class chainRules_Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        chain c=new chain();
        
        c.create_board();
        c.print_board();
        c.select_key();
        c.game_start();
        
        System.out.println();
    }
    
}

/*
if(game[row][column]=="-"||game[row][column].charAt(0)==play1.charAt(0)){
            //game[row][column]=play1;
            if(game[row][column].charAt(0)==play1.charAt(0)&&game[row][column].charAt(1)==51){
              if(column==0&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+c;
                    }else{
                      game[row+1][column]=play1+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    d+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+d;
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                    
                }else if(column==m-1&&(row>0&&row<n-1)){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+c;
                    }else{
                      game[row+1][column]=play1+1;
                    }
                    int d=0;
                    if(game[row-1][column]!="-"){
                    d+=game[row-1][column].charAt(1)-'0';
                    d+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+d;
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                    game[row][column]="-";
                }
              else if(row==0){
                if(row==0&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+c;
                   
                    }else{
                        game[row+1][column]=play1+1;
                    }
                }else if(row==0&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+c;
                    game[row][column]="-";
                    }else{
                      game[row+1][column]=play1+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    d+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row+1][column]!="-"){
                    c+=game[row+1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+c;
                   
                    }else{
                        game[row+1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
             }else if(row==n-1){
                 if(row==n-1&&column==0){
                    int b=0;
                    if(game[row][column+1]!="-"){
                    b+=game[row][column+1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+b;
                    }else
                        game[row][column+1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                    }
                }else if(row==n-1&&column==m-1){
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+c;
                    
                    }else{
                      game[row-1][column]=play1+1;
                    }
                }else{
                    int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    d+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
             }else{
                 int f=0;
                    if(game[row+1][column]!="-"){
                    f+=game[row+1][column].charAt(1)-'0';
                    f+=game[row][column].charAt(1)-'0';
                    game[row+1][column]=play1+f;
                    
                    }else{
                        game[row+1][column]=play1+1;
                       
                    }
                 int d=0;
                    if(game[row][column+1]!="-"){
                    d+=game[row][column+1].charAt(1)-'0';
                    d+=game[row][column].charAt(1)-'0';
                    game[row][column+1]=play1+d;
                    }else{
                        game[row][column+1]=play1+1;
                        
                    }
                    int b=0;
                    if(game[row][column-1]!="-"){
                    b+=game[row][column-1].charAt(1)-'0';
                    b+=game[row][column].charAt(1)-'0';
                    game[row][column-1]=play1+b;
                    }else
                        game[row][column-1]=play1+1;
                    int c=0;
                    if(game[row-1][column]!="-"){
                    c+=game[row-1][column].charAt(1)-'0';
                    c+=game[row][column].charAt(1)-'0';
                    game[row-1][column]=play1+c;
                    
                    }else{
                        game[row-1][column]=play1+1;
                       
                    }
                }
                 game[row][column]="-";
            }else if(game[row][column]!="-"){
                String ch="";
                for(i=0;i<game[row][column].length();i++){
                    if(game[row][column].charAt(i)>=48&&game[row][column].charAt(i)<=57){
                        int a=0;
                        a=(game[row][column].charAt(i)-'0')+1;
                        ch+=a;
                    }else{
                        ch+=game[row][column].charAt(i);
                    }
                }
                game[row][column]=ch;
            }else
                game[row][column]=play1+'1';
        }else{
            System.out.println("your selection is wrong because player 2 key is here so plases try agsin ");
            return play1();
        }
*/