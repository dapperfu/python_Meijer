package Zg;

import java.lang.reflect.Array;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b[] f43800a;

    /* renamed from: b, reason: collision with root package name */
    private int f43801b;

    /* renamed from: c, reason: collision with root package name */
    private final int f43802c;

    /* renamed from: d, reason: collision with root package name */
    private final int f43803d;

    b a() {
        return this.f43800a[this.f43801b];
    }

    public byte[][] b(int i10, int i11) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f43802c * i11, this.f43803d * i10);
        int i12 = this.f43802c * i11;
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[(i12 - i13) - 1] = this.f43800a[i13 / i11].b(i10);
        }
        return bArr;
    }

    void c() {
        this.f43801b++;
    }

    a(int i10, int i11) {
        b[] bVarArr = new b[i10];
        this.f43800a = bVarArr;
        int length = bVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            this.f43800a[i12] = new b(((i11 + 4) * 17) + 1);
        }
        this.f43803d = i11 * 17;
        this.f43802c = i10;
        this.f43801b = -1;
    }
}
