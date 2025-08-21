package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f72285a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f72286b;

    /* renamed from: c, reason: collision with root package name */
    private int f72287c;

    /* renamed from: d, reason: collision with root package name */
    private long f72288d;

    /* renamed from: e, reason: collision with root package name */
    private int f72289e;

    /* renamed from: f, reason: collision with root package name */
    private int f72290f;

    /* renamed from: g, reason: collision with root package name */
    private int f72291g;

    public final void b() {
        this.f72286b = false;
        this.f72287c = 0;
    }

    public final void a(X0 x02, W0 w02) {
        if (this.f72287c > 0) {
            x02.a(this.f72288d, this.f72289e, this.f72290f, this.f72291g, w02);
            this.f72287c = 0;
        }
    }

    public final void c(X0 x02, long j10, int i10, int i11, int i12, W0 w02) {
        C8211gC.g(this.f72291g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f72286b) {
            int i13 = this.f72287c;
            int i14 = i13 + 1;
            this.f72287c = i14;
            if (i13 == 0) {
                this.f72288d = j10;
                this.f72289e = i10;
                this.f72290f = 0;
            }
            this.f72290f += i11;
            this.f72291g = i12;
            if (i14 >= 16) {
                a(x02, w02);
            }
        }
    }

    public final void d(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        if (this.f72286b) {
            return;
        }
        interfaceC9361r0.g(this.f72285a, 0, 10);
        interfaceC9361r0.zzj();
        byte[] bArr = this.f72285a;
        int i10 = P.f70068g;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f72286b = true;
        }
    }
}
