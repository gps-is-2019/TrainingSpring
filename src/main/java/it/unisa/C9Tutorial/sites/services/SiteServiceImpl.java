package it.unisa.C9Tutorial.sites.services;

import it.unisa.C9Tutorial.sites.dao.SiteDao;
import it.unisa.C9Tutorial.sites.domain.Site;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SiteServiceImpl implements SiteService {

    private final SiteDao siteDao;

    @Override
    public List<Site> findAllSites() {
        List<Site> result = new LinkedList<>();
        siteDao.findAll().forEach(result::add);
        return result;
    }

    @Override
    public Site createSite(Site site) {
        return siteDao.save(site);
    }

    @Override
    public Optional<Site> getSiteDetail(Long siteId) {
        return siteDao.findById(siteId);
    }
}
