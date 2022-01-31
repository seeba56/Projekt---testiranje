Zadatak - Testiranje Demoblaze stranice

Za rješavanje ovoga projekta odabrao sam testiranje web stranice. Demoblaze stranica služi upravo kao primjer stranice na kojoj možemo provoditi
razne, proizvoljne testove. Link na stranicu je : https://www.demoblaze.com/index.html

Za realizaciju ovog projekta korišteni alat bio je IntelliJ IDEA, a kod je pisan u Java programskom jeziku. 
Unutar repozitorija mogu se pronaci sve datoteke, klase koje su korištene za realizaciju projekta. 
Projekt se sastoji od 5 razlicitih testova, a testovi su sljedeci: 
1. Log in test - test u kojem se provjerava funkcionalnost prijave na stranicu tako što se odabere "log in", unesu se tražene vrijednosti i u konacnici se pritisne gumb za log in. 
2. Sign up test - test koji je slican prvom testu, ali se testira funkcionalnost registriranja na stranicu tako da se unesu tražene vrijednosti, a to su kao i u prvom slucaju, username i password te pritiskom na gumb "Sign up", registracija se obavlja. 
3. Home button press test - najjednostavniji od svih 5 testova. Provjerava se funkcionalnost home gumba pritiskom na isti.
4. Add to cart test - odabirom kategorije laptopi, prikazuju se svi laptopi na stranici nakon cega odabiremo jedan od ponudenih, otvara nam se nova stranica te unutar nje proizvod dodajemo u košaricu prisitkom na gumb "Add to the cart". 
5. Next page and click on item - na dnu stranice odabire se gumb "Next page" nakon cega nam se prikazuju novi uredaji dostupni na stranici te odabiremo proizvoljan uredaj. 

Kako bi se projekt mogao pokrenuti potrebno je klonirati repozitorij te ga pokrenuti uz pomoc IntelliJ IDEA. 
Takoder potrebno je imati instalirane drivere za naš pretraživac. 
Nakon što se projekt otvori, kako bismo proveli sve testove, potrebno je pritisnuti desni klik na datoteku "TestPlan.java" koja se nalazi u src/test/java datoteci te pritisnuti pokreni test. 
Testovi se provode te u konacnici vidimo rezultate, odnosno jesu li testovi prošli ili ne. 