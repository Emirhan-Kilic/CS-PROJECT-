package Bilkay.mainDashBoardScreens;

import Bilkay.UserRelatedServices.user;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainDashboardMenu {

    private final JFrame myMainFrame;
    private JPanel mainPanelForMenu;
    private JPanel leftSideMenuBackgroundPanel;
    private JPanel rightMainDashboardPanel;
    private JPanel leftSideMenuForegroundPanel;
    private JButton homeButton;
    private JPanel topUserPanel;
    private JPanel bottomMenuPanel;
    private JButton userPP;
    private JLabel nameOfTheUserLabel;
    private JLabel pointsOfTheUserLabel;
    private JSeparator seperatorJseperator;
    private JButton settingsButton;
    private JButton gymButton;
    private JButton webButton;
    private JButton peopleButton;
    private JButton mailButton;
    private JButton bilUberButton;
    private JPanel homeMenuPanel;
    private JPanel profileMenuPanel;
    private JPanel mathcesMenuPanel;
    private JPanel eventsMenuPanel;
    private JPanel biluberMenuPanel;
    private JPanel emailMenuPanel;
    private JPanel gymMenuPanel;
    private JPanel settingsMenuPanel;

    private final user currentUser;



    public mainDashboardMenu(JFrame myMainFrameInput, user currentUser) {
        this.myMainFrame = myMainFrameInput;
        this.currentUser = currentUser;

        rightMainDashboardPanel.removeAll();
        ImageIcon iconPP = new ImageIcon(new ImageIcon(currentUser.getPathToPP()).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
        userPP.setIcon(iconPP);
        nameOfTheUserLabel.setText(currentUser.getNameSurname());
        pointsOfTheUserLabel.setText(String.valueOf(currentUser.getBilkayPoints()) + " points");


        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(true);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();

                rightMainDashboardPanel.removeAll();
                rightMainDashboardPanel.add(new mainHomeMenu(myMainFrame, currentUser).getMainPanelForMenu());

                myMainFrame.revalidate();
                myMainFrame.repaint();

            }
        });
        peopleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(true);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();


            }
        });
        webButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(true);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();

            }
        });
        bilUberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(true);
                userPP.setSelected(false);
                updateInfo();

            }
        });
        mailButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(true);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();

            }
        });
        gymButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(true);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();

            }
        });
        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(true);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(false);
                updateInfo();

                rightMainDashboardPanel.removeAll();
                rightMainDashboardPanel.add(new mainSettingsMenu(myMainFrame, currentUser).getMainPanelForMenu());
                myMainFrame.revalidate();
                myMainFrame.repaint();


            }
        });
        userPP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                homeButton.setSelected(false);
                settingsButton.setSelected(false);
                gymButton.setSelected(false);
                webButton.setSelected(false);
                peopleButton.setSelected(false);
                mailButton.setSelected(false);
                bilUberButton.setSelected(false);
                userPP.setSelected(true);
                updateInfo();


            }
        });
    }

    public JPanel getMainPanelForMenu() {
        return mainPanelForMenu;
    }

    public void updateInfo() {
        nameOfTheUserLabel.setText(currentUser.getNameSurname());
        pointsOfTheUserLabel.setText(String.valueOf(currentUser.getBilkayPoints()) + " points");
        ImageIcon iconPP = new ImageIcon(new ImageIcon(currentUser.getPathToPP()).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
        userPP.setIcon(iconPP);
    }


}
