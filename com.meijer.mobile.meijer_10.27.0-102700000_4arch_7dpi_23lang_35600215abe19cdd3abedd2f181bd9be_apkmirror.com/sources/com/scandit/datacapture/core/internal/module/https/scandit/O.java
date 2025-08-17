package com.scandit.datacapture.core.internal.module.https.scandit;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class O implements N {

    /* renamed from: a, reason: collision with root package name */
    public final J f124698a;

    public O() {
        J sslSocketFactoryCreator = (J) Q.f124700a.getValue();
        Intrinsics.j(sslSocketFactoryCreator, "sslSocketFactoryCreator");
        this.f124698a = sslSocketFactoryCreator;
    }

    public final void a(HttpsURLConnection connection) {
        Intrinsics.j(connection, "connection");
        Object value = ((M) this.f124698a).f124697b.getValue();
        Intrinsics.i(value, "getValue(...)");
        connection.setSSLSocketFactory((SSLSocketFactory) value);
    }
}
