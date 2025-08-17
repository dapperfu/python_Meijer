package bh;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: bh.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6251b {

    /* renamed from: a, reason: collision with root package name */
    private final byte[][] f60271a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60272b;

    /* renamed from: c, reason: collision with root package name */
    private final int f60273c;

    public void a(byte b10) {
        for (byte[] bArr : this.f60271a) {
            Arrays.fill(bArr, b10);
        }
    }

    public byte b(int i10, int i11) {
        return this.f60271a[i11][i10];
    }

    public byte[][] c() {
        return this.f60271a;
    }

    public int d() {
        return this.f60273c;
    }

    public int e() {
        return this.f60272b;
    }

    public void f(int i10, int i11, int i12) {
        this.f60271a[i11][i10] = (byte) i12;
    }

    public void g(int i10, int i11, boolean z10) {
        this.f60271a[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((this.f60272b * 2 * this.f60273c) + 2);
        for (int i10 = 0; i10 < this.f60273c; i10++) {
            byte[] bArr = this.f60271a[i10];
            for (int i11 = 0; i11 < this.f60272b; i11++) {
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

    public C6251b(int i10, int i11) {
        this.f60271a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f60272b = i10;
        this.f60273c = i11;
    }
}
