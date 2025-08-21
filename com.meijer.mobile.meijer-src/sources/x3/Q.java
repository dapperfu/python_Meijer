package x3;

import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f170193a;

    /* renamed from: b, reason: collision with root package name */
    private final int f170194b;

    /* renamed from: c, reason: collision with root package name */
    private int f170195c;

    /* renamed from: d, reason: collision with root package name */
    private int f170196d;

    private void a() {
        int i10;
        int i11 = this.f170195c;
        C13599a.g(i11 >= 0 && (i11 < (i10 = this.f170194b) || (i11 == i10 && this.f170196d == 0)));
    }

    public int b() {
        return (this.f170195c * 8) + this.f170196d;
    }

    public boolean c() {
        boolean z10 = (((this.f170193a[this.f170195c] & 255) >> this.f170196d) & 1) == 1;
        e(1);
        return z10;
    }

    public int d(int i10) {
        int i11 = this.f170195c;
        int iMin = Math.min(i10, 8 - this.f170196d);
        int i12 = i11 + 1;
        int i13 = ((this.f170193a[i11] & 255) >> this.f170196d) & (l3.f93323c >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f170193a[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        e(i10);
        return i14;
    }

    public void e(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f170195c + i11;
        this.f170195c = i12;
        int i13 = this.f170196d + (i10 - (i11 * 8));
        this.f170196d = i13;
        if (i13 > 7) {
            this.f170195c = i12 + 1;
            this.f170196d = i13 - 8;
        }
        a();
    }

    public Q(byte[] bArr) {
        this.f170193a = bArr;
        this.f170194b = bArr.length;
    }
}
