import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlbumBuilderTest {

    @Test
    void shouldThrowsWithInvalidName() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setArtist("Artista")
                    .setAverageRating(0.0F)
                    .setDuration(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido!", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidArtist() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setName("Nome")
                    .setAverageRating(0.0F)
                    .setDuration(10)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Artista inválido!", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidDuration() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setArtist("Artista")
                    .setName("Nome")
                    .setAverageRating(0.0F)
                    .setDuration(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Duração inválida!", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithNegativeDuration() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setArtist("Artista")
                    .setName("Nome")
                    .setAverageRating(0.0F)
                    .setDuration(-15)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Duração inválida!", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidMaxLimitAverageRating() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setArtist("Artista")
                    .setName("Nome")
                    .setAverageRating(15.0F)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota média deve estar entre 0 e 10!", e.getMessage());
        }
    }

    @Test
    void shouldThrowsWithInvalidMinLimitAverageRating() {
        try {
            AlbumBuilder albumBuilder = new AlbumBuilder();
            albumBuilder.setDuration(10)
                    .setArtist("Artista")
                    .setName("Nome")
                    .setAverageRating(-15.0F)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nota média deve estar entre 0 e 10!", e.getMessage());
        }
    }
}
