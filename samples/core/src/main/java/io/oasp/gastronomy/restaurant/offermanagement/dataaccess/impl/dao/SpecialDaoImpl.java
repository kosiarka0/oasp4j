package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.impl.dao;

import java.util.Collection;

import javax.inject.Named;

import io.oasp.gastronomy.restaurant.general.dataaccess.base.dao.ApplicationMasterDataDaoImpl;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao.SpecialDao;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;

/**
 * @author PIBANAS
 *
 */
@Named
public class SpecialDaoImpl extends ApplicationMasterDataDaoImpl<SpecialEntity> implements SpecialDao {

  /**
   * The constructor.
   */
  public SpecialDaoImpl() {

  }

  @Override
  public Collection<SpecialEntity> findBySearchCriteria(SpecialSearchCriteriaTo criteria) {

    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected Class<SpecialEntity> getEntityClass() {

    return SpecialEntity.class;
  }

}
