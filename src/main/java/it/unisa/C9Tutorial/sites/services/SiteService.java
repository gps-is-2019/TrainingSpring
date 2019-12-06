package it.unisa.C9Tutorial.sites.services;

import it.unisa.C9Tutorial.sites.domain.Site;

import java.util.List;
import java.util.Optional;

public interface SiteService {

    List<Site> findAllSites();

    Site createSite(Site site);

    Optional<Site> getSiteDetail(Long siteId);

}
