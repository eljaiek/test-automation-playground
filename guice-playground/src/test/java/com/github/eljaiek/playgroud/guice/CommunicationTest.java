package com.github.eljaiek.playgroud.guice;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import javax.inject.Inject;

@GovernatorTest(modules = CommModule.class)
public class CommunicationTest {

    @Inject
    private Communication comms;

    @Test
    public void testSendMessage() {
        Assertions.assertThat(comms.sendMessage("Hello World!")).isTrue();
    }
}