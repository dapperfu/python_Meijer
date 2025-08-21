package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class Z2 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f72802a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f72803b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f72804c;

    /* renamed from: d, reason: collision with root package name */
    private final H0 f72805d;

    /* renamed from: e, reason: collision with root package name */
    private final X0 f72806e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9575t0 f72807f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f72808g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f72809h;

    /* renamed from: i, reason: collision with root package name */
    private int f72810i;

    /* renamed from: j, reason: collision with root package name */
    private C8776lb f72811j;

    /* renamed from: k, reason: collision with root package name */
    private long f72812k;

    /* renamed from: l, reason: collision with root package name */
    private long f72813l;

    /* renamed from: m, reason: collision with root package name */
    private long f72814m;

    /* renamed from: n, reason: collision with root package name */
    private long f72815n;

    /* renamed from: o, reason: collision with root package name */
    private int f72816o;

    /* renamed from: p, reason: collision with root package name */
    private InterfaceC7660b3 f72817p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f72818q;

    public Z2() {
        throw null;
    }

    private static boolean i(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        this.f72810i = 0;
        this.f72812k = -9223372036854775807L;
        this.f72813l = 0L;
        this.f72816o = 0;
        if (this.f72817p instanceof X2) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        return k(interfaceC9361r0, true);
    }

    public final void e() {
        this.f72818q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    public Z2(int i10) {
        this.f72802a = new GQ(10);
        this.f72803b = new J0();
        this.f72804c = new F0();
        this.f72812k = -9223372036854775807L;
        this.f72805d = new H0();
        C8720l0 c8720l0 = new C8720l0();
        this.f72806e = c8720l0;
        this.f72809h = c8720l0;
        this.f72815n = -1L;
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
    private final int f(com.google.android.gms.internal.ads.InterfaceC9361r0 r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Z2.f(com.google.android.gms.internal.ads.r0):int");
    }

    private final long g(long j10) {
        return this.f72812k + ((j10 * 1000000) / this.f72803b.f68583d);
    }

    private final void h() {
        InterfaceC7660b3 interfaceC7660b3 = this.f72817p;
        if ((interfaceC7660b3 instanceof W2) && interfaceC7660b3.zzh()) {
            long j10 = this.f72815n;
            if (j10 == -1 || j10 == this.f72817p.zzd()) {
                return;
            }
            this.f72817p = ((W2) this.f72817p).c(this.f72815n);
            InterfaceC9575t0 interfaceC9575t0 = this.f72807f;
            interfaceC9575t0.getClass();
            interfaceC9575t0.m(this.f72817p);
        }
    }

    private final boolean j(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        InterfaceC7660b3 interfaceC7660b3 = this.f72817p;
        if (interfaceC7660b3 != null) {
            long jZzd = interfaceC7660b3.zzd();
            if (jZzd != -1 && interfaceC9361r0.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !interfaceC9361r0.c(this.f72802a.n(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws Throwable {
        C8211gC.b(this.f72808g);
        int i10 = OV.f69931a;
        int iF = f(interfaceC9361r0);
        if (iF == -1 && (this.f72817p instanceof X2)) {
            if (this.f72817p.zza() != g(this.f72813l)) {
                throw null;
            }
        }
        return iF;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f72807f = interfaceC9575t0;
        X0 x0A = interfaceC9575t0.a(0, 1);
        this.f72808g = x0A;
        this.f72809h = x0A;
        this.f72807f.e();
    }

    private final boolean k(InterfaceC9361r0 interfaceC9361r0, boolean z10) throws IOException {
        int iZze;
        int i10;
        int iB;
        int i11;
        interfaceC9361r0.zzj();
        if (interfaceC9361r0.zzf() == 0) {
            C8776lb c8776lbA = this.f72805d.a(interfaceC9361r0, null);
            this.f72811j = c8776lbA;
            if (c8776lbA != null) {
                this.f72804c.b(c8776lbA);
            }
            iZze = (int) interfaceC9361r0.zze();
            if (!z10) {
                interfaceC9361r0.e(iZze);
            }
            i10 = 0;
        } else {
            iZze = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (j(interfaceC9361r0)) {
                if (i12 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                this.f72802a.l(0);
                int iW = this.f72802a.w();
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
                        interfaceC9361r0.zzj();
                        interfaceC9361r0.zzg(iZze + i14);
                    } else {
                        interfaceC9361r0.e(1);
                    }
                    i10 = 0;
                    i13 = i14;
                    i12 = 0;
                } else {
                    i12++;
                    if (i12 == 1) {
                        this.f72803b.a(iW);
                        i10 = iW;
                    } else if (i12 == 4) {
                        break;
                    }
                    interfaceC9361r0.zzg(iB - 4);
                }
            }
        }
        if (z10) {
            interfaceC9361r0.e(iZze + i13);
        } else {
            interfaceC9361r0.zzj();
        }
        this.f72810i = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
