/**
 * Created by helton on 21/03/2016.
 */
def joinedTitles = """\
A Bruxa
A Casa de Cera
A Centop�ia Humana
A Centop�ia Humana 2
A Centop�ia Humana 3
A Chave Mestra
� Espera de um Milagre
A Ilha
A �rf�
A Origem
A Outra Hist�ria Americana
A Profecia
A Vida � Bela
A Visita
Amn�sia
Apocalypse Now
Brilho Eterno de uma Mente Sem Lembran�as
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
Intoc�veis
Looper
Mad Max: Estrada da F�ria
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
O Hobbit: A Batalha dos Cinco Ex�rcitos
O Hobbit: A Desola��o de Smaug
O Hobbit: Uma Viagem Inesperada
O Imp�rio Contra-Ataca
O Nevoeiro
O Pianista
O Poderoso Chef�o
O Poderoso Chef�o II
O Poderoso Chef�o III
O Regresso
O Resgate do Soldado Ryan
O Retorno de Jedi
O Senhor dos An�is: A Sociedade do Anel
O Senhor dos An�is: O Retorno do Rei
O Senhor dos An�is: As Duas Torres
O Sil�ncio dos Inocentes
Os Infiltrados
Os Outros
Os Tempos Modernos
Perdido em Marte
Predestinado
Primer
Seven
Sniper Americano
Sobrenatural
Star Wars: Epis�dio I - A Amea�a Fantasma
Star Wars: Epis�dio II - Ataque dos Clones
Star Wars: Epis�dio III - A Vingan�a dos Sith
Star Wars: O Despertar da For�a
Um Sonho de Liberdade
Whiplash: Em Busca da Perfei��o
Wolf Creek - Viagem ao Inferno
"""

MovieRepository repository = new MovieRepository()
repository.addMovies(joinedTitles.split('\n'))
CsvBuilder.instance.createCsvFile(repository, 'C:\\Users\\Helton\\Desktop\\movies.csv')