package xml;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public abstract class SinglePlayerScreen2 extends AnchorPane {

    protected final ImageView back;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final ImageView img_0;
    protected final ImageView img_8;
    protected final ImageView img_7;
    protected final ImageView img_6;
    protected final ImageView img_5;
    protected final ImageView img_4;
    protected final ImageView img_3;
    protected final ImageView img_2;
    protected final ImageView img_1;

    public SinglePlayerScreen2() {

        back = new ImageView();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        img_0 = new ImageView();
        img_8 = new ImageView();
        img_7 = new ImageView();
        img_6 = new ImageView();
        img_5 = new ImageView();
        img_4 = new ImageView();
        img_3 = new ImageView();
        img_2 = new ImageView();
        img_1 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(650.0);
        setPrefWidth(600.0);
        setStyle("-fx-background-color: linear-gradient( #247ba0 0%,#70c1b3 50% ,#247ba0 100%);;");

        back.setFitHeight(41.0);
        back.setFitWidth(35.0);
        back.setLayoutX(14.0);
        back.setLayoutY(14.0);
        back.setPickOnBounds(true);
        back.setPreserveRatio(true);
        back.setImage(new Image(getClass().getResource("../images/backward.png").toExternalForm()));

        AnchorPane.setBottomAnchor(gridPane, 70.0);
        AnchorPane.setLeftAnchor(gridPane, 60.0);
        AnchorPane.setRightAnchor(gridPane, 60.0);
        AnchorPane.setTopAnchor(gridPane, 70.0);
        gridPane.setGridLinesVisible(true);
        gridPane.setLayoutX(60.0);
        gridPane.setLayoutY(58.0);
        gridPane.setPrefHeight(240.0);
        gridPane.setPrefWidth(481.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        img_0.setFitHeight(170.0);
        img_0.setFitWidth(160.0);
        img_0.setId("img_0");
        img_0.setOnMousePressed(this::onImgViewClicked);
        img_0.setPickOnBounds(true);
        img_0.setPreserveRatio(true);

        GridPane.setColumnIndex(img_8, 2);
        GridPane.setRowIndex(img_8, 2);
        img_8.setFitHeight(170.0);
        img_8.setFitWidth(160.0);
        img_8.setId("img_8");
        img_8.setOnMousePressed(this::onImgViewClicked);
        img_8.setPickOnBounds(true);
        img_8.setPreserveRatio(true);

        GridPane.setColumnIndex(img_7, 1);
        GridPane.setRowIndex(img_7, 2);
        img_7.setFitHeight(170.0);
        img_7.setFitWidth(160.0);
        img_7.setId("img_7");
        img_7.setOnMousePressed(this::onImgViewClicked);
        img_7.setPickOnBounds(true);
        img_7.setPreserveRatio(true);

        GridPane.setRowIndex(img_6, 2);
        img_6.setFitHeight(170.0);
        img_6.setFitWidth(160.0);
        img_6.setId("img_6");
        img_6.setOnMousePressed(this::onImgViewClicked);
        img_6.setPickOnBounds(true);
        img_6.setPreserveRatio(true);

        GridPane.setColumnIndex(img_5, 2);
        GridPane.setRowIndex(img_5, 1);
        img_5.setFitHeight(170.0);
        img_5.setFitWidth(160.0);
        img_5.setId("img_5");
        img_5.setOnMousePressed(this::onImgViewClicked);
        img_5.setPickOnBounds(true);
        img_5.setPreserveRatio(true);

        GridPane.setColumnIndex(img_4, 1);
        GridPane.setRowIndex(img_4, 1);
        img_4.setFitHeight(170.0);
        img_4.setFitWidth(160.0);
        img_4.setId("img_4");
        img_4.setOnMousePressed(this::onImgViewClicked);
        img_4.setPickOnBounds(true);
        img_4.setPreserveRatio(true);

        GridPane.setRowIndex(img_3, 1);
        img_3.setFitHeight(170.0);
        img_3.setFitWidth(160.0);
        img_3.setId("img_3");
        img_3.setOnMousePressed(this::onImgViewClicked);
        img_3.setPickOnBounds(true);
        img_3.setPreserveRatio(true);

        GridPane.setColumnIndex(img_2, 2);
        img_2.setFitHeight(170.0);
        img_2.setFitWidth(160.0);
        img_2.setId("img_2");
        img_2.setOnMousePressed(this::onImgViewClicked);
        img_2.setPickOnBounds(true);
        img_2.setPreserveRatio(true);

        GridPane.setColumnIndex(img_1, 1);
        img_1.setFitHeight(170.0);
        img_1.setFitWidth(160.0);
        img_1.setId("img_1");
        img_1.setOnMousePressed(this::onImgViewClicked);
        img_1.setPickOnBounds(true);
        img_1.setPreserveRatio(true);

        getChildren().add(back);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(img_0);
        gridPane.getChildren().add(img_8);
        gridPane.getChildren().add(img_7);
        gridPane.getChildren().add(img_6);
        gridPane.getChildren().add(img_5);
        gridPane.getChildren().add(img_4);
        gridPane.getChildren().add(img_3);
        gridPane.getChildren().add(img_2);
        gridPane.getChildren().add(img_1);
        getChildren().add(gridPane);

    }

    protected abstract void onImgViewClicked(javafx.scene.input.MouseEvent mouseEvent);









}
