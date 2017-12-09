package duanyingkui.gomoku;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import duanyingkui.gomoku.game.GamePanel;

/**
 * Created by Duan on 2017/12/7.
 */

public class FightGameActivity extends AppCompatActivity {
    private Button bt_ReStart;//重玩按钮
    private Button bt_Return;//悔棋按钮
    private Button bt_about;//关于
//    private Button bt_back;//返回
    private AlertDialog alert;
    private GamePanel gamePanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight_game);
        initViews();
        initEvents();
    }

    private void initViews() {
        bt_ReStart = (Button) findViewById(R.id.id_bt_restart);
        bt_Return = (Button) findViewById(R.id.id_bt_return);
        bt_about = (Button) findViewById(R.id.id_bt_about);
//        bt_back = (Button) findViewById(R.id.id_bt_back);
        gamePanel = (GamePanel) findViewById(R.id.game_view);

    }

    private void initEvents() {
        bt_ReStart.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //重玩
                gamePanel.reStart();
            }
        });

        bt_Return.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //悔棋
                gamePanel.Return();
            }
        });

        bt_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert = new AlertDialog.Builder(FightGameActivity.this).create();
                alert.setTitle("游戏关于:");
                alert.setMessage("五子棋称亦为“连五子”或“连珠”，源于史书中“日月如合璧，五星如连珠”。五子棋不仅能增强思维能力，提高智力，而且富含哲理，有助于修身养性。并具有“ 短、平、快 ”特点，适合于现代休闲娱乐，又饱含古典哲学的“ 阴阳易理 ”,它既有简单易学的特点为年轻男女所喜爱，又有深奥的技巧和高水平的国际性比赛；兼具有东方的神秘和西方的直观，它是中西方文化的交融点，也是一个中西方文化交流的平台。");

                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert.dismiss();
                    }
                });

                alert.show();
            }
        });
//
//        bt_back.setOnClickListener(new View.OnClickListener(){
//
//            public void onClick(View v) {
//                //返回游戏主界面
//                startActivity(new Intent(FightGameActivity.this, MainActivity.class));
//            }
//        });
    }

}
