package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class BB {

    /* renamed from: a, reason: collision with root package name */
    private final B80 f65472a;

    /* renamed from: b, reason: collision with root package name */
    private final Qc.a f65473b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f65474c;

    /* renamed from: d, reason: collision with root package name */
    private final String f65475d;

    /* renamed from: e, reason: collision with root package name */
    private final List f65476e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f65477f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC7738cy0 f65478g;

    /* renamed from: h, reason: collision with root package name */
    private final String f65479h;

    /* renamed from: i, reason: collision with root package name */
    private final W10 f65480i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.r0 f65481j;

    /* renamed from: k, reason: collision with root package name */
    private final C9570u60 f65482k;

    /* renamed from: l, reason: collision with root package name */
    private final int f65483l;

    /* renamed from: m, reason: collision with root package name */
    private final RE f65484m;

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ C9853wo a(com.google.common.util.concurrent.q qVar, Bundle bundle) throws Exception {
        AB ab2 = (AB) qVar.get();
        Bundle bundle2 = ab2.f65088a;
        String str = (String) ((com.google.common.util.concurrent.q) this.f65478g.zzb()).get();
        boolean z10 = false;
        if (((Boolean) Mc.A.c().a(C8659lf.f76117Q6)).booleanValue() && this.f65481j.zzN()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = this.f65479h;
        PackageInfo packageInfo = this.f65477f;
        List list = this.f65476e;
        String str3 = this.f65475d;
        return new C9853wo(bundle2, this.f65473b, this.f65474c, str3, list, packageInfo, str, str2, null, null, z11, this.f65482k.b(), bundle, ab2.f65089b);
    }

    public final com.google.common.util.concurrent.q b(Bundle bundle) {
        this.f65484m.zza();
        return C8505k80.c(this.f65480i.a(new AB(new Bundle(), new Bundle()), bundle, this.f65483l == 2), EnumC9681v80.SIGNALS, this.f65472a).a();
    }

    public final com.google.common.util.concurrent.q c() {
        final Bundle bundle = new Bundle();
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
            Bundle bundle2 = this.f65482k.f78753s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.q qVarB = b(bundle);
        return this.f65472a.a(EnumC9681v80.REQUEST_PARCEL, qVarB, (com.google.common.util.concurrent.q) this.f65478g.zzb()).a(new Callable() { // from class: com.google.android.gms.internal.ads.zB
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f80377a.a(qVarB, bundle);
            }
        }).a();
    }

    BB(B80 b80, Qc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, InterfaceC7738cy0 interfaceC7738cy0, Pc.r0 r0Var, String str2, W10 w10, C9570u60 c9570u60, RE re2, int i10) {
        this.f65472a = b80;
        this.f65473b = aVar;
        this.f65474c = applicationInfo;
        this.f65475d = str;
        this.f65476e = list;
        this.f65477f = packageInfo;
        this.f65478g = interfaceC7738cy0;
        this.f65479h = str2;
        this.f65480i = w10;
        this.f65481j = r0Var;
        this.f65482k = c9570u60;
        this.f65484m = re2;
        this.f65483l = i10;
    }
}
