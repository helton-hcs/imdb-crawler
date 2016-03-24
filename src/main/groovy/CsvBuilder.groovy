/**
 * Created by helton on 21/03/2016.
 */

@Singleton
class CsvBuilder {

    void createCsvFile(MovieRepository repository, String fileName) {
        new FileOutputStream(fileName).withWriter('UTF-8') { writer ->
            //header
            def csv = ['Imagem', 'T�tulo (Portugu�s)', 'IMDB', 'T�tulo (Ingl�s)', 'Ano', 'G�nero', 'Atores', 'Resumo', 'Link IMDB']
            writer << csv.join('|') + "\n"
            //body
            repository.movies.each { movie ->
                csv = [
                        "=IMAGE(\"${movie.imageLink}\")",
                        movie.titlePortuguese,
                        movie.imdbRating,
                        movie.title,
                        movie.year,
                        movie.genre.join(', '),
                        movie.actors.join(', '),
                        movie.plot,
                        movie.imdbLink
                ]
                def csvRow = csv.join('|') + "\n"
                println csvRow
                writer.write csvRow
            }
        }
    }

}
