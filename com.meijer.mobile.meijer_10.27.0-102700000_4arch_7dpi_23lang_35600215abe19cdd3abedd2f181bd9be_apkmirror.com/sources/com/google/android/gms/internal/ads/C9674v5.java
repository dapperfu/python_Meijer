package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9674v5 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f78981e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f78982a;

    /* renamed from: b, reason: collision with root package name */
    public int f78983b;

    /* renamed from: c, reason: collision with root package name */
    public int f78984c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f78985d = new byte[128];

    public C9674v5(int i10) {
    }

    public final void b() {
        this.f78982a = false;
        this.f78983b = 0;
        this.f78984c = 0;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f78982a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f78985d;
            int length = bArr2.length;
            int i13 = this.f78983b + i12;
            if (length < i13) {
                this.f78985d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f78985d, this.f78983b, i12);
            this.f78983b += i12;
        }
    }

    public final boolean c(int i10, int i11) {
        if (this.f78982a) {
            int i12 = this.f78983b - i11;
            this.f78983b = i12;
            if (this.f78984c != 0 || i10 != 181) {
                this.f78982a = false;
                return true;
            }
            this.f78984c = i12;
        } else if (i10 == 179) {
            this.f78982a = true;
        }
        a(f78981e, 0, 3);
        return false;
    }
}
