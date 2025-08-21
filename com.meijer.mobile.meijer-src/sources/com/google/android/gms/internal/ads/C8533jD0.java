package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.google.maps.android.BuildConfig;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.jD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8533jD0 implements IC0 {

    /* renamed from: b0, reason: collision with root package name */
    private static final Object f76208b0 = new Object();

    /* renamed from: c0, reason: collision with root package name */
    private static ScheduledExecutorService f76209c0;

    /* renamed from: d0, reason: collision with root package name */
    private static int f76210d0;

    /* renamed from: A, reason: collision with root package name */
    private long f76211A;

    /* renamed from: B, reason: collision with root package name */
    private long f76212B;

    /* renamed from: C, reason: collision with root package name */
    private long f76213C;

    /* renamed from: D, reason: collision with root package name */
    private int f76214D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f76215E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f76216F;

    /* renamed from: G, reason: collision with root package name */
    private long f76217G;

    /* renamed from: H, reason: collision with root package name */
    private float f76218H;

    /* renamed from: I, reason: collision with root package name */
    private ByteBuffer f76219I;

    /* renamed from: J, reason: collision with root package name */
    private int f76220J;

    /* renamed from: K, reason: collision with root package name */
    private ByteBuffer f76221K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f76222L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f76223M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f76224N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f76225O;

    /* renamed from: P, reason: collision with root package name */
    private int f76226P;

    /* renamed from: Q, reason: collision with root package name */
    private C8412i50 f76227Q;

    /* renamed from: R, reason: collision with root package name */
    private C8959nC0 f76228R;

    /* renamed from: S, reason: collision with root package name */
    private long f76229S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f76230T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f76231U;

    /* renamed from: V, reason: collision with root package name */
    private Looper f76232V;

    /* renamed from: W, reason: collision with root package name */
    private long f76233W;

    /* renamed from: X, reason: collision with root package name */
    private long f76234X;

    /* renamed from: Y, reason: collision with root package name */
    private Handler f76235Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ZC0 f76236Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f76237a;

    /* renamed from: a0, reason: collision with root package name */
    private final OC0 f76238a0;

    /* renamed from: b, reason: collision with root package name */
    private final NC0 f76239b;

    /* renamed from: c, reason: collision with root package name */
    private final C9602tD0 f76240c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC8042eh0 f76241d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC8042eh0 f76242e;

    /* renamed from: f, reason: collision with root package name */
    private final MC0 f76243f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f76244g;

    /* renamed from: h, reason: collision with root package name */
    private C8321hD0 f76245h;

    /* renamed from: i, reason: collision with root package name */
    private final C7894dD0 f76246i;

    /* renamed from: j, reason: collision with root package name */
    private final C7894dD0 f76247j;

    /* renamed from: k, reason: collision with root package name */
    private final VC0 f76248k;

    /* renamed from: l, reason: collision with root package name */
    private C8105fC0 f76249l;

    /* renamed from: m, reason: collision with root package name */
    private HC0 f76250m;

    /* renamed from: n, reason: collision with root package name */
    private YC0 f76251n;

    /* renamed from: o, reason: collision with root package name */
    private YC0 f76252o;

    /* renamed from: p, reason: collision with root package name */
    private C7238Qs f76253p;

    /* renamed from: q, reason: collision with root package name */
    private AudioTrack f76254q;

    /* renamed from: r, reason: collision with root package name */
    private C8319hC0 f76255r;

    /* renamed from: s, reason: collision with root package name */
    private C8852mC0 f76256s;

    /* renamed from: t, reason: collision with root package name */
    private C7787cD0 f76257t;

    /* renamed from: u, reason: collision with root package name */
    private HR f76258u;

    /* renamed from: v, reason: collision with root package name */
    private C7574aD0 f76259v;

    /* renamed from: w, reason: collision with root package name */
    private C7574aD0 f76260w;

    /* renamed from: x, reason: collision with root package name */
    private C7613ag f76261x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f76262y;

    /* renamed from: z, reason: collision with root package name */
    private long f76263z;

    private final void E() {
        if (this.f76252o.f72344c == 1) {
            this.f76230T = true;
        }
    }

    private final void I(C7613ag c7613ag) {
        C7574aD0 c7574aD0 = new C7574aD0(c7613ag, -9223372036854775807L, -9223372036854775807L, null);
        if (N()) {
            this.f76259v = c7574aD0;
        } else {
            this.f76260w = c7574aD0;
        }
    }

    private final boolean N() {
        return this.f76254q != null;
    }

    static /* synthetic */ void w(AudioTrack audioTrack, final HC0 hc0, Handler handler, final GC0 gc0) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (hc0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.RC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((C8961nD0) hc0).f77855a.f78369A0.d(gc0);
                    }
                });
            }
            synchronized (f76208b0) {
                try {
                    int i10 = f76210d0 - 1;
                    f76210d0 = i10;
                    if (i10 == 0) {
                        f76209c0.shutdown();
                        f76209c0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (hc0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.RC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((C8961nD0) hc0).f77855a.f78369A0.d(gc0);
                    }
                });
            }
            synchronized (f76208b0) {
                try {
                    int i11 = f76210d0 - 1;
                    f76210d0 = i11;
                    if (i11 == 0) {
                        f76209c0.shutdown();
                        f76209c0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void g(C8105fC0 c8105fC0) {
        this.f76249l = c8105fC0;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void m(HC0 hc0) {
        this.f76250m = hc0;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final C7613ag zzc() {
        return this.f76261x;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzg() {
        this.f76215E = true;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzh() throws IllegalStateException {
        this.f76225O = false;
        if (N()) {
            if (this.f76243f.k() || O(this.f76254q)) {
                this.f76254q.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzi() throws IllegalStateException {
        this.f76225O = true;
        if (N()) {
            this.f76243f.f();
            this.f76254q.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A() {
        YC0 yc0 = this.f76252o;
        if (yc0.f72344c != 0) {
            return this.f76213C;
        }
        long j10 = this.f76212B;
        long j11 = yc0.f72345d;
        int i10 = OV.f69931a;
        return ((j10 + j11) - 1) / j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void D(long r8) throws java.lang.Exception {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.f76221K
            if (r8 != 0) goto L6
            goto Lb5
        L6:
            com.google.android.gms.internal.ads.dD0 r8 = r7.f76247j
            boolean r8 = r8.c()
            if (r8 != 0) goto Lb5
            java.nio.ByteBuffer r8 = r7.f76221K
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.f76254q
            java.nio.ByteBuffer r0 = r7.f76221K
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.f76229S = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L6a
            int r8 = com.google.android.gms.internal.ads.OV.f69931a
            r4 = 24
            if (r8 < r4) goto L31
            r8 = -6
            if (r9 == r8) goto L35
        L31:
            r8 = -32
            if (r9 != r8) goto L4a
        L35:
            long r4 = r7.A()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L3e
            goto L4b
        L3e:
            android.media.AudioTrack r8 = r7.f76254q
            boolean r8 = O(r8)
            if (r8 == 0) goto L4a
            r7.E()
            goto L4b
        L4a:
            r1 = r0
        L4b:
            com.google.android.gms.internal.ads.zzpl r8 = new com.google.android.gms.internal.ads.zzpl
            com.google.android.gms.internal.ads.YC0 r0 = r7.f76252o
            com.google.android.gms.internal.ads.C r0 = r0.f72342a
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.HC0 r9 = r7.f76250m
            if (r9 == 0) goto L5b
            r9.a(r8)
        L5b:
            boolean r9 = r8.f81558b
            if (r9 != 0) goto L65
            com.google.android.gms.internal.ads.dD0 r9 = r7.f76247j
            r9.b(r8)
            return
        L65:
            com.google.android.gms.internal.ads.hC0 r9 = com.google.android.gms.internal.ads.C8319hC0.f75473c
            r7.f76255r = r9
            throw r8
        L6a:
            com.google.android.gms.internal.ads.dD0 r4 = r7.f76247j
            r4.a()
            android.media.AudioTrack r4 = r7.f76254q
            boolean r4 = O(r4)
            if (r4 == 0) goto L8b
            long r4 = r7.f76213C
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r7.f76231U = r0
        L7f:
            boolean r2 = r7.f76225O
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.HC0 r2 = r7.f76250m
            if (r2 == 0) goto L8b
            if (r9 >= r8) goto L8b
            com.google.android.gms.internal.ads.nD0 r2 = (com.google.android.gms.internal.ads.C8961nD0) r2
        L8b:
            com.google.android.gms.internal.ads.YC0 r2 = r7.f76252o
            int r2 = r2.f72344c
            if (r2 != 0) goto L97
            long r3 = r7.f76212B
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.f76212B = r3
        L97:
            if (r9 != r8) goto Lb5
            if (r2 == 0) goto Lb2
            java.nio.ByteBuffer r8 = r7.f76221K
            java.nio.ByteBuffer r9 = r7.f76219I
            if (r8 != r9) goto La2
            goto La3
        La2:
            r1 = r0
        La3:
            com.google.android.gms.internal.ads.C8211gC.f(r1)
            long r8 = r7.f76213C
            int r0 = r7.f76214D
            long r0 = (long) r0
            int r2 = r7.f76220J
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.f76213C = r8
        Lb2:
            r8 = 0
            r7.f76221K = r8
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8533jD0.D(long):void");
    }

    private final void F() {
        if (this.f76256s != null || this.f76237a == null) {
            return;
        }
        this.f76232V = Looper.myLooper();
        C8852mC0 c8852mC0 = new C8852mC0(this.f76237a, new SC0(this), this.f76258u, this.f76228R);
        this.f76256s = c8852mC0;
        this.f76255r = c8852mC0.c();
    }

    private final void G() throws IllegalStateException {
        if (this.f76223M) {
            return;
        }
        this.f76223M = true;
        this.f76243f.b(A());
        if (O(this.f76254q)) {
            this.f76224N = false;
        }
        this.f76254q.stop();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8533jD0.J(java.nio.ByteBuffer):void");
    }

    private final void L() {
        C7238Qs c7238Qs = this.f76252o.f72350i;
        this.f76253p = c7238Qs;
        c7238Qs.c();
    }

    private final boolean M() throws Exception {
        if (!this.f76253p.h()) {
            D(Long.MIN_VALUE);
            return this.f76221K == null;
        }
        this.f76253p.d();
        H(Long.MIN_VALUE);
        if (!this.f76253p.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f76221K;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static boolean O(AudioTrack audioTrack) {
        return OV.f69931a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean P() {
        YC0 yc0 = this.f76252o;
        if (yc0.f72344c != 0) {
            return false;
        }
        int i10 = yc0.f72342a.f66483F;
        return true;
    }

    private static final AudioTrack Q(GC0 gc0, HR hr2, int i10, C c10) throws UnsupportedOperationException, zzpi, IllegalArgumentException {
        C c11;
        Exception exc;
        AudioTrack audioTrackBuild;
        try {
            int i11 = OV.f69931a;
            if (i11 >= 23) {
                try {
                    AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(hr2.a().f70026a).setAudioFormat(OV.P(gc0.f67976b, gc0.f67977c, gc0.f67975a)).setTransferMode(1).setBufferSizeInBytes(gc0.f67979e).setSessionId(i10);
                    if (i11 >= 29) {
                        sessionId.setOffloadedPlayback(gc0.f67978d);
                    }
                    audioTrackBuild = sessionId.build();
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    exc = e;
                    c11 = c10;
                    throw new zzpi(0, gc0.f67976b, gc0.f67977c, gc0.f67975a, c11, gc0.f67978d, exc);
                } catch (UnsupportedOperationException e11) {
                    e = e11;
                    exc = e;
                    c11 = c10;
                    throw new zzpi(0, gc0.f67976b, gc0.f67977c, gc0.f67975a, c11, gc0.f67978d, exc);
                }
            } else {
                AudioAttributes audioAttributes = hr2.a().f70026a;
                int i12 = gc0.f67976b;
                int i13 = gc0.f67977c;
                int i14 = gc0.f67975a;
                audioTrackBuild = new AudioTrack(audioAttributes, OV.P(i12, i13, i14), gc0.f67979e, 1, i10);
            }
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzpi(state, gc0.f67976b, gc0.f67977c, gc0.f67975a, c10, gc0.f67978d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e12) {
            c11 = c10;
            exc = e12;
        }
    }

    public static /* synthetic */ void u(C8533jD0 c8533jD0) {
        if (c8533jD0.f76234X >= 300000) {
            ((C8961nD0) c8533jD0.f76250m).f77855a.f78380L0 = true;
            c8533jD0.f76234X = 0L;
        }
    }

    static /* bridge */ /* synthetic */ boolean y() {
        boolean z10;
        synchronized (f76208b0) {
            z10 = f76210d0 > 0;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z() {
        return this.f76252o.f72344c == 0 ? this.f76263z / r0.f72343b : this.f76211A;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void Y(float f10) {
        if (this.f76218H != f10) {
            this.f76218H = f10;
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void b(int i10) throws IllegalStateException {
        if (this.f76226P != i10) {
            this.f76226P = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void d(C7613ag c7613ag) {
        this.f76261x = new C7613ag(Math.max(0.1f, Math.min(c7613ag.f73301a, 8.0f)), Math.max(0.1f, Math.min(c7613ag.f73302b, 8.0f)));
        I(c7613ag);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final C9280qC0 e(C c10) {
        return this.f76230T ? C9280qC0.f78589d : this.f76238a0.a(c10, this.f76258u);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0274  */
    @Override // com.google.android.gms.internal.ads.IC0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.nio.ByteBuffer r31, long r32, int r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8533jD0.f(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void h(HC hc2) {
        this.f76243f.e(hc2);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void i(C c10, int i10, int[] iArr) throws zzph {
        int i11;
        int iIntValue;
        int iIntValue2;
        int i12;
        int iC;
        C7238Qs c7238Qs;
        int iC2;
        int i13;
        int iMax;
        F();
        if ("audio/raw".equals(c10.f66504o)) {
            C8211gC.d(OV.j(c10.f66483F));
            iC = OV.C(c10.f66483F) * c10.f66481D;
            C7723bh0 c7723bh0 = new C7723bh0();
            c7723bh0.i(this.f76241d);
            c7723bh0.h(this.f76236Z.e());
            C7238Qs c7238Qs2 = new C7238Qs(c7723bh0.j());
            if (c7238Qs2.equals(this.f76253p)) {
                c7238Qs2 = this.f76253p;
            }
            this.f76240c.k(c10.f66484G, c10.f66485H);
            this.f76239b.i(iArr);
            try {
                C9453rt c9453rtA = c7238Qs2.a(new C9453rt(c10.f66482E, c10.f66481D, c10.f66483F));
                iIntValue = c9453rtA.f78922c;
                i11 = c9453rtA.f78920a;
                int i14 = c9453rtA.f78921b;
                iIntValue2 = OV.A(i14);
                c7238Qs = c7238Qs2;
                iC2 = OV.C(iIntValue) * i14;
                i12 = 0;
            } catch (zzcg e10) {
                throw new zzph(e10, c10);
            }
        } else {
            C7238Qs c7238Qs3 = new C7238Qs(AbstractC8042eh0.t());
            i11 = c10.f66482E;
            C9280qC0 c9280qC0 = C9280qC0.f78589d;
            Pair pairB = this.f76255r.b(c10, this.f76258u);
            if (pairB == null) {
                throw new zzph("Unable to configure passthrough for: ".concat(String.valueOf(c10)), c10);
            }
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            i12 = 2;
            iC = -1;
            c7238Qs = c7238Qs3;
            iC2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzph("Invalid output encoding (mode=" + i12 + ") for: " + String.valueOf(c10), c10);
        }
        if (iIntValue2 == 0) {
            throw new zzph("Invalid output channel config (mode=" + i12 + ") for: " + String.valueOf(c10), c10);
        }
        int i15 = c10.f66499j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c10.f66504o) && i15 == -1) {
            i15 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue2, iIntValue);
        C8211gC.f(minBufferSize != -2);
        int i16 = iC2 != -1 ? iC2 : 1;
        int i17 = 250000;
        if (i12 == 0) {
            i13 = i12;
            iMax = Math.max(C8747lD0.a(250000, i11, i16), Math.min(minBufferSize * 4, C8747lD0.a(750000, i11, i16)));
        } else if (i12 != 1) {
            if (iIntValue == 5) {
                i17 = 500000;
            } else if (iIntValue == 8) {
                i17 = 1000000;
                iIntValue = 8;
            }
            i13 = i12;
            iMax = Ii0.b((i17 * (i15 != -1 ? Bi0.b(i15, 8, RoundingMode.CEILING) : C8747lD0.b(iIntValue))) / 1000000);
        } else {
            i13 = i12;
            iMax = Ii0.b((C8747lD0.b(iIntValue) * 50000000) / 1000000);
        }
        this.f76230T = false;
        int i18 = iC;
        YC0 yc0 = new YC0(c10, i18, i13, iC2, i11, iIntValue2, iIntValue, (((Math.max(minBufferSize, iMax) + i16) - 1) / i16) * i16, c7238Qs, false, false, false);
        if (N()) {
            this.f76251n = yc0;
        } else {
            this.f76252o = yc0;
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void k(AudioDeviceInfo audioDeviceInfo) {
        this.f76228R = audioDeviceInfo == null ? null : new C8959nC0(audioDeviceInfo);
        C8852mC0 c8852mC0 = this.f76256s;
        if (c8852mC0 != null) {
            c8852mC0.h(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f76254q;
        if (audioTrack != null) {
            TC0.a(audioTrack, this.f76228R);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void l(C8412i50 c8412i50) {
        if (this.f76227Q.equals(c8412i50)) {
            return;
        }
        if (this.f76254q != null) {
            int i10 = this.f76227Q.f75720a;
        }
        this.f76227Q = c8412i50;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void n(HR hr2) throws IllegalStateException {
        if (this.f76258u.equals(hr2)) {
            return;
        }
        this.f76258u = hr2;
        C8852mC0 c8852mC0 = this.f76256s;
        if (c8852mC0 != null) {
            c8852mC0.g(hr2);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void o(boolean z10) {
        this.f76262y = z10;
        I(this.f76261x);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzj() throws IllegalStateException, zzpl {
        if (!this.f76222L && N() && M()) {
            G();
            this.f76222L = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzk() {
        C8852mC0 c8852mC0 = this.f76256s;
        if (c8852mC0 != null) {
            c8852mC0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzr(int i10, int i11) {
        AudioTrack audioTrack = this.f76254q;
        if (audioTrack != null) {
            O(audioTrack);
        }
    }

    /* synthetic */ C8533jD0(XC0 xc0, C8428iD0 c8428iD0) {
        C8319hC0 c8319hC0C;
        Context context = xc0.f72117a;
        this.f76237a = context;
        HR hr2 = HR.f68273b;
        this.f76258u = hr2;
        C8428iD0 c8428iD02 = null;
        if (context == null) {
            c8319hC0C = xc0.f72118b;
        } else {
            C8319hC0 c8319hC0 = C8319hC0.f75473c;
            int i10 = OV.f69931a;
            c8319hC0C = C8319hC0.c(context, hr2, null);
        }
        this.f76255r = c8319hC0C;
        this.f76236Z = xc0.f72122f;
        int i11 = OV.f69931a;
        OC0 oc0 = xc0.f72123g;
        oc0.getClass();
        this.f76238a0 = oc0;
        this.f76243f = new MC0(new C8000eD0(this, c8428iD02));
        NC0 nc0 = new NC0();
        this.f76239b = nc0;
        C9602tD0 c9602tD0 = new C9602tD0();
        this.f76240c = c9602tD0;
        this.f76241d = AbstractC8042eh0.x(new C9887vw(), nc0, c9602tD0);
        this.f76242e = AbstractC8042eh0.u(new C9495sD0());
        this.f76218H = 1.0f;
        this.f76226P = 0;
        this.f76227Q = new C8412i50(0, 0.0f);
        C7613ag c7613ag = C7613ag.f73300d;
        this.f76260w = new C7574aD0(c7613ag, 0L, 0L, null);
        this.f76261x = c7613ag;
        this.f76262y = false;
        this.f76244g = new ArrayDeque();
        this.f76246i = new C7894dD0();
        this.f76247j = new C7894dD0();
        this.f76248k = xc0.f72121e;
    }

    private final AudioTrack B(YC0 yc0) throws zzpi {
        try {
            return Q(yc0.a(), this.f76258u, this.f76226P, yc0.f72342a);
        } catch (zzpi e10) {
            HC0 hc0 = this.f76250m;
            if (hc0 != null) {
                hc0.a(e10);
            }
            throw e10;
        }
    }

    private final void C(long j10) {
        C7613ag c7613ag;
        boolean z10;
        if (P()) {
            ZC0 zc0 = this.f76236Z;
            c7613ag = this.f76261x;
            zc0.c(c7613ag);
        } else {
            c7613ag = C7613ag.f73300d;
        }
        C7613ag c7613ag2 = c7613ag;
        this.f76261x = c7613ag2;
        if (P()) {
            ZC0 zc02 = this.f76236Z;
            z10 = this.f76262y;
            zc02.d(z10);
        } else {
            z10 = false;
        }
        this.f76262y = z10;
        this.f76244g.add(new C7574aD0(c7613ag2, Math.max(0L, j10), OV.L(A(), this.f76252o.f72346e), null));
        L();
        HC0 hc0 = this.f76250m;
        if (hc0 != null) {
            ((C8961nD0) hc0).f77855a.f78369A0.w(this.f76262y);
        }
    }

    private final void H(long j10) throws Exception {
        D(j10);
        if (this.f76221K == null) {
            if (this.f76253p.h()) {
                while (!this.f76253p.g()) {
                    do {
                        ByteBuffer byteBufferB = this.f76253p.b();
                        if (byteBufferB.hasRemaining()) {
                            J(byteBufferB);
                            D(j10);
                        } else {
                            ByteBuffer byteBuffer = this.f76219I;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.f76253p.e(this.f76219I);
                            } else {
                                return;
                            }
                        }
                    } while (this.f76221K == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.f76219I;
            if (byteBuffer2 != null) {
                J(byteBuffer2);
                D(j10);
            }
        }
    }

    private final void K() {
        if (N()) {
            this.f76254q.setVolume(this.f76218H);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final int a(C c10) {
        F();
        if ("audio/raw".equals(c10.f66504o)) {
            if (!OV.j(c10.f66483F)) {
                C10042xL.f("DefaultAudioSink", "Invalid PCM encoding: " + c10.f66483F);
                return 0;
            }
            if (c10.f66483F == 2) {
                return 2;
            }
            return 1;
        }
        if (this.f76255r.b(c10, this.f76258u) == null) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final boolean c(C c10) {
        if (a(c10) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final boolean j() {
        if (!N()) {
            return true;
        }
        if (this.f76222L && !zzy()) {
            return true;
        }
        return false;
    }

    public final void x(C8319hC0 c8319hC0) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f76232V;
        if (looper != looperMyLooper) {
            String name2 = BuildConfig.TRAVIS;
            if (looper == null) {
                name = BuildConfig.TRAVIS;
            } else {
                name = looper.getThread().getName();
            }
            if (looperMyLooper != null) {
                name2 = looperMyLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + name2 + ") is not the playback looper (" + name + ")");
        }
        if (!c8319hC0.equals(this.f76255r)) {
            this.f76255r = c8319hC0;
            HC0 hc0 = this.f76250m;
            if (hc0 != null) {
                ((C8961nD0) hc0).f77855a.x();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final long zzb(boolean z10) {
        long jI;
        if (N() && !this.f76216F) {
            long jMin = Math.min(this.f76243f.a(z10), OV.L(A(), this.f76252o.f72346e));
            while (!this.f76244g.isEmpty() && jMin >= ((C7574aD0) this.f76244g.getFirst()).f73219c) {
                this.f76260w = (C7574aD0) this.f76244g.remove();
            }
            long j10 = jMin - this.f76260w.f73219c;
            if (this.f76244g.isEmpty()) {
                jI = this.f76260w.f73218b + this.f76236Z.a(j10);
            } else {
                C7574aD0 c7574aD0 = (C7574aD0) this.f76244g.getFirst();
                jI = c7574aD0.f73218b - OV.I(c7574aD0.f73219c - jMin, this.f76260w.f73217a.f73301a);
            }
            long jB = this.f76236Z.b();
            long jL = jI + OV.L(jB, this.f76252o.f72346e);
            long j11 = this.f76233W;
            if (jB > j11) {
                long jL2 = OV.L(jB - j11, this.f76252o.f72346e);
                this.f76233W = jB;
                this.f76234X += jL2;
                if (this.f76235Y == null) {
                    this.f76235Y = new Handler(Looper.myLooper());
                }
                this.f76235Y.removeCallbacksAndMessages(null);
                this.f76235Y.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.QC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8533jD0.u(this.f70384a);
                    }
                }, 100L);
            }
            return jL;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzf() throws IllegalStateException {
        C7787cD0 c7787cD0;
        if (N()) {
            this.f76263z = 0L;
            this.f76211A = 0L;
            this.f76212B = 0L;
            this.f76213C = 0L;
            this.f76231U = false;
            this.f76214D = 0;
            this.f76260w = new C7574aD0(this.f76261x, 0L, 0L, null);
            this.f76217G = 0L;
            this.f76259v = null;
            this.f76244g.clear();
            this.f76219I = null;
            this.f76220J = 0;
            this.f76221K = null;
            this.f76223M = false;
            this.f76222L = false;
            this.f76224N = false;
            this.f76240c.j();
            L();
            if (this.f76243f.h()) {
                this.f76254q.pause();
            }
            if (O(this.f76254q)) {
                C8321hD0 c8321hD0 = this.f76245h;
                c8321hD0.getClass();
                c8321hD0.b(this.f76254q);
            }
            final GC0 gc0A = this.f76252o.a();
            YC0 yc0 = this.f76251n;
            if (yc0 != null) {
                this.f76252o = yc0;
                this.f76251n = null;
            }
            this.f76243f.c();
            if (OV.f69931a >= 24 && (c7787cD0 = this.f76257t) != null) {
                c7787cD0.b();
                this.f76257t = null;
            }
            final AudioTrack audioTrack = this.f76254q;
            final HC0 hc0 = this.f76250m;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f76208b0) {
                try {
                    if (f76209c0 == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        f76209c0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.nV

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f77900a = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.f77900a);
                            }
                        });
                    }
                    f76210d0++;
                    f76209c0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.PC0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8533jD0.w(audioTrack, hc0, handler, gc0A);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f76254q = null;
        }
        this.f76247j.a();
        this.f76246i.a();
        this.f76233W = 0L;
        this.f76234X = 0L;
        Handler handler2 = this.f76235Y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzl() throws IllegalStateException {
        zzf();
        AbstractC8042eh0 abstractC8042eh0 = this.f76241d;
        int size = abstractC8042eh0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC9455ru) abstractC8042eh0.get(i10)).zzf();
        }
        AbstractC8042eh0 abstractC8042eh02 = this.f76242e;
        int size2 = abstractC8042eh02.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((InterfaceC9455ru) abstractC8042eh02.get(i11)).zzf();
        }
        C7238Qs c7238Qs = this.f76253p;
        if (c7238Qs != null) {
            c7238Qs.f();
        }
        this.f76225O = false;
        this.f76230T = false;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final boolean zzy() {
        if (N()) {
            if ((OV.f69931a < 29 || !this.f76254q.isOffloadedPlayback() || !this.f76224N) && this.f76243f.g(A())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
