package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class Z2 implements InterfaceC9130q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f71962a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f71963b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f71964c;

    /* renamed from: d, reason: collision with root package name */
    private final H0 f71965d;

    /* renamed from: e, reason: collision with root package name */
    private final X0 f71966e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9450t0 f71967f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f71968g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f71969h;

    /* renamed from: i, reason: collision with root package name */
    private int f71970i;

    /* renamed from: j, reason: collision with root package name */
    private C8651lb f71971j;

    /* renamed from: k, reason: collision with root package name */
    private long f71972k;

    /* renamed from: l, reason: collision with root package name */
    private long f71973l;

    /* renamed from: m, reason: collision with root package name */
    private long f71974m;

    /* renamed from: n, reason: collision with root package name */
    private long f71975n;

    /* renamed from: o, reason: collision with root package name */
    private int f71976o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC7535b3 f71977p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f71978q;

    public Z2() {
        throw null;
    }

    private static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void a(long j10, long j11) {
        this.f71970i = 0;
        this.f71972k = -9223372036854775807L;
        this.f71973l = 0L;
        this.f71976o = 0;
        if (this.f71977p instanceof X2) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final boolean c(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        return k(interfaceC9236r0, true);
    }

    public final void e() {
        this.f71978q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ InterfaceC9130q0 zzc() {
        return this;
    }

    public Z2(int i10) {
        this.f71962a = new GQ(10);
        this.f71963b = new J0();
        this.f71964c = new F0();
        this.f71972k = -9223372036854775807L;
        this.f71965d = new H0();
        C8595l0 c8595l0 = new C8595l0();
        this.f71966e = c8595l0;
        this.f71969h = c8595l0;
        this.f71975n = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024e  */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [com.google.android.gms.internal.ads.Q0] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int f(com.google.android.gms.internal.ads.InterfaceC9236r0 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z2.f(com.google.android.gms.internal.ads.r0):int");
    }

    private final long g(long j10) {
        return this.f71972k + ((j10 * 1000000) / this.f71963b.f67743d);
    }

    private final void h() {
        InterfaceC7535b3 interfaceC7535b3 = this.f71977p;
        if ((interfaceC7535b3 instanceof W2) && interfaceC7535b3.zzh()) {
            long j10 = this.f71975n;
            if (j10 == -1 || j10 == this.f71977p.zzd()) {
                return;
            }
            this.f71977p = ((W2) this.f71977p).c(this.f71975n);
            InterfaceC9450t0 interfaceC9450t0 = this.f71967f;
            interfaceC9450t0.getClass();
            interfaceC9450t0.m(this.f71977p);
        }
    }

    private final boolean j(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        InterfaceC7535b3 interfaceC7535b3 = this.f71977p;
        if (interfaceC7535b3 != null) {
            long jZzd = interfaceC7535b3.zzd();
            if (jZzd != -1 && interfaceC9236r0.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !interfaceC9236r0.c(this.f71962a.n(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final int b(InterfaceC9236r0 interfaceC9236r0, N0 n02) throws Throwable {
        C8086gC.b(this.f71968g);
        int i10 = OV.f69091a;
        int iF = f(interfaceC9236r0);
        if (iF == -1 && (this.f71977p instanceof X2)) {
            if (this.f71977p.zza() != g(this.f71973l)) {
                throw null;
            }
        }
        return iF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final void d(InterfaceC9450t0 interfaceC9450t0) {
        this.f71967f = interfaceC9450t0;
        X0 x0A = interfaceC9450t0.a(0, 1);
        this.f71968g = x0A;
        this.f71969h = x0A;
        this.f71967f.e();
    }

    private final boolean k(InterfaceC9236r0 interfaceC9236r0, boolean z10) throws IOException {
        int iZze;
        int i10;
        int iB;
        int i11;
        interfaceC9236r0.zzj();
        if (interfaceC9236r0.zzf() == 0) {
            C8651lb c8651lbA = this.f71965d.a(interfaceC9236r0, null);
            this.f71971j = c8651lbA;
            if (c8651lbA != null) {
                this.f71964c.b(c8651lbA);
            }
            iZze = (int) interfaceC9236r0.zze();
            if (!z10) {
                interfaceC9236r0.e(iZze);
            }
            i10 = 0;
        } else {
            iZze = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (j(interfaceC9236r0)) {
                if (i12 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                this.f71962a.l(0);
                int iW = this.f71962a.w();
                if ((i10 != 0 && !i(iW, i10)) || (iB = K0.b(iW)) == -1) {
                    if (true != z10) {
                        i11 = 131072;
                    } else {
                        i11 = 32768;
                    }
                    int i14 = i13 + 1;
                    if (i13 == i11) {
                        if (z10) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z10) {
                        interfaceC9236r0.zzj();
                        interfaceC9236r0.zzg(iZze + i14);
                    } else {
                        interfaceC9236r0.e(1);
                    }
                    i10 = 0;
                    i13 = i14;
                    i12 = 0;
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.f71963b.a(iW);
                        i10 = iW;
                    } else if (i12 == 4) {
                        break;
                    }
                    interfaceC9236r0.zzg(iB - 4);
                }
            }
        }
        if (z10) {
            interfaceC9236r0.e(iZze + i13);
        } else {
            interfaceC9236r0.zzj();
        }
        this.f71970i = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9130q0
    public final /* synthetic */ List zzd() {
        return AbstractC7917eh0.t();
    }
}
