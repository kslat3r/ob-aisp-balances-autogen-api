#!/bin/sh

openapi-generator generate \
    -g spring \
    -i swagger.yml \
    --api-package com.sapient.aisp.balances.api \
    --artifact-id aisp-balances-service \
    --artifact-version 0.0.1-SNAPSHOT \
    --group-id com.sapient.aisp \
    --model-package com.sapient.aisp.balances.model \
    --additional-properties sortParamsByRequiredFlag=true,prependFormOrBodyParameters=true,hideGenerationTimestamp=true,java8=true,title=ob-aisp-balances-autogen-api,async=trueuseBeanValidation=true,performBeanValidation=true \
    -o .