package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.trusts.AllowExpiredCertificatesTrustManager;
import com.scandit.datacapture.core.internal.module.https.trusts.ExtendedX509TrustManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class L extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f124695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(n0 n0Var) {
        super(0);
        this.f124695a = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((n0) this.f124695a).getClass();
        return new ExtendedX509TrustManager[]{new com.scandit.datacapture.core.internal.module.https.trusts.d(), new AllowExpiredCertificatesTrustManager()};
    }
}
