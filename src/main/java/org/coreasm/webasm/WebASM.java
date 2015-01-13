package org.coreasm.webasm;

/**
 * Created by Simone Zenzaro on 09/01/15.
 */

import  org.coreasm.engine.CoreASMEngine;
import org.coreasm.engine.CoreASMEngineFactory;

import java.applet.Applet;
import java.awt.*;

public class WebASM extends Applet{

    CoreASMEngine engine = null;

    public void init(){
        engine = CoreASMEngineFactory.createEngine();
        System.out.println("Inizio");
    }

    public void paint(Graphics g){
        System.out.println("Paint");
        g.setColor(Color.blue);
        g.drawRect(0, 0,
                getSize().width -1,
                getSize().height -1);
        g.setColor(Color.red);
        g.drawString("asd: " + CoreASMEngine.class.getName(), 15, 25);
    }

    public String hello() { return "hello"; }

    public String testApplet(){
        return engine.getEngineMode().toString();
    }

}
