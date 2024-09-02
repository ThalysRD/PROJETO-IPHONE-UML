package com.iphone;
import com.iphone.musicplayer.MusicPlayer;
import com.iphone.browser.Browser;
import com.iphone.phonecall.PhoneCall;;

public class Iphone {
    static int volume = 10;
    static boolean ligado = true;

    public static void powerOn(){
    ligado = !ligado;
    System.out.println("O iphone está " + ligado );
}
    public static void volumeUp(){
        volume = volume++;
    }

    public static void volumeDown(){
        volume = volume--;
    }

    public static void main(String[] args) {
        MusicPlayer.play();
        MusicPlayer.stop();

        Browser.abrirUrl("google.com");
        PhoneCall.makeCall("999999999");
        PhoneCall.endCall();
    }


    
    
}
