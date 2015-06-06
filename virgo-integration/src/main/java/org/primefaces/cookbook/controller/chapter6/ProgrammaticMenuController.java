package org.primefaces.cookbook.controller.chapter6;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

import org.primefaces.cookbook.utils.FacesUtil;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * ProgrammaticMenuController
 *
 * @author  Oleg Varaksin / last modified by $Author: $
 * @version $Revision: 1.0 $
 */
@ManagedBean
@ViewScoped
public class ProgrammaticMenuController implements Serializable {

    private MenuModel model;

    @PostConstruct
    protected void initialize() {
        model = new DefaultMenuModel();

        // first submenu
        DefaultSubMenu submenu = new DefaultSubMenu();
        submenu.setLabel("JavaScript Libraries");

        // menu items
        DefaultMenuItem item = new DefaultMenuItem();
        item.setValue("jQuery");
        item.setUrl("http://jquery.com");
        submenu.addElement(item);

        item = new DefaultMenuItem();
        item.setValue("Yahoo UI");
        item.setUrl("http://yuilibrary.com");
        submenu.addElement(item);

        item = new DefaultMenuItem();
        item.setValue("Prototype");
        item.setUrl("http://prototypejs.org");
        submenu.addElement(item);

        model.addElement(submenu);

        // second submenu
        submenu = new DefaultSubMenu();
        submenu.setLabel("Operations");

        // menu items
        item = new DefaultMenuItem();
        item.setValue("Save");
        item.setCommand("#{positionedMenuController.save}");
        item.setUpdate("growl");
        submenu.addElement(item);

        item = new DefaultMenuItem();
        item.setValue("Update");
        item.setCommand("#{positionedMenuController.update}");
        item.setUpdate("growl");
        submenu.addElement(item);

        item = new DefaultMenuItem();
        item.setValue("Delete");
        item.setCommand("#{positionedMenuController.delete}");
        item.setUpdate("growl");
        submenu.addElement(item);

        model.addElement(submenu);
    }

    public MenuModel getModel() {
        return model;
    }
}
