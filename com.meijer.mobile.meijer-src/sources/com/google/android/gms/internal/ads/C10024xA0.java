package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10024xA0 {

    /* renamed from: u, reason: collision with root package name */
    private static final C7578aF0 f80526u = new C7578aF0(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7432Wl f80527a;

    /* renamed from: b, reason: collision with root package name */
    public final C7578aF0 f80528b;

    /* renamed from: c, reason: collision with root package name */
    public final long f80529c;

    /* renamed from: d, reason: collision with root package name */
    public final long f80530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80531e;

    /* renamed from: f, reason: collision with root package name */
    public final zzib f80532f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80533g;

    /* renamed from: h, reason: collision with root package name */
    public final C7900dG0 f80534h;

    /* renamed from: i, reason: collision with root package name */
    public final XG0 f80535i;

    /* renamed from: j, reason: collision with root package name */
    public final List f80536j;

    /* renamed from: k, reason: collision with root package name */
    public final C7578aF0 f80537k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f80538l;

    /* renamed from: m, reason: collision with root package name */
    public final int f80539m;

    /* renamed from: n, reason: collision with root package name */
    public final int f80540n;

    /* renamed from: o, reason: collision with root package name */
    public final C7613ag f80541o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f80542p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f80543q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f80544r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f80545s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f80546t;

    public C10024xA0(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, long j10, long j11, int i10, zzib zzibVar, boolean z10, C7900dG0 c7900dG0, XG0 xg0, List list, C7578aF0 c7578aF02, boolean z11, int i11, int i12, C7613ag c7613ag, long j12, long j13, long j14, long j15, boolean z12) {
        this.f80527a = abstractC7432Wl;
        this.f80528b = c7578aF0;
        this.f80529c = j10;
        this.f80530d = j11;
        this.f80531e = i10;
        this.f80532f = zzibVar;
        this.f80533g = z10;
        this.f80534h = c7900dG0;
        this.f80535i = xg0;
        this.f80536j = list;
        this.f80537k = c7578aF02;
        this.f80538l = z11;
        this.f80539m = i11;
        this.f80540n = i12;
        this.f80541o = c7613ag;
        this.f80543q = j12;
        this.f80544r = j13;
        this.f80545s = j14;
        this.f80546t = j15;
    }

    public static C7578aF0 h() {
        return f80526u;
    }

    public final C10024xA0 a(C7578aF0 c7578aF0) {
        return new C10024xA0(this.f80527a, this.f80528b, this.f80529c, this.f80530d, this.f80531e, this.f80532f, this.f80533g, this.f80534h, this.f80535i, this.f80536j, c7578aF0, this.f80538l, this.f80539m, this.f80540n, this.f80541o, this.f80543q, this.f80544r, this.f80545s, this.f80546t, false);
    }

    public final C10024xA0 c(boolean z10, int i10, int i11) {
        return new C10024xA0(this.f80527a, this.f80528b, this.f80529c, this.f80530d, this.f80531e, this.f80532f, this.f80533g, this.f80534h, this.f80535i, this.f80536j, this.f80537k, z10, i10, i11, this.f80541o, this.f80543q, this.f80544r, this.f80545s, this.f80546t, false);
    }

    public final C10024xA0 d(zzib zzibVar) {
        return new C10024xA0(this.f80527a, this.f80528b, this.f80529c, this.f80530d, this.f80531e, zzibVar, this.f80533g, this.f80534h, this.f80535i, this.f80536j, this.f80537k, this.f80538l, this.f80539m, this.f80540n, this.f80541o, this.f80543q, this.f80544r, this.f80545s, this.f80546t, false);
    }

    public final C10024xA0 e(int i10) {
        return new C10024xA0(this.f80527a, this.f80528b, this.f80529c, this.f80530d, i10, this.f80532f, this.f80533g, this.f80534h, this.f80535i, this.f80536j, this.f80537k, this.f80538l, this.f80539m, this.f80540n, this.f80541o, this.f80543q, this.f80544r, this.f80545s, this.f80546t, false);
    }

    public final C10024xA0 f(AbstractC7432Wl abstractC7432Wl) {
        return new C10024xA0(abstractC7432Wl, this.f80528b, this.f80529c, this.f80530d, this.f80531e, this.f80532f, this.f80533g, this.f80534h, this.f80535i, this.f80536j, this.f80537k, this.f80538l, this.f80539m, this.f80540n, this.f80541o, this.f80543q, this.f80544r, this.f80545s, this.f80546t, false);
    }

    public final boolean i() {
        return this.f80531e == 3 && this.f80538l && this.f80540n == 0;
    }

    public static C10024xA0 g(XG0 xg0) {
        AbstractC7432Wl abstractC7432Wl = AbstractC7432Wl.f71995a;
        C7578aF0 c7578aF0 = f80526u;
        return new C10024xA0(abstractC7432Wl, c7578aF0, -9223372036854775807L, 0L, 1, null, false, C7900dG0.f74224d, xg0, AbstractC8042eh0.t(), c7578aF0, false, 1, 0, C7613ag.f73300d, 0L, 0L, 0L, 0L, false);
    }

    public final C10024xA0 b(C7578aF0 c7578aF0, long j10, long j11, long j12, long j13, C7900dG0 c7900dG0, XG0 xg0, List list) {
        C7578aF0 c7578aF02 = this.f80537k;
        boolean z10 = this.f80538l;
        int i10 = this.f80539m;
        int i11 = this.f80540n;
        C7613ag c7613ag = this.f80541o;
        long j14 = this.f80543q;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new C10024xA0(this.f80527a, c7578aF0, j11, j12, this.f80531e, this.f80532f, this.f80533g, c7900dG0, xg0, list, c7578aF02, z10, i10, i11, c7613ag, j14, j13, j10, jElapsedRealtime, false);
    }
}
