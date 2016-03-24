import groovy.transform.Canonical

/**
 * Created by helton on 21/03/2016.
 */
@Canonical
class Movie {
    String titlePortuguese

    String getImdbId() {
        ImdbService.instance.getImdbId(titlePortuguese)
    }

    def getTitle() {
        ImdbService.instance.getMovieInfo(imdbId).Title
    }

    def getPlot() {
        ImdbService.instance.getMovieInfo(imdbId).Plot
    }

    def getYear() {
        ImdbService.instance.getMovieInfo(imdbId).Year
    }

    def getGenre() {
        ImdbService.instance.getMovieInfo(imdbId).Genre.split(', ')
    }

    def getImdbRating() {
        ImdbService.instance.getMovieInfo(imdbId).imdbRating
    }

    def getActors() {
        ImdbService.instance.getMovieInfo(imdbId).Actors.split(', ')
    }

    def getImageLink() {
        ImdbService.instance.getMovieInfo(imdbId).Poster
    }

    def getImdbLink() {
        "http://www.imdb.com/title/$imdbId"
    }

    String toString() {
        "{$titlePortuguese, $imdbId, $title, $year, $genre, $imdbRating, '$plot'}"
    }

}
