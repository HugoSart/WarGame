/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wargame.util.audio;

/**
 *
 * @author Hugo Sartori
 */
public final class Effect extends Track {
    
    public Effect(String songName) {
        super(songName);
    }
    
    @Override
    protected void initSettings() {
        mp.setMute(!(AudioControler.isEffectAudio() && AudioControler.isGeneralAudio()));
        mp.setVolume(AudioControler.getEffectVolume()*AudioControler.getGeneralVolume());
    }
    
}
