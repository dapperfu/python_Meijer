package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.x5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10013x5 {

    /* renamed from: f, reason: collision with root package name */
    private static final byte[] f80513f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    private boolean f80514a;

    /* renamed from: b, reason: collision with root package name */
    private int f80515b;

    /* renamed from: c, reason: collision with root package name */
    public int f80516c;

    /* renamed from: d, reason: collision with root package name */
    public int f80517d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f80518e = new byte[128];

    public C10013x5(int i10) {
    }

    public final void b() {
        this.f80514a = false;
        this.f80516c = 0;
        this.f80515b = 0;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f80514a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f80518e;
            int length = bArr2.length;
            int i13 = this.f80516c + i12;
            if (length < i13) {
                this.f80518e = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f80518e, this.f80516c, i12);
            this.f80516c += i12;
        }
    }

    public final boolean c(int i10, int i11) {
        int i12 = this.f80515b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i10 == 179 || i10 == 181) {
                            this.f80516c -= i11;
                            this.f80514a = false;
                            return true;
                        }
                    } else if ((i10 & 240) != 32) {
                        C10042xL.f("H263Reader", "Unexpected start code value");
                        b();
                    } else {
                        this.f80517d = this.f80516c;
                        this.f80515b = 4;
                    }
                } else if (i10 > 31) {
                    C10042xL.f("H263Reader", "Unexpected start code value");
                    b();
                } else {
                    this.f80515b = 3;
                }
            } else if (i10 != 181) {
                C10042xL.f("H263Reader", "Unexpected start code value");
                b();
            } else {
                this.f80515b = 2;
            }
        } else if (i10 == 176) {
            this.f80515b = 1;
            this.f80514a = true;
        }
        a(f80513f, 0, 3);
        return false;
    }
}
