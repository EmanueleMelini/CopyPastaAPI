package it.emanuelemelini.model

import kotlinx.serialization.Serializable

@Serializable
data class CopyPasta(
    val IDcopy: Int,
    val title: String,
    val body: String,
    val IDgroup: Int,
    val deleted: Boolean
)

val copyPastaStorage = listOf(
    CopyPasta(
        1,
        "Tanga in mezzo alle chiappe",
        "Tanga di qua, tanga di la ma forse è il momento che cominciate a soffermarvi sulla totalità dello spoiler e che lo analizziate \n" +
                "\n" +
                "\"Ti sta scomparendo il tanga, tanga in mezzo alle chiappe\"\n" +
                "\n" +
                "Sfera ci dice che una persona, presumibilmente di fronte a lui, porta un tanga che grazie a delle poderose chiappe sembra sparire \n" +
                "\n" +
                "\"la mia tipa chiama pensa ci siano altre\"\n" +
                "\n" +
                "Attenzione perché non è riferito ad Angelina che purtroppo si vede costretta a chiamare perché pensa che Gionata lo stia tradendo, ma tutti sappiamo che Sfera ama Angelina e che sta per diventare padre quindi una persona responsabile come lui non farebbe mai qualcosa con un'altra ragazza.\n" +
                "\n" +
                "Sfera però in tutto lo spoiler non specifica se sia una donna o un uomo a portare il tanga e sapendo che non tradirebbe Angelina con nessuno perché la ama e stanno per avere un figlio può essere solo una persona a portare quel tanga \n" +
                "\n" +
                "TanoSosa e perché proprio lui? Beh perché lo sanno tutti che in una vera amicizia bisogna essere Homiesessuali questo ci fa capire anche quando uscirà la canzone e sarà a Giungo durante il Pride Month \n" +
                "\n" +
                "Buona Giornata",
        1,
        false
    ),
    CopyPasta(
        2,
        "OSU",
        "Osu gaming",
        1,
        false
    ),
    CopyPasta(
        3,
        "Donne Divertenti",
        "ɴᴏᴡ ᴘʟᴀʏɪɴɢ: Women Aren't Funny (Feat: Back To The Kitchen) ───────────⚪────── ◄◄⠀▐▐ ⠀►► 5:12/ 7:\uD835\uDFFB\uD835\uDFFC ───○ \uD83D\uDD0A⠀ ᴴᴰ ⚙️",
        1,
        false
    ),
    CopyPasta(
        4,
        "Marracash pokemon",
        "All'inizio pensavo fosse un gioco per pischelli, invece è molto più profondo e strategico di quello che uno può pensare. (siiI!) e alla fine ti tira dentro... una cifra. adesso puoi anche fare combattere i pokemon 3 contro 3 o addirittura a rotazione e la cosa aggiunge un sacco di strategia al gioco e devo dire che non è per niente semplice. sto cercando di catturare il leggendario Reshiram, che è il boss della versione nera, ma mi sa che devo giocare ancora un bel po'.",
        1,
        false
    ),
    CopyPasta(
        5,
        "Rap",
        "Il rap\n" +
                "La rappata\n" +
                "La rappanza\n" +
                "La rappazione\n" +
                "Il rappaggio\n" +
                "Il ritmo e poesia\n" +
                "L'ippoppazione\n" +
                "Il tru ippop\n" +
                "L'ippoppete\n" +
                "La doppia h\n" +
                "Le quattro discipline\n" +
                "L'azione del rappare\n" +
                "Il quattro quarto\n" +
                "Il rappismo\n" +
                "Il rappando\n" +
                "La rimazione che spacca\n" +
                "L'azione dello scorrere sulla strumentale\n" +
                "L'azione del RAPPAMENTO\n" +
                "LA RAPPAGGIA\n" +
                "IL MOMENTO RAPPER\n" +
                "IL MOMENTO FREESTYLE\n" +
                "IL MOMENTO B-BWOI\n" +
                "IL MOMENTO FASTCUT\n" +
                "IL MOMENTO PURISTA\n" +
                "IL MOMENTO MASSICCI\n" +
                "IL MOMENTO YO\uD83E\uDD18\n" +
                "IL MOMENTO RAPPING\n" +
                "IL MOMENTO DELLE CORNA\n" +
                "IL MOMENTO DELLE JAM CON 30 PERSONE\n" +
                "IL MOMENTO BOOM BAP\n" +
                "IL MOMENTO INCASTRO\n" +
                "IL MOMENTO DEL F L O W\n" +
                "IL MOMENTO DEL B E A T\n" +
                "IL MOMENTO DELLE BARRE\n" +
                "IL MOMENTO QUARTINA\n" +
                "IL MOMENTO DISCLAIMER\uD83D\uDE0E\n" +
                "IL MOMENTO REALNESS\n" +
                "IL MOMENTO LILWAYNEDIPSETGUNITMOBBDEEPCOKEBOYS E SIMILI\n" +
                "IL MOMENTO 17\n" +
                "IL MOMENTO CONTENUTO\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\uD83E\uDD2F\n" +
                "IL MOMENTO PAZZO SCORRETTO\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\uD83E\uDD2A\n" +
                "IL MOMENTO GANG SIGN\n" +
                "IL MOMENTO INCASTRO\n" +
                "IL MOMENTO EXTRABEAT\n" +
                "IL MOMENTO PUNCHLINE⚠️\n" +
                "IL MOMENTO METAFORA\n" +
                "IL MOMENTO FIGURA RETORICA\n" +
                "IL MOMENTO STORYTELLING\n" +
                "IL MOMENTO CONSCIOUS\n" +
                "IL MOMENTO UNDERGROUND\n" +
                "IL MOMENTO 2PAC\n" +
                "IL MOMENTO VERO RAP\n" +
                "\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\uD83E\uDD18\n" +
                "\n" +
                "\n" +
                "La trap,la casa abbandonata localizzata ad Atlanta,la trappola,la rete,il ginepraio",
        1,
        false,
    ),
    CopyPasta(
        6,
        "Classico",
        "Ha delle poppe giganti. Intendo davvero delle imponenti tettone. Un vero set di mammellone. Possiede delle tettolone. Imponenti mega tettonone. Un gran bel paio di super mammelosenoni gigantesche super mega extra tettone. Mastodontiche ipergigasupermecro extra poppellone. Ouooouao. Quelle sono davvero un paio di grosse super tettone da mami. Cioè davvero senoni da furgone del latte; macchine del latte così imponenti da causare seri problemi alla schiena. Una coppia di gargantuesche colossali titaniche mastodontiche mongolfiere sessuali, sto parlando di bocciosissime bocciose tettose zinne, vaste titaniche astronomiche divine mostruose elefantine angurie mammarie da milkshake podinose tettose lattiere.",
        1,
        false
    ),
    CopyPasta(
        7,
        "Morto dal ridere",
        "Sto letteralmente lacrimando dal ridere. Le lacrime stanno scorrendo sul mio volto, facendomi diventare la faccia, i vestiti e i piedi fradici. C'è anche tanto rumore. Non avevo idea che potessi fare cosi tanto rumore piangendo. Letteralmente non posso. Non sono letteralmente in grado. Tutte queste lacrime provengono da me stesso che sto letteralmente piangendo e non riesco a inalare dalla bocca, di conseguenza sto per annegare. Sto letteralmente morendo. Sono letteralmente sul baratro della morte. Tutto ciò è da pazzi. Non mi sono mai sentito cosi prima d'ora. Non sto solamente piangendo; non sto solamente morendo- Sto letteralmente piangendo, e sto letteralmente morendo. Sangue, Vedo sangue, il sangue sta sgorgando fuori dai miei stessi occhi, Vedo letteralmente sangue. Sto ridendo cosi forte in questo momento. Non posso letteralmente smettere di ridere- è folle. Ti prego salvami, O Signore. Ti prego salvami da questa pazzia. Sto letteralmente agonizzando verso la morte da 45 minuti ora. Non c'è fine a tutto questo? Voglio solo riunirmi al Creatore. Voglio solo vedere la luce e desidero solo vedere l'oscurità, allo stesso tempo. Salvami, Cristo, in quanto sto letteralmente morendo in questo momento.",
        1,
        false
    ),
    CopyPasta(
        8,
        "Twitch Machete Mixtape",
        "Ma ve lo immaginate un album stile Cantera Machete ma con, al posto di emergenti, solo youtuber/streamer di Twitch? Ma che bomba sarebbe?\uD83D\uDCA3\n" +
                "Lo vedo già: da una parte producer come Tha Supreme, il Chakrone, Hell Raton e poi sulla base a rappare un po' come si deve Blur, il Kappa Freneh, Panetti, Homy, Il Masseo, Paul Cannon in freestyle madò e magari con qualche feat di spessore come Nitro molto vicino agli ambienti di Twitch.\n" +
                "Che ne pensate?\n" +
                "edit: mi è stato fatto notare che ho scordato di citare Zano, forse lo davo proprio per scontato \uD83D\uDD8C",
        1,
        false
    ),
    CopyPasta(
        9,
        "Thasup x Zano",
        "Siete in hype per  Zano x tha Supreme? Io personalmente si. Nonostante Zano sia uno youtuber/streamer ha una buona penna, le rime ci sono e la fotta pure. Molto di più di qualche pseudo rapper in classifica. Poi siccome è il suo idolo si impegnerà anche di più. Immaginate l'entrata ignorante di Zano, seguito dal ritornello di thasup e poi boom, magari arriva pure Blur. E si gode!  \uD83D\uDE08\uD83D\uDE07",
        1,
        false
    ),
    CopyPasta(
        10,
        "Lo scopo",
        "Sì, esatto. Io scopo. Io trombo. Io fotto. Io fornico. Io infilo. Io sborro. Io stantuffo. Io chiavo. Io faccio il sesso. L'accoppiamento, per l'appunto. Metto in atto l'amplesso. L'amore carnale. L'eros senza Ramazzotti. Lo scopaggio. L'Infila-e-sfila. Il su-e-giù. Anche di lato. Anche sul divano. Anche sulle ceneri dei miei avi trapassati.\n" +
                "La riproduzione sessuata. La fecondazione non assistita. L'unione dei gameti per formare lo zigote. La sborratio cum laude. L'unione eterosessuale\n" +
                "Il carotaggio. L'eiaculazione di fluidi. Chiodo schiaccia chiodo. La fertilizzazione. Il salto della quaglia, senza salto. Le api ed i fiori. Io sono l'ape, lei il fiore. Io il chiodo, lei il buco. Io la matita lei il portacolori. Io il wrüstel, lei il panino. Io il pipettatore lei la provetta. Il contagocce ed il flaconcino. La banana ed il pompelmo. Io la chiave, lei la serratura. O se vogliamo io sono Sora con il Keyblade. Ed ho per l'appunto appena chiuso il Kingdom Hearts. È un'allusione al fatto che ho scopato.\n" +
                "Lo starnuto penale. L'innaffiatura copiosa. La pioggia spermatica. Lo spargimento di fluidi corporei non fecali né urinali né sanguigni né salivari. La fertilizzazione del campo dei miracoli. Il gen\uD83C\uDD7E️cidi\uD83C\uDD7E️ di pulcinella.",
        1,
        false
    ),
    CopyPasta(
        11,
        "Catcalling",
        "Se un individuo, \n" +
                "Nel momento in cui stai passeggiando, \n" +
                "Si approccia a te con fare maleducato\n" +
                "Comprendo ed empatizzo con te\n" +
                "Oppure se si rivolge a te con parole scurrili..\n" +
                "Ma, nel momento in cui un individuo è fermo..\n" +
                "Non conoscevo dell'esistenza del manuale del rimorchio..\n" +
                "Se un individuo, giunge nella tua stessa direzione, e ammira due arti inferiori di bella apparenza..\n" +
                "Ricordo quando ero un fanciullo, che usavo dire:\"Ciao, bella fanciulla!\". Ti ho rivolto un complimento, non mi sembra di averti rivolto una parola scurrile nei tuoi confronti e averti paragonata a una donna di pochi costumi..\n" +
                "Faccio difficoltà a comprendere la gente..\n" +
                "\"Chiamare un micio\" è oggi associato a due fischi.\n" +
                "Nella società moderna, due fischi significano \"Chiamare un micio\". \n" +
                "Sono preoccupato, di come andremo a finire..\n" +
                "Lo ribadisco perché preferirei evitare equivoci..\n" +
                "Se un individuo si rivolge a te in maniera volgare e usa il tatto come modalità di approccio, sono d’accordo con te, è inopportuno.\n" +
                "Ma nell’eventualità di un individuo che ti fischia gentilmente recitando la frase \"Ciao, graziosa fanciulla\", la risposta più corretta da parte tua sarebbe un ringraziamento. \n" +
                "\n" +
                "Firmato \n" +
                "Egregio Signor Damiano IV Faina di Savoia",
        1,
        false
    ),
    CopyPasta(
        12,
        "Cosplay di Kratos",
        "Mi ero ripromesso di non farlo ma per la prima volta in vita mia (si fa per dire, in 7 anni di Cosplay) devo fare polemica sul risultato della gara cosplay di Torino. Lo faccio pubblicamente sul mio profilo perché non saprei nemmeno in quale gruppo o pagina andarlo a scrivere e perché non mi nascondo dietro ad un dito. Quindi se qualcuno dell'organizzazione della fiera di Torino o della giuria vuole rispondermi lo faccia pure qui! \n" +
                "\n" +
                "Inizio premettendo che si, rosico, e pure un casino! Così lo dico subito io e non v'è ne uscite con cavolate del genere! E sapete perché rosico e mi rode il culo? Mi rode il culo perché per arrivare in fiera a Torino da Roma ho fatto tipo 13 ore di viaggio in 3 giorni, ho speso soldi e perso due giorni di lavoro, ed io lavoro ad ore. Non ho ferie, ne malattie! Rosico perché sono stato sicuramente penalizzato per essere stato così sfigato che mi si è rotta l'ascia durante l'esibizione sul palco! Rosico perché dietro la realizzazione del personaggio C'era intanto il lavoro di un'altra persona che meritava di essere valorizzato! E soprattutto c'era un significato più profondo, mio! Ed era importante. Poi vedermi sfuggire ben tre premi dei quali uno dato a doppio che poteva soddisfare più amici! Ed altri due VERAMENTE ASSEGNATI IN MANIERA RIDICOLA! Tra il makeup e la somiglianza fisica non mi esprimo nemmeno perché mi incazzo come una bestia! Erano merda in confronto a me! Cioè, MA MI AVETE VISTO!!???? LA VEDETE STA CAZZO DI FOTO? TROVATEMI UN DIFETTO! UNO!!!!!!!!!!!! Ed aggiungo che una \"famosa\" cosplayer italiana durante la mia esibizione non mi ha degnato di uno sguardo, quindi molto probabilmente non mi ha nemmeno visto, visto che era molto impegnata col suo telefono! Ero uno dei cosplayer migliori della fiera e nonostante la sfiga, la penalizzazione e tutto, meritavo di essere premiato! IO SONO UNO DI QUEI COSPLAYER CHE DOVREBBERO ESSERE INVITATI COME OSPITI PER QUANTO CAZZO SONO EPICI I LAVORI CHE REALIZZO OGNI VOLTA, CHE MI COSTANO TEMPO E SOLDI! Adesso capisco perché molta gente è stanca di andare in fiera! A parte gli amici, non vi è motivo, allora ditemi perché dovrei tornare!? Tanto la mia passione la posso esercitare anche a casa mia! Lo ripeto si, ROSICO COME UN BASTARDO! COME LA MERDA PROPRIO STAVOLTA! Perché anche se come tutto, tutto questo non conta nulla, per me era davvero importante....",
        1,
        false
    ),
    CopyPasta(
        13,
        "Scettici del sesso",
        "Sto notando ovviamente degli scettici che commentano com'è normale che sia, allora mi chiarisco: ho avuto 11 anni di relazioni stabili e ho fatto sesso quasi ogni giorno per ALMENO 3 ore al giorno. Mettendo caso che io abbia fatto sesso per 3 ore al giorno per 5 volte la settimana per 11 anni... 3x5=15x4(settimane)=60x12(mesi)=720x11(anni)=7920 ore.\n" +
                "Togliendo il fatto che 3 ore sono il MINIMO, e sono arrivato anche a 9 ore filate, cercate di rispondere senza stare a sindacare, grazie, lo so io cosa ho fatto nella mia vita. Certamente non siete i primi né gli ultimi a mettere in dubbio tutto ciò ma le mie ex mi hanno bloccato e non stanno su Sondaggioland, quindi non mi frega niente se mi credete o meno, ci sono abituato.",
        1,
        false
    ),
    CopyPasta(
        14,
        "Culo Serena",
        "sai che nell’ultima metà dell’800 i gentiluomini europei scoprirono la cocaina? E per assumerla erano soliti porzionare la dose in una depressione presente prossimalmente alla base del pollice. La suddetta depressione, formata dal rilievo di tre tendini dei muscoli dell’avambraccio, viene infatti chiamata tabacchiera anatomica. \n" +
                "Ad ogni modo, perdonami, sto straparlando come spesso faccio. \n" +
                "Volevo in realtà chiederti: ma non è che posso acchittarmi due raglie su quel gargantuesco e bellissimo culo che hai?",
        1,
        false
    )
)