package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class K extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f125646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m10) {
        super(0);
        this.f125646a = m10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, (ExtendedX509TrustManager[]) this.f125646a.f125648a.getValue(), null);
        return sSLContext.getSocketFactory();
    }
}
