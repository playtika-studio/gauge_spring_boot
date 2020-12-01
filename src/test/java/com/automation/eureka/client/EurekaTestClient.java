package com.automation.eureka.client;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import com.thoughtworks.gauge.Step;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
public class EurekaTestClient {

    public final EurekaClient eurekaClient;

    @Step("Get server instances for <serverName>")
    public void getListOfServer(String serverName) {
        Applications applications = eurekaClient.getApplications();
        List<InstanceInfo> instances = applications.getRegisteredApplications(serverName).getInstances();
        for (InstanceInfo instance : instances) {
            log.info("List of servers for " + serverName + " are " + instance.getId());
        }
    }

    @Step("Verify that <serverName> status is <runningStatus>")
    public void getApplicationStatus(String serverName, String runningStatus) {
        Applications applications = eurekaClient.getApplications();
        List<InstanceInfo> instances = applications.getRegisteredApplications(serverName).getInstances();
        for (InstanceInfo instance : instances) {
            log.info("Instance status is " + instance.getStatus().toString());
            Assertions.assertThat(instance.getStatus().toString()).isEqualTo(runningStatus);
        }
    }
}
