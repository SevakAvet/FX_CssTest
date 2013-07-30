package com.sevak_avet.css_test;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class Controller implements Initializable {
	@FXML
	private static Button simpleButton;
	@FXML
	private static ListView<String> simpleListView;

	public static final List<String> styles = Arrays.asList("green", "round-red", "bevel-grey", "glass-grey", "shiny-orange",
															"dark-blue", "dark-blue Text", "record-sales", "record-sales:hover",
															"record-sales:pressed", "record-sales Text", "rich-blue", "rich-blue Text",
															"big-yellow", "big-yellow Text", "iphone-toolbar", "iphone", "iphone Text",
															"ipad-dark-grey", "ipad-dark-grey Text", "ipad-grey", "ipad-grey Text",
															"lion-default", "lion", "windows7-default", "windows7");
	private static final ObservableList<String> stylesListView = FXCollections.observableList(styles);

	public void initialize(URL location, ResourceBundle resources) {
		simpleListView.setItems(stylesListView);
		simpleListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				System.out.println(newValue);
				simpleButton.setId(newValue);
			}
		});
		
	};
}
