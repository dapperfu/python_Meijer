package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class D10 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C7311Wp f66104a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f66105b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f66106c;

    public D10(C7311Wp c7311Wp, Xj0 xj0, Context context) {
        this.f66104a = c7311Wp;
        this.f66105b = xj0;
        this.f66106c = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 34;
    }

    final /* synthetic */ E10 a() throws Exception {
        if (!this.f66104a.p(this.f66106c)) {
            return new E10(null, null, null, null, null);
        }
        String strD = this.f66104a.d(this.f66106c);
        String str = strD == null ? "" : strD;
        String strB = this.f66104a.b(this.f66106c);
        String str2 = strB == null ? "" : strB;
        String strA = this.f66104a.a(this.f66106c);
        String str3 = strA == null ? "" : strA;
        String str4 = true != this.f66104a.p(this.f66106c) ? null : "fa";
        return new E10(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) Mc.A.c().a(C8659lf.f76516t0) : null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f66105b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.C10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f65687a.a();
            }
        });
    }
}
