package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {

    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt); //2023-06-10T22:22:42.244433200

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM*dd*yyyy - HH*mm "); //06*10*2023 - 22*30
        String formattedLdt =dtf.format(ldt);
        System.out.println(formattedLdt);



    }
}
