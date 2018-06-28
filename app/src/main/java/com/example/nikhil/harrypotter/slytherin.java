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

public class slytherin extends Activity {

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
        setContentView(R.layout.activity_slytherin);

        //Name of the Character
        name = new String[]{"Salazar Slytherin", "Tom Riddle", "Lord Voldermort","Severus Snape", "Lucious Malfoy", "Draco Malfoy","Bellatrix Lestrange","Dolores Umbridge", "The Bloody Baron", "Horace Slughorn" };

        //Main Description
        description = new String[]{"One of the four Hogwarts founders. He was a famous Parselmouth who built the Chamber of Secrets","A troubled young wizard with an affinity for the Dark Arts and manipulation","Formerly known as Tom Marvolo Riddle and commonly referred to as He-Who-Must-Not-Be-Named. The most powerful Dark wizard of all time","Hogwarts Potions master, Head of Slytherin house and former Death Eater. Holds a grudge against Harry","Draco's father who serves Lord Voldemort as a Death Eater in both Wizarding Wars","A pure-blood wizard, proud Slytherin and Harry Potter’s arch rival at Hogwarts","One of Voldemort’s most loyal Death Eaters, sent to Azkaban for her crimes. A dangerous witch and skilled duelist","A half-blood witch who is a sinister Ministry bureaucrat and one-time Hogwarts teacher","The Slytherin Ghost is a gaunt and silent spectre covered in silver bloodstains.","Well-connected Potions master and founder of the Slug Club"};

        //List View Description
        desc = new String[]{"Viper","Snake","Nagina","Peacock","Mouse","Scorpion","Spider","Badger","Mastiff","Horse"};

        //Quote by the character
        quote = new String[]{"'We’ll teach just those whose ancestry is purest'","'I can make bad things happen to people who annoy me.'","'There is nothing worse than death, Dumbledore!'","Ah, yes, Harry Potter. Our new – celebrity.","Dear me, what’s the use of being a disgrace to the name of wizard if they don’t even pay you well for it?","'Potter! My Father will hear about this'","If I had sons, I would be glad to give them up to the service of the Dark Lord!","'Well, it is lovely to be back at Hogwarts, I must say! And to see such happy little faces!'","'So sorry, your bloodiness, Mr Baron, sir'","To friendship! To generosity! To ten Galleons a hair!"};

        //Patronus
        patronus = new String[]{"Viper","Snake","Nagina","Peacock","Mouse","Scorpion","Spider","Badger","Mastiff","Horse" };

        //Skills
        skill = new String[]{"Accomplished Legilimens and one of the first recorded Parselmouths","Outstanding manipulation, Parseltongue","Dark magic, Inferi creation and control, Parseltongue and the power to possess living creatures","Extremely skilled at potions and Occlumency","Skilled duellist and potioneer","Controlling Peeves","Duelist - Occlumens","Quill - Punisher","Accomplished Occlumens, expert Potioneer","Chaser, Bat-Bogey Hex"};

        //Wand Images
        wicon = new int[]{R.drawable.general, R.drawable.voldemort, R.drawable.voldemort,R.drawable.snape, R.drawable.general, R.drawable.draco,R.drawable.bellatrix, R.drawable.general, R.drawable.general, R.drawable.general};

        //Profile Images
        icon = new int[]{R.drawable.salazar_icon,R.drawable.tom_icon, R.drawable.voldie, R.drawable.snape_icon,R.drawable.lucius_icon, R.drawable.draco_icon, R.drawable.bellatrix_icon,R.drawable.umbridge_icon, R.drawable.bloodybaron_icon, R.drawable.slughorn_icon};

        //Creating and Sending the Name, Profile Image and List View Description from the List to the Adapter
        listView = findViewById(R.id.slytherin_list);

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

