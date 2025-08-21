package com.scandit.datacapture.core.internal.module.https.trusts;

import androidx.annotation.Keep;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/module/https/trusts/ExtendedX509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "host", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class ExtendedX509TrustManager implements X509TrustManager {
    @Keep
    public void checkServerTrusted(X509Certificate[] chain, String authType, String host) throws CertificateException {
        Intrinsics.j(chain, "chain");
        Intrinsics.j(authType, "authType");
        Intrinsics.j(host, "host");
        throw new CertificateException(getClass().getSimpleName().concat(" doesn't implement checkServerTrusted(chain: [X509Certificate], authType: String, host: String)"));
    }
}
