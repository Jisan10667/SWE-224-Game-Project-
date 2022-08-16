package TreasureQuestGame2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class TreasureHunt extends BaseGame
{

    public void create() 
    {

        super.create();
        setActiveScreen( new  MenuScreen() );

    }
}