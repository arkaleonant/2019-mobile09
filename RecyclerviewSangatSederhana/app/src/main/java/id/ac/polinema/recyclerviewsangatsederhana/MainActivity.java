package id.ac.polinema.recyclerviewsangatsederhana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import id.ac.polinema.recyclerviewsangatsederhana.adapters.SuperHeroAdapter;
import id.ac.polinema.recyclerviewsangatsederhana.models.SuperHero;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menyambungkan rvSuperHero ke layout
        rvSuperHero = findViewById(R.id.rvSuperHero);

        //Membuat object hero
        SuperHero hero = new SuperHero("Petruk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //membuat object hero baru
        hero = new SuperHero("Gareng");
        //menambahkan hero baru ke listSuperhero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Semar");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Iron Man");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Thor");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Hulk");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Gundala");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Nyi Roro Kidoel");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Ant Man");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Superman");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Batman");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Wonder Woman");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("The Flash");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Cyborg");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Gundam");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Naruto");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Boruto");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Sasuke Uchiha");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Itachi Uchiha");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Otsusuki Urashiki");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Boboboy");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Membuat object hero
        hero = new SuperHero("Captain America");
        //menambahkan hero ke listSuperHero
        listSuperHero.add(hero);

        //Instansiasi Adapter
        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);

        //set adapter dan layoutmanager
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new LinearLayoutManager(this));
    }
}
