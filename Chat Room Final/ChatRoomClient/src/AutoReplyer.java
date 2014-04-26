
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ashley
 */
public class AutoReplyer {

    String[] mode2 = {"ok!", "I know!", "yes!", "great!", "nice!", "right!", "cool!", "yup!", "you're right!"};
    String[] mode3 = {"My mom just call me! ttyl", "Go to Shower! Bye!", "Need to work now. Bye!", "I'm so tired. need to sleep. Bye!", "my dad need me to help him clean his car. see ya!", "my mom force me to turn off my computer:( bye!", "oh no I forget something. gotta go ttyl", "my boss just call me to go to his office. bye", "need to pick my sister up. bye!"};
    String[] mode4 = {"E = mc2 has sometimes been used as an explanation for the origin of energy in nuclear processes.",
        "In nuclear physics and nuclear chemistry, nuclear fission is either a nuclear reaction or a radioactive decay process in which the nucleus of an atom splits into smaller parts (lighter nuclei).",
        "in africa every 60 seconds a minute passes",
        "Huffman coding is an entropy encoding algorithm used for lossless data compression."};
    String[] mode5 = {"how's the weather today?", "how do you feel today?", "how are you doing?", "do you know ISLAB?", "do you know who is Blue?", "I feel good today!", "how do you think about hacker?", "how do you think anout this chat room?"};
    String[] mode6 = {"http://i.imgur.com/KszZaEo.jpg", "http://i.imgur.com/y9WmYlS.jpg", "http://i.imgur.com/WqujM5p.jpg"};

    AutoReplyer() {
    }

    public String getMode2Reply() {
        Random r = new Random();
        return mode2[r.nextInt(mode2.length)];
    }

    public void mode3() {
        System.out.println("mode3");
        Random r = new Random();
        String s = mode3[r.nextInt(mode3.length)];
        MsgSender sender = new MsgSender();
        int type = 1;
        if (ClientScreen.isPrivate()) {
            type = 2;
        }
        sender.send(type, loginScreen.userName, s);
    }

    public void mode4() {
        System.out.println("mode4");
        Random r = new Random();
        String s = mode4[r.nextInt(mode4.length)];
        MsgSender sender = new MsgSender();
        int type = 1;
        if (ClientScreen.isPrivate()) {
            type = 2;
        }
        sender.send(type, loginScreen.userName, s);
    }

    public void mode5() {
        System.out.println("mode5");
        Random r = new Random();
        String s = mode5[r.nextInt(mode5.length)];
        MsgSender sender = new MsgSender();
        int type = 1;
        if (ClientScreen.isPrivate()) {
            type = 2;
        }
        sender.send(type, loginScreen.userName, s);
    }
    public void mode6() {
        System.out.println("mode6");
        Random r = new Random();
        String s = "<br><img src="+mode6[r.nextInt(mode6.length)]+">";
        MsgSender sender = new MsgSender();
        int type = 1;
        if (ClientScreen.isPrivate()) {
            type = 2;
        }
        sender.send(type, loginScreen.userName, s);
    }
}
