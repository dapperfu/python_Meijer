package com.google.android.gms.internal.ads;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Sy0 implements InterfaceC7675bA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8115fH0 f71045a;

    /* renamed from: b, reason: collision with root package name */
    private final long f71046b;

    /* renamed from: c, reason: collision with root package name */
    private final long f71047c;

    /* renamed from: d, reason: collision with root package name */
    private final long f71048d;

    /* renamed from: e, reason: collision with root package name */
    private final long f71049e;

    /* renamed from: f, reason: collision with root package name */
    private final long f71050f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f71051g;

    /* renamed from: h, reason: collision with root package name */
    private long f71052h;

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean a(C8105fC0 c8105fC0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final long d(C8105fC0 c8105fC0) {
        return this.f71050f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final C8115fH0 zzk() {
        return this.f71045a;
    }

    public Sy0() {
        C8115fH0 c8115fH0 = new C8115fH0(true, 65536);
        k(2500, 0, "bufferForPlaybackMs", "0");
        k(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        k(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.f71045a = c8115fH0;
        this.f71046b = OV.K(50000L);
        this.f71047c = OV.K(50000L);
        this.f71048d = OV.K(AnimatedGradientTextView.ANIMATION_DURATION);
        this.f71049e = OV.K(5000L);
        this.f71050f = OV.K(0L);
        this.f71051g = new HashMap();
        this.f71052h = -1L;
    }

    private static void k(int i10, int i11, String str, String str2) {
        C8211gC.e(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void l(C8105fC0 c8105fC0) {
        if (this.f71051g.remove(c8105fC0) != null) {
            m();
        }
    }

    private final void m() {
        if (this.f71051g.isEmpty()) {
            this.f71045a.e();
        } else {
            this.f71045a.f(j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean b(C7568aA0 c7568aA0) {
        Qy0 qy0 = (Qy0) this.f71051g.get(c7568aA0.f73207a);
        qy0.getClass();
        int iA = this.f71045a.a();
        int iJ = j();
        long jMin = this.f71046b;
        float f10 = c7568aA0.f73209c;
        if (f10 > 1.0f) {
            jMin = Math.min(OV.I(jMin, f10), this.f71047c);
        }
        long j10 = c7568aA0.f73208b;
        if (j10 < Math.max(jMin, 500000L)) {
            boolean z10 = iA < iJ;
            qy0.f70539a = z10;
            if (!z10 && j10 < 500000) {
                C10042xL.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f71047c || iA >= iJ) {
            qy0.f70539a = false;
        }
        return qy0.f70539a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean f(C7568aA0 c7568aA0) {
        boolean z10 = c7568aA0.f73210d;
        long J10 = OV.J(c7568aA0.f73208b, c7568aA0.f73209c);
        long jMin = z10 ? this.f71049e : this.f71048d;
        long j10 = c7568aA0.f73211e;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || J10 >= jMin || this.f71045a.a() >= j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final boolean h(AbstractC7432Wl abstractC7432Wl, C7578aF0 c7578aF0, long j10) {
        Iterator it = this.f71051g.values().iterator();
        while (it.hasNext()) {
            if (((Qy0) it.next()).f70539a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void i(C7568aA0 c7568aA0, C7900dG0 c7900dG0, PG0[] pg0Arr) {
        Qy0 qy0 = (Qy0) this.f71051g.get(c7568aA0.f73207a);
        qy0.getClass();
        int length = pg0Arr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 13107200;
            if (i10 >= length) {
                qy0.f70540b = Math.max(13107200, i11);
                m();
                return;
            }
            PG0 pg0 = pg0Arr[i10];
            if (pg0 != null) {
                switch (pg0.zzg().f79963c) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i12 = 144310272;
                        break;
                    case 2:
                        i12 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i12 = 131072;
                        break;
                }
                i11 += i12;
            }
            i10++;
        }
    }

    final int j() {
        Iterator it = this.f71051g.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Qy0) it.next()).f70540b;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void c(C8105fC0 c8105fC0) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f71052h;
        boolean z10 = true;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        }
        C8211gC.g(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f71052h = id2;
        if (!this.f71051g.containsKey(c8105fC0)) {
            this.f71051g.put(c8105fC0, new Qy0(null));
        }
        Qy0 qy0 = (Qy0) this.f71051g.get(c8105fC0);
        qy0.getClass();
        qy0.f70540b = 13107200;
        qy0.f70539a = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void e(C8105fC0 c8105fC0) {
        l(c8105fC0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7675bA0
    public final void g(C8105fC0 c8105fC0) {
        l(c8105fC0);
        if (this.f71051g.isEmpty()) {
            this.f71052h = -1L;
        }
    }
}
