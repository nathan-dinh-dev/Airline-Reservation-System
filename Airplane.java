import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

/**
 * Airplane class represents an airplane with a collection of seats.
 * It manages seat reservations, cancellations, and seat availability.
 *
 * Programmed by: Nathan Dinh
 * Date: 10/02/2024
 */
public class Airplane {

    // Declares variables
    private Map<String, Seat> seats;

    public Airplane() {
        seats = new HashMap<>();
        defaultSeatsMap();
    }

    /**
     * Initializes the seat map with a default configuration.
     * It defines seat type such as First Class, Economy Plus, and Economy.
     */
    private void defaultSeatsMap() {
        // This is United First Class Seat
        // Row 1
        seats.put("1A", new Seat("1A", "First", 1000));
        seats.put("1B", new Seat("1B", "First", 1000));
        seats.put("1D", new Seat("1D", "First", 1000));
        seats.put("1E", new Seat("1E", "First", 1000));
        seats.put("1F", new Seat("1F", "First", 1000));
        seats.put("1G", new Seat("1G", "First", 1000));
        seats.put("1L", new Seat("1L", "First", 1000));
        seats.put("1K", new Seat("1K", "First", 1000));

        // Row 2
        seats.put("2A", new Seat("2A", "First", 1000));
        seats.put("2B", new Seat("2B", "First", 1000));
        seats.put("2D", new Seat("2D", "First", 1000));
        seats.put("2E", new Seat("2E", "First", 1000));
        seats.put("2F", new Seat("2F", "First", 1000));
        seats.put("2G", new Seat("2G", "First", 1000));
        seats.put("2L", new Seat("2L", "First", 1000));
        seats.put("2K", new Seat("2K", "First", 1000));

        // Row 3
        seats.put("3A", new Seat("3A", "First", 1000));
        seats.put("3B", new Seat("3B", "First", 1000));
        seats.put("3D", new Seat("3D", "First", 1000));
        seats.put("3E", new Seat("3E", "First", 1000));
        seats.put("3F", new Seat("3F", "First", 1000));
        seats.put("3G", new Seat("3G", "First", 1000));
        seats.put("3L", new Seat("3L", "First", 1000));
        seats.put("3K", new Seat("3K", "First", 1000));

        // Row 4
        seats.put("4A", new Seat("4A", "First", 1000));
        seats.put("4B", new Seat("4B", "First", 1000));
        seats.put("4L", new Seat("4L", "First", 1000));
        seats.put("4K", new Seat("4K", "First", 1000));

        // This is Economy Plus Seat
        // Row 17
        seats.put("17A", new Seat("17A", "EPlus", 500));
        seats.put("17B", new Seat("17B", "EPlus", 500));
        seats.put("17C", new Seat("17C", "EPlus", 500));
        seats.put("17D", new Seat("17D", "EPlus", 500));
        seats.put("17E", new Seat("17E", "EPlus", 500));
        seats.put("17F", new Seat("17F", "EPlus", 500));
        seats.put("17G", new Seat("17G", "EPlus", 500));
        seats.put("17J", new Seat("17J", "EPlus", 500));
        seats.put("17L", new Seat("17L", "EPlus", 500));
        seats.put("17K", new Seat("17K", "EPlus", 500));

        // Row 18
        seats.put("18A", new Seat("18A", "EPlus", 500));
        seats.put("18B", new Seat("18B", "EPlus", 500));
        seats.put("18C", new Seat("18C", "EPlus", 500));
        seats.put("18D", new Seat("18D", "EPlus", 500));
        seats.put("18E", new Seat("18E", "EPlus", 500));
        seats.put("18F", new Seat("18F", "EPlus", 500));
        seats.put("18G", new Seat("18G", "EPlus", 500));
        seats.put("18J", new Seat("18J", "EPlus", 500));
        seats.put("18L", new Seat("18L", "EPlus", 500));
        seats.put("18K", new Seat("18K", "EPlus", 500));

        // Row 19
        seats.put("19A", new Seat("19A", "EPlus", 500));
        seats.put("19B", new Seat("19B", "EPlus", 500));
        seats.put("19C", new Seat("19C", "EPlus", 500));
        seats.put("19D", new Seat("19D", "EPlus", 500));
        seats.put("19E", new Seat("19E", "EPlus", 500));
        seats.put("19F", new Seat("19F", "EPlus", 500));
        seats.put("19G", new Seat("19G", "EPlus", 500));
        seats.put("19J", new Seat("19J", "EPlus", 500));
        seats.put("19L", new Seat("19L", "EPlus", 500));
        seats.put("19K", new Seat("19K", "EPlus", 500));

        // Row 20
        seats.put("20A", new Seat("20A", "EPlus", 500));
        seats.put("20B", new Seat("20B", "EPlus", 500));
        seats.put("20C", new Seat("20C", "EPlus", 500));
        seats.put("20D", new Seat("20D", "EPlus", 500));
        seats.put("20E", new Seat("20E", "EPlus", 500));
        seats.put("20F", new Seat("20F", "EPlus", 500));
        seats.put("20G", new Seat("20G", "EPlus", 500));
        seats.put("20J", new Seat("20J", "EPlus", 500));
        seats.put("20L", new Seat("20L", "EPlus", 500));
        seats.put("20K", new Seat("20K", "EPlus", 500));

        // Row 21
        seats.put("21A", new Seat("21A", "EPlus", 500));
        seats.put("21B", new Seat("21B", "EPlus", 500));
        seats.put("21C", new Seat("21C", "EPlus", 500));
        seats.put("21D", new Seat("21D", "EPlus", 500));
        seats.put("21E", new Seat("21E", "EPlus", 500));
        seats.put("21F", new Seat("21F", "EPlus", 500));
        seats.put("21G", new Seat("21G", "EPlus", 500));
        seats.put("21J", new Seat("21J", "EPlus", 500));
        seats.put("21L", new Seat("21L", "EPlus", 500));
        seats.put("21K", new Seat("21K", "EPlus", 500));

        // Row 22
        seats.put("22A", new Seat("22A", "EPlus", 500));
        seats.put("22B", new Seat("22B", "EPlus", 500));
        seats.put("22C", new Seat("22C", "EPlus", 500));
        seats.put("22D", new Seat("22D", "EPlus", 500));
        seats.put("22E", new Seat("22E", "EPlus", 500));
        seats.put("22F", new Seat("22F", "EPlus", 500));
        seats.put("22G", new Seat("22G", "EPlus", 500));
        seats.put("22J", new Seat("22J", "EPlus", 500));
        seats.put("22L", new Seat("22L", "EPlus", 500));
        seats.put("22K", new Seat("22K", "EPlus", 500));

        // Row 23
        seats.put("23A", new Seat("23A", "EPlus", 500));
        seats.put("23B", new Seat("23B", "EPlus", 500));
        seats.put("23C", new Seat("23C", "EPlus", 500));
        seats.put("23D", new Seat("23D", "EPlus", 500));
        seats.put("23E", new Seat("23E", "EPlus", 500));
        seats.put("23F", new Seat("23F", "EPlus", 500));
        seats.put("23G", new Seat("23G", "EPlus", 500));
        seats.put("23J", new Seat("23J", "EPlus", 500));
        seats.put("23L", new Seat("23L", "EPlus", 500));
        seats.put("23K", new Seat("23K", "EPlus", 500));

        // Row 24
        seats.put("24A", new Seat("24A", "EPlus", 500));
        seats.put("24B", new Seat("24B", "EPlus", 500));
        seats.put("24C", new Seat("24C", "EPlus", 500));
        seats.put("24D", new Seat("24D", "EPlus", 500));
        seats.put("24E", new Seat("24E", "EPlus", 500));
        seats.put("24F", new Seat("24F", "EPlus", 500));
        seats.put("24G", new Seat("24G", "EPlus", 500));
        seats.put("24J", new Seat("24J", "EPlus", 500));
        seats.put("24L", new Seat("24L", "EPlus", 500));
        seats.put("24K", new Seat("24K", "EPlus", 500));


        // Row 25
        seats.put("25A", new Seat("25A", "EPlus", 500));
        seats.put("25B", new Seat("25B", "EPlus", 500));
        seats.put("25C", new Seat("25C", "EPlus", 500));
        seats.put("25J", new Seat("25J", "EPlus", 500));
        seats.put("25L", new Seat("25L", "EPlus", 500));
        seats.put("25K", new Seat("25K", "EPlus", 500));

        // Row 26
        seats.put("26A", new Seat("26A", "EPlus", 500));
        seats.put("26B", new Seat("26B", "EPlus", 500));
        seats.put("26C", new Seat("26C", "EPlus", 500));
        seats.put("26J", new Seat("26J", "EPlus", 500));
        seats.put("26L", new Seat("26L", "EPlus", 500));
        seats.put("26K", new Seat("26K", "EPlus", 500));

        // Row 39
        seats.put("39A", new Seat("39A", "EPlus", 500));
        seats.put("39B", new Seat("39B", "EPlus", 500));
        seats.put("39C", new Seat("39C", "EPlus", 500));
        seats.put("39J", new Seat("39J", "EPlus", 500));
        seats.put("39L", new Seat("39L", "EPlus", 500));
        seats.put("39K", new Seat("39K", "EPlus", 500));

        // Row 40
        seats.put("40D", new Seat("40D", "EPlus", 500));
        seats.put("40E", new Seat("40E", "EPlus", 500));
        seats.put("40F", new Seat("40F", "EPlus", 500));
        seats.put("40G", new Seat("40G", "EPlus", 500));

        // This is Economy Seat
        // Row 25
        seats.put("25D", new Seat("25D", "EPlus", 250));
        seats.put("25E", new Seat("25E", "EPlus", 250));
        seats.put("25F", new Seat("25F", "EPlus", 250));
        seats.put("25G", new Seat("25G", "EPlus", 250));

        // Row 26
        seats.put("26D", new Seat("26D", "EPlus", 250));
        seats.put("26E", new Seat("26E", "EPlus", 250));
        seats.put("26F", new Seat("26F", "EPlus", 250));
        seats.put("26G", new Seat("26G", "EPlus", 250));

        // Row 27
        seats.put("27A", new Seat("27A", "Economy", 250));
        seats.put("27B", new Seat("27B", "Economy", 250));
        seats.put("27C", new Seat("27C", "Economy", 250));
        seats.put("27D", new Seat("27D", "Economy", 250));
        seats.put("27E", new Seat("27E", "Economy", 250));
        seats.put("27F", new Seat("27F", "Economy", 250));
        seats.put("27G", new Seat("27G", "Economy", 250));
        seats.put("27J", new Seat("27J", "Economy", 250));
        seats.put("27L", new Seat("27L", "Economy", 250));
        seats.put("27K", new Seat("27K", "Economy", 250));

        // Row 28
        seats.put("28A", new Seat("28A", "Economy", 250));
        seats.put("28B", new Seat("28B", "Economy", 250));
        seats.put("28C", new Seat("28C", "Economy", 250));
        seats.put("28D", new Seat("28D", "Economy", 250));
        seats.put("28E", new Seat("28E", "Economy", 250));
        seats.put("28F", new Seat("28F", "Economy", 250));
        seats.put("28G", new Seat("28G", "Economy", 250));
        seats.put("28J", new Seat("28J", "Economy", 250));
        seats.put("28L", new Seat("28L", "Economy", 250));
        seats.put("28K", new Seat("28K", "Economy", 250));

        // Row 29
        seats.put("29A", new Seat("29A", "Economy", 250));
        seats.put("29B", new Seat("29B", "Economy", 250));
        seats.put("29C", new Seat("29C", "Economy", 250));
        seats.put("29D", new Seat("29D", "Economy", 250));
        seats.put("29E", new Seat("29E", "Economy", 250));
        seats.put("29F", new Seat("29F", "Economy", 250));
        seats.put("29G", new Seat("29G", "Economy", 250));
        seats.put("29J", new Seat("29J", "Economy", 250));
        seats.put("29L", new Seat("29L", "Economy", 250));
        seats.put("29K", new Seat("29K", "Economy", 250));

        // Row 30
        seats.put("30A", new Seat("30A", "Economy", 250));
        seats.put("30B", new Seat("30B", "Economy", 250));
        seats.put("30C", new Seat("30C", "Economy", 250));
        seats.put("30D", new Seat("30D", "Economy", 250));
        seats.put("30E", new Seat("30E", "Economy", 250));
        seats.put("30F", new Seat("30F", "Economy", 250));
        seats.put("30G", new Seat("30G", "Economy", 250));
        seats.put("30J", new Seat("30J", "Economy", 250));
        seats.put("30L", new Seat("30L", "Economy", 250));
        seats.put("30K", new Seat("30K", "Economy", 250));

        // Row 31
        seats.put("31A", new Seat("31A", "Economy", 250));
        seats.put("31B", new Seat("31B", "Economy", 250));
        seats.put("31C", new Seat("31C", "Economy", 250));
        seats.put("31D", new Seat("31D", "Economy", 250));
        seats.put("31E", new Seat("31E", "Economy", 250));
        seats.put("31F", new Seat("31F", "Economy", 250));
        seats.put("31G", new Seat("31G", "Economy", 250));
        seats.put("31J", new Seat("31J", "Economy", 250));
        seats.put("31L", new Seat("31L", "Economy", 250));
        seats.put("31K", new Seat("31K", "Economy", 250));

        // Row 32
        seats.put("32A", new Seat("32A", "Economy", 250));
        seats.put("32B", new Seat("32B", "Economy", 250));
        seats.put("32C", new Seat("32C", "Economy", 250));
        seats.put("32D", new Seat("32D", "Economy", 250));
        seats.put("32E", new Seat("32E", "Economy", 250));
        seats.put("32F", new Seat("32F", "Economy", 250));
        seats.put("32G", new Seat("32G", "Economy", 250));
        seats.put("32J", new Seat("32J", "Economy", 250));
        seats.put("32L", new Seat("32L", "Economy", 250));
        seats.put("32K", new Seat("32K", "Economy", 250));

        // Row 33
        seats.put("33A", new Seat("33A", "Economy", 250));
        seats.put("33B", new Seat("33B", "Economy", 250));
        seats.put("33C", new Seat("33C", "Economy", 250));
        seats.put("33D", new Seat("33D", "Economy", 250));
        seats.put("33E", new Seat("33E", "Economy", 250));
        seats.put("33F", new Seat("33F", "Economy", 250));
        seats.put("33G", new Seat("33G", "Economy", 250));
        seats.put("33J", new Seat("33J", "Economy", 250));
        seats.put("33L", new Seat("33L", "Economy", 250));
        seats.put("33K", new Seat("33K", "Economy", 250));

        // Row 34
        seats.put("34A", new Seat("34A", "Economy", 250));
        seats.put("34B", new Seat("34B", "Economy", 250));
        seats.put("34C", new Seat("34C", "Economy", 250));
        seats.put("34D", new Seat("34D", "Economy", 250));
        seats.put("34E", new Seat("34E", "Economy", 250));
        seats.put("34F", new Seat("34F", "Economy", 250));
        seats.put("34G", new Seat("34G", "Economy", 250));
        seats.put("34J", new Seat("34J", "Economy", 250));
        seats.put("34L", new Seat("34L", "Economy", 250));
        seats.put("34K", new Seat("34K", "Economy", 250));

        // Row 35
        seats.put("35A", new Seat("35A", "Economy", 250));
        seats.put("35B", new Seat("35B", "Economy", 250));
        seats.put("35C", new Seat("35C", "Economy", 250));
        seats.put("35D", new Seat("35D", "Economy", 250));
        seats.put("35E", new Seat("35E", "Economy", 250));
        seats.put("35F", new Seat("35F", "Economy", 250));
        seats.put("35G", new Seat("35G", "Economy", 250));
        seats.put("35J", new Seat("35J", "Economy", 250));
        seats.put("35L", new Seat("35L", "Economy", 250));
        seats.put("35K", new Seat("35K", "Economy", 250));

        // Row 36
        seats.put("36A", new Seat("36A", "Economy", 250));
        seats.put("36B", new Seat("36B", "Economy", 250));
        seats.put("36C", new Seat("36C", "Economy", 250));
        seats.put("36D", new Seat("36D", "Economy", 250));
        seats.put("36E", new Seat("36E", "Economy", 250));
        seats.put("36F", new Seat("36F", "Economy", 250));
        seats.put("36G", new Seat("36G", "Economy", 250));
        seats.put("36J", new Seat("36J", "Economy", 250));
        seats.put("36L", new Seat("36L", "Economy", 250));

        // Row 37
        seats.put("37A", new Seat("37A", "Economy", 250));
        seats.put("37B", new Seat("37B", "Economy", 250));
        seats.put("37L", new Seat("37L", "Economy", 250));
        seats.put("37K", new Seat("37K", "Economy", 250));

        // Row 40
        seats.put("40A", new Seat("40A", "EPlus", 500));
        seats.put("40B", new Seat("40B", "EPlus", 500));
        seats.put("40C", new Seat("40C", "EPlus", 500));
        seats.put("40J", new Seat("40J", "EPlus", 500));
        seats.put("40K", new Seat("40K", "EPlus", 500));
        seats.put("40L", new Seat("40L", "EPlus", 500));

        // Row 41
        seats.put("41A", new Seat("41A", "Economy", 250));
        seats.put("41B", new Seat("41B", "Economy", 250));
        seats.put("41C", new Seat("41C", "Economy", 250));
        seats.put("41D", new Seat("41D", "Economy", 250));
        seats.put("41E", new Seat("41E", "Economy", 250));
        seats.put("41F", new Seat("41F", "Economy", 250));
        seats.put("41G", new Seat("41G", "Economy", 250));
        seats.put("41J", new Seat("41J", "Economy", 250));
        seats.put("41L", new Seat("41L", "Economy", 250));
        seats.put("41K", new Seat("41K", "Economy", 250));

        // Row 42
        seats.put("42A", new Seat("42A", "Economy", 250));
        seats.put("42B", new Seat("42B", "Economy", 250));
        seats.put("42C", new Seat("42C", "Economy", 250));
        seats.put("42D", new Seat("42D", "Economy", 250));
        seats.put("42E", new Seat("42E", "Economy", 250));
        seats.put("42F", new Seat("42F", "Economy", 250));
        seats.put("42G", new Seat("42G", "Economy", 250));
        seats.put("42J", new Seat("42J", "Economy", 250));
        seats.put("42L", new Seat("42L", "Economy", 250));
        seats.put("42K", new Seat("42K", "Economy", 250));

        // Row 43
        seats.put("43A", new Seat("43A", "Economy", 250));
        seats.put("43B", new Seat("43B", "Economy", 250));
        seats.put("43C", new Seat("43C", "Economy", 250));
        seats.put("43D", new Seat("43D", "Economy", 250));
        seats.put("43E", new Seat("43E", "Economy", 250));
        seats.put("43F", new Seat("43F", "Economy", 250));
        seats.put("43G", new Seat("43G", "Economy", 250));
        seats.put("43J", new Seat("43J", "Economy", 250));
        seats.put("43L", new Seat("43L", "Economy", 250));
        seats.put("43K", new Seat("43K", "Economy", 250));

        // Row 44
        seats.put("44A", new Seat("44A", "Economy", 250));
        seats.put("44B", new Seat("44B", "Economy", 250));
        seats.put("44C", new Seat("44C", "Economy", 250));
        seats.put("44D", new Seat("44D", "Economy", 250));
        seats.put("44E", new Seat("44E", "Economy", 250));
        seats.put("44F", new Seat("44F", "Economy", 250));
        seats.put("44G", new Seat("44G", "Economy", 250));
        seats.put("44J", new Seat("44J", "Economy", 250));
        seats.put("44L", new Seat("44L", "Economy", 250));
        seats.put("44K", new Seat("44K", "Economy", 250));

        // Row 45
        seats.put("45A", new Seat("45A", "Economy", 250));
        seats.put("45B", new Seat("45B", "Economy", 250));
        seats.put("45C", new Seat("45C", "Economy", 250));
        seats.put("45D", new Seat("45D", "Economy", 250));
        seats.put("45E", new Seat("45E", "Economy", 250));
        seats.put("45F", new Seat("45F", "Economy", 250));
        seats.put("45G", new Seat("45G", "Economy", 250));
        seats.put("45J", new Seat("45J", "Economy", 250));
        seats.put("45L", new Seat("45L", "Economy", 250));
        seats.put("45K", new Seat("45K", "Economy", 250));

        // Row 46
        seats.put("46A", new Seat("46A", "Economy", 250));
        seats.put("46B", new Seat("46B", "Economy", 250));
        seats.put("46C", new Seat("46C", "Economy", 250));
        seats.put("46D", new Seat("46D", "Economy", 250));
        seats.put("46E", new Seat("46E", "Economy", 250));
        seats.put("46F", new Seat("46F", "Economy", 250));
        seats.put("46G", new Seat("46G", "Economy", 250));
        seats.put("46J", new Seat("46J", "Economy", 250));
        seats.put("46L", new Seat("46L", "Economy", 250));
        seats.put("46K", new Seat("46K", "Economy", 250));

        // Row 47
        seats.put("47A", new Seat("47A", "Economy", 250));
        seats.put("47B", new Seat("47B", "Economy", 250));
        seats.put("47C", new Seat("47C", "Economy", 250));
        seats.put("47D", new Seat("47D", "Economy", 250));
        seats.put("47E", new Seat("47E", "Economy", 250));
        seats.put("47F", new Seat("47F", "Economy", 250));
        seats.put("47G", new Seat("47G", "Economy", 250));
        seats.put("47J", new Seat("47J", "Economy", 250));
        seats.put("47L", new Seat("47L", "Economy", 250));
        seats.put("47K", new Seat("47K", "Economy", 250));

        // Row 48
        seats.put("48A", new Seat("48A", "Economy", 250));
        seats.put("48B", new Seat("48B", "Economy", 250));
        seats.put("48D", new Seat("48D", "Economy", 250));
        seats.put("48E", new Seat("48E", "Economy", 250));
        seats.put("48F", new Seat("48F", "Economy", 250));
        seats.put("48G", new Seat("48G", "Economy", 250));
        seats.put("48L", new Seat("48L", "Economy", 250));
        seats.put("48K", new Seat("48K", "Economy", 250));

        // Row 49
        seats.put("49A", new Seat("49A", "Economy", 250));
        seats.put("49B", new Seat("49B", "Economy", 250));
        seats.put("49D", new Seat("49D", "Economy", 250));
        seats.put("49E", new Seat("49E", "Economy", 250));
        seats.put("49F", new Seat("49F", "Economy", 250));
        seats.put("49G", new Seat("49G", "Economy", 250));
        seats.put("49L", new Seat("49L", "Economy", 250));
        seats.put("49K", new Seat("49K", "Economy", 250));

        // Row 50
        seats.put("50A", new Seat("50A", "Economy", 250));
        seats.put("50B", new Seat("50B", "Economy", 250));
        seats.put("50D", new Seat("50D", "Economy", 250));
        seats.put("50E", new Seat("50E", "Economy", 250));
        seats.put("50F", new Seat("50F", "Economy", 250));
        seats.put("50G", new Seat("50G", "Economy", 250));
        seats.put("50L", new Seat("50L", "Economy", 250));
        seats.put("50K", new Seat("50K", "Economy", 250));

        // Row 51
        seats.put("51A", new Seat("51A", "Economy", 250));
        seats.put("51B", new Seat("51B", "Economy", 250));
        seats.put("51D", new Seat("51D", "Economy", 250));
        seats.put("51E", new Seat("51E", "Economy", 250));
        seats.put("51F", new Seat("51F", "Economy", 250));
        seats.put("51G", new Seat("51G", "Economy", 250));
        seats.put("51L", new Seat("51L", "Economy", 250));
        seats.put("51K", new Seat("51K", "Economy", 250));

        // Row 52
        seats.put("52A", new Seat("52A", "Economy", 250));
        seats.put("52B", new Seat("52B", "Economy", 250));
        seats.put("52D", new Seat("52D", "Economy", 250));
        seats.put("52E", new Seat("52E", "Economy", 250));
        seats.put("52F", new Seat("52F", "Economy", 250));
        seats.put("52G", new Seat("52G", "Economy", 250));

        // Row 53
        seats.put("53D", new Seat("53D", "Economy", 250));
        seats.put("53E", new Seat("53E", "Economy", 250));
        seats.put("53F", new Seat("53F", "Economy", 250));
        seats.put("53G", new Seat("53G", "Economy", 250));
    }

    /**
     * Checks if a seat is available for reservation.
     *
     * @param seatNumber The seat number to be checked.
     * @return True if the seat is available, false otherwise.
     */
    public boolean isSeatAvailable(String seatNumber) {
        Seat seat = seats.get(seatNumber);
        return seat != null && !seat.isReserved();
    }

    /**
     * Reserves a seat for a user if it is available.
     *
     * @param seatNumber The seat number to be reserved.
     * @param userId     The ID of the user reserving the seat.
     */
    public void reserveSeat(String seatNumber, String userId) {
        Seat seat = seats.get(seatNumber);
        if(seat != null && !seat.isReserved()) {
            seat.reserve(userId);
        }
    }

    /**
     * Cancels a reservation for a seat.
     *
     * @param seatNumber The seat number whose reservation is to be canceled.
     */
    public void cancelReservation(String seatNumber) {
        Seat seat = seats.get(seatNumber);
        if (seat != null && seat.isReserved()) {
            seat.cancel();
        }
    }

    /**
     * Displays the availability of all seats in a specific order:
     * First Class, then Economy Plus, and finally Economy.
     */
    public void showAvailability() {
        System.out.println("Seat Availability");

        // Display First Class seats first
        System.out.println("\nFirst Class:");
        showSeatsByType("First");

        // Display Economy Plus seats next
        System.out.println("\nEconomy Plus:");
        showSeatsByType("EPlus");

        // Display Economy seats last
        System.out.println("\nEconomy:");
        showSeatsByType("Economy");
    }

    /**
     * Displays the seats by type if they are available.
     *
     * @param seatType The type of the seat to display ("First", "EPlus", "Economy").
     */
    private void showSeatsByType(String seatType) {
        for (String seatNumber : seats.keySet()) {
            Seat seat = seats.get(seatNumber);
            if (!seat.isReserved() && seat.getSeatType().equals(seatType)) {
                System.out.println(seatNumber + ": " + seat.getSeatType() + " (price: $" + seat.getPrice() + ")");
            }
        }
    }

    /**
     * Retrieves a list of reservations made by a specific user.
     *
     * @param userId The ID of the user whose reservations are being retrieved.
     * @return A list of reserved seats in the format "seatNumber $price".
     */
    public List<String> getUserReservations(String userId) {
        List<String> reservedSeats = new ArrayList<>();
        for (Seat seat : seats.values()) {
            if (seat.isReserved() && seat.getReservedBy().equals(userId)) {
                reservedSeats.add(seat.getSeatNumber() + " $" + seat.getPrice());
            }
        }
        return reservedSeats;
    }

    /**
     * Gets the Seat object for a specific seat number.
     *
     * @param seatNumber The seat number to be retrieved.
     * @return The Seat object associated with the seat number, or null if not found.
     */
    public Seat getSeat(String seatNumber) {
        return seats.get(seatNumber);
    }

    /**
     * Retrieves a list of all seats in the airplane.
     *
     * @return A list of all Seat objects in the airplane.
     */
    public List<Seat> getAllSeats() {
        return new ArrayList<>(seats.values());
    }}
