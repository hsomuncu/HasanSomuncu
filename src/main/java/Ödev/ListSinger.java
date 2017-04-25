package Ödev;

import java.util.ArrayList;

/**
 * Created by Hasan on 25.04.2017.
 */

public class ListSinger {
    public ArrayList<String> VolkanKonak = new ArrayList<String>();


    public void ListSingerAlbum()

    {
        VolkanKonak.add("/ VOLKAN KONAK /");
        VolkanKonak.add("aleni");
        VolkanKonak.add("göklerdekartalgibiyim");
        VolkanKonak.add("mimozaciçeğim");
        for (int i = 0; i < VolkanKonak.size(); i++) {
            System.out.println(VolkanKonak.get(i));
        }
    }
}