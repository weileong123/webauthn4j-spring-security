package net.sharplab.springframework.security.webauthn.authenticator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebAuthnAuthenticatorTest {

    @Test
    public void equals_hashCode_test() {
        WebAuthnAuthenticator instanceA = new WebAuthnAuthenticator("authenticator", null, null, 0);
        WebAuthnAuthenticator instanceB = new WebAuthnAuthenticator("authenticator", null, null, 0);
        assertThat(instanceA).isEqualTo(instanceB);
        assertThat(instanceA).hasSameHashCodeAs(instanceB);
    }

    @Test
    public void get_set_name_test() {
        WebAuthnAuthenticator instance = new WebAuthnAuthenticator("authenticator", null, null, 0);
        assertThat(instance.getName()).isEqualTo("authenticator");
        instance.setName("newName");
        assertThat(instance.getName()).isEqualTo("newName");
    }
}
