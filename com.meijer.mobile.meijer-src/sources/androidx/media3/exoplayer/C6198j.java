package androidx.media3.exoplayer;

import androidx.media3.exoplayer.InterfaceC6201k0;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import i3.E1;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.media3.exoplayer.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6198j implements InterfaceC6201k0 {

    /* renamed from: b, reason: collision with root package name */
    private final t3.f f56422b;

    /* renamed from: c, reason: collision with root package name */
    private final long f56423c;

    /* renamed from: d, reason: collision with root package name */
    private final long f56424d;

    /* renamed from: e, reason: collision with root package name */
    private final long f56425e;

    /* renamed from: f, reason: collision with root package name */
    private final long f56426f;

    /* renamed from: g, reason: collision with root package name */
    private final int f56427g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f56428h;

    /* renamed from: i, reason: collision with root package name */
    private final long f56429i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f56430j;

    /* renamed from: k, reason: collision with root package name */
    private final HashMap<E1, b> f56431k;

    /* renamed from: l, reason: collision with root package name */
    private long f56432l;

    /* renamed from: androidx.media3.exoplayer.j$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f56433a;

        /* renamed from: b, reason: collision with root package name */
        public int f56434b;

        private b() {
        }
    }

    public C6198j() {
        this(new t3.f(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    protected int t(s3.y[] yVarArr) {
        int iV = 0;
        for (s3.y yVar : yVarArr) {
            if (yVar != null) {
                iV += v(yVar.g().f44453c);
            }
        }
        return Math.max(13107200, iV);
    }

    protected C6198j(t3.f fVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        s(i12, 0, "bufferForPlaybackMs", "0");
        s(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        s(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        s(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        s(i11, i10, "maxBufferMs", "minBufferMs");
        s(i15, 0, "backBufferDurationMs", "0");
        this.f56422b = fVar;
        this.f56423c = d3.P.M0(i10);
        this.f56424d = d3.P.M0(i11);
        this.f56425e = d3.P.M0(i12);
        this.f56426f = d3.P.M0(i13);
        this.f56427g = i14;
        this.f56428h = z10;
        this.f56429i = d3.P.M0(i15);
        this.f56430j = z11;
        this.f56431k = new HashMap<>();
        this.f56432l = -1L;
    }

    private static void s(int i10, int i11, String str, String str2) {
        C13599a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int v(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void w(E1 e12) {
        if (this.f56431k.remove(e12) != null) {
            y();
        }
    }

    private void x(E1 e12) {
        b bVar = (b) C13599a.e(this.f56431k.get(e12));
        int i10 = this.f56427g;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f56434b = i10;
        bVar.f56433a = false;
    }

    private void y() {
        if (this.f56431k.isEmpty()) {
            this.f56422b.g();
        } else {
            this.f56422b.h(u());
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public boolean a(InterfaceC6201k0.a aVar) {
        long jH0 = d3.P.h0(aVar.f56530e, aVar.f56531f);
        long jMin = aVar.f56533h ? this.f56426f : this.f56425e;
        long j10 = aVar.f56534i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jH0 >= jMin) {
            return true;
        }
        return !this.f56428h && this.f56422b.f() >= u();
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public boolean e(a3.F f10, r.b bVar, long j10) {
        Iterator<b> it = this.f56431k.values().iterator();
        while (it.hasNext()) {
            if (it.next().f56433a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public void f(InterfaceC6201k0.a aVar, p3.w wVar, s3.y[] yVarArr) {
        b bVar = (b) C13599a.e(this.f56431k.get(aVar.f56526a));
        int iT = this.f56427g;
        if (iT == -1) {
            iT = t(yVarArr);
        }
        bVar.f56434b = iT;
        y();
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public t3.b k() {
        return this.f56422b;
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public boolean m(InterfaceC6201k0.a aVar) {
        b bVar = (b) C13599a.e(this.f56431k.get(aVar.f56526a));
        boolean z10 = true;
        boolean z11 = this.f56422b.f() >= u();
        long jMin = this.f56423c;
        float f10 = aVar.f56531f;
        if (f10 > 1.0f) {
            jMin = Math.min(d3.P.c0(jMin, f10), this.f56424d);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f56530e;
        if (j10 < jMax) {
            if (!this.f56428h && z11) {
                z10 = false;
            }
            bVar.f56433a = z10;
            if (!z10 && j10 < 500000) {
                d3.r.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f56424d || z11) {
            bVar.f56433a = false;
        }
        return bVar.f56433a;
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public boolean o(E1 e12) {
        return this.f56430j;
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public long q(E1 e12) {
        return this.f56429i;
    }

    int u() {
        Iterator<b> it = this.f56431k.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f56434b;
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public void c(E1 e12) {
        w(e12);
        if (this.f56431k.isEmpty()) {
            this.f56432l = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public void d(E1 e12) {
        w(e12);
    }

    @Override // androidx.media3.exoplayer.InterfaceC6201k0
    public void i(E1 e12) {
        boolean z10;
        long id2 = Thread.currentThread().getId();
        long j10 = this.f56432l;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        } else {
            z10 = true;
        }
        C13599a.h(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f56432l = id2;
        if (!this.f56431k.containsKey(e12)) {
            this.f56431k.put(e12, new b());
        }
        x(e12);
    }
}
