package net.sharplab.springframework.security.webauthn.endpoint;

import com.webauthn4j.request.PublicKeyCredentialParameters;
import com.webauthn4j.request.PublicKeyCredentialRpEntity;
import com.webauthn4j.request.extension.client.AuthenticationExtensionsClientInputs;
import com.webauthn4j.response.client.challenge.Challenge;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

public class AttestationOptions implements Serializable {

    private PublicKeyCredentialRpEntity relyingParty;
    private WebAuthnUserEntity user;
    private Challenge challenge;
    private List<PublicKeyCredentialParameters> pubKeyCredParams;
    private BigInteger registrationTimeout;
    private List<String> credentials;
    private AuthenticationExtensionsClientInputs registrationExtensions;

    public AttestationOptions(
            PublicKeyCredentialRpEntity relyingParty,
            WebAuthnUserEntity user,
            Challenge challenge,
            List<PublicKeyCredentialParameters> pubKeyCredParams,
            BigInteger registrationTimeout,
            List<String> credentials,
            AuthenticationExtensionsClientInputs registrationExtensions) {
        this.relyingParty = relyingParty;
        this.user = user;
        this.challenge = challenge;
        this.pubKeyCredParams = pubKeyCredParams;
        this.registrationTimeout = registrationTimeout;
        this.credentials = credentials;
        this.registrationExtensions = registrationExtensions;
    }

    public PublicKeyCredentialRpEntity getRelyingParty() {
        return relyingParty;
    }

    public WebAuthnUserEntity getUser() {
        return user;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public List<PublicKeyCredentialParameters> getPubKeyCredParams() {
        return pubKeyCredParams;
    }

    public BigInteger getRegistrationTimeout() {
        return registrationTimeout;
    }

    public List<String> getCredentials() {
        return credentials;
    }

    public AuthenticationExtensionsClientInputs getRegistrationExtensions() {
        return registrationExtensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AttestationOptions that = (AttestationOptions) o;
        return Objects.equals(relyingParty, that.relyingParty) &&
                Objects.equals(user, that.user) &&
                Objects.equals(challenge, that.challenge) &&
                Objects.equals(pubKeyCredParams, that.pubKeyCredParams) &&
                Objects.equals(registrationTimeout, that.registrationTimeout) &&
                Objects.equals(credentials, that.credentials) &&
                Objects.equals(registrationExtensions, that.registrationExtensions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(relyingParty, user, challenge, pubKeyCredParams, registrationTimeout, credentials, registrationExtensions);
    }
}