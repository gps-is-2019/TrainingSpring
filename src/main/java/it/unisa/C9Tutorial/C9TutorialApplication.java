package it.unisa.C9Tutorial;

import it.unisa.C9Tutorial.sites.dao.SiteDao;
import it.unisa.C9Tutorial.sites.domain.Responsible;
import it.unisa.C9Tutorial.sites.domain.Site;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class C9TutorialApplication {

    private static final Logger log = LoggerFactory.getLogger(C9TutorialApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(C9TutorialApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(SiteDao siteDao){
	    return args -> {
            log.info("Creating some sites");
            log.info("----------");

            Site siteWithResposible = new Site("Costiera Amalfitana", LocalDate.ofYearDay(1997, 1), Site.TYPE_CULTURAL, "Campania");
            Responsible responsible = new Responsible("Giovanni","Magi");
            siteWithResposible.addResponsible(responsible);

            siteDao.save(siteWithResposible);
            siteDao.save(new Site("Isole Eolie",LocalDate.ofYearDay(2000,1),Site.TYPE_NATURAL,"Sicilia"));
            siteDao.save(new Site("Ville e Giardini Medicei",LocalDate.ofYearDay(2013,1),Site.TYPE_MIXED,"Toscana"));

            log.info("Reading all sites of type {}",Site.TYPE_NATURAL);

            siteDao.findAllByType(Site.TYPE_NATURAL).forEach(site -> {
                log.info("{}",site);
            });

            log.info("----------");
        };
    }

}
