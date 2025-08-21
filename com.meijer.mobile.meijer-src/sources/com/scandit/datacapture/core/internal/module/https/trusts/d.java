package com.scandit.datacapture.core.internal.module.https.trusts;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d extends WrapperX509TrustManager {
    /* JADX WARN: Illegal instructions before constructor call */
    public d() throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    Intrinsics.h(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                    super(new WrapperX509TrustManager((X509TrustManager) trustManager));
                    return;
                }
            }
            throw new IllegalStateException(("Unexpected default trust managers: " + Arrays.toString(trustManagers)).toString());
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }
}
