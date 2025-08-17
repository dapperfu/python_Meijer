package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9888x5 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f79673f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f79674a;

    /* renamed from: b, reason: collision with root package name */
    private int f79675b;

    /* renamed from: c, reason: collision with root package name */
    public int f79676c;

    /* renamed from: d, reason: collision with root package name */
    public int f79677d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f79678e = new byte[128];

    public C9888x5(int i10) {
    }

    public final void b() {
        this.f79674a = false;
        this.f79676c = 0;
        this.f79675b = 0;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f79674a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f79678e;
            int length = bArr2.length;
            int i13 = this.f79676c + i12;
            if (length < i13) {
                this.f79678e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f79678e, this.f79676c, i12);
            this.f79676c += i12;
        }
    }

    public final boolean c(int i10, int i11) {
        int i12 = this.f79675b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i10 == 179 || i10 == 181) {
                            this.f79676c -= i11;
                            this.f79674a = false;
                            return true;
                        }
                    } else if ((i10 & 240) != 32) {
                        C9917xL.f("H263Reader", "Unexpected start code value");
                        b();
                    } else {
                        this.f79677d = this.f79676c;
                        this.f79675b = 4;
                    }
                } else if (i10 > 31) {
                    C9917xL.f("H263Reader", "Unexpected start code value");
                    b();
                } else {
                    this.f79675b = 3;
                }
            } else if (i10 != 181) {
                C9917xL.f("H263Reader", "Unexpected start code value");
                b();
            } else {
                this.f79675b = 2;
            }
        } else if (i10 == 176) {
            this.f79675b = 1;
            this.f79674a = true;
        }
        a(f79673f, 0, 3);
        return false;
    }
}
