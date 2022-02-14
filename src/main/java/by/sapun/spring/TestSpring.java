package by.sapun.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

       /* MusicPlayer firstPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        MusicPlayer secondPlayer = context.getBean("musicPlayer",MusicPlayer.class);

        boolean comparison = firstPlayer == secondPlayer;

        System.out.println(comparison);
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);

        firstPlayer.setVolume(10);
        System.out.println(firstPlayer.getVolume());
        System.out.println(secondPlayer.getVolume());*/

        //System.out.println(musicPlayer.getName());
        //System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
