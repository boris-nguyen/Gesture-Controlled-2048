package ca.uwaterloo.dnnguyen.gesture_controlled_2048;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by borisnguyen on 2017-03-05.
 */

//Abstract class for game blocks; used for future game expansions
public abstract class GameBlockTemplate extends ImageView {
    public GameBlockTemplate(Context input1){
        super(input1); //Invoke ImageView constructor
    }
    public abstract boolean move();
    public abstract void setBlockDirection(GameLoopTask.gameDirection newDirection);
}
