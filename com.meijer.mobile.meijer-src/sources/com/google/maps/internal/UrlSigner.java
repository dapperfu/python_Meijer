package com.google.maps.internal;

import gw.C14419h;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public class UrlSigner {
    private static final String ALGORITHM_HMAC_SHA1 = "HmacSHA1";
    private final Mac mac;

    private Mac getMac() {
        try {
            return (Mac) this.mac.clone();
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public UrlSigner(String str) throws NoSuchAlgorithmException, InvalidKeyException {
        C14419h c14419hL = C14419h.l(str.replace('-', '+').replace('_', '/'));
        if (c14419hL != null) {
            Mac mac = Mac.getInstance(ALGORITHM_HMAC_SHA1);
            this.mac = mac;
            mac.init(new SecretKeySpec(c14419hL.b0(), ALGORITHM_HMAC_SHA1));
            return;
        }
        throw new IllegalArgumentException("Private key is invalid.");
    }

    public String getSignature(String str) {
        return C14419h.O(getMac().doFinal(str.getBytes(StandardCharsets.UTF_8))).a().replace('+', '-').replace('/', '_');
    }
}
