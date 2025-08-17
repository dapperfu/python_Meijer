package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f71445a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f71446b;

    /* renamed from: c, reason: collision with root package name */
    private int f71447c;

    /* renamed from: d, reason: collision with root package name */
    private long f71448d;

    /* renamed from: e, reason: collision with root package name */
    private int f71449e;

    /* renamed from: f, reason: collision with root package name */
    private int f71450f;

    /* renamed from: g, reason: collision with root package name */
    private int f71451g;

    public final void b() {
        this.f71446b = false;
        this.f71447c = 0;
    }

    public final void a(X0 x02, W0 w02) {
        if (this.f71447c > 0) {
            x02.a(this.f71448d, this.f71449e, this.f71450f, this.f71451g, w02);
            this.f71447c = 0;
        }
    }

    public final void c(X0 x02, long j10, int i10, int i11, int i12, W0 w02) {
        C8086gC.g(this.f71451g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f71446b) {
            int i13 = this.f71447c;
            int i14 = i13 + 1;
            this.f71447c = i14;
            if (i13 == 0) {
                this.f71448d = j10;
                this.f71449e = i10;
                this.f71450f = 0;
            }
            this.f71450f += i11;
            this.f71451g = i12;
            if (i14 >= 16) {
                a(x02, w02);
            }
        }
    }

    public final void d(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        if (this.f71446b) {
            return;
        }
        interfaceC9236r0.g(this.f71445a, 0, 10);
        interfaceC9236r0.zzj();
        byte[] bArr = this.f71445a;
        int i10 = P.f69228g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f71446b = true;
        }
    }
}
