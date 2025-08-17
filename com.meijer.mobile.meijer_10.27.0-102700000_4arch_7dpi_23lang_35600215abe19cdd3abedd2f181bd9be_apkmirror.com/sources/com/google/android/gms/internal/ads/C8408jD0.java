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
public final class C8408jD0 implements IC0 {

    /* renamed from: b0, reason: collision with root package name */
    private static final Object f75368b0 = new Object();

    /* renamed from: c0, reason: collision with root package name */
    private static ScheduledExecutorService f75369c0;

    /* renamed from: d0, reason: collision with root package name */
    private static int f75370d0;

    /* renamed from: A, reason: collision with root package name */
    private long f75371A;

    /* renamed from: B, reason: collision with root package name */
    private long f75372B;

    /* renamed from: C, reason: collision with root package name */
    private long f75373C;

    /* renamed from: D, reason: collision with root package name */
    private int f75374D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f75375E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f75376F;

    /* renamed from: G, reason: collision with root package name */
    private long f75377G;

    /* renamed from: H, reason: collision with root package name */
    private float f75378H;

    /* renamed from: I, reason: collision with root package name */
    private ByteBuffer f75379I;

    /* renamed from: J, reason: collision with root package name */
    private int f75380J;

    /* renamed from: K, reason: collision with root package name */
    private ByteBuffer f75381K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f75382L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f75383M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f75384N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f75385O;

    /* renamed from: P, reason: collision with root package name */
    private int f75386P;

    /* renamed from: Q, reason: collision with root package name */
    private C8287i50 f75387Q;

    /* renamed from: R, reason: collision with root package name */
    private C8834nC0 f75388R;

    /* renamed from: S, reason: collision with root package name */
    private long f75389S;

    /* renamed from: T, reason: collision with root package name */
    private boolean f75390T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f75391U;

    /* renamed from: V, reason: collision with root package name */
    private Looper f75392V;

    /* renamed from: W, reason: collision with root package name */
    private long f75393W;

    /* renamed from: X, reason: collision with root package name */
    private long f75394X;

    /* renamed from: Y, reason: collision with root package name */
    private Handler f75395Y;

    /* renamed from: Z, reason: collision with root package name */
    private final ZC0 f75396Z;

    /* renamed from: a, reason: collision with root package name */
    private final Context f75397a;

    /* renamed from: a0, reason: collision with root package name */
    private final OC0 f75398a0;

    /* renamed from: b, reason: collision with root package name */
    private final NC0 f75399b;

    /* renamed from: c, reason: collision with root package name */
    private final C9477tD0 f75400c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7917eh0 f75401d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC7917eh0 f75402e;

    /* renamed from: f, reason: collision with root package name */
    private final MC0 f75403f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f75404g;

    /* renamed from: h, reason: collision with root package name */
    private C8196hD0 f75405h;

    /* renamed from: i, reason: collision with root package name */
    private final C7769dD0 f75406i;

    /* renamed from: j, reason: collision with root package name */
    private final C7769dD0 f75407j;

    /* renamed from: k, reason: collision with root package name */
    private final VC0 f75408k;

    /* renamed from: l, reason: collision with root package name */
    private C7980fC0 f75409l;

    /* renamed from: m, reason: collision with root package name */
    private HC0 f75410m;

    /* renamed from: n, reason: collision with root package name */
    private YC0 f75411n;

    /* renamed from: o, reason: collision with root package name */
    private YC0 f75412o;

    /* renamed from: p, reason: collision with root package name */
    private C7113Qs f75413p;

    /* renamed from: q, reason: collision with root package name */
    private AudioTrack f75414q;

    /* renamed from: r, reason: collision with root package name */
    private C8194hC0 f75415r;

    /* renamed from: s, reason: collision with root package name */
    private C8727mC0 f75416s;

    /* renamed from: t, reason: collision with root package name */
    private C7662cD0 f75417t;

    /* renamed from: u, reason: collision with root package name */
    private HR f75418u;

    /* renamed from: v, reason: collision with root package name */
    private C7449aD0 f75419v;

    /* renamed from: w, reason: collision with root package name */
    private C7449aD0 f75420w;

    /* renamed from: x, reason: collision with root package name */
    private C7488ag f75421x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f75422y;

    /* renamed from: z, reason: collision with root package name */
    private long f75423z;

    private final void E() {
        if (this.f75412o.f71504c == 1) {
            this.f75390T = true;
        }
    }

    private final void I(C7488ag c7488ag) {
        C7449aD0 c7449aD0 = new C7449aD0(c7488ag, -9223372036854775807L, -9223372036854775807L, null);
        if (N()) {
            this.f75419v = c7449aD0;
        } else {
            this.f75420w = c7449aD0;
        }
    }

    private final boolean N() {
        return this.f75414q != null;
    }

    static /* synthetic */ void w(AudioTrack audioTrack, final HC0 hc0, Handler handler, final GC0 gc0) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (hc0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.RC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((C8836nD0) hc0).f77015a.f77529A0.d(gc0);
                    }
                });
            }
            synchronized (f75368b0) {
                try {
                    int i10 = f75370d0 - 1;
                    f75370d0 = i10;
                    if (i10 == 0) {
                        f75369c0.shutdown();
                        f75369c0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (hc0 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.RC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((C8836nD0) hc0).f77015a.f77529A0.d(gc0);
                    }
                });
            }
            synchronized (f75368b0) {
                try {
                    int i11 = f75370d0 - 1;
                    f75370d0 = i11;
                    if (i11 == 0) {
                        f75369c0.shutdown();
                        f75369c0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void g(C7980fC0 c7980fC0) {
        this.f75409l = c7980fC0;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void m(HC0 hc0) {
        this.f75410m = hc0;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final C7488ag zzc() {
        return this.f75421x;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzg() {
        this.f75375E = true;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzh() throws IllegalStateException {
        this.f75385O = false;
        if (N()) {
            if (this.f75403f.k() || O(this.f75414q)) {
                this.f75414q.pause();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzi() throws IllegalStateException {
        this.f75385O = true;
        if (N()) {
            this.f75403f.f();
            this.f75414q.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long A() {
        YC0 yc0 = this.f75412o;
        if (yc0.f71504c != 0) {
            return this.f75373C;
        }
        long j10 = this.f75372B;
        long j11 = yc0.f71505d;
        int i10 = OV.f69091a;
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
            java.nio.ByteBuffer r8 = r7.f75381K
            if (r8 != 0) goto L6
            goto Lb5
        L6:
            com.google.android.gms.internal.ads.dD0 r8 = r7.f75407j
            boolean r8 = r8.c()
            if (r8 != 0) goto Lb5
            java.nio.ByteBuffer r8 = r7.f75381K
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.f75414q
            java.nio.ByteBuffer r0 = r7.f75381K
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.f75389S = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L6a
            int r8 = com.google.android.gms.internal.ads.OV.f69091a
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
            android.media.AudioTrack r8 = r7.f75414q
            boolean r8 = O(r8)
            if (r8 == 0) goto L4a
            r7.E()
            goto L4b
        L4a:
            r1 = r0
        L4b:
            com.google.android.gms.internal.ads.zzpl r8 = new com.google.android.gms.internal.ads.zzpl
            com.google.android.gms.internal.ads.YC0 r0 = r7.f75412o
            com.google.android.gms.internal.ads.C r0 = r0.f71502a
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.HC0 r9 = r7.f75410m
            if (r9 == 0) goto L5b
            r9.a(r8)
        L5b:
            boolean r9 = r8.f80718b
            if (r9 != 0) goto L65
            com.google.android.gms.internal.ads.dD0 r9 = r7.f75407j
            r9.b(r8)
            return
        L65:
            com.google.android.gms.internal.ads.hC0 r9 = com.google.android.gms.internal.ads.C8194hC0.f74633c
            r7.f75415r = r9
            throw r8
        L6a:
            com.google.android.gms.internal.ads.dD0 r4 = r7.f75407j
            r4.a()
            android.media.AudioTrack r4 = r7.f75414q
            boolean r4 = O(r4)
            if (r4 == 0) goto L8b
            long r4 = r7.f75373C
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7f
            r7.f75391U = r0
        L7f:
            boolean r2 = r7.f75385O
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.HC0 r2 = r7.f75410m
            if (r2 == 0) goto L8b
            if (r9 >= r8) goto L8b
            com.google.android.gms.internal.ads.nD0 r2 = (com.google.android.gms.internal.ads.C8836nD0) r2
        L8b:
            com.google.android.gms.internal.ads.YC0 r2 = r7.f75412o
            int r2 = r2.f71504c
            if (r2 != 0) goto L97
            long r3 = r7.f75372B
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.f75372B = r3
        L97:
            if (r9 != r8) goto Lb5
            if (r2 == 0) goto Lb2
            java.nio.ByteBuffer r8 = r7.f75381K
            java.nio.ByteBuffer r9 = r7.f75379I
            if (r8 != r9) goto La2
            goto La3
        La2:
            r1 = r0
        La3:
            com.google.android.gms.internal.ads.C8086gC.f(r1)
            long r8 = r7.f75373C
            int r0 = r7.f75374D
            long r0 = (long) r0
            int r2 = r7.f75380J
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.f75373C = r8
        Lb2:
            r8 = 0
            r7.f75381K = r8
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8408jD0.D(long):void");
    }

    private final void F() {
        if (this.f75416s != null || this.f75397a == null) {
            return;
        }
        this.f75392V = Looper.myLooper();
        C8727mC0 c8727mC0 = new C8727mC0(this.f75397a, new SC0(this), this.f75418u, this.f75388R);
        this.f75416s = c8727mC0;
        this.f75415r = c8727mC0.c();
    }

    private final void G() throws IllegalStateException {
        if (this.f75383M) {
            return;
        }
        this.f75383M = true;
        this.f75403f.b(A());
        if (O(this.f75414q)) {
            this.f75384N = false;
        }
        this.f75414q.stop();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8408jD0.J(java.nio.ByteBuffer):void");
    }

    private final void L() {
        C7113Qs c7113Qs = this.f75412o.f71510i;
        this.f75413p = c7113Qs;
        c7113Qs.c();
    }

    private final boolean M() throws Exception {
        if (!this.f75413p.h()) {
            D(Long.MIN_VALUE);
            return this.f75381K == null;
        }
        this.f75413p.d();
        H(Long.MIN_VALUE);
        if (!this.f75413p.g()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f75381K;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    private static boolean O(AudioTrack audioTrack) {
        return OV.f69091a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean P() {
        YC0 yc0 = this.f75412o;
        if (yc0.f71504c != 0) {
            return false;
        }
        int i10 = yc0.f71502a.f65643F;
        return true;
    }

    private static final AudioTrack Q(GC0 gc0, HR hr2, int i10, C c10) throws UnsupportedOperationException, zzpi, IllegalArgumentException {
        C c11;
        Exception exc;
        AudioTrack audioTrackBuild;
        try {
            int i11 = OV.f69091a;
            if (i11 >= 23) {
                try {
                    AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(hr2.a().f69186a).setAudioFormat(OV.P(gc0.f67136b, gc0.f67137c, gc0.f67135a)).setTransferMode(1).setBufferSizeInBytes(gc0.f67139e).setSessionId(i10);
                    if (i11 >= 29) {
                        sessionId.setOffloadedPlayback(gc0.f67138d);
                    }
                    audioTrackBuild = sessionId.build();
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    exc = e;
                    c11 = c10;
                    throw new zzpi(0, gc0.f67136b, gc0.f67137c, gc0.f67135a, c11, gc0.f67138d, exc);
                } catch (UnsupportedOperationException e11) {
                    e = e11;
                    exc = e;
                    c11 = c10;
                    throw new zzpi(0, gc0.f67136b, gc0.f67137c, gc0.f67135a, c11, gc0.f67138d, exc);
                }
            } else {
                AudioAttributes audioAttributes = hr2.a().f69186a;
                int i12 = gc0.f67136b;
                int i13 = gc0.f67137c;
                int i14 = gc0.f67135a;
                audioTrackBuild = new AudioTrack(audioAttributes, OV.P(i12, i13, i14), gc0.f67139e, 1, i10);
            }
            int state = audioTrackBuild.getState();
            if (state == 1) {
                return audioTrackBuild;
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new zzpi(state, gc0.f67136b, gc0.f67137c, gc0.f67135a, c10, gc0.f67138d, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e12) {
            c11 = c10;
            exc = e12;
        }
    }

    public static /* synthetic */ void u(C8408jD0 c8408jD0) {
        if (c8408jD0.f75394X >= 300000) {
            ((C8836nD0) c8408jD0.f75410m).f77015a.f77540L0 = true;
            c8408jD0.f75394X = 0L;
        }
    }

    static /* bridge */ /* synthetic */ boolean y() {
        boolean z10;
        synchronized (f75368b0) {
            z10 = f75370d0 > 0;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z() {
        return this.f75412o.f71504c == 0 ? this.f75423z / r0.f71503b : this.f75371A;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void X(float f10) {
        if (this.f75378H != f10) {
            this.f75378H = f10;
            K();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void b(int i10) throws IllegalStateException {
        if (this.f75386P != i10) {
            this.f75386P = i10;
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void d(C7488ag c7488ag) {
        this.f75421x = new C7488ag(Math.max(0.1f, Math.min(c7488ag.f72461a, 8.0f)), Math.max(0.1f, Math.min(c7488ag.f72462b, 8.0f)));
        I(c7488ag);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final C9155qC0 e(C c10) {
        return this.f75390T ? C9155qC0.f77749d : this.f75398a0.a(c10, this.f75418u);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8408jD0.f(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void h(HC hc2) {
        this.f75403f.e(hc2);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void i(C c10, int i10, int[] iArr) throws zzph {
        int i11;
        int iIntValue;
        int iIntValue2;
        int i12;
        int iC;
        C7113Qs c7113Qs;
        int iC2;
        int i13;
        int iMax;
        F();
        if ("audio/raw".equals(c10.f65664o)) {
            C8086gC.d(OV.j(c10.f65643F));
            iC = OV.C(c10.f65643F) * c10.f65641D;
            C7598bh0 c7598bh0 = new C7598bh0();
            c7598bh0.i(this.f75401d);
            c7598bh0.h(this.f75396Z.e());
            C7113Qs c7113Qs2 = new C7113Qs(c7598bh0.j());
            if (c7113Qs2.equals(this.f75413p)) {
                c7113Qs2 = this.f75413p;
            }
            this.f75400c.k(c10.f65644G, c10.f65645H);
            this.f75399b.i(iArr);
            try {
                C9328rt c9328rtA = c7113Qs2.a(new C9328rt(c10.f65642E, c10.f65641D, c10.f65643F));
                iIntValue = c9328rtA.f78082c;
                i11 = c9328rtA.f78080a;
                int i14 = c9328rtA.f78081b;
                iIntValue2 = OV.A(i14);
                c7113Qs = c7113Qs2;
                iC2 = OV.C(iIntValue) * i14;
                i12 = 0;
            } catch (zzcg e10) {
                throw new zzph(e10, c10);
            }
        } else {
            C7113Qs c7113Qs3 = new C7113Qs(AbstractC7917eh0.t());
            i11 = c10.f65642E;
            C9155qC0 c9155qC0 = C9155qC0.f77749d;
            Pair pairB = this.f75415r.b(c10, this.f75418u);
            if (pairB == null) {
                throw new zzph("Unable to configure passthrough for: ".concat(String.valueOf(c10)), c10);
            }
            iIntValue = ((Integer) pairB.first).intValue();
            iIntValue2 = ((Integer) pairB.second).intValue();
            i12 = 2;
            iC = -1;
            c7113Qs = c7113Qs3;
            iC2 = -1;
        }
        if (iIntValue == 0) {
            throw new zzph("Invalid output encoding (mode=" + i12 + ") for: " + String.valueOf(c10), c10);
        }
        if (iIntValue2 == 0) {
            throw new zzph("Invalid output channel config (mode=" + i12 + ") for: " + String.valueOf(c10), c10);
        }
        int i15 = c10.f65659j;
        if ("audio/vnd.dts.hd;profile=lbr".equals(c10.f65664o) && i15 == -1) {
            i15 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i11, iIntValue2, iIntValue);
        C8086gC.f(minBufferSize != -2);
        int i16 = iC2 != -1 ? iC2 : 1;
        int i17 = 250000;
        if (i12 == 0) {
            i13 = i12;
            iMax = Math.max(C8622lD0.a(250000, i11, i16), Math.min(minBufferSize * 4, C8622lD0.a(750000, i11, i16)));
        } else if (i12 != 1) {
            if (iIntValue == 5) {
                i17 = 500000;
            } else if (iIntValue == 8) {
                i17 = 1000000;
                iIntValue = 8;
            }
            i13 = i12;
            iMax = Ii0.b((i17 * (i15 != -1 ? Bi0.b(i15, 8, RoundingMode.CEILING) : C8622lD0.b(iIntValue))) / 1000000);
        } else {
            i13 = i12;
            iMax = Ii0.b((C8622lD0.b(iIntValue) * 50000000) / 1000000);
        }
        this.f75390T = false;
        int i18 = iC;
        YC0 yc0 = new YC0(c10, i18, i13, iC2, i11, iIntValue2, iIntValue, (((Math.max(minBufferSize, iMax) + i16) - 1) / i16) * i16, c7113Qs, false, false, false);
        if (N()) {
            this.f75411n = yc0;
        } else {
            this.f75412o = yc0;
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void k(AudioDeviceInfo audioDeviceInfo) {
        this.f75388R = audioDeviceInfo == null ? null : new C8834nC0(audioDeviceInfo);
        C8727mC0 c8727mC0 = this.f75416s;
        if (c8727mC0 != null) {
            c8727mC0.h(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f75414q;
        if (audioTrack != null) {
            TC0.a(audioTrack, this.f75388R);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void l(C8287i50 c8287i50) {
        if (this.f75387Q.equals(c8287i50)) {
            return;
        }
        if (this.f75414q != null) {
            int i10 = this.f75387Q.f74880a;
        }
        this.f75387Q = c8287i50;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void n(HR hr2) throws IllegalStateException {
        if (this.f75418u.equals(hr2)) {
            return;
        }
        this.f75418u = hr2;
        C8727mC0 c8727mC0 = this.f75416s;
        if (c8727mC0 != null) {
            c8727mC0.g(hr2);
        }
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void o(boolean z10) {
        this.f75422y = z10;
        I(this.f75421x);
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzj() throws IllegalStateException, zzpl {
        if (!this.f75382L && N() && M()) {
            G();
            this.f75382L = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzk() {
        C8727mC0 c8727mC0 = this.f75416s;
        if (c8727mC0 != null) {
            c8727mC0.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzr(int i10, int i11) {
        AudioTrack audioTrack = this.f75414q;
        if (audioTrack != null) {
            O(audioTrack);
        }
    }

    /* synthetic */ C8408jD0(XC0 xc0, C8303iD0 c8303iD0) {
        C8194hC0 c8194hC0C;
        Context context = xc0.f71277a;
        this.f75397a = context;
        HR hr2 = HR.f67433b;
        this.f75418u = hr2;
        C8303iD0 c8303iD02 = null;
        if (context == null) {
            c8194hC0C = xc0.f71278b;
        } else {
            C8194hC0 c8194hC0 = C8194hC0.f74633c;
            int i10 = OV.f69091a;
            c8194hC0C = C8194hC0.c(context, hr2, null);
        }
        this.f75415r = c8194hC0C;
        this.f75396Z = xc0.f71282f;
        int i11 = OV.f69091a;
        OC0 oc0 = xc0.f71283g;
        oc0.getClass();
        this.f75398a0 = oc0;
        this.f75403f = new MC0(new C7875eD0(this, c8303iD02));
        NC0 nc0 = new NC0();
        this.f75399b = nc0;
        C9477tD0 c9477tD0 = new C9477tD0();
        this.f75400c = c9477tD0;
        this.f75401d = AbstractC7917eh0.x(new C9762vw(), nc0, c9477tD0);
        this.f75402e = AbstractC7917eh0.u(new C9370sD0());
        this.f75378H = 1.0f;
        this.f75386P = 0;
        this.f75387Q = new C8287i50(0, 0.0f);
        C7488ag c7488ag = C7488ag.f72460d;
        this.f75420w = new C7449aD0(c7488ag, 0L, 0L, null);
        this.f75421x = c7488ag;
        this.f75422y = false;
        this.f75404g = new ArrayDeque();
        this.f75406i = new C7769dD0();
        this.f75407j = new C7769dD0();
        this.f75408k = xc0.f71281e;
    }

    private final AudioTrack B(YC0 yc0) throws zzpi {
        try {
            return Q(yc0.a(), this.f75418u, this.f75386P, yc0.f71502a);
        } catch (zzpi e10) {
            HC0 hc0 = this.f75410m;
            if (hc0 != null) {
                hc0.a(e10);
            }
            throw e10;
        }
    }

    private final void C(long j10) {
        C7488ag c7488ag;
        boolean z10;
        if (P()) {
            ZC0 zc0 = this.f75396Z;
            c7488ag = this.f75421x;
            zc0.c(c7488ag);
        } else {
            c7488ag = C7488ag.f72460d;
        }
        C7488ag c7488ag2 = c7488ag;
        this.f75421x = c7488ag2;
        if (P()) {
            ZC0 zc02 = this.f75396Z;
            z10 = this.f75422y;
            zc02.d(z10);
        } else {
            z10 = false;
        }
        this.f75422y = z10;
        this.f75404g.add(new C7449aD0(c7488ag2, Math.max(0L, j10), OV.L(A(), this.f75412o.f71506e), null));
        L();
        HC0 hc0 = this.f75410m;
        if (hc0 != null) {
            ((C8836nD0) hc0).f77015a.f77529A0.w(this.f75422y);
        }
    }

    private final void H(long j10) throws Exception {
        D(j10);
        if (this.f75381K == null) {
            if (this.f75413p.h()) {
                while (!this.f75413p.g()) {
                    do {
                        ByteBuffer byteBufferB = this.f75413p.b();
                        if (byteBufferB.hasRemaining()) {
                            J(byteBufferB);
                            D(j10);
                        } else {
                            ByteBuffer byteBuffer = this.f75379I;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.f75413p.e(this.f75379I);
                            } else {
                                return;
                            }
                        }
                    } while (this.f75381K == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.f75379I;
            if (byteBuffer2 != null) {
                J(byteBuffer2);
                D(j10);
            }
        }
    }

    private final void K() {
        if (N()) {
            this.f75414q.setVolume(this.f75378H);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final int a(C c10) {
        F();
        if ("audio/raw".equals(c10.f65664o)) {
            if (!OV.j(c10.f65643F)) {
                C9917xL.f("DefaultAudioSink", "Invalid PCM encoding: " + c10.f65643F);
                return 0;
            }
            if (c10.f65643F == 2) {
                return 2;
            }
            return 1;
        }
        if (this.f75415r.b(c10, this.f75418u) == null) {
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
        if (this.f75382L && !zzy()) {
            return true;
        }
        return false;
    }

    public final void x(C8194hC0 c8194hC0) {
        String name;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f75392V;
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
        if (!c8194hC0.equals(this.f75415r)) {
            this.f75415r = c8194hC0;
            HC0 hc0 = this.f75410m;
            if (hc0 != null) {
                ((C8836nD0) hc0).f77015a.x();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final long zzb(boolean z10) {
        long jI;
        if (N() && !this.f75376F) {
            long jMin = Math.min(this.f75403f.a(z10), OV.L(A(), this.f75412o.f71506e));
            while (!this.f75404g.isEmpty() && jMin >= ((C7449aD0) this.f75404g.getFirst()).f72379c) {
                this.f75420w = (C7449aD0) this.f75404g.remove();
            }
            long j10 = jMin - this.f75420w.f72379c;
            if (this.f75404g.isEmpty()) {
                jI = this.f75420w.f72378b + this.f75396Z.a(j10);
            } else {
                C7449aD0 c7449aD0 = (C7449aD0) this.f75404g.getFirst();
                jI = c7449aD0.f72378b - OV.I(c7449aD0.f72379c - jMin, this.f75420w.f72377a.f72461a);
            }
            long jB = this.f75396Z.b();
            long jL = jI + OV.L(jB, this.f75412o.f71506e);
            long j11 = this.f75393W;
            if (jB > j11) {
                long jL2 = OV.L(jB - j11, this.f75412o.f71506e);
                this.f75393W = jB;
                this.f75394X += jL2;
                if (this.f75395Y == null) {
                    this.f75395Y = new Handler(Looper.myLooper());
                }
                this.f75395Y.removeCallbacksAndMessages(null);
                this.f75395Y.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.QC0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8408jD0.u(this.f69544a);
                    }
                }, 100L);
            }
            return jL;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzf() throws IllegalStateException {
        C7662cD0 c7662cD0;
        if (N()) {
            this.f75423z = 0L;
            this.f75371A = 0L;
            this.f75372B = 0L;
            this.f75373C = 0L;
            this.f75391U = false;
            this.f75374D = 0;
            this.f75420w = new C7449aD0(this.f75421x, 0L, 0L, null);
            this.f75377G = 0L;
            this.f75419v = null;
            this.f75404g.clear();
            this.f75379I = null;
            this.f75380J = 0;
            this.f75381K = null;
            this.f75383M = false;
            this.f75382L = false;
            this.f75384N = false;
            this.f75400c.j();
            L();
            if (this.f75403f.h()) {
                this.f75414q.pause();
            }
            if (O(this.f75414q)) {
                C8196hD0 c8196hD0 = this.f75405h;
                c8196hD0.getClass();
                c8196hD0.b(this.f75414q);
            }
            final GC0 gc0A = this.f75412o.a();
            YC0 yc0 = this.f75411n;
            if (yc0 != null) {
                this.f75412o = yc0;
                this.f75411n = null;
            }
            this.f75403f.c();
            if (OV.f69091a >= 24 && (c7662cD0 = this.f75417t) != null) {
                c7662cD0.b();
                this.f75417t = null;
            }
            final AudioTrack audioTrack = this.f75414q;
            final HC0 hc0 = this.f75410m;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f75368b0) {
                try {
                    if (f75369c0 == null) {
                        final String str = "ExoPlayer:AudioTrackReleaseThread";
                        f75369c0 = Executors.newSingleThreadScheduledExecutor(new ThreadFactory(str) { // from class: com.google.android.gms.internal.ads.nV

                            /* renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ String f77060a = "ExoPlayer:AudioTrackReleaseThread";

                            @Override // java.util.concurrent.ThreadFactory
                            public final Thread newThread(Runnable runnable) {
                                return new Thread(runnable, this.f77060a);
                            }
                        });
                    }
                    f75370d0++;
                    f75369c0.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.PC0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8408jD0.w(audioTrack, hc0, handler, gc0A);
                        }
                    }, 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f75414q = null;
        }
        this.f75407j.a();
        this.f75406i.a();
        this.f75393W = 0L;
        this.f75394X = 0L;
        Handler handler2 = this.f75395Y;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final void zzl() throws IllegalStateException {
        zzf();
        AbstractC7917eh0 abstractC7917eh0 = this.f75401d;
        int size = abstractC7917eh0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC9330ru) abstractC7917eh0.get(i10)).zzf();
        }
        AbstractC7917eh0 abstractC7917eh02 = this.f75402e;
        int size2 = abstractC7917eh02.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((InterfaceC9330ru) abstractC7917eh02.get(i11)).zzf();
        }
        C7113Qs c7113Qs = this.f75413p;
        if (c7113Qs != null) {
            c7113Qs.f();
        }
        this.f75385O = false;
        this.f75390T = false;
    }

    @Override // com.google.android.gms.internal.ads.IC0
    public final boolean zzy() {
        if (N()) {
            if ((OV.f69091a < 29 || !this.f75414q.isOffloadedPlayback() || !this.f75384N) && this.f75403f.g(A())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
