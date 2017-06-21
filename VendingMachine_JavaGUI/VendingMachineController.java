import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

/**
 * The controller of the vending machine application.
 */
public class VendingMachineController {
    /**
     * The model of the vending machine application.
     */
    private VendingMachineModel model;

    /**
     * The view of the vending machine application.
     */
    private VendingMachineView view;

    /**
     * Constructs a newly allocated {@code VendingMachineController} object.
     */
    public VendingMachineController() {
        this.model = new VendingMachineModel();
        this.view = new VendingMachineView();

        //TODO implement your code here


        this.view.getRefillJMenuItem().addActionListener(e -> {
            JButton refillJMenuItem = new JButton("Refill Item");
            String refill = JOptionPane.showInputDialog(this.view.getMainJPanel(), "Enter the name of the bin to refill:", "", JOptionPane.QUESTION_MESSAGE);
            Bin bin[] = model.getBins();
            int position = 0;

            for (int i = 0; i < bin.length; i++) {
                if (refill.equals(bin[i].getName())) {
                    position = i;
                }
            }
            model.getBins()[position].refill();

            for (int i = 0; i < bin.length; i++) {

                if (bin[i].getName().equals("Apple")) {
                    this.view.getAppleJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Aubergine")) {
                    this.view.getAubergineJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Banana")) {
                    this.view.getBananaJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Lemon")) {
                    this.view.getLemonJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Orange")) {
                    this.view.getOrangeJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Pineapple")) {
                    this.view.getPineappleJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Raspberry")) {

                    this.view.getRaspberryJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Strawberry")) {
                    this.view.getStrawberryJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Raspberry")) {
                    this.view.getRaspberryJButton().setEnabled(true);

                } else if (bin[i].getName().equals("Tomato")) {

                    this.view.getTomatoJButton().setEnabled(true);
                } else if (bin[i].getName().equals("Watermelon")) {
                    this.view.getWatermelonJButton().setEnabled(true);

                } else if (bin[i].getName().equals("Cherries")) {
                    this.view.getCherriesJButton().setEnabled(true);
                }
            }

        });


        //re-enable

        this.view.getDisplayProfitJMenuItem().addActionListener(e ->
            JOptionPane.showMessageDialog(this.view.getMainJPanel(), "Profit: " + model.getProfit(), "", JOptionPane.INFORMATION_MESSAGE));



        this.setUpGUI();
        }


    //VendingMachineController

    /**
     * Sets up the GUI to handle user interaction.
     */
    private void setUpGUI() {
        /*
         * Adds action listeners to the components.
         */

        this.view.getAppleJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Apple");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getAppleJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/apple.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getAubergineJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Aubergine");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getAubergineJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/aubergine.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getBroccoliJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Broccoli");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getBroccoliJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/broccoli.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getCherriesJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Cherries");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getCherriesJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/cherries.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getOrangeJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Orange");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getOrangeJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/orange.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getPineappleJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Pineapple");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getPineappleJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/pineapple.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getBananaJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Banana");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getBananaJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/banana.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getLemonJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Lemon");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getLemonJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/lemon.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getRaspberryJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Raspberry");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getRaspberryJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/raspberry.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getStrawberryJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Strawberry");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getStrawberryJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/strawberry.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getTomatoJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Tomato");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getTomatoJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/tomato.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        this.view.getWatermelonJButton().addActionListener(e -> {
            Optional<Bin> binOptional = this.model.vendItem("Watermelon");

            if (binOptional.isPresent()) {
                if (binOptional.get().isEmpty()) {
                    this.view.getWatermelonJButton().setEnabled(false);
                } //end if
            } //end if

            this.view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/watermelon.png"));
            this.view.getDoorJLabel().revalidate();
            this.view.getDoorJLabel().repaint();

            new SwingWorker<Void, Void>() {
                @Override
                protected Void doInBackground() throws InterruptedException {
                    Thread.sleep(5000);
                    view.getDoorJLabel().setIcon(new ImageIcon("foodIcons/bars.png"));
                    view.getDoorJLabel().revalidate();
                    view.getDoorJLabel().repaint();
                    return null;
                } //doInBackground
            }.execute();
        });

        /*
         * Sets up and displays the JFrame.
         */

        JFrame frame = new JFrame();
        frame.setJMenuBar(this.view.getMainJMenuBar());
        frame.setContentPane(this.view.getMainJPanel());
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    } //setUpGUI

    /**
     * Run your program here.
     */
    public static void main(String[] args) {
        new VendingMachineController();
    } //main
}
