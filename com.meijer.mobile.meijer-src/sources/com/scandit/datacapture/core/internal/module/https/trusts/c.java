package com.scandit.datacapture.core.internal.module.https.trusts;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X509Certificate[] f125703a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f125704b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f125705c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(X509Certificate[] x509CertificateArr, String str, String str2) {
        super(1);
        this.f125703a = x509CertificateArr;
        this.f125704b = str;
        this.f125705c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws CertificateException {
        X509TrustManager trust = (X509TrustManager) obj;
        Intrinsics.j(trust, "trust");
        new X509TrustManagerExtensions(trust).checkServerTrusted(this.f125703a, this.f125704b, this.f125705c);
        return Unit.f143329a;
    }
}
