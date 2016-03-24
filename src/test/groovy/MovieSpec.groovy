import spock.lang.Specification
import spock.lang.Unroll;

/**
 * Created by helton on 21/03/2016.
 */

@Unroll
class MovieSpec extends Specification {

    def "retrieve imdbId of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).imdbId == imdbId

        where:
        titlePortuguese  || imdbId
        'A Casa de Cera' || 'tt0397065'
        'A Origem'       || 'tt1375666'
    }

    def "retrieve title of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).title == titleEnglish

        where:
        titlePortuguese  || titleEnglish
        'A Chave Mestra' || 'The Skeleton Key'
        'A Ilha'         || 'The Island'
    }

    def "retrieve plot of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).plot == plot

        where:
        titlePortuguese              || plot
        'A Bruxa'                    || 'A family in 1630s New England is torn apart by the forces of witchcraft, black magic and possession.'
        'A Outra Historia Americana' || 'A former neo-nazi skinhead tries to prevent his younger brother from going down the same wrong path that he did.'
    }

    def "retrieve year of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).year == year

        where:
        titlePortuguese || year
        'A Visita'      || '2015'
        'Amnesia'       || '2000'
    }

    def "retrieve genre of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).genre == genre

        where:
        titlePortuguese  || genre
        'Apocalypse Now' || ['Drama', 'War']
        'Cidade de Deus' || ['Crime', 'Drama']
    }

    def "retrieve actors of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).actors == actors

        where:
        titlePortuguese  || actors
        'Clube da Luta'  || ['Edward Norton', 'Brad Pitt', 'Helena Bonham Carter', 'Meat Loaf']
        'Deadpool'       || ['Ryan Reynolds', 'Karan Soni', 'Ed Skrein', 'Michael Benyaer']
    }

    def "retrieve imageLink of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).imageLink == imageLink

        where:
        titlePortuguese          || imageLink
        'Ela'                    || 'http://ia.media-imdb.com/images/M/MV5BMjA1Nzk0OTM2OF5BMl5BanBnXkFtZTgwNjU2NjEwMDE@._V1_SX300.jpg'
        'Entrevista com Vampiro' || 'http://ia.media-imdb.com/images/M/MV5BMTIzMTIxOTg1NV5BMl5BanBnXkFtZTcwOTM0OTcxMQ@@._V1_SX300.jpg'
    }

    def "retrieve imdbLink of the movie '#titlePortuguese' correctly"() {
        expect:
        new Movie(titlePortuguese: titlePortuguese).imdbLink == imdbLink

        where:
        titlePortuguese  || imdbLink
        'A Casa de Cera' || 'http://www.imdb.com/title/tt0397065'
        'A Origem'       || 'http://www.imdb.com/title/tt1375666'
    }

}
