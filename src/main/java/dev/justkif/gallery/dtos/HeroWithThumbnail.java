package dev.justkif.gallery.dtos;

public record HeroWithThumbnail(

    String name,

    String thumbnail_link

) {

    public static HeroWithThumbnail createOne(String name, String thumbnail_link) {
        return new HeroWithThumbnail(
            name,
            thumbnail_link
        );
    }

}
