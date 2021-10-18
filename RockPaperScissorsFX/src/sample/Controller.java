package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView fon;

    @FXML
    private ImageView srp;

    @FXML
    private Button lucky;

    @FXML
    private Text players;

    @FXML
    private Text winners;

    @FXML
    void initialize() {
      lucky.setOnAction(event -> {
                  String r = "Rock";
                  String p = "Paper";
                  String s = "Scissors";
                  String vr = " vs Rock";
                  String vp = " vs Paper";
                  String vs = " vs Scissors";
                  String[] strArray = {r, p, s};
                  int RandomElement = (int) ((Math.random() * (strArray.length - 0)) + 0);


                  String[] HAY = {vr, vp, vs};
                  int Random = (int) ((Math.random() * (strArray.length - 0)) + 0);

                  // ничья камень и камень
                  if (strArray[RandomElement].contains(r) && HAY[Random].contains(vr) || strArray[RandomElement].contains(r) && HAY[Random].contains(vr))
                  {
                      players.setText("Players: Rock vs Rock");
                      winners.setText("Result: Draw ");
                  }
                  // ничья бумага и бумага
                  if (strArray[RandomElement].contains(p) && HAY[Random].contains(vp) || strArray[RandomElement].contains(p) && HAY[Random].contains(vp))
                  {
                      players.setText("Players: Paper vs Paper");
                      winners.setText("Result: Draw ");
                  }
                  // ничья ножницы и ножницы
                  if (strArray[RandomElement].contains(s) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vs))
                  {
                      players.setText("Players: Scissors vs Scissors");
                      winners.setText("Result: Draw ");
                  }
                  // победа бумаги , камень и бумага
                  if (strArray[RandomElement].contains(r) && HAY[Random].contains(vp) || strArray[RandomElement].contains(p) && HAY[Random].contains(vr))
                  {
                      players.setText("Players: Rock vs Paper");
                      winners.setText("Result: Paper win ");
                  }
                  // победа камня , камень и ножницы
                  if (strArray[RandomElement].contains(r) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vr))
                  {
                      players.setText("Players: Rock vs Scissors");
                      winners.setText("Result: Rock win ");
                  }
                  // победа ножниц , бумага и ножницы
                  if (strArray[RandomElement].contains(p) && HAY[Random].contains(vs) || strArray[RandomElement].contains(s) && HAY[Random].contains(vp))
                  {
                      players.setText("Players: Scissors vs Papers");
                      winners.setText("Result: Scissors win ");
                  }
      });

    }
}
