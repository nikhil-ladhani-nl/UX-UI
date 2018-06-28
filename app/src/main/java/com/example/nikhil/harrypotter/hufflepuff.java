package com.example.nikhil.harrypotter;

import android.app.Activity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class hufflepuff extends Activity {

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
    ArrayList<Model> arrayList = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hufflepuff);

        //Name of the Character
        name = new String[]{"Helga Hufflepuff", "Newt Scamander", "Cedric Diggory", "Pomona Sprout", "Nymphadora Tonks", "Teddy Lupin","Hannah Abbot", "The Fat Friar", "Justin Finch-Fletchley", "Susan Bones" };

        //Main Description
        description = new String[]{"One of the four Hogwarts founders. Her portrait can be seen in the Hufflepuff common room toasting her students with her golden cup","Magizoologist and writer of the textbook ‘Fantastic Beasts and Where to Find Them","Popular Hufflepuff Seeker and competitor in the Triwizard Tournament","Herbology Professor and expert in dangerous plants. Head of Hufflepuff house","A Metamorphmagus and Auror with distinctive hair. Member of the Order of the Phoenix","Hello","Hufflepuff prefect and a loyal member of Dumbledore's Army","A cheerful Hufflepuff ghost who still resents the fact he was never made a cardinal in life","Muggle-born Hufflepuff student who was also accepted to Eton","So – is it really true? You make a stag Patronus?"};

        //Quote by the character
        quote = new String[]{"'I’ll teach the lot, and treat them just the same'","'It is our choices...that show what we truly are, far more than our abilities.'","'So, we’re playing against each other again!'","'Be Careful of the Venomous Tentacula... Its Teething'","'Wotcher...Harry!'","'I am sorry too... Sorry I will never know my son'","Collecting Chocolate Frog cards","''The Fat Friar...''", "'Of course, mother was slightly disappointed ...'", "So – is it really true? You make a stag Patronus?"};

        //Patronus
        desc = new String[]{"Badger","Abraxan Winged Horse","Black Bird","Brown Hare","Wolf - Jack Rabbit","Werewolf","White Swan","Bear","Weasel","Newt"};

        //Patronus
        patronus = new String[]{"Badger","Abraxan Winged Horse","Black Bird","Brown Hare","Wolf - Jack Rabbit","Werewolf","White Swan","Bear","Weasel","Newt" };

        //SKills
        skill = new String[]{"Charms, Witch","Magizoology, Wizard","Seeker","Herbology","Auror, Metamorphmagus","Doctor","Animagus","Defender, Witch","Ghost"," Bat-Bogey Hex","Defensive spells, learned with Dumbledore's Army"};

        //Wand Images
        wicon = new int[]{R.drawable.general,  R.drawable.newt,R.drawable.cedric, R.drawable.general, R.drawable.tonks,R.drawable.general, R.drawable.general, R.drawable.general, R.drawable.general, R.drawable.general};

        //Profile Images
        icon = new int[]{R.drawable.helga_icon, R.drawable.newt_icon, R.drawable.cedric_icon,R.drawable.sprout_icon, R.drawable.tonks_icon, R.drawable.lupin_icon,R.drawable.abbot_icon, R.drawable.fat_icon, R.drawable.justin_icon, R.drawable.susan_icon};

        //Creating and Sending the Name, Profile Image and List View Description from the List to the Adapter
        listView = findViewById(R.id.hufflepuff_list);

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


