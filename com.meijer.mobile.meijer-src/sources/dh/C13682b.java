package dh;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: dh.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13682b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f128506a;

    /* renamed from: b, reason: collision with root package name */
    private final int f128507b;

    /* renamed from: c, reason: collision with root package name */
    private final int f128508c;

    public void a(byte b10) {
        for (byte[] bArr : this.f128506a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f128506a[i11][i10];
    }

    public byte[][] c() {
        return this.f128506a;
    }

    public int d() {
        return this.f128508c;
    }

    public int e() {
        return this.f128507b;
    }

    public void f(int i10, int i11, int i12) {
        this.f128506a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f128506a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f128507b * 2 * this.f128508c) + 2);
        for (int i10 = 0; i10 < this.f128508c; i10++) {
            byte[] bArr = this.f128506a[i10];
            for (int i11 = 0; i11 < this.f128507b; i11++) {
                byte b10 = bArr[i11];
                if (b10 == 0) {
                    sb2.append(" 0");
                } else if (b10 != 1) {
                    sb2.append("  ");
                } else {
                    sb2.append(" 1");
                }
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }

    public C13682b(int i10, int i11) {
        this.f128506a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f128507b = i10;
        this.f128508c = i11;
    }
}
