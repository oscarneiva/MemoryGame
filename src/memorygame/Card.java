/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import javafx.scene.image.Image;

/**
 *
 * @author Oscar Neiva
 */
public class Card {
    private String name;
    private Image image;
    private boolean isTurnedOver;

    public Card(String name, Image image, boolean isTurnedOver) {
        this.name = name;
        this.image = image;
        this.isTurnedOver = isTurnedOver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean getIsTurnedOver() {
        return isTurnedOver;
    }

    public void setIsTurnedOver(boolean isTurnedOver) {
        this.isTurnedOver = isTurnedOver;
    }

}
