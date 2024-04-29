/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawingProgram;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpringLayout;

/**
 *
 * @author zayed
 */
public class GUIManager {

    private DrawingProgram drawingProgram;
    private JPanel toolbar;
    private MyPanel canvas;

    public GUIManager(DrawingProgram drawingProgram, JPanel toolbar, MyPanel canvas) {
        this.drawingProgram = drawingProgram;
        this.toolbar = toolbar;
        this.canvas = canvas;
        addButtonsAndFields();
    }

    private void addButtonsAndFields() {

        Map<Component, Constraint> components = new LinkedHashMap<>();

        JToggleButton rectangle = new JToggleButton("draw rectangle");
        rectangle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                handleShapeButtonAction(rectangle, new Rectangle());
            }
        });
        components.put(rectangle, new Constraint(10, 25));

        JToggleButton circle = new JToggleButton("draw circle");
        circle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                handleShapeButtonAction(circle, new Circle());
            }
        });
        components.put(circle, new Constraint(10, 152));

        JToggleButton oval = new JToggleButton("draw Oval");
        oval.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                handleShapeButtonAction(oval, new Oval());
            }
        });
        components.put(oval, new Constraint(10, 257));

        JToggleButton square = new JToggleButton("draw square");
        square.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                handleShapeButtonAction(square, new Square());
            }
        });
        components.put(square, new Constraint(10, 357));

        JButton chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog(null, "Select a color", Color.BLACK);
                chooseColorButton.setBackground(c);
                canvas.setColor(c);
            }
        });
        components.put(chooseColorButton, new Constraint(10, 472));

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                canvas.resetCanvas();
            }
        });
        components.put(resetButton, new Constraint(10, 595));

        JTextField textField = new JTextField(2);
        JButton setFontSize = new JButton("setFontSize");
        setFontSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.setFontSize(Integer.parseInt(textField.getText()));
            }
        });
        components.put(textField, new Constraint(13, 747));
        components.put(setFontSize, new Constraint(10, 772));

        for (Map.Entry<Component, Constraint> entry : components.entrySet()) {
            toolbar.add(entry.getKey());
        }

        setConstraint(components);

    }

    private void handleShapeButtonAction(JToggleButton button, Shape shape) {
        if (button.isSelected()) {

            canvas.setShapeSelected(true);
            canvas.setActivaited(shape);
        } else {
            canvas.setShapeSelected(false);
        }
    }

    private void setConstraint(Map<Component, Constraint> components) {
        SpringLayout springLayout = new SpringLayout();
        toolbar.setLayout(springLayout);
        GUILayoutManager.setConstraints(springLayout, toolbar, canvas, 50, components);

        drawingProgram.pack();
    }

}
