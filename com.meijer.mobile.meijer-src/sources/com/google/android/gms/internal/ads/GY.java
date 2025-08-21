package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final Context f68063a;

    /* renamed from: b, reason: collision with root package name */
    private final String f68064b;

    /* renamed from: c, reason: collision with root package name */
    private final String f68065c;

    /* renamed from: d, reason: collision with root package name */
    private final long f68066d;

    /* renamed from: e, reason: collision with root package name */
    private final C9488sA f68067e;

    /* renamed from: f, reason: collision with root package name */
    private final C7669b70 f68068f;

    /* renamed from: g, reason: collision with root package name */
    private final C9695u60 f68069g;

    /* renamed from: h, reason: collision with root package name */
    private final Rc.r0 f68070h = Nc.v.s().j();

    /* renamed from: i, reason: collision with root package name */
    private final C9296qN f68071i;

    /* renamed from: j, reason: collision with root package name */
    private final GA f68072j;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        Bundle bundle = new Bundle();
        this.f68071i.b().put("seq_num", this.f68064b);
        if (((Boolean) Oc.A.c().a(C8784lf.f77232k2)).booleanValue()) {
            this.f68071i.c("tsacc", String.valueOf(Nc.v.c().a() - this.f68066d));
            C9296qN c9296qN = this.f68071i;
            Nc.v.t();
            c9296qN.c("foreground", true != Rc.D0.h(this.f68063a) ? "1" : "0");
        }
        this.f68067e.i(this.f68069g.f79578d);
        bundle.putAll(this.f68068f.a());
        return Mj0.h(new HY(this.f68063a, bundle, this.f68064b, this.f68065c, this.f68070h, this.f68069g.f79580f, this.f68072j));
    }

    public GY(Context context, String str, String str2, C9488sA c9488sA, C7669b70 c7669b70, C9695u60 c9695u60, C9296qN c9296qN, GA ga2, long j10) {
        this.f68063a = context;
        this.f68064b = str;
        this.f68065c = str2;
        this.f68067e = c9488sA;
        this.f68068f = c7669b70;
        this.f68069g = c9695u60;
        this.f68071i = c9296qN;
        this.f68072j = ga2;
        this.f68066d = j10;
    }
}
