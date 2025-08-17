package androidx.media3.exoplayer;

import a3.C5560A;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.r;
import java.util.List;
import s3.C16853E;

/* loaded from: classes.dex */
final class E0 {

    /* renamed from: u, reason: collision with root package name */
    private static final r.b f55510u = new r.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final a3.F f55511a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f55512b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55513c;

    /* renamed from: d, reason: collision with root package name */
    public final long f55514d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55515e;

    /* renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f55516f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f55517g;

    /* renamed from: h, reason: collision with root package name */
    public final p3.w f55518h;

    /* renamed from: i, reason: collision with root package name */
    public final C16853E f55519i;

    /* renamed from: j, reason: collision with root package name */
    public final List<a3.y> f55520j;

    /* renamed from: k, reason: collision with root package name */
    public final r.b f55521k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f55522l;

    /* renamed from: m, reason: collision with root package name */
    public final int f55523m;

    /* renamed from: n, reason: collision with root package name */
    public final int f55524n;

    /* renamed from: o, reason: collision with root package name */
    public final C5560A f55525o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f55526p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f55527q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f55528r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f55529s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f55530t;

    public static E0 k(C16853E c16853e) {
        a3.F f10 = a3.F.f43583a;
        r.b bVar = f55510u;
        return new E0(f10, bVar, -9223372036854775807L, 0L, 1, null, false, p3.w.f155473d, c16853e, Ce.L.x(), bVar, false, 1, 0, C5560A.f43549d, 0L, 0L, 0L, 0L, false);
    }

    public static r.b l() {
        return f55510u;
    }

    public E0 a() {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, m(), SystemClock.elapsedRealtime(), this.f55526p);
    }

    public E0 b(boolean z10) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, z10, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 c(r.b bVar) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, bVar, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 d(r.b bVar, long j10, long j11, long j12, long j13, p3.w wVar, C16853E c16853e, List<a3.y> list) {
        return new E0(this.f55511a, bVar, j11, j12, this.f55515e, this.f55516f, this.f55517g, wVar, c16853e, list, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, j13, j10, SystemClock.elapsedRealtime(), this.f55526p);
    }

    public E0 e(boolean z10, int i10, int i11) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, z10, i10, i11, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 f(ExoPlaybackException exoPlaybackException) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, exoPlaybackException, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 g(C5560A c5560a) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, c5560a, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 h(int i10) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, i10, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public E0 i(boolean z10) {
        return new E0(this.f55511a, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, z10);
    }

    public E0 j(a3.F f10) {
        return new E0(f10, this.f55512b, this.f55513c, this.f55514d, this.f55515e, this.f55516f, this.f55517g, this.f55518h, this.f55519i, this.f55520j, this.f55521k, this.f55522l, this.f55523m, this.f55524n, this.f55525o, this.f55527q, this.f55528r, this.f55529s, this.f55530t, this.f55526p);
    }

    public boolean n() {
        return this.f55515e == 3 && this.f55522l && this.f55524n == 0;
    }

    public void o(long j10) {
        this.f55529s = j10;
        this.f55530t = SystemClock.elapsedRealtime();
    }

    public E0(a3.F f10, r.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, p3.w wVar, C16853E c16853e, List<a3.y> list, r.b bVar2, boolean z11, int i11, int i12, C5560A c5560a, long j12, long j13, long j14, long j15, boolean z12) {
        this.f55511a = f10;
        this.f55512b = bVar;
        this.f55513c = j10;
        this.f55514d = j11;
        this.f55515e = i10;
        this.f55516f = exoPlaybackException;
        this.f55517g = z10;
        this.f55518h = wVar;
        this.f55519i = c16853e;
        this.f55520j = list;
        this.f55521k = bVar2;
        this.f55522l = z11;
        this.f55523m = i11;
        this.f55524n = i12;
        this.f55525o = c5560a;
        this.f55527q = j12;
        this.f55528r = j13;
        this.f55529s = j14;
        this.f55530t = j15;
        this.f55526p = z12;
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f55529s;
        }
        do {
            j10 = this.f55530t;
            j11 = this.f55529s;
        } while (j10 != this.f55530t);
        return d3.P.M0(d3.P.j1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f55525o.f43552a)));
    }
}
