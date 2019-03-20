/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrtester;

import java.time.LocalDateTime;
import javafx.util.converter.LocalDateTimeStringConverter;
import org.joda.time.DateTime;

/**
 *
 * @author komyo
 */
public class AllAboutDatetime {
    public static void main(String[] args) {
        DateTime t1 = DateTime.now().plusSeconds(Integer.valueOf("180"));
        
        System.out.println(t1);
        System.out.println(t1.isBeforeNow());
    }
    
}
