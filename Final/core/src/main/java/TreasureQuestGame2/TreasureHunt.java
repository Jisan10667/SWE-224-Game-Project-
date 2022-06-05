package TreasureQuestGame2;

public class TreasureHunt extends BaseGame
{
    public void create() 
    {        
        super.create();
        setActiveScreen( new  MenuScreen() );
    }
}