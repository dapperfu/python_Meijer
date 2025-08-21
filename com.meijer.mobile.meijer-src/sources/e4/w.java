package e4;

import d3.C13599a;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final int f129920a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f129921b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f129922c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f129923d;

    /* renamed from: e, reason: collision with root package name */
    public int f129924e;

    public void d() {
        this.f129921b = false;
        this.f129922c = false;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f129921b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f129923d;
            int length = bArr2.length;
            int i13 = this.f129924e;
            if (length < i13 + i12) {
                this.f129923d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f129923d, this.f129924e, i12);
            this.f129924e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f129921b) {
            return false;
        }
        this.f129924e -= i10;
        this.f129921b = false;
        this.f129922c = true;
        return true;
    }

    public boolean c() {
        return this.f129922c;
    }

    public void e(int i10) {
        C13599a.g(!this.f129921b);
        boolean z10 = i10 == this.f129920a;
        this.f129921b = z10;
        if (z10) {
            this.f129924e = 3;
            this.f129922c = false;
        }
    }

    public w(int i10, int i11) {
        this.f129920a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f129923d = bArr;
        bArr[2] = 1;
    }
}
