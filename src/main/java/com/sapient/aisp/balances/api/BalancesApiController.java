package com.sapient.aisp.balances.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

@Controller
@RequestMapping("${openapi.ob-aisp-balances-autogen-api.base-path:/open-banking/v3.1/aisp}")
public class BalancesApiController implements BalancesApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BalancesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
