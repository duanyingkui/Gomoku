package duanyingkui.gomoku.game;

import android.graphics.Point;
import java.util.List;

/**
 * Created by Duan on 2017/12/7.
 */

public class CheckWin {
    private static int MAX_COUNT_IN_LINE = 5;  //五子棋
    /**
     * 判断x,y位置的棋子，是否横向有相邻的五个一致
     *
     * @param x
     * @param y
     * @param points
     * @return
     */
    public static boolean checkHorizontal(int x, int y, List<Point> points) {
        int count = 1;
        //向左
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x - i, y))) {
                count++;
            }else{
                break;
            }
        }
        if(count == MAX_COUNT_IN_LINE){
            return true;
        }
        //向右
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x + i, y))) {
                count++;
            }else{
                break;
            }
        }
        return false;
    }
    /**
     * 判断x,y位置的棋子，是否纵向有相邻的五个一致
     *
     * @param x
     * @param y
     * @param points
     * @return
     */
    public static boolean checkVertical(int x, int y, List<Point> points) {
        int count = 1;
        //向上
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x, y - i))) {
                count++;
            }else{
                break;
            }
        }
        if(count == MAX_COUNT_IN_LINE){
            return true;
        }
        //向下
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x, y + i))) {
                count++;
            }else{
                break;
            }
        }
        return false;
    }
    /**
     * 判断x,y位置的棋子，是否右左斜有相邻的五个一致
     *
     * @param x
     * @param y
     * @param points
     * @return
     */
    public static boolean checkLeftDiagonal(int x, int y, List<Point> points) {
        int count = 1;
        //向上
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x - i, y + i))) {
                count++;
            }else{
                break;
            }
        }
        if(count == MAX_COUNT_IN_LINE){
            return true;
        }
        //向下
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x + i, y - i))) {
                count++;
            }else{
                break;
            }
        }
        return false;
    }
    /**
     * 判断x,y位置的棋子，是否右斜有相邻的五个一致
     *
     * @param x
     * @param y
     * @param points
     * @return
     */
    public static boolean checkRightDiagonal(int x, int y, List<Point> points) {
        int count = 1;
        //向上
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x - i, y - i))) {
                count++;
            }else{
                break;
            }
        }
        if(count == MAX_COUNT_IN_LINE){
            return true;
        }
        //向下
        for (int i = 1; i < MAX_COUNT_IN_LINE; i++) {
            if (points.contains(new Point(x + i, y + i))) {
                count++;
            }else{
                break;
            }
        }
        return false;
    }
}