package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.pD0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9050pD0 extends AbstractC8198hE0 implements InterfaceC7976fA0 {

    /* renamed from: A0, reason: collision with root package name */
    private final EC0 f77529A0;

    /* renamed from: B0, reason: collision with root package name */
    private final IC0 f77530B0;

    /* renamed from: C0, reason: collision with root package name */
    private final UD0 f77531C0;

    /* renamed from: D0, reason: collision with root package name */
    private int f77532D0;

    /* renamed from: E0, reason: collision with root package name */
    private boolean f77533E0;

    /* renamed from: F0, reason: collision with root package name */
    private boolean f77534F0;

    /* renamed from: G0, reason: collision with root package name */
    private C f77535G0;

    /* renamed from: H0, reason: collision with root package name */
    private C f77536H0;

    /* renamed from: I0, reason: collision with root package name */
    private long f77537I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f77538J0;

    /* renamed from: K0, reason: collision with root package name */
    private boolean f77539K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f77540L0;

    /* renamed from: M0, reason: collision with root package name */
    private int f77541M0;

    /* renamed from: z0, reason: collision with root package name */
    private final Context f77542z0;

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void B0(String str, WD0 wd0, long j10, long j11) {
        this.f77529A0.e(str, j10, j11);
    }

    protected final void E0() {
        this.f77538J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.Ly0
    protected final void O() {
        this.f77539K0 = true;
        this.f77535G0 = null;
        try {
            this.f77530B0.zzf();
            super.O();
        } catch (Throwable th2) {
            super.O();
            throw th2;
        } finally {
            this.f77529A0.g(this.f74688s0);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final float R(float f10, C c10, C[] cArr) {
        int iMax = -1;
        for (C c11 : cArr) {
            int i10 = c11.f65642E;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // com.google.android.gms.internal.ads.FA0, com.google.android.gms.internal.ads.IA0
    public final String b() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.AA0
    public final void v(int i10, Object obj) throws zzib {
        UD0 ud0;
        if (i10 == 2) {
            IC0 ic0 = this.f77530B0;
            obj.getClass();
            ic0.X(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            HR hr2 = (HR) obj;
            IC0 ic02 = this.f77530B0;
            hr2.getClass();
            ic02.n(hr2);
            return;
        }
        if (i10 == 6) {
            C8287i50 c8287i50 = (C8287i50) obj;
            IC0 ic03 = this.f77530B0;
            c8287i50.getClass();
            ic03.l(c8287i50);
            return;
        }
        if (i10 == 12) {
            if (OV.f69091a >= 23) {
                this.f77530B0.k((AudioDeviceInfo) obj);
                return;
            }
            return;
        }
        if (i10 == 16) {
            obj.getClass();
            this.f77541M0 = ((Integer) obj).intValue();
            ZD0 zd0O0 = O0();
            if (zd0O0 == null || OV.f69091a < 35) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f77541M0));
            zd0O0.u(bundle);
            return;
        }
        if (i10 == 9) {
            IC0 ic04 = this.f77530B0;
            obj.getClass();
            ic04.o(((Boolean) obj).booleanValue());
        } else {
            if (i10 != 10) {
                super.v(i10, obj);
                return;
            }
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            this.f77530B0.b(iIntValue);
            if (OV.f69091a < 35 || (ud0 = this.f77531C0) == null) {
                return;
            }
            ud0.d(iIntValue);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final List w0(InterfaceC8410jE0 interfaceC8410jE0, C c10, boolean z10) throws zzsu {
        return C9586uE0.f(Q0(interfaceC8410jE0, c10, false, this.f77530B0), c10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.Ly0
    protected final void y() {
        this.f77540L0 = false;
        try {
            super.y();
            if (this.f77539K0) {
                this.f77539K0 = false;
                this.f77530B0.zzl();
            }
        } catch (Throwable th2) {
            if (this.f77539K0) {
                this.f77539K0 = false;
                this.f77530B0.zzl();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final C7488ag zzc() {
        return this.f77530B0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final boolean zzj() {
        boolean z10 = this.f77540L0;
        this.f77540L0 = false;
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.Ly0, com.google.android.gms.internal.ads.FA0
    public final InterfaceC7976fA0 zzl() {
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9050pD0(Context context, XD0 xd0, InterfaceC8410jE0 interfaceC8410jE0, boolean z10, Handler handler, FC0 fc0, IC0 ic0) {
        super(1, xd0, interfaceC8410jE0, false, 44100.0f);
        C8943oD0 c8943oD0 = null;
        UD0 ud0 = OV.f69091a >= 35 ? new UD0(TD0.f70319a) : null;
        this.f77542z0 = context.getApplicationContext();
        this.f77530B0 = ic0;
        this.f77531C0 = ud0;
        this.f77541M0 = -1000;
        this.f77529A0 = new EC0(handler, fc0);
        ic0.m(new C8836nD0(this, c8943oD0));
    }

    private final int P0(C7558bE0 c7558bE0, C c10) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c7558bE0.f72767a) || (i10 = OV.f69091a) >= 24 || (i10 == 23 && OV.m(this.f77542z0))) {
            return c10.f65665p;
        }
        return -1;
    }

    private static List Q0(InterfaceC8410jE0 interfaceC8410jE0, C c10, boolean z10, IC0 ic0) throws zzsu {
        C7558bE0 c7558bE0A;
        return c10.f65664o == null ? AbstractC7917eh0.t() : (!ic0.c(c10) || (c7558bE0A = C9586uE0.a()) == null) ? C9586uE0.e(interfaceC8410jE0, c10, false, false) : AbstractC7917eh0.u(c7558bE0A);
    }

    private final void k0() {
        long jZzb = this.f77530B0.zzb(a());
        if (jZzb != Long.MIN_VALUE) {
            if (!this.f77538J0) {
                jZzb = Math.max(this.f77537I0, jZzb);
            }
            this.f77537I0 = jZzb;
            this.f77538J0 = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void A0(Exception exc) {
        C9917xL.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f77529A0.a(exc);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void C0(String str) {
        this.f77529A0.f(str);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void D0(C c10, MediaFormat mediaFormat) throws zzib {
        int i10;
        C c11 = this.f77536H0;
        int[] iArr = null;
        boolean z10 = true;
        if (c11 != null) {
            c10 = c11;
        } else if (O0() != null) {
            mediaFormat.getClass();
            int iF = "audio/raw".equals(c10.f65664o) ? c10.f65643F : (OV.f69091a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? OV.F(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.B("audio/raw");
            c9592uH0.u(iF);
            c9592uH0.g(c10.f65644G);
            c9592uH0.h(c10.f65645H);
            c9592uH0.t(c10.f65661l);
            c9592uH0.m(c10.f65650a);
            c9592uH0.o(c10.f65651b);
            c9592uH0.p(c10.f65652c);
            c9592uH0.q(c10.f65653d);
            c9592uH0.D(c10.f65654e);
            c9592uH0.y(c10.f65655f);
            c9592uH0.r0(mediaFormat.getInteger("channel-count"));
            c9592uH0.C(mediaFormat.getInteger("sample-rate"));
            C cH = c9592uH0.H();
            if (this.f77533E0 && cH.f65641D == 6 && (i10 = c10.f65641D) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < c10.f65641D; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.f77534F0) {
                int i12 = cH.f65641D;
                if (i12 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i12 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i12 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i12 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i12 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c10 = cH;
        }
        try {
            int i13 = OV.f69091a;
            if (i13 >= 29) {
                if (d0()) {
                    M();
                }
                if (i13 < 29) {
                    z10 = false;
                }
                C8086gC.f(z10);
            }
            this.f77530B0.i(c10, 0, iArr);
        } catch (zzph e10) {
            throw G(e10, e10.f80714a, false, 5001);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void F0() {
        this.f77530B0.zzg();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void G0() throws zzib {
        try {
            this.f77530B0.zzj();
        } catch (zzpl e10) {
            throw G(e10, e10.f80719c, e10.f80718b, true != d0() ? 5002 : 5003);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.FA0
    public final boolean o() {
        return this.f77530B0.zzy() || super.o();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final int q0(InterfaceC8410jE0 interfaceC8410jE0, C c10) throws zzsu {
        int i10;
        boolean z10;
        if (!C7057Pc.g(c10.f65664o)) {
            return 128;
        }
        int i11 = c10.f65648K;
        boolean zH0 = AbstractC8198hE0.h0(c10);
        int i12 = 1;
        if (!zH0 || (i11 != 0 && C9586uE0.a() == null)) {
            i10 = 0;
        } else {
            C9155qC0 c9155qC0E = this.f77530B0.e(c10);
            if (c9155qC0E.f77750a) {
                i10 = true != c9155qC0E.f77751b ? 512 : 1536;
                if (c9155qC0E.f77752c) {
                    i10 |= RecyclerView.m.FLAG_MOVED;
                }
            } else {
                i10 = 0;
            }
            if (this.f77530B0.c(c10)) {
                return i10 | 172;
            }
        }
        if ((!"audio/raw".equals(c10.f65664o) || this.f77530B0.c(c10)) && this.f77530B0.c(OV.a(2, c10.f65641D, c10.f65642E))) {
            List listQ0 = Q0(interfaceC8410jE0, c10, false, this.f77530B0);
            if (!listQ0.isEmpty()) {
                if (zH0) {
                    C7558bE0 c7558bE0 = (C7558bE0) listQ0.get(0);
                    boolean zE = c7558bE0.e(c10);
                    if (zE) {
                        z10 = true;
                    } else {
                        for (int i13 = 1; i13 < listQ0.size(); i13++) {
                            C7558bE0 c7558bE02 = (C7558bE0) listQ0.get(i13);
                            if (c7558bE02.e(c10)) {
                                z10 = false;
                                zE = true;
                                c7558bE0 = c7558bE02;
                                break;
                            }
                        }
                        z10 = true;
                    }
                    int i14 = true != zE ? 3 : 4;
                    int i15 = 8;
                    if (zE && c7558bE0.f(c10)) {
                        i15 = 16;
                    }
                    return i14 | i15 | 32 | (true != c7558bE0.f72773g ? 0 : 64) | (true != z10 ? 0 : 128) | i10;
                }
                i12 = 2;
            }
        }
        return i12 | 128;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final void r(C7488ag c7488ag) {
        this.f77530B0.d(c7488ag);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final Ny0 s0(Zz0 zz0) throws zzib {
        C c10 = zz0.f72318a;
        c10.getClass();
        this.f77535G0 = c10;
        Ny0 ny0S0 = super.s0(zz0);
        this.f77529A0.i(c10, ny0S0);
        return ny0S0;
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void w() {
        UD0 ud0;
        this.f77530B0.zzk();
        if (OV.f69091a < 35 || (ud0 = this.f77531C0) == null) {
            return;
        }
        ud0.b();
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void z() {
        this.f77530B0.zzi();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final void z0(By0 by0) {
        C c10;
        if (OV.f69091a < 29 || (c10 = by0.f65629b) == null || !Objects.equals(c10.f65664o, "audio/opus") || !d0()) {
            return;
        }
        ByteBuffer byteBuffer = by0.f65634g;
        byteBuffer.getClass();
        C c11 = by0.f65629b;
        c11.getClass();
        int i10 = c11.f65644G;
        if (byteBuffer.remaining() == 8) {
            this.f77530B0.zzr(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ly0
    protected final void A() {
        k0();
        this.f77530B0.zzh();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final boolean H0(long j10, long j11, ZD0 zd0, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C c10) throws zzib {
        byteBuffer.getClass();
        if (this.f77536H0 != null && (i11 & 2) != 0) {
            zd0.getClass();
            zd0.e(i10, false);
            return true;
        }
        if (z10) {
            if (zd0 != null) {
                zd0.e(i10, false);
            }
            this.f74688s0.f68773f += i12;
            this.f77530B0.zzg();
            return true;
        }
        try {
            if (!this.f77530B0.f(byteBuffer, j12, i12)) {
                return false;
            }
            if (zd0 != null) {
                zd0.e(i10, false);
            }
            this.f74688s0.f68772e += i12;
            return true;
        } catch (zzpi e10) {
            C c11 = this.f77535G0;
            if (d0()) {
                M();
            }
            throw G(e10, c11, e10.f80716b, 5001);
        } catch (zzpl e11) {
            if (d0()) {
                M();
            }
            throw G(e11, c10, e11.f80718b, 5002);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final boolean I0(C c10) {
        M();
        return this.f77530B0.c(c10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.Ly0
    protected final void P(boolean z10, boolean z11) throws zzib {
        super.P(z10, z11);
        this.f77529A0.h(this.f74688s0);
        M();
        this.f77530B0.g(N());
        this.f77530B0.h(K());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.Ly0
    protected final void Q(long j10, boolean z10) throws zzib {
        super.Q(j10, z10);
        this.f77530B0.zzf();
        this.f77537I0 = j10;
        this.f77540L0 = false;
        this.f77538J0 = true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0, com.google.android.gms.internal.ads.FA0
    public final boolean a() {
        if (super.a() && this.f77530B0.j()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    protected final Ny0 r0(C7558bE0 c7558bE0, C c10, C c11) {
        int i10;
        int i11;
        Ny0 ny0B = c7558bE0.b(c10, c11);
        int i12 = ny0B.f68981e;
        if (e0(c11)) {
            i12 |= 32768;
        }
        if (P0(c7558bE0, c11) > this.f77532D0) {
            i12 |= 64;
        }
        String str = c7558bE0.f72767a;
        if (i12 != 0) {
            i11 = 0;
            i10 = i12;
        } else {
            i10 = 0;
            i11 = ny0B.f68980d;
        }
        return new Ny0(str, c10, c11, i11, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    @Override // com.google.android.gms.internal.ads.AbstractC8198hE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final com.google.android.gms.internal.ads.WD0 v0(com.google.android.gms.internal.ads.C7558bE0 r8, com.google.android.gms.internal.ads.C r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9050pD0.v0(com.google.android.gms.internal.ads.bE0, com.google.android.gms.internal.ads.C, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.WD0");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7976fA0
    public final long zza() {
        if (k() == 2) {
            k0();
        }
        return this.f77537I0;
    }
}
