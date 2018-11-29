package io.oasp.gastronomy.restaurant.suppliermanagement.service.impl.rest;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import io.oasp.gastronomy.restaurant.general.common.base.AbstractRestServiceTest;
import io.oasp.gastronomy.restaurant.salesmanagement.service.impl.rest.SalesmanagementRestTestConfig;
import io.oasp.gastronomy.restaurant.suppliermanagement.logic.api.to.SupplierEto;
import io.oasp.gastronomy.restaurant.suppliermanagement.service.api.rest.SuppliermanagementRestService;
import io.oasp.module.service.common.api.client.ServiceClientFactory;

/**
 * @author PIBANAS
 *
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { SalesmanagementRestTestConfig.class })
@TestPropertySource(properties = { "flyway.locations=filesystem:src/test/resources/db/tablemanagement",
"service.client.app.restaurant.user.login=manager" })
public class SuppliermanagementRestServiceTest extends AbstractRestServiceTest {

  private SuppliermanagementRestService service;

  @Inject
  private ServiceClientFactory serviceClientFactory;

  @Override
  public void doSetUp() {

    super.doSetUp();
    getDbTestHelper().resetDatabase();
    this.service = this.serviceClientFactory.create(SuppliermanagementRestService.class);
  }

  /**
   * Provides clean up after tests.
   */
  @Override
  public void doTearDown() {

    this.service = null;
    super.doTearDown();
  }

  @Test
  public void testFindSuplier() {

    // given
    long id = 3;
    // when
    SupplierEto supplier = this.service.getSupplier(id);
    // then
    assertThat(supplier).isNotNull();
    assertThat(supplier.getName()).isEqualTo("Albafrost");

  }
}
