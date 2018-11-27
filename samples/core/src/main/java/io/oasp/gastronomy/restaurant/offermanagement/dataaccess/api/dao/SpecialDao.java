package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import java.util.Collection;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author PIBANAS
 *
 */
public interface SpecialDao extends ApplicationRevisionedDao<SpecialEntity>, MasterDataDao<SpecialEntity> {

  /**
   * @param criteria
   * @return all active specials for given criteria
   */
  Collection<SpecialEntity> findBySearchCriteria(SpecialSearchCriteriaTo criteria);

}
