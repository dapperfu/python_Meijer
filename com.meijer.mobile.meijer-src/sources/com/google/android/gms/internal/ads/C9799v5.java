package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9799v5 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f79821e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f79822a;

    /* renamed from: b, reason: collision with root package name */
    public int f79823b;

    /* renamed from: c, reason: collision with root package name */
    public int f79824c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f79825d = new byte[128];

    public C9799v5(int i10) {
    }

    public final void b() {
        this.f79822a = false;
        this.f79823b = 0;
        this.f79824c = 0;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f79822a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f79825d;
            int length = bArr2.length;
            int i13 = this.f79823b + i12;
            if (length < i13) {
                this.f79825d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f79825d, this.f79823b, i12);
            this.f79823b += i12;
        }
    }

    public final boolean c(int i10, int i11) {
        if (this.f79822a) {
            int i12 = this.f79823b - i11;
            this.f79823b = i12;
            if (this.f79824c != 0 || i10 != 181) {
                this.f79822a = false;
                return true;
            }
            this.f79824c = i12;
        } else if (i10 == 179) {
            this.f79822a = true;
        }
        a(f79821e, 0, 3);
        return false;
    }
}
