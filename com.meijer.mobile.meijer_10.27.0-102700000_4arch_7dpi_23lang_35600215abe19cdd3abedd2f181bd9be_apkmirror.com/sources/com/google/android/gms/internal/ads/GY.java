package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class GY implements T10 {

    /* renamed from: a, reason: collision with root package name */
    final Context f67223a;

    /* renamed from: b, reason: collision with root package name */
    private final String f67224b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67225c;

    /* renamed from: d, reason: collision with root package name */
    private final long f67226d;

    /* renamed from: e, reason: collision with root package name */
    private final C9363sA f67227e;

    /* renamed from: f, reason: collision with root package name */
    private final C7544b70 f67228f;

    /* renamed from: g, reason: collision with root package name */
    private final C9570u60 f67229g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.r0 f67230h = Lc.v.s().j();

    /* renamed from: i, reason: collision with root package name */
    private final C9171qN f67231i;

    /* renamed from: j, reason: collision with root package name */
    private final GA f67232j;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        Bundle bundle = new Bundle();
        this.f67231i.b().put("seq_num", this.f67224b);
        if (((Boolean) Mc.A.c().a(C8659lf.f76392k2)).booleanValue()) {
            this.f67231i.c("tsacc", String.valueOf(Lc.v.c().a() - this.f67226d));
            C9171qN c9171qN = this.f67231i;
            Lc.v.t();
            c9171qN.c("foreground", true != Pc.D0.h(this.f67223a) ? "1" : "0");
        }
        this.f67227e.i(this.f67229g.f78738d);
        bundle.putAll(this.f67228f.a());
        return Mj0.h(new HY(this.f67223a, bundle, this.f67224b, this.f67225c, this.f67230h, this.f67229g.f78740f, this.f67232j));
    }

    public GY(Context context, String str, String str2, C9363sA c9363sA, C7544b70 c7544b70, C9570u60 c9570u60, C9171qN c9171qN, GA ga2, long j10) {
        this.f67223a = context;
        this.f67224b = str;
        this.f67225c = str2;
        this.f67227e = c9363sA;
        this.f67228f = c7544b70;
        this.f67229g = c9570u60;
        this.f67231i = c9171qN;
        this.f67232j = ga2;
        this.f67226d = j10;
    }
}
