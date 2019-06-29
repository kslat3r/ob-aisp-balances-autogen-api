package com.sapient.aisp.balances.api;

import com.sapient.aisp.balances.model.OBErrorResponse1;
import com.sapient.aisp.balances.model.OBReadBalance1;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BalancesApiControllerIntegrationTest {

    @Autowired
    private BalancesApi api;

    @Test
    public void getBalancesTest() throws Exception {
        String xFapiFinancialId = "xFapiFinancialId_example";
        String authorization = "authorization_example";
        String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example";
        String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example";
        String xFapiInteractionId = "xFapiInteractionId_example";
        String xCustomerUserAgent = "xCustomerUserAgent_example";
        ResponseEntity<OBReadBalance1> responseEntity = api.getBalances(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
