import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.VBox;

public class App extends Application{

    Stage window;
    //declare table
    TableView<Book> table1;

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        
        window = primaryStage;
        window.setTitle("Table view demo");

        //set Book, name collum
        TableColumn<Book, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(300);
        /*setCellValueFactory is to use the name property of our object into our column
        */
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        //set Author column
        TableColumn<Book, String> authorColumn = new TableColumn<>("Author");
        authorColumn.setMinWidth(400);
        authorColumn.setCellValueFactory(new PropertyValueFactory<>("author"));

        //set NumberOPage column
        TableColumn<Book, Integer>nbrColumn = new TableColumn<>("Pages");
        nbrColumn.setMinWidth(200);
        nbrColumn.setCellValueFactory(new PropertyValueFactory<>("numberOfPage"));

        //set up table
        table1 = new TableView<>();
        table1.setItems(getBook());
        table1.getColumns().addAll(nameColumn,authorColumn,nbrColumn);

        VBox layout1 = new VBox();
        layout1.getChildren().addAll(table1);

        Scene scene = new Scene(layout1);
        window.setScene(scene);
        window.show();
        
    }
    
    //load data of book object into Observable List
    public ObservableList<Book> getBook(){
        // observableArrayList a type of ObservableList that can store
        //java object inside
        ObservableList<Book> books = FXCollections.observableArrayList();
        books.add(new Book("Java I","Mai Ngan", 100));
        books.add(new Book("Java II","Mai Ngan", 120));
        books.add(new Book("Java III","Hotra", 90));
        books.add(new Book("Java Exclusive","Viksolier", 50));

        return books;
    }
}
