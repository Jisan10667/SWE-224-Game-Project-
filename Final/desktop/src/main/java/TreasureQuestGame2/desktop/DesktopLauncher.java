package TreasureQuestGame2.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import TreasureQuestGame2.TreasureHunt;

/** Launches the desktop (LWJGL) application. */
public class DesktopLauncher
{
    public static void main (String[] args)
    {
        TreasureHunt myGame = new TreasureHunt();
        LwjglApplication launcher = new LwjglApplication( myGame, "Treasure Hunt", 800, 600 );

    }
}