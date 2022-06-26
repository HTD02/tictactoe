package com.myapplication.tictactoe;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Boolean check = true;
    PlayGame playGame;
    ImageView i00,i01,i02,i10,i11,i12,i20,i21,i22;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Init();
        playGame = new PlayGame();
        playGame.giaTriBanDau();


    }
    void Init(){
        i00 = findViewById(R.id.i00);
        i01 = findViewById(R.id.i01);
        i02 = findViewById(R.id.i02);
        i10 = findViewById(R.id.i10);
        i11 = findViewById(R.id.i11);
        i12 = findViewById(R.id.i12);
        i20 = findViewById(R.id.i20);
        i21 = findViewById(R.id.i21);
        i22 = findViewById(R.id.i22);
    }
    @Override
    public void onClick(View view) {
        int viewId = view.getId();
        if(viewId == R.id.i00){
            i00.setImageResource(setAnh());
            i00.setEnabled(false);
            playGame.datGiaTri(0,0,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i01){
            i01.setImageResource(setAnh());
            i01.setEnabled(false);
            playGame.datGiaTri(0,1,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i02){
            i02.setImageResource(setAnh());
            i02.setEnabled(false);
            playGame.datGiaTri(0,2,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i10){
            i10.setImageResource(setAnh());
            i10.setEnabled(false);
            playGame.datGiaTri(1,0,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i11){
            i11.setImageResource(setAnh());
            i11.setEnabled(false);
            playGame.datGiaTri(1,1,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i12){
            i12.setImageResource(setAnh());
            i12.setEnabled(false);
            playGame.datGiaTri(1,2,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i20){
            i20.setImageResource(setAnh());
            i20.setEnabled(false);
            playGame.datGiaTri(2,0,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i21){
            i21.setImageResource(setAnh());
            i21.setEnabled(false);
            playGame.datGiaTri(2,1,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.i22){
            i22.setImageResource(setAnh());
            i22.setEnabled(false);
            playGame.datGiaTri(2,2,giaTri());
            kiemTra(giaTri());
        }
        if(viewId == R.id.reset){
            reset();
        }
    }
    void reset(){
        i00.setEnabled(true);
        i00.setImageResource(R.color.white);

        i01.setEnabled(true);
        i01.setImageResource(R.color.white);

        i02.setEnabled(true);
        i02.setImageResource(R.color.white);

        i10.setEnabled(true);
        i10.setImageResource(R.color.white);

        i11.setEnabled(true);
        i11.setImageResource(R.color.white);

        i12.setEnabled(true);
        i12.setImageResource(R.color.white);

        i20.setEnabled(true);
        i20.setImageResource(R.color.white);

        i21.setEnabled(true);
        i21.setImageResource(R.color.white);

        i22.setEnabled(true);
        i22.setImageResource(R.color.white);

        playGame.giaTriBanDau();
        check = true;
    }
    private void winGame(String dat) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_win);
        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        ImageView imageView = dialog.findViewById(R.id.imagewin);
        if(dat.equals("X")){
            imageView.setImageResource(R.drawable.x);
        }else{
            imageView.setImageResource(R.drawable.o);
        }
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                reset();
            }
        });
        dialog.show();
    }

    int setAnh(){
        if(check){
            check = false;
            return R.drawable.x;
        }
        check = true;
        return R.drawable.o;
    }
    int giaTri(){
        if(check) return 1;
        return 0;
    }
    void kiemTra(int giatri){
        if(playGame.kiemTraHangNgang()||playGame.kiemTraHangDoc()||playGame.kiemTraDuongCheo()){
            if(giatri==1){
                winGame("O");
            }else{
                winGame("X");
            }
        }return;
    }
}