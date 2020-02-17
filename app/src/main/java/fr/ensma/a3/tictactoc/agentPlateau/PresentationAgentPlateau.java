package fr.ensma.a3.tictactoc.agentPlateau;

public class PresentationAgentPlateau {
    private IPresentationAgentPlateau pres;

    private ModelAgentPlateau mod;

    public PresentationAgentPlateau(){
        mod = new ModelAgentPlateau();
    }

    public ModelAgentPlateau getMod() {
        return mod;
    }
}
