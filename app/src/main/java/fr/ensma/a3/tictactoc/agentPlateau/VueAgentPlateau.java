package fr.ensma.a3.tictactoc.agentPlateau;

import android.widget.ImageButton;

import java.util.List;

public class VueAgentPlateau implements IPresentationAgentPlateau {
    private PresentationAgentPlateau pres;
    private List<ImageButton> lbutton;

    public VueAgentPlateau(PresentationAgentPlateau pres, List<ImageButton> lbutton){
        this.pres = pres;
        this.lbutton = lbutton;
    }

    @Override
    public void initialize() {
        pres.getMod().setLbutton(lbutton);
    }

    @Override
    public void notifDebut() {

    }
}
