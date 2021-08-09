/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12.DateTimesAPIs;

import java.time.LocalDateTime;
import static java.time.Month.*;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author Jaco
 */
public class OffsetDateTimeExample {

  public static void main(String[] args) {
    ZoneId SanFran = ZoneId.of("America/Los_Angeles");
    ZoneId London = ZoneId.of("Europe/London");
    LocalDateTime meeting = LocalDateTime.of(2014, JUNE, 13, 12, 30);
    ZonedDateTime staffCall = ZonedDateTime.of(meeting, SanFran);
    OffsetDateTime staffCallOffset = staffCall.toOffsetDateTime();
    ZonedDateTime staffCallLondon = staffCallOffset.atZoneSameInstant(London);
    //ZonedDateTime staffCallLondon = staffCall.withZoneSameInstant(London); 
    System.out.println("Staff call (Pacific) is at: " + staffCall);
    System.out.println("Staff call (UK) is at:      " + staffCallLondon);
  }
}
