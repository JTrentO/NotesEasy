

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.Group;

import javafx.stage.Stage;
 

/**
 *
 * @author Jason
 */
public class NotesEasy extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       
        
        VBox vbox = new VBox();
        Scene scene = new Scene( vbox, 600, 600 );
        
        Menu menuFile = new Menu( "File" );
        MenuItem openFile = new MenuItem( "Open" );
        openFile.setAccelerator( KeyCombination.keyCombination("Ctrl+O") );
        MenuItem newFile = new MenuItem( "New" );
        newFile.setAccelerator( KeyCombination.keyCombination( "Ctrl+N" ) );
        MenuItem saveFile = new MenuItem( "Save" );
        saveFile.setAccelerator( KeyCombination.keyCombination( "Ctrl+S" ) );
        MenuItem closeFile = new MenuItem( "Close" );
        closeFile.setAccelerator( KeyCombination.keyCombination("Ctrl+L") );
        menuFile.getItems().addAll( newFile, openFile, saveFile, closeFile );
        
		Menu menuEdit = new Menu( "Edit" );
		MenuItem cutText = new MenuItem( "Cut" );
		cutText.setAccelerator( ( KeyCombination.keyCombination( "Ctrl+X" ) ) );
		MenuItem copyText = new MenuItem( "Copy" );
		copyText.setAccelerator( ( KeyCombination.keyCombination( "Ctrl+C" ) ) );
		MenuItem pasteText = new MenuItem( "Paste" );
		pasteText.setAccelerator( ( KeyCombination.keyCombination( "Ctrl+V" ) ) );
		menuEdit.getItems().addAll( cutText, copyText, pasteText );
		
        Menu menuView = new Menu( "View" );
		ToggleGroup toggleView = new ToggleGroup();
		RadioMenuItem small = new RadioMenuItem( "350 X 500" );
		small.setSelected( false );
		RadioMenuItem medium = new RadioMenuItem( "450 X 550" );
		medium.setSelected( true );
		RadioMenuItem large = new RadioMenuItem( "500 X 600" );
		large.setSelected( false );
		small.setToggleGroup( toggleView );
		medium.setToggleGroup( toggleView );
		large.setToggleGroup( toggleView );
		menuView.getItems().addAll( small, medium, large );
		
		
        Menu menuFormat = new Menu( "Format" );
		
		Menu textStyle = new Menu( "Text Style" );
		CheckMenuItem underline = new CheckMenuItem( "Underline" );
		underline.setAccelerator( KeyCombination.keyCombination( "Ctrl+U" ) );
		CheckMenuItem bold = new CheckMenuItem( "Bold" );
		bold.setAccelerator( KeyCombination.keyCombination( "Ctrl+B" ) );
		CheckMenuItem italic = new CheckMenuItem( "Italic" );
		italic.setAccelerator( KeyCombination.keyCombination( "Ctrl+I" ) );
		textStyle.getItems().addAll( underline, bold, italic );
		
		Menu textSize = new Menu( "Text Size" );
		
		Menu font = new Menu( "Font" );
		
        menuFormat.getItems().addAll( font, textStyle, textSize );
		
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll( menuFile, menuEdit, menuView, menuFormat );
        
        vbox.getChildren().addAll(menuBar);
        
        
        primaryStage.setTitle( "NOTESeasy" );
        primaryStage.setScene( scene );
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}