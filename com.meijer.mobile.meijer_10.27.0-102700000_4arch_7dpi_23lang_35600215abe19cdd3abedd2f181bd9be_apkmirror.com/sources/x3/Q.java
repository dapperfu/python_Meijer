package x3;

import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f169105a;

    /* renamed from: b, reason: collision with root package name */
    private final int f169106b;

    /* renamed from: c, reason: collision with root package name */
    private int f169107c;

    /* renamed from: d, reason: collision with root package name */
    private int f169108d;

    private void a() {
        int i10;
        int i11 = this.f169107c;
        C13466a.g(i11 >= 0 && (i11 < (i10 = this.f169106b) || (i11 == i10 && this.f169108d == 0)));
    }

    public int b() {
        return (this.f169107c * 8) + this.f169108d;
    }

    public boolean c() {
        boolean z10 = (((this.f169105a[this.f169107c] & 255) >> this.f169108d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f169107c;
        int iMin = Math.min(i10, 8 - this.f169108d);
        int i12 = i11 + 1;
        int i13 = ((this.f169105a[i11] & 255) >> this.f169108d) & (l3.f92484c >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f169105a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f169107c + i11;
        this.f169107c = i12;
        int i13 = this.f169108d + (i10 - (i11 * 8));
        this.f169108d = i13;
        if (i13 > 7) {
            this.f169107c = i12 + 1;
            this.f169108d = i13 - 8;
        }
        a();
    }

    public Q(byte[] bArr) {
        this.f169105a = bArr;
        this.f169106b = bArr.length;
    }
}
