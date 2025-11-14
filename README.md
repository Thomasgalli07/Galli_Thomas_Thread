#PRODUZIONE DELLE PIASTRELLE
**repository** Galli_Thomas_Thread

##DESCRIZIONE DEL PROGETTO
il programma che ho svolto simula un processo della produzione delle piastrelle in due fasi:
-preparazione dell'impasto 
-cottura dell'impasto

ognuna di queste fasi è gestita da Thread dedicato a esse,inoltre il programma utilizza:
-Thread.sleep():per simulare i tempi della lavorazione
-join(): per consentire al processoprincipale di attendere la fine del Thread

##FUNZIONAMENTO DEI THREAD
il primo Thread PreparazioneImpasto simula:
-i materiali che si mischiano tra di loro
-preparazione dell'impasto
-formatura della piastrella

il secondo Thread CotturaImpasto simula:
-accensione del fuoco per la cottura
-inizio della cottura dell'impasto
-cottura completata
anche questo Thread usa sleep per simulare il tempo necessario a fare delle azioni

successivamente si andrà a creare l'UML per spiegare il collegamento che ha la classe madre con le classi figlie 


