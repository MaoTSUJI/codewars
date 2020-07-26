public class Dubstep {
    public static String songDecoder(final String song) {
        return song.replaceAll("(WUB)+", " ").trim();
    }
}