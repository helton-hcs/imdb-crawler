import groovy.json.JsonSlurper
import groovy.transform.Memoized

/**
 * Created by helton on 21/03/2016.
 */
@Singleton
class ImdbService {

    @Memoized
    def getImdbId(String title) {

        //movies mapped wrong - Fix it later :P
        def exceptions = [
                'Sobrenatural': 'tt1591095',
                'A Profecia'  : 'tt0466909'
        ]
        if (exceptions.keySet().contains(title))
            exceptions."$title"
        else {
            def params = [
                    ref_: 'nv_sr_fn',
                    s   : 'all'
            ]
            def baseUrl = 'http://www.imdb.com/find?'
            def pattern = /a href="\/title\/(tt[0-9]{7})\/\?ref_=.*?"/
            def encodedTitle = URLEncoder.encode(title.toString(), "UTF-8")
            params << [q: encodedTitle]
            def qs = params.collect { it }.join('&')
            def url = "$baseUrl$qs"
            def content = url.toURL().text
            def group = content =~ pattern
            group[0][1]
        }
    }

    @Memoized
    def getMovieInfo(String imdbId) {
        def baseUrl = 'http://www.omdbapi.com/?'
        def params = [
                plot: 'short',
                r   : 'json',
                i   : imdbId
        ]
        def qs = params.collect { it }.join('&')
        def url = "$baseUrl$qs"
        def content = url.toURL().text
        new JsonSlurper().parseText(content)
    }

}
