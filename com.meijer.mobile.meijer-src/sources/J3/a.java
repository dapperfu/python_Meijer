package J3;

import a3.x;
import a3.y;
import a3.z;
import d3.D;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f15407a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15408b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15409c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15410d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15411e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15412f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15413g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f15414h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15407a == aVar.f15407a && this.f15408b.equals(aVar.f15408b) && this.f15409c.equals(aVar.f15409c) && this.f15410d == aVar.f15410d && this.f15411e == aVar.f15411e && this.f15412f == aVar.f15412f && this.f15413g == aVar.f15413g && Arrays.equals(this.f15414h, aVar.f15414h)) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.y.a
    public void b(x.b bVar) {
        bVar.K(this.f15414h, this.f15407a);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f15407a) * 31) + this.f15408b.hashCode()) * 31) + this.f15409c.hashCode()) * 31) + this.f15410d) * 31) + this.f15411e) * 31) + this.f15412f) * 31) + this.f15413g) * 31) + Arrays.hashCode(this.f15414h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f15408b + ", description=" + this.f15409c;
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f15407a = i10;
        this.f15408b = str;
        this.f15409c = str2;
        this.f15410d = i11;
        this.f15411e = i12;
        this.f15412f = i13;
        this.f15413g = i14;
        this.f15414h = bArr;
    }

    public static a d(D d10) {
        int iQ = d10.q();
        String strR = z.r(d10.F(d10.q(), StandardCharsets.US_ASCII));
        String strE = d10.E(d10.q());
        int iQ2 = d10.q();
        int iQ3 = d10.q();
        int iQ4 = d10.q();
        int iQ5 = d10.q();
        int iQ6 = d10.q();
        byte[] bArr = new byte[iQ6];
        d10.l(bArr, 0, iQ6);
        return new a(iQ, strR, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }
}
