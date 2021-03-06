package TreasureQuestGame2;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputEvent.Type;

public class MenuScreen extends BaseScreen
{
    public void initialize()
    {
        BaseActor ocean = new BaseActor(0,0, mainStage);
        ocean.loadTexture( "back1.jpg" );
        ocean.setSize(800,600);

        BaseActor title = new BaseActor(0,0, mainStage);
        title.loadTexture( "Treasure-hunt.png" );
        // title.centerAtPosition(400,300);
        // title.moveBy(0,100);

        // BaseActor start = new BaseActor(0,0, mainStage);
        // start.loadTexture( "assets/message-start.png" );
        // start.centerAtPosition(400,300);
        // start.moveBy(0,-100);
       
        TextButton startButton = new TextButton( "Start", BaseGame.textButtonStyle );
        // startButton.setPosition(150,150);
        // uiStage.addActor(startButton);
        
        startButton.addListener(
            (Event e) -> 
            { 
                if ( !(e instanceof InputEvent) )
                    return false;

                if ( !((InputEvent)e).getType().equals(Type.touchDown) )
                    return false;

                TreasureHunt.setActiveScreen( new LevelScreen() );
                return true;
            }
        );
        
        TextButton quitButton = new TextButton( "Quit", BaseGame.textButtonStyle );
        // quitButton.setPosition(500,150);
        // uiStage.addActor(quitButton);
        
        quitButton.addListener(
            (Event e) -> 
            { 
                if ( !(e instanceof InputEvent) )
                    return false;

                if ( !((InputEvent)e).getType().equals(Type.touchDown) )
                    return false;
                    
                Gdx.app.exit();
                return true;
            }
        );
        
        uiTable.add(title).colspan(2);
        uiTable.row();
        uiTable.add(startButton);
        uiTable.add(quitButton);

    }

    public void update(float dt)
    {

    }

    public boolean keyDown(int keyCode)
    {
        if (Gdx.input.isKeyPressed(Keys.ENTER)) 
            TreasureHunt.setActiveScreen( new LevelScreen() );
        if (Gdx.input.isKeyPressed(Keys.ESCAPE)) 
             Gdx.app.exit();
        return false;
    }
}