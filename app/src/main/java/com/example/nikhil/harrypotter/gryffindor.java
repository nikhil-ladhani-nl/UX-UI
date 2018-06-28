package com.example.nikhil.harrypotter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class gryffindor extends Activity {

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
        setContentView(R.layout.activity_gryffindor);

        //Name of the Character
        name = new String[]{"Godric Gryffindor", "Albus Dumbledore", "Rubeus Hagrid", "Sirius Black", "Harry Potter", "Ron Weasley", "Hermione Granger","Neville Longbottom", "Minerva McGonagall", "Ginny Weasley" };

        //Main Description
        description = new String[] {"One of the four Hogwarts founders. His sword may present itself to a worthy Gryffindor in times of need","Hogwarts Headmaster, founder of the Order of the Phoenix, with a fondness for sherbet lemons and knitting patterns","The half-giant Hogwarts gamekeeper loves all creatures and is a tirelessly loyal friend to Harry and Dumbledore","Harry's Animagus godfather who escaped from Azkaban. Old friend of James and Lily Potter","Harry Potter is The Boy Who Lived, singled out by Lord Voldemort at birth to be his greatest rival, and our hero","One of Harry Potter’s two best friends, fellow Gryffindor, and youngest Weasley son","From bookish Muggle-born to one of Gryffindor's bravest","A clumsy but keen Herbology student and shy Gryffindor with great inner strength","The strict but fair Head of Gryffindor house and Transfiguration teacher","The youngest Weasley child. Brave, tenacious and an accomplished Quidditch player"};

        //List View Description
        desc = new String[]{"Stallion","Phoenix","Buckbeak","Black Dog","Stag","Jack Russel terrier","Otter","Mist","Cat","Horse"};

        //Quote by the character
        quote = new String[] {"'We’ll teach all those with brave deeds to their name'","'There are all kinds of courage. It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends'","'Ah, go boil yer heads, both of yeh. Harry - yer a wizard.'","'We've all got both light and dark inside us. What matters is the part we choose to act on. That's who we really are.'","'It’s got to be like this. It’s got to be me.'","'Bloody Hell!!'","'It's 'LEVIOSA!' not 'LEVIOSAR''","'I'll join you when Hell freezes over...'","‘Potter! Weasley! Will you pay attention?’","'The thing about growing up with Fred and George, is that you sort of start thinking anything's possible if you've got enough nerve.'"};

        //Patronus
        patronus = new String[]{"Stallion","Phoenix","Buckbeak","Black Dog","Stag","Jack Russel terrier","Otter","Mist","Cat","Horse" };

        //Skills
        skill = new String[]{"Duelist","Wizard","Wizard, Bowman, Strong","Animagus, Wizard","Parseltongue,Seeker, Wizard","Wizard Chess, Quiditch Goalkeeping","Almost Everything","Herbology, Warrior","Animagus, Witch","Chaser, Bat-Bogey Hex"};

        //Wand Icon
        wicon = new int[]{R.drawable.godric, R.drawable.dumbeldore, R.drawable.hagrid,R.drawable.sirius, R.drawable.harry, R.drawable.ron,R.drawable.hermione, R.drawable.neville, R.drawable.minerva, R.drawable.ginny};

        //Profile Image
        icon = new int[]{R.drawable.goddrick_icon, R.drawable.albus_icon, R.drawable.hagrid_icon,R.drawable.black_icon, R.drawable.harry_icon, R.drawable.ron_icon,R.drawable.hermione_icon, R.drawable.neville_icon, R.drawable.minerva_icon, R.drawable.ginny_icon};

        //Creating and Sending the Name, Profile Image and List View Description from the List to the Adapter
        listView = findViewById(R.id.gryffindor_list);

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

    //Transition fade out for teh navigation
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
