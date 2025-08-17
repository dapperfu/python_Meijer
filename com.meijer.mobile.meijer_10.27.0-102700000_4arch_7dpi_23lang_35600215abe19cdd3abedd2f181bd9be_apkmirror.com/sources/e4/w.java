package e4;

import d3.C13466a;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final int f128584a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f128585b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f128586c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f128587d;

    /* renamed from: e, reason: collision with root package name */
    public int f128588e;

    public void d() {
        this.f128585b = false;
        this.f128586c = false;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f128585b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f128587d;
            int length = bArr2.length;
            int i13 = this.f128588e;
            if (length < i13 + i12) {
                this.f128587d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f128587d, this.f128588e, i12);
            this.f128588e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f128585b) {
            return false;
        }
        this.f128588e -= i10;
        this.f128585b = false;
        this.f128586c = true;
        return true;
    }

    public boolean c() {
        return this.f128586c;
    }

    public void e(int i10) {
        C13466a.g(!this.f128585b);
        boolean z10 = i10 == this.f128584a;
        this.f128585b = z10;
        if (z10) {
            this.f128588e = 3;
            this.f128586c = false;
        }
    }

    public w(int i10, int i11) {
        this.f128584a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f128587d = bArr;
        bArr[2] = 1;
    }
}
