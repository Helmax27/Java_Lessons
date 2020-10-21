package Lesson26;

import org.ini4j.Profile;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.Collection;


public class Task5 {
    public static void main(String[] args) throws IOException {
        Wini ini = new Wini(new File("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\test.ini"));

        Collection<Profile.Section> list = ini.values();
        for (Profile.Section section: list){
            System.out.println(section.getName());
        }

        String value = ini.fetch("link#1", "link");
        System.out.println(value);

        Profile.Section section = ini.get("link#3");

        for (String key: section.keySet()){
            System.out.println(key);
            System.out.println(ini.fetch(section.getName(),key));
        }

    }
}
