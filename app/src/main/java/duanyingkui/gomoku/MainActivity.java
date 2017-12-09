package duanyingkui.gomoku;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Duan on 2017/12/7.
 */

public class MainActivity extends AppCompatActivity {
    private AlertDialog alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button game_fight = (Button) findViewById(R.id.game_fight);
        Button game_help = (Button) findViewById(R.id.game_help);
        Button game_exit = (Button) findViewById(R.id.game_exit);

        game_fight.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FightGameActivity.class));
            }
        });


        game_help.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"四不四傻?五子棋都不会?",Toast.LENGTH_LONG).show();
            }
        });

        game_exit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                alert = new AlertDialog.Builder(MainActivity.this).create();
                alert.setTitle("提示:");
                alert.setMessage("确定要退出游戏吗?");
                //确定
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(0);
                    }
                });
                //取消
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert.dismiss();
                    }
                });
                alert.show();
            }
        });
    }

}
