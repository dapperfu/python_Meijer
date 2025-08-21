package androidx.media3.exoplayer;

import a3.C5643A;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.r;
import java.util.List;
import s3.C16999E;

/* loaded from: classes.dex */
final class E0 {

    /* renamed from: u, reason: collision with root package name */
    private static final r.b f55734u = new r.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final a3.F f55735a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f55736b;

    /* renamed from: c, reason: collision with root package name */
    public final long f55737c;

    /* renamed from: d, reason: collision with root package name */
    public final long f55738d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55739e;

    /* renamed from: f, reason: collision with root package name */
    public final ExoPlaybackException f55740f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f55741g;

    /* renamed from: h, reason: collision with root package name */
    public final p3.w f55742h;

    /* renamed from: i, reason: collision with root package name */
    public final C16999E f55743i;

    /* renamed from: j, reason: collision with root package name */
    public final List<a3.y> f55744j;

    /* renamed from: k, reason: collision with root package name */
    public final r.b f55745k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f55746l;

    /* renamed from: m, reason: collision with root package name */
    public final int f55747m;

    /* renamed from: n, reason: collision with root package name */
    public final int f55748n;

    /* renamed from: o, reason: collision with root package name */
    public final C5643A f55749o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f55750p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f55751q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f55752r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f55753s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f55754t;

    public static E0 k(C16999E c16999e) {
        a3.F f10 = a3.F.f44401a;
        r.b bVar = f55734u;
        return new E0(f10, bVar, -9223372036854775807L, 0L, 1, null, false, p3.w.f156147d, c16999e, Ee.L.x(), bVar, false, 1, 0, C5643A.f44367d, 0L, 0L, 0L, 0L, false);
    }

    public static r.b l() {
        return f55734u;
    }

    public E0 a() {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, m(), SystemClock.elapsedRealtime(), this.f55750p);
    }

    public E0 b(boolean z10) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, z10, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 c(r.b bVar) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, bVar, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 d(r.b bVar, long j10, long j11, long j12, long j13, p3.w wVar, C16999E c16999e, List<a3.y> list) {
        return new E0(this.f55735a, bVar, j11, j12, this.f55739e, this.f55740f, this.f55741g, wVar, c16999e, list, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, j13, j10, SystemClock.elapsedRealtime(), this.f55750p);
    }

    public E0 e(boolean z10, int i10, int i11) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, z10, i10, i11, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 f(ExoPlaybackException exoPlaybackException) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, exoPlaybackException, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 g(C5643A c5643a) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, c5643a, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 h(int i10) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, i10, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public E0 i(boolean z10) {
        return new E0(this.f55735a, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, z10);
    }

    public E0 j(a3.F f10) {
        return new E0(f10, this.f55736b, this.f55737c, this.f55738d, this.f55739e, this.f55740f, this.f55741g, this.f55742h, this.f55743i, this.f55744j, this.f55745k, this.f55746l, this.f55747m, this.f55748n, this.f55749o, this.f55751q, this.f55752r, this.f55753s, this.f55754t, this.f55750p);
    }

    public boolean n() {
        return this.f55739e == 3 && this.f55746l && this.f55748n == 0;
    }

    public void o(long j10) {
        this.f55753s = j10;
        this.f55754t = SystemClock.elapsedRealtime();
    }

    public E0(a3.F f10, r.b bVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, p3.w wVar, C16999E c16999e, List<a3.y> list, r.b bVar2, boolean z11, int i11, int i12, C5643A c5643a, long j12, long j13, long j14, long j15, boolean z12) {
        this.f55735a = f10;
        this.f55736b = bVar;
        this.f55737c = j10;
        this.f55738d = j11;
        this.f55739e = i10;
        this.f55740f = exoPlaybackException;
        this.f55741g = z10;
        this.f55742h = wVar;
        this.f55743i = c16999e;
        this.f55744j = list;
        this.f55745k = bVar2;
        this.f55746l = z11;
        this.f55747m = i11;
        this.f55748n = i12;
        this.f55749o = c5643a;
        this.f55751q = j12;
        this.f55752r = j13;
        this.f55753s = j14;
        this.f55754t = j15;
        this.f55750p = z12;
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f55753s;
        }
        do {
            j10 = this.f55754t;
            j11 = this.f55753s;
        } while (j10 != this.f55754t);
        return d3.P.M0(d3.P.j1(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f55749o.f44370a)));
    }
}
