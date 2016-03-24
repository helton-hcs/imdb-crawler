import groovy.transform.Canonical

/**
 * Created by helton on 21/03/2016.
 */

@Canonical
class MovieRepository {
    List<Movie> movies = new ArrayList<>()

    def addMovies(String[] titles) {
        movies.addAll(titles.collect { new Movie(titlePortuguese: it) })
    }

    def findByActor(String actor) {
        movies.findAll { it.actors.contains(actor) }
    }

}
