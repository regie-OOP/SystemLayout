
package kiosk_system;

import FRAMES.DineIn_TakeOut;
import FRAMES.Start_Frame;
import FRAMES.Welcome_Frame;
import FRAMES.YankeeBite;


public class KIOSK_SYSTEM {

    public static void main(String[] args) {
     Start_Frame sf = new Start_Frame();
     DineIn_TakeOut dt = new DineIn_TakeOut();
     YankeeBite yb = new YankeeBite();
     Welcome_Frame wf = new Welcome_Frame();
     
     sf.setVisible(true);
     dt.setVisible(false);
     yb.setVisible(false);
     wf.setVisible(false);
          
    }
    
}
