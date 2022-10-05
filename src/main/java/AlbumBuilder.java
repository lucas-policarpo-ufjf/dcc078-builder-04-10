import java.util.Date;

public class AlbumBuilder {

    private Album album;

    public AlbumBuilder(){
        this.album = new Album();
    }

    public Album build(){
        if(album.getDuration() <= 0){
            throw new IllegalArgumentException("Duração inválida!");
        }
        if(album.getName() == null){
            throw new IllegalArgumentException("Nome inválido!");
        }
        if(album.getArtist() == null){
            throw new IllegalArgumentException("Artista inválido!");
        }
        if(album.getAverageRating() < 0 || album.getAverageRating() > 10){
            throw new IllegalArgumentException("Nota média deve estar entre 0 e 10!");
        }

        return album;
    }

    public AlbumBuilder setName(String name) {
        this.album.setName(name);
        return this;
    }

    public AlbumBuilder setDescription(String description) {
        this.album.setDescription(description);
        return this;
    }

    public AlbumBuilder setReleaseDate(String releaseDate) {
        this.album.setReleaseDate(releaseDate);
        return this;
    }

    public AlbumBuilder setDuration(Integer duration) {
        this.album.setDuration(duration);
        return this;
    }

    public AlbumBuilder setArtist(String artist) {
        this.album.setArtist(artist);
        return this;
    }

    public AlbumBuilder setGenre(String genre) {
        this.album.setGenre(genre);
        return this;
    }

    public AlbumBuilder setDistributedBy(String distributedBy) {
        this.album.setDistributedBy(distributedBy);
        return this;
    }

    public AlbumBuilder setProducedBy(String producedBy) {
        this.album.setProducedBy(producedBy);
        return this;
    }


    public AlbumBuilder setAverageRating(Float averageRating) {
        this.album.setAverageRating(averageRating);
        return this;
    }
}
