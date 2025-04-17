package KoreaIT;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {

  public static String getNowBate(){
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String formatedNow = now.format(formatter);



    return formatedNow;
  }

}