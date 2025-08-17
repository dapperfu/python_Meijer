package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
final class MC0 {

    /* renamed from: A, reason: collision with root package name */
    private long f68567A;

    /* renamed from: B, reason: collision with root package name */
    private long f68568B;

    /* renamed from: C, reason: collision with root package name */
    private long f68569C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f68570D;

    /* renamed from: E, reason: collision with root package name */
    private long f68571E;

    /* renamed from: F, reason: collision with root package name */
    private long f68572F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f68573G;

    /* renamed from: H, reason: collision with root package name */
    private long f68574H;

    /* renamed from: I, reason: collision with root package name */
    private HC f68575I;

    /* renamed from: a, reason: collision with root package name */
    private final LC0 f68576a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f68577b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f68578c;

    /* renamed from: d, reason: collision with root package name */
    private int f68579d;

    /* renamed from: e, reason: collision with root package name */
    private KC0 f68580e;

    /* renamed from: f, reason: collision with root package name */
    private int f68581f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f68582g;

    /* renamed from: h, reason: collision with root package name */
    private long f68583h;

    /* renamed from: i, reason: collision with root package name */
    private float f68584i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f68585j;

    /* renamed from: k, reason: collision with root package name */
    private long f68586k;

    /* renamed from: l, reason: collision with root package name */
    private long f68587l;

    /* renamed from: m, reason: collision with root package name */
    private Method f68588m;

    /* renamed from: n, reason: collision with root package name */
    private long f68589n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f68590o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f68591p;

    /* renamed from: q, reason: collision with root package name */
    private long f68592q;

    /* renamed from: r, reason: collision with root package name */
    private long f68593r;

    /* renamed from: s, reason: collision with root package name */
    private long f68594s;

    /* renamed from: t, reason: collision with root package name */
    private long f68595t;

    /* renamed from: u, reason: collision with root package name */
    private long f68596u;

    /* renamed from: v, reason: collision with root package name */
    private int f68597v;

    /* renamed from: w, reason: collision with root package name */
    private int f68598w;

    /* renamed from: x, reason: collision with root package name */
    private long f68599x;

    /* renamed from: y, reason: collision with root package name */
    private long f68600y;

    /* renamed from: z, reason: collision with root package name */
    private long f68601z;

    private final void n() {
        this.f68586k = 0L;
        this.f68598w = 0;
        this.f68597v = 0;
        this.f68587l = 0L;
        this.f68569C = 0L;
        this.f68572F = 0L;
        this.f68585j = false;
    }

    public final void e(HC hc2) {
        this.f68575I = hc2;
    }

    public final boolean g(long j10) {
        if (j10 > OV.H(a(false), this.f68581f)) {
            return true;
        }
        if (this.f68582g) {
            AudioTrack audioTrack = this.f68578c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && l() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long l() {
        /*
            r13 = this;
            com.google.android.gms.internal.ads.HC r0 = r13.f68575I
            long r0 = r0.zzb()
            long r2 = r13.f68599x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 2
            if (r2 == 0) goto L3d
            android.media.AudioTrack r2 = r13.f68578c
            r2.getClass()
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L20
            long r0 = r13.f68601z
            return r0
        L20:
            long r0 = com.google.android.gms.internal.ads.OV.K(r0)
            long r2 = r13.f68599x
            long r0 = r0 - r2
            float r2 = r13.f68584i
            long r0 = com.google.android.gms.internal.ads.OV.I(r0, r2)
            int r2 = r13.f68581f
            long r0 = com.google.android.gms.internal.ads.OV.H(r0, r2)
            long r2 = r13.f68567A
            long r4 = r13.f68601z
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L3d:
            long r6 = r13.f68593r
            long r6 = r0 - r6
            r8 = 5
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 < 0) goto La6
            android.media.AudioTrack r2 = r13.f68578c
            r2.getClass()
            int r6 = r2.getPlayState()
            r7 = 1
            if (r6 != r7) goto L54
            goto La4
        L54:
            int r2 = r2.getPlaybackHeadPosition()
            long r7 = (long) r2
            boolean r2 = r13.f68582g
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            r9 = 0
            if (r2 == 0) goto L75
            if (r6 != r3) goto L70
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L71
            long r11 = r13.f68594s
            r13.f68596u = r11
            goto L71
        L70:
            r3 = r6
        L71:
            long r11 = r13.f68596u
            long r7 = r7 + r11
            r6 = r3
        L75:
            int r2 = com.google.android.gms.internal.ads.OV.f69091a
            r3 = 29
            if (r2 > r3) goto L95
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L91
            long r2 = r13.f68594s
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 <= 0) goto L92
            r2 = 3
            if (r6 != r2) goto L92
            long r2 = r13.f68600y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto La4
            r13.f68600y = r0
            goto La4
        L91:
            r9 = r7
        L92:
            r13.f68600y = r4
            r7 = r9
        L95:
            long r2 = r13.f68594s
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto La2
            long r2 = r13.f68595t
            r4 = 1
            long r2 = r2 + r4
            r13.f68595t = r2
        La2:
            r13.f68594s = r7
        La4:
            r13.f68593r = r0
        La6:
            long r0 = r13.f68594s
            long r2 = r13.f68574H
            long r0 = r0 + r2
            long r2 = r13.f68595t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MC0.l():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r22) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MC0.a(boolean):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.f68578c = r3
            r2.f68579d = r7
            com.google.android.gms.internal.ads.KC0 r0 = new com.google.android.gms.internal.ads.KC0
            r0.<init>(r3)
            r2.f68580e = r0
            int r3 = r3.getSampleRate()
            r2.f68581f = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.OV.f69091a
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.f68582g = r0
            boolean r4 = com.google.android.gms.internal.ads.OV.j(r5)
            r2.f68591p = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.f68581f
            long r4 = com.google.android.gms.internal.ads.OV.L(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.f68583h = r4
            r4 = 0
            r2.f68594s = r4
            r2.f68595t = r4
            r2.f68573G = r3
            r2.f68574H = r4
            r2.f68596u = r4
            r2.f68590o = r3
            r2.f68599x = r0
            r2.f68600y = r0
            r2.f68592q = r4
            r2.f68589n = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.f68584i = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.MC0.d(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void f() {
        if (this.f68599x != -9223372036854775807L) {
            this.f68599x = OV.K(this.f68575I.zzb());
        }
        KC0 kc0 = this.f68580e;
        kc0.getClass();
        kc0.e();
    }

    public final boolean h() {
        AudioTrack audioTrack = this.f68578c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean i(long j10) {
        return this.f68600y != -9223372036854775807L && j10 > 0 && this.f68575I.zzb() - this.f68600y >= 200;
    }

    public final boolean j(long j10) {
        AudioTrack audioTrack = this.f68578c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f68582g) {
            if (playState == 2) {
                this.f68590o = false;
                return false;
            }
            if (playState == 1) {
                if (l() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.f68590o;
        boolean zG = g(j10);
        this.f68590o = zG;
        if (z10 && !zG && playState != 1) {
            this.f68576a.n(this.f68579d, OV.N(this.f68583h));
        }
        return true;
    }

    public MC0(LC0 lc0) {
        this.f68576a = lc0;
        try {
            this.f68588m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f68577b = new long[10];
        this.f68575I = HC.f67408a;
    }

    private final long m() {
        return OV.L(l(), this.f68581f);
    }

    public final void b(long j10) {
        this.f68601z = l();
        this.f68599x = OV.K(this.f68575I.zzb());
        this.f68567A = j10;
    }

    public final void c() {
        n();
        this.f68578c = null;
        this.f68580e = null;
    }

    public final boolean k() {
        n();
        if (this.f68599x == -9223372036854775807L) {
            KC0 kc0 = this.f68580e;
            kc0.getClass();
            kc0.e();
            return true;
        }
        this.f68601z = l();
        return false;
    }
}
