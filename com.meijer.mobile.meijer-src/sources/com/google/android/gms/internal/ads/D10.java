package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class D10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C7436Wp f66944a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f66945b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f66946c;

    public D10(C7436Wp c7436Wp, Xj0 xj0, Context context) {
        this.f66944a = c7436Wp;
        this.f66945b = xj0;
        this.f66946c = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 34;
    }

    final /* synthetic */ E10 a() throws Exception {
        if (!this.f66944a.p(this.f66946c)) {
            return new E10(null, null, null, null, null);
        }
        String strD = this.f66944a.d(this.f66946c);
        String str = strD == null ? "" : strD;
        String strB = this.f66944a.b(this.f66946c);
        String str2 = strB == null ? "" : strB;
        String strA = this.f66944a.a(this.f66946c);
        String str3 = strA == null ? "" : strA;
        String str4 = true != this.f66944a.p(this.f66946c) ? null : "fa";
        return new E10(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) Oc.A.c().a(C8784lf.f77356t0) : null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f66945b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.C10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f66527a.a();
            }
        });
    }
}
