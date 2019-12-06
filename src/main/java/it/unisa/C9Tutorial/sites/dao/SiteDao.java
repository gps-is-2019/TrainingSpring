package it.unisa.C9Tutorial.sites.dao;

import it.unisa.C9Tutorial.sites.domain.Site;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SiteDao extends CrudRepository<Site,Long> {

    List<Site> findAllByType(String type);


}
