import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {

    @Test
    public void downloadingOneMovie(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");


        String[] expected = {"Film_1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void downloadingTenMovies(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");
        manager.addFilm("Film_8");
        manager.addFilm("Film_9");
        manager.addFilm("Film_10");

        String[] expected = {"Film_1", "Film_2", "Film_3", "Film_4", "Film_5", "Film_6", "Film_7", "Film_8", "Film_9", "Film_10",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void downloadingMoreThanTenMovies(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");
        manager.addFilm("Film_8");
        manager.addFilm("Film_9");
        manager.addFilm("Film_10");
        manager.addFilm("Film_11");
        manager.addFilm("Film_12");

        String[] expected = {"Film_1", "Film_2", "Film_3", "Film_4", "Film_5", "Film_6", "Film_7", "Film_8", "Film_9", "Film_10", "Film_11", "Film_12",};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void displayOneMovie(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");


        String[] expected = {"Film_1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void displayTenMovie2(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");
        manager.addFilm("Film_8");
        manager.addFilm("Film_9");
        manager.addFilm("Film_10");


        String[] expected = {"Film_10", "Film_9", "Film_8", "Film_7", "Film_6", "Film_5", "Film_4", "Film_3", "Film_2", "Film_1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void displayElevenMovie2(){
        BillboardManager manager = new BillboardManager();

        manager.addFilm("Film_1");
        manager.addFilm("Film_2");
        manager.addFilm("Film_3");
        manager.addFilm("Film_4");
        manager.addFilm("Film_5");
        manager.addFilm("Film_6");
        manager.addFilm("Film_7");
        manager.addFilm("Film_8");
        manager.addFilm("Film_9");
        manager.addFilm("Film_10");
        manager.addFilm("Film_11");


        String[] expected = {"Film_11", "Film_10", "Film_9", "Film_8", "Film_7", "Film_6", "Film_5", "Film_4", "Film_3", "Film_2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}