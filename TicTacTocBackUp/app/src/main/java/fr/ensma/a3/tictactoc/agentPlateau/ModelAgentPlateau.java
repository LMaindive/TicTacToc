package fr.ensma.a3.tictactoc.agentPlateau;

import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

import fr.ensma.a3.tictactoc.agentCase.PresentationAgentCase;
import fr.ensma.a3.tictactoc.agentCase.VueAgentCase;

public class ModelAgentPlateau {

    private List<VueAgentCase> lvcase;
    private List<PresentationAgentCase> lpcase;
    private List<ImageButton> lbutton;

    public ModelAgentPlateau(){
        lpcase = new ArrayList<PresentationAgentCase>();
        lvcase = new ArrayList<VueAgentCase>();

        for (int i = 0 ; i < 9 ; i++){
            lpcase.add(new PresentationAgentCase());
            lvcase.add(new VueAgentCase(lpcase.get(i), lbutton.get(i)));
        }
    }

    public List<VueAgentCase> getLvcase() {
        return lvcase;
    }

    public void setLvcase(List<VueAgentCase> lvcase) {
        this.lvcase = lvcase;
    }

    public List<PresentationAgentCase> getLpcase() {
        return lpcase;
    }

    public void setLpcase(List<PresentationAgentCase> lpcase) {
        this.lpcase = lpcase;
    }

    public List<ImageButton> getLbutton() {
        return lbutton;
    }

    public void setLbutton(List<ImageButton> lbutton) {
        this.lbutton = lbutton;
    }
}
