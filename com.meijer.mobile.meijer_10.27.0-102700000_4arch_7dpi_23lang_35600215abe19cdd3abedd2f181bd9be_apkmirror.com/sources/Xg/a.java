package Xg;

import java.lang.reflect.Array;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f39322a;

    /* renamed from: b, reason: collision with root package name */
    private int f39323b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39324c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39325d;

    b a() {
        return this.f39322a[this.f39323b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f39324c * i11, this.f39325d * i10);
        int i12 = this.f39324c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f39322a[i13 / i11].b(i10);
        }
        return bArr;
    }

    void c() {
        this.f39323b++;
    }

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f39322a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f39322a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f39325d = i11 * 17;
        this.f39324c = i10;
        this.f39323b = -1;
    }
}
