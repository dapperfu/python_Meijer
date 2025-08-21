package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class BB {

    /* renamed from: a, reason: collision with root package name */
    private final B80 f66312a;

    /* renamed from: b, reason: collision with root package name */
    private final Sc.a f66313b;

    /* renamed from: c, reason: collision with root package name */
    private final ApplicationInfo f66314c;

    /* renamed from: d, reason: collision with root package name */
    private final String f66315d;

    /* renamed from: e, reason: collision with root package name */
    private final List f66316e;

    /* renamed from: f, reason: collision with root package name */
    private final PackageInfo f66317f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC7863cy0 f66318g;

    /* renamed from: h, reason: collision with root package name */
    private final String f66319h;

    /* renamed from: i, reason: collision with root package name */
    private final W10 f66320i;

    /* renamed from: j, reason: collision with root package name */
    private final Rc.r0 f66321j;

    /* renamed from: k, reason: collision with root package name */
    private final C9695u60 f66322k;

    /* renamed from: l, reason: collision with root package name */
    private final int f66323l;

    /* renamed from: m, reason: collision with root package name */
    private final RE f66324m;

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ C9978wo a(com.google.common.util.concurrent.q qVar, Bundle bundle) throws Exception {
        AB ab2 = (AB) qVar.get();
        Bundle bundle2 = ab2.f65928a;
        String str = (String) ((com.google.common.util.concurrent.q) this.f66318g.zzb()).get();
        boolean z10 = false;
        if (((Boolean) Oc.A.c().a(C8784lf.f76957Q6)).booleanValue() && this.f66321j.zzN()) {
            z10 = true;
        }
        boolean z11 = z10;
        String str2 = this.f66319h;
        PackageInfo packageInfo = this.f66317f;
        List list = this.f66316e;
        String str3 = this.f66315d;
        return new C9978wo(bundle2, this.f66313b, this.f66314c, str3, list, packageInfo, str, str2, null, null, z11, this.f66322k.b(), bundle, ab2.f65929b);
    }

    public final com.google.common.util.concurrent.q b(Bundle bundle) {
        this.f66324m.zza();
        return C8630k80.c(this.f66320i.a(new AB(new Bundle(), new Bundle()), bundle, this.f66323l == 2), EnumC9806v80.SIGNALS, this.f66312a).a();
    }

    public final com.google.common.util.concurrent.q c() {
        final Bundle bundle = new Bundle();
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue()) {
            Bundle bundle2 = this.f66322k.f79593s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final com.google.common.util.concurrent.q qVarB = b(bundle);
        return this.f66312a.a(EnumC9806v80.REQUEST_PARCEL, qVarB, (com.google.common.util.concurrent.q) this.f66318g.zzb()).a(new Callable() { // from class: com.google.android.gms.internal.ads.zB
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f81217a.a(qVarB, bundle);
            }
        }).a();
    }

    BB(B80 b80, Sc.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, InterfaceC7863cy0 interfaceC7863cy0, Rc.r0 r0Var, String str2, W10 w10, C9695u60 c9695u60, RE re2, int i10) {
        this.f66312a = b80;
        this.f66313b = aVar;
        this.f66314c = applicationInfo;
        this.f66315d = str;
        this.f66316e = list;
        this.f66317f = packageInfo;
        this.f66318g = interfaceC7863cy0;
        this.f66319h = str2;
        this.f66320i = w10;
        this.f66321j = r0Var;
        this.f66322k = c9695u60;
        this.f66324m = re2;
        this.f66323l = i10;
    }
}
