package Bilkay.mainDashBoardScreens;

import Bilkay.UserRelatedServices.user;

import javax.swing.*;
import java.awt.*;

public class mainEventsMenu {

    private final user currentUser;
    private final JFrame myMainFrame;
    private JPanel mainPanelForMenu;

    public mainEventsMenu(user currentUser, JFrame myMainFrame) {
        this.currentUser = currentUser;
        this.myMainFrame = myMainFrame;
    }

    public JPanel getMainPanelForMenu() {
        return mainPanelForMenu;
    }


}
