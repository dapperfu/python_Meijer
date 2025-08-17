package com.scandit.datacapture.core.internal.module.https.trusts;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X509Certificate[] f124749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f124750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(X509Certificate[] x509CertificateArr, String str) {
        super(1);
        this.f124749a = x509CertificateArr;
        this.f124750b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws CertificateException {
        X509TrustManager trust = (X509TrustManager) obj;
        Intrinsics.j(trust, "trust");
        trust.checkServerTrusted(this.f124749a, this.f124750b);
        return Unit.f142422a;
    }
}
