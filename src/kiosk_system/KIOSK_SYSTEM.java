
package kiosk_system;

import FRAMES.BiteGo_Frame;
import FRAMES.DineIn_TakeOut;
import FRAMES.KantoKusina_Frame;
import FRAMES.Start_Frame;
import FRAMES.Welcome_Frame;
import FRAMES.YankeeBite;


public class KIOSK_SYSTEM {

    public static void main(String[] args) {
     Start_Frame sf = new Start_Frame();
     DineIn_TakeOut dt = new DineIn_TakeOut();
     YankeeBite yb = new YankeeBite();
     Welcome_Frame wf = new Welcome_Frame();
     
    KantoKusina_Frame kk = new KantoKusina_Frame();
    BiteGo_Frame bf = new BiteGo_Frame();
     
     sf.setVisible(true);
     dt.setVisible(false);
     yb.setVisible(false);
     wf.setVisible(false);
     kk.setVisible(false);
     bf.setVisible(false);
          
    }
    
}
