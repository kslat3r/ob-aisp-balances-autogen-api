package com.sapient.aisp.balances.api;

import com.sapient.aisp.balances.model.OBErrorResponse1;
import com.sapient.aisp.balances.model.OBReadBalance1;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-29T16:58:28.625+01:00[Europe/London]")
@Controller
public class BalancesApiController implements BalancesApi {

    private static final Logger log = LoggerFactory.getLogger(BalancesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BalancesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<OBReadBalance1> getBalances(@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true) @RequestHeader(value="x-fapi-financial-id", required=true) String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true) @RequestHeader(value="Authorization", required=true) String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC" ) @RequestHeader(value="x-fapi-customer-last-logged-time", required=false) String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "Indicates the user-agent that the PSU is using." ) @RequestHeader(value="x-customer-user-agent", required=false) String xCustomerUserAgent) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<OBReadBalance1>(objectMapper.readValue("{
  "Meta" : {
    "LastAvailableDateTime" : "2000-01-23T04:56:07.000+00:00",
    "FirstAvailableDateTime" : "2000-01-23T04:56:07.000+00:00",
    "TotalPages" : 0
  },
  "Links" : {
    "Last" : "http://example.com/aeiou",
    "Prev" : "http://example.com/aeiou",
    "Next" : "http://example.com/aeiou",
    "Self" : "http://example.com/aeiou",
    "First" : "http://example.com/aeiou"
  },
  "Data" : {
    "Balance" : [ {
      "Type" : "ClosingAvailable",
      "AccountId" : "AccountId",
      "CreditLine" : [ {
        "Type" : "Available",
        "Included" : true,
        "Amount" : {
          "Amount" : "Amount",
          "Currency" : "Currency"
        }
      }, {
        "Type" : "Available",
        "Included" : true,
        "Amount" : {
          "Amount" : "Amount",
          "Currency" : "Currency"
        }
      } ],
      "Amount" : {
        "Amount" : "Amount",
        "Currency" : "Currency"
      },
      "CreditDebitIndicator" : "Credit",
      "DateTime" : "2000-01-23T04:56:07.000+00:00"
    }, {
      "Type" : "ClosingAvailable",
      "AccountId" : "AccountId",
      "CreditLine" : [ {
        "Type" : "Available",
        "Included" : true,
        "Amount" : {
          "Amount" : "Amount",
          "Currency" : "Currency"
        }
      }, {
        "Type" : "Available",
        "Included" : true,
        "Amount" : {
          "Amount" : "Amount",
          "Currency" : "Currency"
        }
      } ],
      "Amount" : {
        "Amount" : "Amount",
        "Currency" : "Currency"
      },
      "CreditDebitIndicator" : "Credit",
      "DateTime" : "2000-01-23T04:56:07.000+00:00"
    } ]
  }
}", OBReadBalance1.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<OBReadBalance1>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<OBReadBalance1>(HttpStatus.NOT_IMPLEMENTED);
    }

}
