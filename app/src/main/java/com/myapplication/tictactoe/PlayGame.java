package com.myapplication.tictactoe;


public class PlayGame {
    static int arr[][] = new int[3][3];
    void datGiaTri(int hang,int cot, int giatri){
        arr[hang][cot]=giatri;
    }
    void giaTriBanDau(){
        int i = 0;
        int j = 0;
        int num = -1;
        while (i<3){
            arr[i][j] = num;
            num--;
            j++;
            if(j==3){
                j = 0;
                i++;
            }
        }
    }
    boolean kiemTraDuongCheo(){
        if(arr[1][1]==arr[0][0]&& arr[1][1]==arr[2][2]){
            return true;
        }
        if(arr[1][1]==arr[0][2]&& arr[1][1]==arr[2][0]){
            return true;
        }
        return false;
    }
    boolean kiemTraHangNgang(){
        if(arr[0][0]==arr[0][1]&& arr[0][1]==arr[0][2]){
            return true;
        }
        if(arr[1][0]==arr[1][1]&& arr[1][1]==arr[1][2]){
            return true;
        }
        if(arr[2][0]==arr[2][1]&& arr[2][1]==arr[2][2]){
            return true;
        }
        return false;
    }
    boolean kiemTraHangDoc(){
        if(arr[0][0]==arr[1][0]&& arr[1][0]==arr[2][0]){
            return true;
        }
        if(arr[0][1]==arr[1][1]&& arr[1][1]==arr[2][1]){
            return true;
        }
        if(arr[0][2]==arr[1][2]&& arr[1][2]==arr[2][2]){
            return true;
        }
        return false;
    }
}
