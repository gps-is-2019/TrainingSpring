# TrainingSpring
In questa repository è contenuta la parte iniziale del codice scritto durante la sessione di Training del 4 Dicembre 2019.
Attualmente il progetto realizza una piccola applicazione web scritta con Spring, che gestisce siti UNESCO.
Nello specifico, l'app contiene:
- Due Entity: Site e Responsible;
- Una DAO: SiteDao;
- Un Service (Interfaccia e Implementazione): SiteService;
- Un Controller: SiteController
- Due Pagine Web: site-list.html e site-detail.html

L'esercizio prevede la creazione di Entity, delle Dao per accedere ai dati persistenti, un service che contenga la logica di business e un controller per servire le pagine web che fanno da view.

N.B. Le pagine web sono renderizzate tramite *Thymeleaf* e sfruttano il framework SemanticUI, incluso come dipendenza tramite webjar.
