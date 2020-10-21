package Lesson26;

import org.ini4j.Profile;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class Task6 {
    public static void main(String[] args) throws IOException {
        Wini inifile = new Wini(new File("C:\\Users\\helen\\IdeaProjects\\TestOlena\\src\\Lesson26\\inifile.ini"));
        Collection<Profile.Section> listini = inifile.values();
        for(Profile.Section ps: listini) {
            System.out.println(ps.getName());
        }
        String sectionValue=inifile.fetch("anti-spam", "service.enabled");
        System.out.println("anti-spam \nservice.enabled=" + sectionValue);

        Profile.Section section=inifile.get("casual-skins");
        for(String key: section.keySet()) {
            System.out.println("key: " + key);
            System.out.println(inifile.fetch(section.getName(), key));
        }
    }
}
