/**
 * Created by helton on 21/03/2016.
 */
def joinedTitles = """\
A Bruxa
A Casa de Cera
A Centopéia Humana
A Centopéia Humana 2
A Centopéia Humana 3
A Chave Mestra
À Espera de um Milagre
A Ilha
A Órfã
A Origem
A Outra História Americana
A Profecia
A Vida É Bela
A Visita
Amnésia
Apocalypse Now
Brilho Eterno de uma Mente Sem Lembranças
Caso 39
Cidade de Deus
Clube da Luta
Deadpool
Ela
Entrevista com Vampiro
Garota Exemplar
Gladiador
Grand Hotel Budapeste
Gravidade
Guerra nas Estrelas
Ilha do Medo
Interestelar
Intocáveis
Looper
Mad Max: Estrada da Fúria
Matrix
Matrix Reloaded
Matrix Revolution
Menina de Ouro
O Amigo Oculto
O Chamado
O Chamado 2
O Grito
O Grito 2
O Grito 3
O Hobbit: A Batalha dos Cinco Exércitos
O Hobbit: A Desolação de Smaug
O Hobbit: Uma Viagem Inesperada
O Império Contra-Ataca
O Nevoeiro
O Pianista
O Poderoso Chefão
O Poderoso Chefão II
O Poderoso Chefão III
O Regresso
O Resgate do Soldado Ryan
O Retorno de Jedi
O Senhor dos Anéis: A Sociedade do Anel
O Senhor dos Anéis: O Retorno do Rei
O Senhor dos Anéis: As Duas Torres
O Silêncio dos Inocentes
Os Infiltrados
Os Outros
Os Tempos Modernos
Perdido em Marte
Predestinado
Primer
Seven
Sniper Americano
Sobrenatural
Star Wars: Episódio I - A Ameaça Fantasma
Star Wars: Episódio II - Ataque dos Clones
Star Wars: Episódio III - A Vingança dos Sith
Star Wars: O Despertar da Força
Um Sonho de Liberdade
Whiplash: Em Busca da Perfeição
Wolf Creek - Viagem ao Inferno
"""

MovieRepository repository = new MovieRepository()
repository.addMovies(joinedTitles.split('\n'))
CsvBuilder.instance.createCsvFile(repository, 'C:\\Users\\Helton\\Desktop\\movies.csv')