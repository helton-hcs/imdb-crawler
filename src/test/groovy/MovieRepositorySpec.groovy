import spock.lang.Specification

/**
 * Created by helton on 21/03/2016.
 */
class MovieRepositorySpec extends Specification {
    def repository = new MovieRepository()

    def "can find all movies by actor"() {
        when:
        repository.addMovies(
                """\
O Hobbit: A Batalha dos Cinco Exercitos
O Hobbit: A Desolacao de Smaug
O Hobbit: Uma Viagem Inesperada
""".trim().split("\n"))

        then:
        repository.findByActor('Martin Freeman').size() == 3
    }

}
