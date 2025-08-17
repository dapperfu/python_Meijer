package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xA0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9899xA0 {

    /* renamed from: u, reason: collision with root package name */
    private static final C7453aF0 f79686u = new C7453aF0(new Object(), -1);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7307Wl f79687a;

    /* renamed from: b, reason: collision with root package name */
    public final C7453aF0 f79688b;

    /* renamed from: c, reason: collision with root package name */
    public final long f79689c;

    /* renamed from: d, reason: collision with root package name */
    public final long f79690d;

    /* renamed from: e, reason: collision with root package name */
    public final int f79691e;

    /* renamed from: f, reason: collision with root package name */
    public final zzib f79692f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f79693g;

    /* renamed from: h, reason: collision with root package name */
    public final C7775dG0 f79694h;

    /* renamed from: i, reason: collision with root package name */
    public final XG0 f79695i;

    /* renamed from: j, reason: collision with root package name */
    public final List f79696j;

    /* renamed from: k, reason: collision with root package name */
    public final C7453aF0 f79697k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f79698l;

    /* renamed from: m, reason: collision with root package name */
    public final int f79699m;

    /* renamed from: n, reason: collision with root package name */
    public final int f79700n;

    /* renamed from: o, reason: collision with root package name */
    public final C7488ag f79701o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f79702p = false;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f79703q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f79704r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f79705s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f79706t;

    public C9899xA0(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, long j10, long j11, int i10, zzib zzibVar, boolean z10, C7775dG0 c7775dG0, XG0 xg0, List list, C7453aF0 c7453aF02, boolean z11, int i11, int i12, C7488ag c7488ag, long j12, long j13, long j14, long j15, boolean z12) {
        this.f79687a = abstractC7307Wl;
        this.f79688b = c7453aF0;
        this.f79689c = j10;
        this.f79690d = j11;
        this.f79691e = i10;
        this.f79692f = zzibVar;
        this.f79693g = z10;
        this.f79694h = c7775dG0;
        this.f79695i = xg0;
        this.f79696j = list;
        this.f79697k = c7453aF02;
        this.f79698l = z11;
        this.f79699m = i11;
        this.f79700n = i12;
        this.f79701o = c7488ag;
        this.f79703q = j12;
        this.f79704r = j13;
        this.f79705s = j14;
        this.f79706t = j15;
    }

    public static C7453aF0 h() {
        return f79686u;
    }

    public final C9899xA0 a(C7453aF0 c7453aF0) {
        return new C9899xA0(this.f79687a, this.f79688b, this.f79689c, this.f79690d, this.f79691e, this.f79692f, this.f79693g, this.f79694h, this.f79695i, this.f79696j, c7453aF0, this.f79698l, this.f79699m, this.f79700n, this.f79701o, this.f79703q, this.f79704r, this.f79705s, this.f79706t, false);
    }

    public final C9899xA0 c(boolean z10, int i10, int i11) {
        return new C9899xA0(this.f79687a, this.f79688b, this.f79689c, this.f79690d, this.f79691e, this.f79692f, this.f79693g, this.f79694h, this.f79695i, this.f79696j, this.f79697k, z10, i10, i11, this.f79701o, this.f79703q, this.f79704r, this.f79705s, this.f79706t, false);
    }

    public final C9899xA0 d(zzib zzibVar) {
        return new C9899xA0(this.f79687a, this.f79688b, this.f79689c, this.f79690d, this.f79691e, zzibVar, this.f79693g, this.f79694h, this.f79695i, this.f79696j, this.f79697k, this.f79698l, this.f79699m, this.f79700n, this.f79701o, this.f79703q, this.f79704r, this.f79705s, this.f79706t, false);
    }

    public final C9899xA0 e(int i10) {
        return new C9899xA0(this.f79687a, this.f79688b, this.f79689c, this.f79690d, i10, this.f79692f, this.f79693g, this.f79694h, this.f79695i, this.f79696j, this.f79697k, this.f79698l, this.f79699m, this.f79700n, this.f79701o, this.f79703q, this.f79704r, this.f79705s, this.f79706t, false);
    }

    public final C9899xA0 f(AbstractC7307Wl abstractC7307Wl) {
        return new C9899xA0(abstractC7307Wl, this.f79688b, this.f79689c, this.f79690d, this.f79691e, this.f79692f, this.f79693g, this.f79694h, this.f79695i, this.f79696j, this.f79697k, this.f79698l, this.f79699m, this.f79700n, this.f79701o, this.f79703q, this.f79704r, this.f79705s, this.f79706t, false);
    }

    public final boolean i() {
        return this.f79691e == 3 && this.f79698l && this.f79700n == 0;
    }

    public static C9899xA0 g(XG0 xg0) {
        AbstractC7307Wl abstractC7307Wl = AbstractC7307Wl.f71155a;
        C7453aF0 c7453aF0 = f79686u;
        return new C9899xA0(abstractC7307Wl, c7453aF0, -9223372036854775807L, 0L, 1, null, false, C7775dG0.f73384d, xg0, AbstractC7917eh0.t(), c7453aF0, false, 1, 0, C7488ag.f72460d, 0L, 0L, 0L, 0L, false);
    }

    public final C9899xA0 b(C7453aF0 c7453aF0, long j10, long j11, long j12, long j13, C7775dG0 c7775dG0, XG0 xg0, List list) {
        C7453aF0 c7453aF02 = this.f79697k;
        boolean z10 = this.f79698l;
        int i10 = this.f79699m;
        int i11 = this.f79700n;
        C7488ag c7488ag = this.f79701o;
        long j14 = this.f79703q;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        return new C9899xA0(this.f79687a, c7453aF0, j11, j12, this.f79691e, this.f79692f, this.f79693g, c7775dG0, xg0, list, c7453aF02, z10, i10, i11, c7488ag, j14, j13, j10, jElapsedRealtime, false);
    }
}
