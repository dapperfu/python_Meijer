package com.google.android.gms.internal.ads;

import java.util.Collections;

/* renamed from: com.google.android.gms.internal.ads.y1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9987y1 extends B1 {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f79901e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    private boolean f79902b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79903c;

    /* renamed from: d, reason: collision with root package name */
    private int f79904d;

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean a(GQ gq2) throws zzaew {
        if (this.f79902b) {
            gq2.m(1);
        } else {
            int iC = gq2.C();
            int i10 = iC >> 4;
            this.f79904d = i10;
            if (i10 == 2) {
                int i11 = f79901e[(iC >> 2) & 3];
                C9592uH0 c9592uH0 = new C9592uH0();
                c9592uH0.B("audio/mpeg");
                c9592uH0.r0(1);
                c9592uH0.C(i11);
                this.f65402a.d(c9592uH0.H());
                this.f79903c = true;
            } else if (i10 == 7 || i10 == 8) {
                C9592uH0 c9592uH02 = new C9592uH0();
                c9592uH02.B(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                c9592uH02.r0(1);
                c9592uH02.C(8000);
                this.f65402a.d(c9592uH02.H());
                this.f79903c = true;
            } else if (i10 != 10) {
                throw new zzaew("Audio format not supported: " + i10);
            }
            this.f79902b = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean b(GQ gq2, long j10) throws zzbc {
        if (this.f79904d == 2) {
            int iR = gq2.r();
            this.f65402a.c(gq2, iR);
            this.f65402a.a(j10, 1, iR, 0, null);
            return true;
        }
        int iC = gq2.C();
        if (iC != 0 || this.f79903c) {
            if (this.f79904d == 10 && iC != 1) {
                return false;
            }
            int iR2 = gq2.r();
            this.f65402a.c(gq2, iR2);
            this.f65402a.a(j10, 1, iR2, 0, null);
            return true;
        }
        int iR3 = gq2.r();
        byte[] bArr = new byte[iR3];
        gq2.h(bArr, 0, iR3);
        K kA = M.a(bArr);
        C9592uH0 c9592uH0 = new C9592uH0();
        c9592uH0.B("audio/mp4a-latm");
        c9592uH0.a(kA.f68001c);
        c9592uH0.r0(kA.f68000b);
        c9592uH0.C(kA.f67999a);
        c9592uH0.n(Collections.singletonList(bArr));
        this.f65402a.d(c9592uH0.H());
        this.f79903c = true;
        return false;
    }

    public C9987y1(X0 x02) {
        super(x02);
    }
}
