package sg.edu.rp.c346.id21037552.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step 1
    TextView tvTranslatedText;
    TextView tvTranslatedText2;


    String wordClicked = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2
        tvTranslatedText = findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2 = findViewById(R.id.textViewTranslatedText2);
        //Trigger menu
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, 0, 0, "English");
        menu.add(0, 1, 1, "Italian");

        if (v == tvTranslatedText) {
            wordClicked = "hello";
        } else if (v == tvTranslatedText2) {
            wordClicked = "bye";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (wordClicked.equalsIgnoreCase("hello")) {

            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText.setText("Hello");
                return true; //menu item successfully handled
            }
            else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText.setText("Ciao");
                return true;  //menu item successfully handled
            }
        }


        if (wordClicked.equalsIgnoreCase("bye")) {

            if (item.getItemId() == 0) { //check whether the selected menu item ID is 0
                //code for action
                tvTranslatedText2.setText("Bye");
                return true; //menu item successfully handled
            }
            else if (item.getItemId() == 1) { //check if the selected menu item ID is 1
                //code for action
                tvTranslatedText2.setText("Addio");
                return true;  //menu item successfully handled
            }
        }

        return super.onContextItemSelected(item);
    }


}