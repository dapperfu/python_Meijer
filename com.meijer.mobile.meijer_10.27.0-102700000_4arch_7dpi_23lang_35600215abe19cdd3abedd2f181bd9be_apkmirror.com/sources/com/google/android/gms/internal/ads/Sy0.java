package com.google.android.gms.internal.ads;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Sy0 implements InterfaceC7550bA0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7990fH0 f70205a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70206b;

    /* renamed from: c, reason: collision with root package name */
    private final long f70207c;

    /* renamed from: d, reason: collision with root package name */
    private final long f70208d;

    /* renamed from: e, reason: collision with root package name */
    private final long f70209e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70210f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f70211g;

    /* renamed from: h, reason: collision with root package name */
    private long f70212h;

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean a(C7980fC0 c7980fC0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final long d(C7980fC0 c7980fC0) {
        return this.f70210f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final C7990fH0 zzk() {
        return this.f70205a;
    }

    public Sy0() {
        C7990fH0 c7990fH0 = new C7990fH0(true, 65536);
        k(2500, 0, "bufferForPlaybackMs", "0");
        k(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        k(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(50000, 50000, "maxBufferMs", "minBufferMs");
        k(0, 0, "backBufferDurationMs", "0");
        this.f70205a = c7990fH0;
        this.f70206b = OV.K(50000L);
        this.f70207c = OV.K(50000L);
        this.f70208d = OV.K(AnimatedGradientTextView.ANIMATION_DURATION);
        this.f70209e = OV.K(5000L);
        this.f70210f = OV.K(0L);
        this.f70211g = new HashMap();
        this.f70212h = -1L;
    }

    private static void k(int i10, int i11, String str, String str2) {
        C8086gC.e(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void l(C7980fC0 c7980fC0) {
        if (this.f70211g.remove(c7980fC0) != null) {
            m();
        }
    }

    private final void m() {
        if (this.f70211g.isEmpty()) {
            this.f70205a.e();
        } else {
            this.f70205a.f(j());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean b(C7443aA0 c7443aA0) {
        Qy0 qy0 = (Qy0) this.f70211g.get(c7443aA0.f72367a);
        qy0.getClass();
        int iA = this.f70205a.a();
        int iJ = j();
        long jMin = this.f70206b;
        float f10 = c7443aA0.f72369c;
        if (f10 > 1.0f) {
            jMin = Math.min(OV.I(jMin, f10), this.f70207c);
        }
        long j10 = c7443aA0.f72368b;
        if (j10 < Math.max(jMin, 500000L)) {
            boolean z10 = iA < iJ;
            qy0.f69699a = z10;
            if (!z10 && j10 < 500000) {
                C9917xL.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f70207c || iA >= iJ) {
            qy0.f69699a = false;
        }
        return qy0.f69699a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean f(C7443aA0 c7443aA0) {
        boolean z10 = c7443aA0.f72370d;
        long J10 = OV.J(c7443aA0.f72368b, c7443aA0.f72369c);
        long jMin = z10 ? this.f70209e : this.f70208d;
        long j10 = c7443aA0.f72371e;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        return jMin <= 0 || J10 >= jMin || this.f70205a.a() >= j();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final boolean h(AbstractC7307Wl abstractC7307Wl, C7453aF0 c7453aF0, long j10) {
        Iterator it = this.f70211g.values().iterator();
        while (it.hasNext()) {
            if (((Qy0) it.next()).f69699a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void i(C7443aA0 c7443aA0, C7775dG0 c7775dG0, PG0[] pg0Arr) {
        Qy0 qy0 = (Qy0) this.f70211g.get(c7443aA0.f72367a);
        qy0.getClass();
        int length = pg0Arr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = 13107200;
            if (i10 >= length) {
                qy0.f69700b = Math.max(13107200, i11);
                m();
                return;
            }
            PG0 pg0 = pg0Arr[i10];
            if (pg0 != null) {
                switch (pg0.zzg().f79123c) {
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
        Iterator it = this.f70211g.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Qy0) it.next()).f69700b;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void c(C7980fC0 c7980fC0) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f70212h;
        boolean z10 = true;
        if (j10 != -1 && j10 != id2) {
            z10 = false;
        }
        C8086gC.g(z10, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f70212h = id2;
        if (!this.f70211g.containsKey(c7980fC0)) {
            this.f70211g.put(c7980fC0, new Qy0(null));
        }
        Qy0 qy0 = (Qy0) this.f70211g.get(c7980fC0);
        qy0.getClass();
        qy0.f69700b = 13107200;
        qy0.f69699a = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void e(C7980fC0 c7980fC0) {
        l(c7980fC0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7550bA0
    public final void g(C7980fC0 c7980fC0) {
        l(c7980fC0);
        if (this.f70211g.isEmpty()) {
            this.f70212h = -1L;
        }
    }
}
