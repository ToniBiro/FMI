package interfaces.model.constructionitems;

import interfaces.Washable;

public class Window implements Washable {

    @Override
    public void wash() {
        System.out.println("washing a window");
    }
}
