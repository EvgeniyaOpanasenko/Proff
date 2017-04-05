package ua.com.converter;

import ua.com.model.*;

public class Converter {

    public static Hobby convertToHobby(String name) {

        if (name.equals("SPORT")) {
            return new Hobby(HobbyType.SPORT);
        } else if (name.equals("FINANCE")) {
            return new Hobby(HobbyType.FINANCE);
        } else if (name.equals("THEATRE")) {
            return new Hobby(HobbyType.THEATRE);
        }

        return null;

    }

    public static Region covertToRegion(String regionString) {
        if (regionString.equals("KIEV")) return new Region(RegionName.KIEV);
        else if (regionString.equals("KHARKOV")) return new Region(RegionName.KHARKOV);
        else if (regionString.equals("LVOV")) return new Region(RegionName.LVOV);

        return null;
    }

    public static Clan convertToClan(String clanString) {
        return new Clan(clanString);
    }
}
