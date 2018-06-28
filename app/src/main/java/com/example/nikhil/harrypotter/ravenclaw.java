package com.example.nikhil.harrypotter;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class ravenclaw extends Activity {

    //Variables for sending data to the List View Adapter and List Activity for displaying on the Profile Page
    ListView listView;
    ListViewAdapter adapter;
    String [] name;
    String [] description;
    String [] desc;
    String [] quote;
    String [] skill;
    String [] patronus;
    int [] wicon;
    int [] icon;

    //List Made to display the information provided within the parameters
    ArrayList<Model> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ravenclaw);

        //Name of the Character
        name = new String[]{"Rowena Ravenclaw", "Filius Flitwick", "Gilderoy Lockhart", "Sybill Trelawney", "Garrick Olivander", "Cho Chang", "Luna Lovegood","Moaning Myrtle", "Padma Patil", "Quirinus Quirell" };

        //Main Description
        description = new String[]{"One of the four Hogwarts founders. She wore an enchanted diadem, which was stolen by her daughter","Hogwarts Charms professor and Head of Ravenclaw house","Author, professor and five-time winner of Witch Weekly's Most Charming Smile Award","Divination professor at Hogwarts who has prophesied accurately at least twice","Considered by many to be the world's best wandmaker, almost everyone at Hogwarts gets their wands from him","Ravenclaw Seeker, member of Dumbledore’s Army, Harry’s first crush","Unique Ravenclaw, true friend and artist","Hogwarts ghost who haunts the girls' toilets on the first floor","Parvati Patil’s twin sister and member of Dumbledore’s Army","Stuttering, nervous Defence Against the Dark Arts professor who's hiding a dark secret"};

        //List View Description
        desc = new String[]{"Diadem","Feather","Buzzard","Doe","Brown Bear","Swan","Hare","Field Mouse","Rabbit","Brown Owl"};

        //Quote by the character
        quote = new String[]{"'We’ll teach those whose intelligence is surest'","'Swish and flick, remember, swish and flick.'","'Nice big smile, Harry. Together, you and I are worth the front page.'","'The Grim, my dear, the Grim! The giant, spectral dog that haunts churchyards!'","'It’s really the wand that chooses the wizard, of course.'","'If they think I’m not going to fight You-Know-Who after what happened to Cedric –'","'Don’t worry. You’re just as sane as I am.'","'Will you come and visit me in my bathroom again sometime?'","'Are you going to ask me to dance at all?'","'You're too nosy to live, Potter.'"};

        //Patronus
        patronus = new String[]{"Diadem","Feather","Buzzard","Doe","Brown Bear","Swan","Hare","Field Mouse","Rabbit","Brown Owl"};

        //Skills
        skill = new String[]{"Extremely skilled witch, known for her intelligence and wisdom","Charms","Wizard, Bowman, Strong","A Seer","WandCraft","Wizard Chess, Quiditch Goalkeeping","Spotting Nargles","Herbology, Warrior","Animagus, Witch","Defensive Magic"};

        //Wand Images
        wicon = new int[]{R.drawable.general, R.drawable.general, R.drawable.general,R.drawable.general, R.drawable.general, R.drawable.general,R.drawable.general, R.drawable.general, R.drawable.general, R.drawable.general};

        //Profile Images
        icon = new int[]{R.drawable.rowena_icon, R.drawable.filius_icon, R.drawable.lockhart_icon,R.drawable.sybill_icon, R.drawable.olivander_icon, R.drawable.cho_icon,R.drawable.luna_icon, R.drawable.moanin_icon, R.drawable.padma_icon, R.drawable.quirell_icon};

        //Creating and Sending the Name, Profile Image and List View Description from the List to the Adapter
        listView = findViewById(R.id.ravenclaw_list);

        //Sending the information for display provided to the Activity List Page
        for (int i = 0; i<name.length; i++){
            Model model = new Model(name[i],desc[i],description[i],quote[i],patronus[i],skill[i],icon[i],wicon[i]);
            //bind all strings in an array
            arrayList.add(model);
        }
        //pass results to listViewAdapter Class
        adapter = new ListViewAdapter(this, arrayList);

        //bind the adapter to the listview
        listView.setAdapter(adapter);

    }
    //Transition fade out
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

